package batalion.com.example.demo;

class Gnom implements Creatura {
    private String nume;

    public Gnom(String nume) {
        this.nume = nume;
    }

    public void afisare() {
        System.out.println("Gnom: " + nume);
    }
}