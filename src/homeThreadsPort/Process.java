package homeThreadsPort;

public class Process implements Runnable{
    private Prichal target;
    private Ship Ship;

    public Process(Prichal target, Ship ship) {
        this.target = target;
        this.Ship = ship;
    }

    @Override
    public void run() {
        synchronized (target) {
            if (Ship.getLoad() == null) {
                System.out.println("Погрузка груза  на корабль " + Ship.getName() + " на причале   " + target.getNumber());
                loadSheep();

            } else if (Ship.getLoad() != null & Ship.aLoadAndUnload()==true) {
                System.out.println("Разгрузка груза " + Ship.getLoad()+ " и погрузка на корабль " + Ship.getName() + " на причале " + target.getNumber());
                unloadSheep();
                loadSheep();
            } else {
                System.out.println("Разгрузка  корабля " + Ship.getName() +" с грузом "+ Ship.getLoad()+ " на причале " + target.getNumber());
                unloadSheep();
            }
            System.out.println("Корабль " + Ship.getName() + " ушел от причала. \n");
        }
    }

    private void loadSheep (){
        Ship.setLoad(target.getLoadForSheep());
        System.out.println( Ship.getName() + " загрузился на причале " + target.getNumber());
    }

    private void unloadSheep (){
        target.setSklad(Ship.getLoad()+ Ship.getName());
        System.out.println(Ship.getName() + " разгрузился на причале " + target.getNumber());
    }
}