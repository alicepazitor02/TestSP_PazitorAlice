package batalion.com.example.demo;

public class ProxyCreatura implements Creatura {
    
    private Creatura realCreatura;
    private String nume;

    public ProxyCreatura(String nume) {
        this.nume = nume;
    }

    public void afisare() {
        if (realCreatura == null) {
            realCreatura = new RealCreatura(nume);
        }
        realCreatura.afisare();
    }
}
