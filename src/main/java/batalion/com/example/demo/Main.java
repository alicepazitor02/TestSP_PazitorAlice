package batalion.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        // Using Proxy Pattern
        Creatura proxyGnom = new ProxyCreatura("Gimli");
        Creatura proxyElfi = new ProxyCreatura("Legolas");
        Creatura proxyEnt = new ProxyCreatura("Treebeard");

        // Creating battalions
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

        // Displaying the army structure
        armata.afisare();
    }
}
