package batalion.com.example.demo;

import java.util.ArrayList;
import java.util.List;

class Batalion implements Creatura {
    private String nume;
    private List<Creatura> creaturi = new ArrayList<>();
    private BatalionStrategy strategy;
    public Batalion(String nume) {
        this.nume = nume;
    }

    public void adaugaCreatura(Creatura creatura) {
        creaturi.add(creatura);
    }
    public void setStrategy(BatalionStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        if (strategy != null) {
            strategy.executeStrategy();
        }
    }


    public void afisare() {
        System.out.println("Batalion: " + nume);
        for (Creatura creatura : creaturi) {
            creatura.afisare();
        }
    }
}
