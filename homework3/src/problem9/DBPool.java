package problem9;

import java.sql.Connection;

public class DBPool {
    // Container for storing DB connections
    private java.util.concurrent.LinkedBlockingQueue<Connection> connections = new java.util.concurrent.LinkedBlockingQueue<>();

    public DBPool(int initialSize) {
        for (int i = 0; i < initialSize; i++) {
            connections.add(createProxyConnection());
            System.out.println("connection added ID: " + i);
        }
    }

    private Connection createProxyConnection() {
        return (Connection) java.lang.reflect.Proxy.newProxyInstance(
                DBPool.class.getClassLoader(),
                new Class<?>[] { Connection.class },
                new java.lang.reflect.InvocationHandler() {
                    private final Connection realConnection = new BingConnectionImpl();

                    @Override
                    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args)
                            throws Throwable {
                        if (method.getName().equals("createStatement")) {
                            return java.lang.reflect.Proxy.newProxyInstance(
                                    DBPool.class.getClassLoader(),
                                    new Class<?>[] { java.sql.Statement.class },
                                    (p, m, a) -> {
                                        if (m.getName().equals("executeQuery")) {
                                            return java.lang.reflect.Proxy.newProxyInstance(
                                                    DBPool.class.getClassLoader(),
                                                    new Class<?>[] { java.sql.ResultSet.class },
                                                    (rp, rm, ra) -> null);
                                        }
                                        return null;
                                    });
                        }
                        return method.invoke(realConnection, args);
                    }
                });
    }

    public Connection fetchConn() {
        Connection conn = connections.poll();
        if (conn != null) {
            System.out.println("Fetched connection from pool");
        } else {
            System.out.println("No available connections");
        }
        return conn;
    }

    public void releaseConn(Connection conn) {
        if (conn != null) {
            connections.offer(conn);
        }
    }
}
