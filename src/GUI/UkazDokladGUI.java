/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Doklady.BV;
import Doklady.ID;
import Doklady.PFA;
import Doklady.PPD;
import Doklady.Predkontacia;
import Doklady.UctovnyDoklad;
import Doklady.VFA;
import Doklady.VPD;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tomáš
 */
public class UkazDokladGUI extends javax.swing.JDialog {

    /**
     * Creates new form UkazDokladGUI
     */
    public UkazDokladGUI(java.awt.Frame parent, boolean modal, UctovnyDoklad u) {
        super(parent, modal);
        initComponents();
        this.datumVytvorenia.setText(ComparatorsAndDate.Datum.formatDatum(u.getDatumDokladu()));
        this.partner.setText(u.getPartner().getMeno());
        this.znenie.setText(u.getZnenieDokladu());
        this.externeCislo.setText("Nie je k dispozícii");
        if (u instanceof BV) {
                BV doklad= (BV)u;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.druh.setText("Bankový výpis");
            } else if (u instanceof ID) {
                ID doklad = (ID)u;
                this.interneCislo.setText(doklad.getInterneCislo());  
                this.druh.setText("Interný doklad");
            } else if (u instanceof PPD) {
                PPD doklad = (PPD)u;
                this.interneCislo.setText(doklad.getInterneCislo()); 
                this.druh.setText("Prijímový pokladničný doklad");
            } else if (u instanceof VPD) {
                VPD doklad = (VPD)u;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.druh.setText("Výdavkový pokladničný doklad");
            } else if (u instanceof PFA) {
                PFA doklad = (PFA)u;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.externeCislo.setText(String.valueOf(doklad.getExterneCislo()));
                this.druh.setText("Prijatá faktúra");
            } else if (u instanceof VFA) {
                VFA doklad = (VFA)u;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.externeCislo.setText(String.valueOf(doklad.getExterneCislo()));
                this.druh.setText("Vystavená faktúra");
            }
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Znenie predkontácie");
        model.addColumn("MD");
        model.addColumn("D");
        model.addColumn("Suma");
        for (Predkontacia p : u.getPredkontacieDokladu()) {
            model.addRow(new Object[] {p.getZnenie(), p.getStranaMD().getCisloUctu(), p.getStranaD().getCisloUctu(), p.getSumaString()});
        }
        this.tabulka.setModel(model);
        this.hodnota.setText(u.getSumaDokladuString());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datumVytvorenia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        znenie = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabulka = new javax.swing.JTable();
        partner = new javax.swing.JLabel();
        hodnota = new javax.swing.JLabel();
        interneCislo = new javax.swing.JLabel();
        externeCislo = new javax.swing.JLabel();
        druh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informácie o doklade");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Doklad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dátum vytvorenia");

        datumVytvorenia.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Partner");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Hodnota dokladu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Interné číslo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Externé číslo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Znenie dokladu");

        znenie.setText("jLabel10");

        tabulka.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabulka);

        partner.setText("jLabel11");

        hodnota.setText("jLabel12");

        interneCislo.setText("jLabel13");

        externeCislo.setText("jLabel14");

        druh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        druh.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(56, 56, 56)
                        .addComponent(znenie))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hodnota)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datumVytvorenia)
                                    .addComponent(partner))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(externeCislo)
                                    .addComponent(interneCislo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(druh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(druh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(datumVytvorenia)
                    .addComponent(jLabel7)
                    .addComponent(interneCislo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(partner)
                    .addComponent(externeCislo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hodnota))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(znenie))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datumVytvorenia;
    private javax.swing.JLabel druh;
    private javax.swing.JLabel externeCislo;
    private javax.swing.JLabel hodnota;
    private javax.swing.JLabel interneCislo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel partner;
    private javax.swing.JTable tabulka;
    private javax.swing.JLabel znenie;
    // End of variables declaration//GEN-END:variables
}