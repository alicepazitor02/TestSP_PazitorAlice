// Main.java
package batalion.com.example.demo;

public class Main {
    public static void main(String[] args) {
        // utilizare proxy
        Creatura proxyGnom = new ProxyCreatura("Gimli");
        Creatura proxyElfi = new ProxyCreatura("Legolas");
        Creatura proxyEnt = new ProxyCreatura("Treebeard");

        // Creare batalioane
        Batalion batalion1 = new Batalion("Batalion1");
        batalion1.adaugaCreatura(proxyGnom);
        batalion1.adaugaCreatura(proxyElfi);
        batalion1.adaugaCreatura(proxyEnt);

        Batalion batalion2 = new Batalion("Batalion2");
        batalion2.adaugaCreatura(new ProxyCreatura("Gloin"));
        batalion2.adaugaCreatura(new ProxyCreatura("Thranduil"));

        Batalion armata = new Batalion("Armata lui Aragon");
        armata.adaugaCreatura(batalion1);
        armata.adaugaCreatura(batalion2);

        // Setarea dinamica a startegiei armatei
        armata.setStrategy(new OffensiveStrategy());
        armata.executeStrategy(); // Executare strategie
		

        // Afisare structura aramata
        armata.afisare();

		// Setarea dinamica a startegiei armatei
        armata.setStrategy(new DefensiveStrategy());
        armata.executeStrategy(); // Executare strategie


    }
}
