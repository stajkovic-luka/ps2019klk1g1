/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Predaje;
import model.Profesor;

/**
 *
 * @author lukas
 */
public class ModelTabeleAngazovanja extends AbstractTableModel {
    private List<Predaje> listaAngazovanja;
    private String[] nizKolona = {"idAngazovanja","ime","prezime","naziv"};
    
    //Prosledi mu se lista koja se na ovaj nacin incijalizuje unutar klase.
    ModelTabeleAngazovanja(List<Predaje> listaAngazovanja){
        this.listaAngazovanja = listaAngazovanja;
    }
    
    //broj redova
    @Override
    public int getRowCount() {
        return listaAngazovanja.size();
    }

    //broj kolona
    @Override
    public int getColumnCount() {
        return nizKolona.length;
        
    }

    //Daje svakoj celiji u tabeli vrednosti. Zato mu se prosledi indeks red i indeks kolone.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Predaje p = listaAngazovanja.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getProfesor().getIme();
            case 2:
                return p.getProfesor().getPrezime();
            case 3:
                return p.getPredmet().getNaziv();
            default:
                return "N/A";
        }
        
    }
    
    //Daje naziv koloni
    @Override
    public String getColumnName(int column) {
        return nizKolona[column];
    }
    
    //Getteri i setteri

    public List<Predaje> getListaAngazovanja() {
        return listaAngazovanja;
    }

    public void setListaAngazovanja(List<Predaje> listaAngazovanja) {
        this.listaAngazovanja = listaAngazovanja;
    }

    

 
    
    
}
