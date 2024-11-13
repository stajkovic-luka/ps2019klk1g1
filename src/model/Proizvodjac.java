/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lukas
 */
public class Proizvodjac {
    private long sifra;
    private String naziv;

    public Proizvodjac() {
    }

    public Proizvodjac(long sifra, String naziv) {
        this.sifra = sifra;
        this.naziv = naziv;
    }

    public long getSifra() {
        return sifra;
    }

    public void setSifra(long sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Proizvodjac{" + "sifra=" + sifra + ", naziv=" + naziv + '}';
    }
    
    
}
