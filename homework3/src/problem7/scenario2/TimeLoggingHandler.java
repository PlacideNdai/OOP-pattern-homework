package problem7.scenario2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeLoggingHandler implements InvocationHandler {

    private final Object target;

    public TimeLoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.nanoTime();

        Object result = method.invoke(target, args);

        long end = System.nanoTime();

        System.out.println("Took " + (end - start) + " nano seconds");

        return result;
    }
}
