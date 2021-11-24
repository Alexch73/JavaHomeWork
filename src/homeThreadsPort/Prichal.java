package homeThreadsPort;

import java.util.LinkedList;

public class Prichal {
    private int number;
    private LinkedList<String> sklad = new LinkedList<>();       //выгрузка в склад
    private String LoadShip="Корабль загружен";

    public Prichal(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getLoadForSheep() {
        return LoadShip;
    }

    public void setSklad(String load) {
        sklad.add(load);
    }
}