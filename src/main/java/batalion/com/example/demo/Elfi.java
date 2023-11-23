package batalion.com.example.demo;

class Elfi implements Creatura {
    private String nume;

    public Elfi(String nume) {
        this.nume = nume;
    }

    public void afisare() {
        System.out.println("Elfi: " + nume);
    }
}