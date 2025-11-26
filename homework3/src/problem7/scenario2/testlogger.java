package problem7.scenario2;

import java.lang.reflect.Proxy;

import com.bing.tank.Movable;

public class testlogger {
    public static void main(String[] args) {

        Movable tank = new Tank();

        Movable proxyTank = (Movable) Proxy.newProxyInstance(
                Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TimeLoggingHandler(tank)
        );

        proxyTank.move();
    }
}
