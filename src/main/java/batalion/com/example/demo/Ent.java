package batalion.com.example.demo;

class Ent implements Creatura {
    private String nume;

    public Ent(String nume) {
        this.nume = nume;
    }

    public void afisare() {
        System.out.println("Ent: " + nume);
    }
}