package batalion.com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // Creare creaturi individuale
        Gnom gnom1 = new Gnom("Gimli");
        Elfi elf1 = new Elfi("Legolas");
        Ent ent1 = new Ent("Treebeard");

        // Creare batalion
        Batalion batalion1 = new Batalion("Batalion1");
        batalion1.adaugaCreatura(gnom1);
        batalion1.adaugaCreatura(elf1);
        batalion1.adaugaCreatura(ent1);

        // Adăugare creaturi individuale într-un alt batalion
        Batalion batalion2 = new Batalion("Batalion2");
        batalion2.adaugaCreatura(new Gnom("Gloin"));
        batalion2.adaugaCreatura(new Elfi("Thranduil"));

        // Adăugare batalioane într-un batalion mai mare
        Batalion armata = new Batalion("Armata lui Aragon");
        armata.adaugaCreatura(batalion1);
        armata.adaugaCreatura(batalion2);

        // Afisare structura armatei
        armata.afisare();
    }
}