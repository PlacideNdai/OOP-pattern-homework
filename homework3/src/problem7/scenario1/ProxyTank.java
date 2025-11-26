package problem7.scenario1;

public class ProxyTank implements Movable{
    private Tank tank;
    public ProxyTank() {
        
    }

    @Override
    public void move(){

        long startTimer = System.nanoTime();
        if(tank == null){
            tank = new Tank();
        }
        tank.move();

        long endTimer = System.nanoTime();

        long totalTimer = endTimer - startTimer;
        System.out.println("Took " + totalTimer + "nano seconds");
    }
}
