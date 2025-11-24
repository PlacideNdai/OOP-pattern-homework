package problem9;

import java.sql.Connection;
import java.util.LinkedList;

public class DBPool {
    // Container for storing DB connections
    private LinkedList<Connection> connections = new LinkedList<>();

    public DBPool(int initialSize) {
        for( int i =0; i < initialSize; i++){
            connections.add(new BingConnectionImpl());
            System.out.println("connection added ID: " + i);
        }
    }

    public Connection fetchConn() {
        Connection conn = null;
        if(!connections.isEmpty()){
            conn = connections.poll();
            System.out.println("Fetched connection from pool");
        } else {
            System.out.println("No available connections");
        }
        return conn;
    }

    public void releaseConn(Connection conn) {
        connections.add(conn);
    }
}
