package batalion.com.example.demo;


    class RealCreatura implements Creatura {
        private String nume;
    
        public RealCreatura(String nume) {
            this.nume = nume;
        }
    
        public void afisare() {
            System.out.println("Creatura: " + nume);
        }
    }

