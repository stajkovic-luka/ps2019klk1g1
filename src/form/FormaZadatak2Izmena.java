/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import controller.Kontroler;
import model.Profesor;
import model.Status;
import model.Zvanje;

/**
 *
 * @author lukas
 */
public class FormaZadatak2Izmena extends javax.swing.JDialog {
    private Profesor profesorZaIzmenu;
    private FormaZadatak2 zad2;
    /**
     * Creates new form FormaZadatak2Izmena
     */
    public FormaZadatak2Izmena(java.awt.Frame parent, boolean modal, Profesor profesorZaIzmenu) {
        super(parent, modal);
        this.profesorZaIzmenu = profesorZaIzmenu;
        this.zad2 = (FormaZadatak2) parent;
        initComponents();
        popuniCombobox();
        popuniOstalo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIme = new javax.swing.JLabel();
        jTextFieldIme = new javax.swing.JTextField();
        jLabelPrezime = new javax.swing.JLabel();
        jTextFieldPrezime = new javax.swing.JTextField();
        jLabelZvanje = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jComboBoxZvanje = new javax.swing.JComboBox<>();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButtonSacuvajPromene = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelIme.setText("Ime");

        jLabelPrezime.setText("Prezime");

        jLabelZvanje.setText("Zvanje");

        jLabelStatus.setText("Status");

        jLabelId.setText("ID");

        jTextFieldId.setEditable(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jButtonSacuvajPromene.setText("SACUVAJ PROMENE");
        jButtonSacuvajPromene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajPromeneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSacuvajPromene)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelZvanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldId)
                                    .addComponent(jComboBoxZvanje, 0, 255, Short.MAX_VALUE)
                                    .addComponent(jComboBoxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIme, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIme)
                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrezime)
                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelZvanje)
                    .addComponent(jComboBoxZvanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButtonSacuvajPromene)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSacuvajPromeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajPromeneActionPerformed
        long id = profesorZaIzmenu.getId();
        String ime = jTextFieldIme.getText();
        String prezime = jTextFieldPrezime.getText();
        Zvanje zvanje = Zvanje.valueOf((String)jComboBoxZvanje.getSelectedItem());
       


        Kontroler.getInstance().azurirajBazu(id,ime,prezime,zvanje);
        zad2.popuniTabelu();
        this.dispose();
    }//GEN-LAST:event_jButtonSacuvajPromeneActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSacuvajPromene;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxZvanje;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIme;
    private javax.swing.JLabel jLabelPrezime;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelZvanje;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldPrezime;
    // End of variables declaration//GEN-END:variables

    private void popuniCombobox() {
        for (Zvanje z : Zvanje.values()) {
            jComboBoxZvanje.addItem(String.valueOf(z));
        }
        for (Status s : Status.values()) {
            jComboBoxStatus.addItem(String.valueOf(s));
        }
    }

    private void popuniOstalo() {
        jTextFieldId.setText(String.valueOf(profesorZaIzmenu.getId()));
        jTextFieldIme.setText(profesorZaIzmenu.getIme());
        jTextFieldPrezime.setText(profesorZaIzmenu.getPrezime());
        jComboBoxZvanje.setSelectedItem(profesorZaIzmenu.getZvanje()+"");
        jComboBoxStatus.setSelectedItem(profesorZaIzmenu.getStatus()+"");
        
        
    }
}
