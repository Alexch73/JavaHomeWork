package homeThreadsPort;

public class Ship {
        private String name;
        private String load = null;         // Переменная для проверки  наличия груза.
        private boolean loadAndUnload;    // переменная для активации загрузки после разгрузки

        public Ship(String name) {
            this.name = name;
        }


        public void setLoad(String load) {
            this.load = load;
        }

        public void setLoadAfterUnload(boolean loadAfterUnload) {
            this.loadAndUnload = loadAfterUnload;
        }

        public String getLoad() {
            String temp = load;
            load = load;
            return temp;
        }

        public String getName() {
            return name;
        }

        public boolean aLoadAndUnload() {
            return loadAndUnload;
        }
    }

