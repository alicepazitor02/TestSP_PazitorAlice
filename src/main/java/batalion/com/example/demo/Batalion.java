package batalion.com.example.demo;

import java.util.ArrayList;
import java.util.List;

class Batalion implements Creatura {
    private String nume;
    private List<Creatura> creaturi = new ArrayList<>();

    public Batalion(String nume) {
        this.nume = nume;
    }

    public void adaugaCreatura(Creatura creatura) {
        creaturi.add(creatura);
    }

    public void afisare() {
        System.out.println("Batalion: " + nume);
        for (Creatura creatura : creaturi) {
            creatura.afisare();
        }
    }
}
