package problem7.scenario1;

import java.util.Date;

public class ProxyTank implements Movable{
    private Date now;
    private Tank tank;

    public ProxyTank() {
        this.now = new Date();
    }

    @Override
    public void move(){
        
        System.out.println(now);

        if(tank == null){
            tank = new Tank();
        }

        tank.move();
    }
}
