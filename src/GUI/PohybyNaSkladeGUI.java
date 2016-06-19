/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import RamcovaUctovaOsnova.RamcovaUctovaOsnova;
import Sklad.Pohyb;
import Sklad.PohybyNaSklade;
import Sklad.Prijemka;
import Sklad.Sklad;
import Sklad.ZoznamSkladovychKariet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomáš
 */
public class PohybyNaSkladeGUI extends javax.swing.JFrame {
    private PohybyNaSklade pohyby;
    private DefaultListModel<Pohyb> dlm;
    private ZoznamSkladovychKariet zoznamSK;
    private Sklad sklad;
    private RamcovaUctovaOsnova ruo;
    /**
     * Creates new form PohybyNaSkladeGUI
     */
    public PohybyNaSkladeGUI(PohybyNaSklade ps, ZoznamSkladovychKariet zsk, Sklad s, RamcovaUctovaOsnova ruo) {
        initComponents();
        this.pohyby = ps;
        ArrayList<Pohyb> al = (ArrayList<Pohyb>) pohyby.getPohyby();
        this.dlm = new DefaultListModel<>();
        for (Pohyb p : al) {
            this.dlm.addElement(p);
        }
        this.vypis.setModel(dlm);
        this.zoznamSK = zsk;
        this.sklad = s;
        this.ruo = ruo;
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setVisible(true);                
    }
    
    public void obnovList() {
        DefaultListModel<Pohyb> dlmnew = new DefaultListModel<>();
        for (Pohyb p : pohyby.getPohyby()) {
            dlmnew.addElement(p);
        }
        this.vypis.setModel(dlmnew);
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
        pridajPrijemku = new javax.swing.JButton();
        pridajVydajku = new javax.swing.JButton();
        zauctujPohyb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        druh = new javax.swing.JLabel();
        hodnotaPohybu = new javax.swing.JLabel();
        datumVytvorenia = new javax.swing.JLabel();
        stav = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        odstranPohyb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pohyby na sklade");

        vypis.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                vypisValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(vypis);

        pridajPrijemku.setText("Pridaj príjemku");
        pridajPrijemku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajPrijemkuActionPerformed(evt);
            }
        });

        pridajVydajku.setText("Pridaj výdajku");
        pridajVydajku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajVydajkuActionPerformed(evt);
            }
        });

        zauctujPohyb.setText("Zaúčtuj pohyb");
        zauctujPohyb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zauctujPohybActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Informácie o pohybe");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Druh");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Hodnota pohybu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Dátum vytvorenia");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Stav");

        druh.setText("   ");

        hodnotaPohybu.setText("   ");

        datumVytvorenia.setText("   ");

        stav.setText("   ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ponuka činností");

        odstranPohyb.setText("Odstráň pohyb");
        odstranPohyb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranPohybActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(druh, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(hodnotaPohybu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datumVytvorenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pridajPrijemku, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pridajVydajku, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(odstranPohyb, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zauctujPohyb, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(druh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(hodnotaPohybu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(datumVytvorenia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(stav))
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pridajPrijemku)
                            .addComponent(pridajVydajku))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(odstranPohyb)
                            .addComponent(zauctujPohyb))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridajPrijemkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajPrijemkuActionPerformed
        PridajPrijemkuGUI pp = new PridajPrijemkuGUI(this, true, sklad, zoznamSK, ruo);
        try {
            if (pp.getPrijemka() != null) {
                this.pohyby.pridajPohyb(pp.getPrijemka());
                JOptionPane.showMessageDialog(rootPane, "Príjemka bola pridaná");
                pp.dispose();
            } else {
                pp.dispose();
            }
            this.obnovList();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_pridajPrijemkuActionPerformed

    private void vypisValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_vypisValueChanged
        Pohyb pohyb = (Pohyb)this.vypis.getSelectedValue();
        if (pohyb != null) {
            this.datumVytvorenia.setText(ComparatorsAndDate.Datum.formatDatum(pohyb.getDatumVytvorenia()));
            this.hodnotaPohybu.setText(String.valueOf(pohyb.celkovaSumaString()));
            if (!pohyb.isZauctovany()) {
                this.stav.setText("Nezaúčtovaný");
            } else {
                this.stav.setText("Zaúčtovaný");
            }
            if (pohyb instanceof Prijemka) {
                this.druh.setText("Príjemka");
            } else {
                this.druh.setText("Výdajka");
            }
        }
    }//GEN-LAST:event_vypisValueChanged

    private void zauctujPohybActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zauctujPohybActionPerformed
        Pohyb pohyb = (Pohyb)this.vypis.getSelectedValue();
        if (pohyb != null) {
            if (pohyb.isZauctovany()) {
                JOptionPane.showMessageDialog(rootPane, "Pohyb je už zaúčtovaný");
            } else {
                try {
                    pohyb.zauctujPohyb();
                    JOptionPane.showMessageDialog(rootPane, "Pohyb bol zaúčtovaný");
                } catch (IllegalArgumentException | IllegalStateException e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }    
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nie je zvolený pohyb");
        }
    }//GEN-LAST:event_zauctujPohybActionPerformed

    private void pridajVydajkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajVydajkuActionPerformed
        PridajVydajkuGUI pv = new PridajVydajkuGUI(this, true, sklad, zoznamSK, ruo);
        try {
            if (pv.getVydajka() != null) {
                this.pohyby.pridajPohyb(pv.getVydajka());
                pv.dispose();
                JOptionPane.showMessageDialog(rootPane, "Výdajka bola pridaná");
            } else {
                pv.dispose();
            }
            this.obnovList();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_pridajVydajkuActionPerformed

    private void odstranPohybActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranPohybActionPerformed
       Pohyb selected = (Pohyb) this.vypis.getSelectedValue();
        if (selected != null) {
            int i = JOptionPane.showConfirmDialog(rootPane, "Naozaj chcete odstrániť zvolený pohyb?", "Odstránenie pohybu", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_NO_OPTION) {
                this.pohyby.odstranPohyb(selected); 
                this.obnovList();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nie je zvolený pohyb");
        }
    }//GEN-LAST:event_odstranPohybActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datumVytvorenia;
    private javax.swing.JLabel druh;
    private javax.swing.JLabel hodnotaPohybu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton odstranPohyb;
    private javax.swing.JButton pridajPrijemku;
    private javax.swing.JButton pridajVydajku;
    private javax.swing.JLabel stav;
    private javax.swing.JList vypis;
    private javax.swing.JButton zauctujPohyb;
    // End of variables declaration//GEN-END:variables
}