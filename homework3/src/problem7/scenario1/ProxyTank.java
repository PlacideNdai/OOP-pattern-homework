package problem7.scenario1;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Timer;

public class ProxyTank implements Movable{
    private Date now;
    private Tank tank;

    public ProxyTank() {
        this.now = new Date();
    }

    @Override
    public void move(){

        long startTimer = System.nanoTime();
        if(tank == null){
            tank = new Tank();
        }
        tank.move();

        long endTimer = System.nanoTime();

        long totalTimer = startTimer - endTimer;
        System.out.println("Took " + totalTimer + "nano seconds");
    }
}
