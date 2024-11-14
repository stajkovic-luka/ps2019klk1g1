/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lukas
 */
public class PoreskaStopa {
    private long sifra;
    private String skraceniNaziv;
    private double iznos;

    public PoreskaStopa() {
    }

    public PoreskaStopa(long sifra, String skraceniNaziv, double iznos) {
        this.sifra = sifra;
        this.skraceniNaziv = skraceniNaziv;
        this.iznos = iznos;
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

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    @Override
    public String toString() {
        return iznos+"";
    }
    
    
}
