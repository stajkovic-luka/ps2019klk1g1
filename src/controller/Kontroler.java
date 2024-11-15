/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.BrokerBP;
import java.util.ArrayList;
import java.util.List;
import model.PoreskaStopa;
import model.Predaje;
import model.Profesor;
import model.Proizvod;
import model.Proizvodjac;
import model.Zvanje;

/**
 *
 * @author lukas
 */
public class Kontroler {
    private static Kontroler instance;
    private List<Proizvod> proizvodi;
    private List<Proizvodjac> proizvodjaci;
    private List<PoreskaStopa> poreskeStope;
    private BrokerBP dbb;
    

    private Kontroler() {
        dbb = new BrokerBP();
        proizvodi = new ArrayList<>();
        proizvodjaci = new ArrayList<>();
        poreskeStope = new ArrayList<>();
        
        Proizvodjac p1 = new Proizvodjac(1, "IKEA");
        Proizvodjac p2 = new Proizvodjac(2, "LIDL");
        Proizvodjac p3 = new Proizvodjac(3, "MAXI");
        
        PoreskaStopa ps1 = new PoreskaStopa(1, "niska", 0.1);
        PoreskaStopa ps2 = new PoreskaStopa(2, "srednja", 0.2);
        PoreskaStopa ps3 = new PoreskaStopa(3, "visoka", 0.3);

        Proizvod pr1 = new Proizvod(1, "banana", 200, ps1, p2);
        Proizvod pr2 = new Proizvod(2, "sto", 5000, ps3, p1);
        Proizvod pr3 = new Proizvod(3, "cokolada", 500, ps2, p3);
        
        proizvodi.add(pr1);
        proizvodi.add(pr2);
        proizvodi.add(pr3);
        
        poreskeStope.add(ps1);
        poreskeStope.add(ps2);
        poreskeStope.add(ps3);
        
        proizvodjaci.add(p1);
        proizvodjaci.add(p2);
        proizvodjaci.add(p3);

        
        

    }
    
    public static Kontroler getInstance(){
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public List<Proizvodjac> getProizvodjaci() {
        return proizvodjaci;
    }

    public List<PoreskaStopa> getPoreskeStope() {
        return poreskeStope;
    }

    public List<Profesor> vratiListuIzBaze() {
        return dbb.ucitajIzBaze();
    }
    
    

    public void azurirajBazu(long id, String ime, String prezime, Zvanje zvanje) {
        dbb.azurirajUBazi(id,ime,prezime,zvanje);
    }

    public List<Predaje> vratiListuAngazovanja(List<Profesor> selektovaniProfesori) {
        return dbb.vratiListuAngazovanjaIzBaze(selektovaniProfesori);
        
    }
   
    
}
