/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Profesor;
import baza.Konekcija;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Status;
import model.Zvanje;
import model.Profesor;

/**
 *
 * @author lukas
 */
public class BrokerBP {

    public List<Profesor> ucitajIzBaze() {
    List<Profesor> listaProf = new ArrayList();
    String upit = "SELECT * FROM profesor";
        try {
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(upit);
            while (rs.next()) {                
                long id = rs.getLong("id");
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                Zvanje zvanje = Zvanje.valueOf(rs.getString("zvanje"));
                Status status = Status.valueOf(rs.getString("status"));
                
                Profesor p = new Profesor(id, ime, prezime, zvanje, status);
                listaProf.add(p);
       
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BrokerBP.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return listaProf;
    }

    public void azurirajUBazi(long id, String ime, String prezime, Zvanje zvanje) {
        String upit = "UPDATE profesor\n" +
                    "SET ime=?, prezime=?, zvanje=?\n" +
                    "WHERE id = ?;";
        
        try {   
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, ime);
            ps.setString(2, prezime);
            ps.setString(3, String.valueOf(zvanje));
            ps.setLong(4, id);
            
            ps.executeUpdate();
            //Komit u bazi!
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(BrokerBP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
