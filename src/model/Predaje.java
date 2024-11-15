/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lukas
 */
public class Predaje {
   // Asocijativna klasa Predmeta i Profesora
    
    private int id;
    private Predmet predmet;
    private Profesor profesor;

    public Predaje() {
    }

    public Predaje(int id, Predmet predmet, Profesor profesor) {
        this.id = id;
        this.predmet = predmet;
        this.profesor = profesor;
    }

    

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
