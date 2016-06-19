/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ComparatorsAndDate.ZnenieDokladuAZComparator;
import ComparatorsAndDate.ZnenieDokladuZAComparator;
import Doklady.BV;
import Doklady.ID;
import Doklady.PFA;
import Doklady.PPD;
import Doklady.UctovnyDoklad;
import Doklady.VFA;
import Doklady.VPD;
import Doklady.ZoznamDokladov;
import RamcovaUctovaOsnova.Ucet;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomáš
 */
public class UctovneDokladyGUI extends javax.swing.JFrame {
    private ZoznamDokladov zd;
    private DefaultListModel<UctovnyDoklad> dlm;
    /**
     * Creates new form UctovneDokladyGUI
     */
    public UctovneDokladyGUI(ZoznamDokladov zd) {
        initComponents();
        this.zd = zd;
        this.dlm = new DefaultListModel<>();
        for (UctovnyDoklad ud : this.zd.getZoznamDokladov()) {
            this.dlm.addElement(ud);
        }
        this.vypis.setModel(dlm);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        vypis = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ukazDoklad = new javax.swing.JButton();
        odstranDoklad = new javax.swing.JButton();
        nazov = new javax.swing.JLabel();
        datumVytvorenia = new javax.swing.JLabel();
        partner = new javax.swing.JLabel();
        hodnota = new javax.swing.JLabel();
        interneCislo = new javax.swing.JLabel();
        externeCislo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        druh = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sortovanie = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Účtovné doklady");

        vypis.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        vypis.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                vypisValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(vypis);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Informácie o účtovnom doklade");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Názov");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dátum vytvorenia");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Interné číslo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Externé číslo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Partner");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Hodnota dokladu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ponuka činností");

        ukazDoklad.setText("Ukáž doklad");
        ukazDoklad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukazDokladActionPerformed(evt);
            }
        });

        odstranDoklad.setText("Odstráň doklad");
        odstranDoklad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranDokladActionPerformed(evt);
            }
        });

        nazov.setText("   ");

        datumVytvorenia.setText("   ");

        partner.setText("   ");

        hodnota.setText("   ");

        interneCislo.setText("   ");

        externeCislo.setText("   ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Druh dokladu");

        druh.setText("   ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Triedenie");

        sortovanie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Podľa znenia dokladu vzostupne", "Podľa znenia dokladu zostupne" }));
        sortovanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortovanieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(externeCislo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(interneCislo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hodnota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(partner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datumVytvorenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nazov, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(druh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(odstranDoklad)
                                    .addComponent(ukazDoklad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(sortovanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nazov))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(datumVytvorenia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(partner))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(hodnota))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(interneCislo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(externeCislo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(druh))
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(ukazDoklad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odstranDoklad)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel10)
                        .addGap(19, 19, 19)
                        .addComponent(sortovanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vypisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_vypisValueChanged
        UctovnyDoklad selected = (UctovnyDoklad)this.vypis.getSelectedValue();
        if (selected != null) {
            this.nazov.setText(selected.getZnenieDokladu());
            this.datumVytvorenia.setText(ComparatorsAndDate.Datum.formatDatum(selected.getDatumDokladu()));
            this.externeCislo.setText("Externé číslo nie je k dispozícii");
            this.hodnota.setText(String.valueOf(selected.getSumaDokladuString()));
            this.partner.setText(selected.getPartner().getMeno());
            if (selected instanceof BV) {
                BV doklad= (BV)selected;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.druh.setText("Bankový výpis");
            } else if (selected instanceof ID) {
                ID doklad = (ID)selected;
                this.interneCislo.setText(doklad.getInterneCislo());  
                this.druh.setText("Interný doklad");
            } else if (selected instanceof PPD) {
                PPD doklad = (PPD)selected;
                this.interneCislo.setText(doklad.getInterneCislo()); 
                this.druh.setText("Prijímový pokladničný doklad");
            } else if (selected instanceof VPD) {
                VPD doklad = (VPD)selected;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.druh.setText("Výdavkový pokladničný doklad");
            } else if (selected instanceof PFA) {
                PFA doklad = (PFA)selected;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.externeCislo.setText(String.valueOf(doklad.getExterneCislo()));
                this.druh.setText("Prijatá faktúra");
            } else if (selected instanceof VFA) {
                VFA doklad = (VFA)selected;
                this.interneCislo.setText(doklad.getInterneCislo());
                this.externeCislo.setText(String.valueOf(doklad.getExterneCislo()));
                this.druh.setText("Vystavená faktúra");
            
            }
        }
    }//GEN-LAST:event_vypisValueChanged

    private void ukazDokladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukazDokladActionPerformed
        UctovnyDoklad selected = (UctovnyDoklad)this.vypis.getSelectedValue();
        if (selected != null) {
            UkazDokladGUI ud = new UkazDokladGUI(this, true, selected);
        } else {
             JOptionPane.showMessageDialog(this, "Nie je zvolený doklad");
        }
    }//GEN-LAST:event_ukazDokladActionPerformed

    private void odstranDokladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranDokladActionPerformed
        UctovnyDoklad selected = (UctovnyDoklad)this.vypis.getSelectedValue();
        if (selected != null) {
            int i = JOptionPane.showConfirmDialog(this, "Naozaj chcete odstrániť tento doklad?", "Odstránenie dokladu", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_NO_OPTION) {
                String vypis = selected.oductujDoklad();
                zd.odstranDoklad(selected);
                JOptionPane.showMessageDialog(this, vypis);
                DefaultListModel<UctovnyDoklad> dlmnew = new DefaultListModel<>();
                for (UctovnyDoklad ud : this.zd.getZoznamDokladov()) {
                    dlmnew.addElement(ud);
                }
                this.vypis.setModel(dlmnew);
            }   
        } else {
            JOptionPane.showMessageDialog(this, "Nie je zvolený doklad");
        }        
    }//GEN-LAST:event_odstranDokladActionPerformed

    private void sortovanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortovanieActionPerformed
        if (this.sortovanie.getSelectedIndex() == 0) {
            zd.zoradDokladyPodlaZneniaAZ();
            this.obnovZoznam(); 
        } else if (this.sortovanie.getSelectedIndex() == 1) {
            zd.zoradDokladyPodlaZneniaZA();
            this.obnovZoznam();
        }
    }//GEN-LAST:event_sortovanieActionPerformed

    public void obnovZoznam() {
        DefaultListModel<UctovnyDoklad> dlmnew = new DefaultListModel<>();
        for (UctovnyDoklad u : zd.getZoznamDokladov()) {
            dlmnew.addElement(u);
        }
        this.dlm = dlmnew;
        this.vypis.setModel(dlm);
    }
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nazov;
    private javax.swing.JButton odstranDoklad;
    private javax.swing.JLabel partner;
    private javax.swing.JComboBox sortovanie;
    private javax.swing.JButton ukazDoklad;
    private javax.swing.JList vypis;
    // End of variables declaration//GEN-END:variables

}