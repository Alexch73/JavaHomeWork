package homeThreadsPort;

class Port {

    public static void main(String[] args) {
        Prichal prichal1 = new Prichal(1);
        Prichal prichal2 = new Prichal(2);

        Ship ship1 = new Ship("Корабль1");
        ship1.setLoad("Стройматериалы");
        ship1.setLoadAfterUnload(true);

        Ship ship2 = new Ship("Корабль2");
        ship2.setLoad("Хлеб");
        ship2.setLoadAfterUnload(false);

        Ship ship3 = new Ship("Корабль3");
        ship3.setLoad(null);
        ship3.setLoadAfterUnload(true);
        Ship ship4 = new Ship("Корабль4");
        ship4.setLoad(null);
        ship4.setLoadAfterUnload(false);

        Thread thread1 = new Thread(new Process(prichal1, ship1));
        Thread thread2 = new Thread(new Process(prichal1, ship2));
        Thread thread3 = new Thread(new Process(prichal2, ship3));
        Thread thread4 = new Thread(new Process(prichal2, ship4));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}





