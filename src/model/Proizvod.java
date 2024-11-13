/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lukas
 */
public class Proizvod {
    private long sifra;
    private String skraceniNaziv;
    private double cena;
    private PoreskaStopa poreskaStopa;
    private Proizvodjac proizvodjac;

    public Proizvod() {
    }

    public Proizvod(long sifra, String skraceniNaziv, double cena, PoreskaStopa poreskaStopa, Proizvodjac proizvodjac) {
        this.sifra = sifra;
        this.skraceniNaziv = skraceniNaziv;
        this.cena = cena;
        this.poreskaStopa = poreskaStopa;
        this.proizvodjac = proizvodjac;
    }

    public long getSifra() {
        return sifra;
    }

    public void setSifra(long sifra) {
        this.sifra = sifra;
    }

    public String getSkraceniNaziv() {
        return skraceniNaziv;
    }

    public void setSkraceniNaziv(String skraceniNaziv) {
        this.skraceniNaziv = skraceniNaziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public PoreskaStopa getPoreskaStopa() {
        return poreskaStopa;
    }

    public void setPoreskaStopa(PoreskaStopa poreskaStopa) {
        this.poreskaStopa = poreskaStopa;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    @Override
    public String toString() {
        return skraceniNaziv;
    }

    
    
    
    
}
