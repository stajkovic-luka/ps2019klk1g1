/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import controller.Kontroler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Predaje;
import model.Profesor;

/**
 *
 * @author lukas
 */
public class FormaZadatak3 extends javax.swing.JDialog {
    private List<Profesor> selektovaniProfesori;
    private List<Profesor> sviProfesori;
    /**
     * Creates new form FormaZadatak3
     */
    public FormaZadatak3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popuniTabelu();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProfesor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAngazovanje = new javax.swing.JTable();
        jButtonPrikazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTableProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProfesor.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTableProfesor);

        jTableAngazovanje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAngazovanje.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTableAngazovanje);

        jButtonPrikazi.setText("PRIKAZI");
        jButtonPrikazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrikaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonPrikazi)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrikazi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrikaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrikaziActionPerformed
        selektovaniProfesori = new ArrayList();
        int[] selektovaniRedoviIndeks = jTableProfesor.getSelectedRows(); // .getselected rowS!
        
        for (int i = 0; i < selektovaniRedoviIndeks.length; i++) {
            Profesor p = sviProfesori.get(selektovaniRedoviIndeks[i]);
            selektovaniProfesori.add(p);
        }
        
        List<Predaje> angazovanja = Kontroler.getInstance().vratiListuAngazovanja(selektovaniProfesori);
        
        //METODA ZA SORTIRANJE!
        angazovanja.sort(
        //BITNO! 
        Comparator.comparing((Predaje p) -> p.getProfesor().getPrezime()).thenComparing((Predaje p) -> p.getProfesor().getIme()).thenComparing((Predaje p) -> p.getPredmet().getNaziv())
        );
        
     
        
        //formira podatke u tabeli
        ModelTabeleAngazovanja mta = new ModelTabeleAngazovanja(angazovanja);
        jTableAngazovanje.setModel(mta);
        
    }//GEN-LAST:event_jButtonPrikaziActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrikazi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAngazovanje;
    private javax.swing.JTable jTableProfesor;
    // End of variables declaration//GEN-END:variables

    public void popuniTabelu() {
        sviProfesori = Kontroler.getInstance().vratiListuIzBaze();
        
        ModelTabeleProfesor mtp = new ModelTabeleProfesor(sviProfesori);
        jTableProfesor.setModel(mtp);
        
        
    }

    
}