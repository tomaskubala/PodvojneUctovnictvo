/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Doklady.ZoznamDokladov;
import Majetok.ZoznamMajetku;
import Partneri.ZoznamPartnerov;
import Podnik.Podnik;
import RamcovaUctovaOsnova.RamcovaUctovaOsnova;
import Sklad.PohybyNaSklade;
import Sklad.Sklad;
import Sklad.ZoznamSkladovychKariet;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Tomáš
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form PrveOknoGUI
     */
    public Main() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vytvorPodnik = new javax.swing.JButton();
        obnovPodnik = new javax.swing.JButton();
        ukonciProgram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Podvojné účtovníctvo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PODVOJNÉ ÚČTOVNÍCTVO");

        jLabel2.setText("Víta Vás program Podvojné účtovníctvo. Tento program slúži na vedenie účtovníctva");

        jLabel3.setText(" pre spoločnosti s ručením obmedzením a akciové spoločnosti.");

        jLabel4.setText("Vyberte si z nasledujúcej ponuky:");

        vytvorPodnik.setText("Vytvor nový podnik");
        vytvorPodnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vytvorPodnikActionPerformed(evt);
            }
        });

        obnovPodnik.setText("Obnov podnik zo súboru");
        obnovPodnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obnovPodnikActionPerformed(evt);
            }
        });

        ukonciProgram.setText("Ukonči program");
        ukonciProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukonciProgramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(vytvorPodnik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(obnovPodnik)
                        .addGap(10, 10, 10)
                        .addComponent(ukonciProgram)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ukonciProgram)
                    .addComponent(vytvorPodnik)
                    .addComponent(obnovPodnik))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private void vytvorPodnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vytvorPodnikActionPerformed
        dispose();
        TvorbaPodnikuGUI tp = new TvorbaPodnikuGUI(null, true);
        Podnik p = tp.getPodnik();
        HlavneOknoGUI mw = null;
        try {
            mw = new HlavneOknoGUI(p);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_vytvorPodnikActionPerformed

    private void obnovPodnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obnovPodnikActionPerformed
        String nazovSuboru = JOptionPane.showInputDialog(this, "Zadajte názov obnovy", "Záloha podniku", 1);
        if (nazovSuboru == null) {
            JOptionPane.showMessageDialog(this, "Obnova podniku nebola vykonaná");
        } else if (nazovSuboru.length() == 0 || nazovSuboru.charAt(0) == ' ') {
            JOptionPane.showMessageDialog(this, "Bol zadaný zlý názov súboru");
        } else {
            String file = "AppData\\Backup\\" + nazovSuboru;
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                RamcovaUctovaOsnova ruo = (RamcovaUctovaOsnova) ois.readObject();
                ZoznamPartnerov zp = (ZoznamPartnerov) ois.readObject();
                ZoznamMajetku zm = (ZoznamMajetku) ois.readObject();
                ZoznamSkladovychKariet zsk = (ZoznamSkladovychKariet) ois.readObject();
                Sklad sklad = (Sklad) ois.readObject();
                PohybyNaSklade pohyby = (PohybyNaSklade) ois.readObject();
                Podnik podnik = (Podnik) ois.readObject();
                ZoznamDokladov zd = (ZoznamDokladov) ois.readObject();
                HlavneOknoGUI ho = new HlavneOknoGUI(podnik, ruo, zp, zm, zsk, sklad, pohyby, zd);
                JOptionPane.showMessageDialog(this, "Obnova podniku prebehla úspešne");
                dispose();
                ho.setVisible(true);
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        }
    }//GEN-LAST:event_obnovPodnikActionPerformed

    private void ukonciProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukonciProgramActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ukonciProgramActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton obnovPodnik;
    private javax.swing.JButton ukonciProgram;
    private javax.swing.JButton vytvorPodnik;
    // End of variables declaration//GEN-END:variables
}