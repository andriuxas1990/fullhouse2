/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author antonioym
 */
public class Jf_Overzicht extends javax.swing.JFrame {

    /**
     * Creates new form Jf_Overzicht
     */
    public Jf_Overzicht() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/resources/pokerSpade.png")).getImage());
        jComboBox_Toernooi.setVisible(false);
        jComboBox_Speler.setVisible(false);
        selectie();
        
        
        
        
    }
    private void selectie(){
    /*
     * Toernooi Selectie
     */
        this.jComboBox_Toernooi.addItem("");
        this.jComboBox_Toernooi.addItem("Geplande Toernooi");
        this.jComboBox_Toernooi.addItem("Alle Toernooien");
        this.jComboBox_Toernooi.addItem("Per Ronde Tafel Indeling");
   /*
    * Speler Selectie
    */
        this.jComboBox_Speler.addItem("");
        this.jComboBox_Speler.addItem("Overzicht Rating met gewone geld");
        this.jComboBox_Speler.addItem("Overzicht ingechreven niet betaald");
        
    }
                 
    private DefaultTableModel createOverzichtModel(){
        DefaultTableModel model = new TableModel();
        model.addColumn("voedingsnummer");
        model.addColumn("naam eten");
        return model;
    }
    
    class TableModel extends DefaultTableModel{
        
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
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
        jTable_Overzicht = new javax.swing.JTable();
        jToggleButton_Toernooi = new javax.swing.JToggleButton();
        jToggleButton_Speler = new javax.swing.JToggleButton();
        jComboBox_Speler = new javax.swing.JComboBox();
        jComboBox_Toernooi = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jTable_Overzicht.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Overzicht);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 450, 230);

        jToggleButton_Toernooi.setText("Selecteer Toernooi");
        jToggleButton_Toernooi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_ToernooiActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton_Toernooi);
        jToggleButton_Toernooi.setBounds(10, 10, 240, 29);

        jToggleButton_Speler.setText("Selecteer Speler");
        jToggleButton_Speler.setMaximumSize(new java.awt.Dimension(100, 29));
        jToggleButton_Speler.setMinimumSize(new java.awt.Dimension(100, 29));
        jToggleButton_Speler.setPreferredSize(new java.awt.Dimension(100, 29));
        jToggleButton_Speler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_SpelerActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton_Speler);
        jToggleButton_Speler.setBounds(250, 10, 240, 29);

        jComboBox_Speler.setMinimumSize(new java.awt.Dimension(275, 27));
        jComboBox_Speler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SpelerActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_Speler);
        jComboBox_Speler.setBounds(260, 40, 220, 27);

        jComboBox_Toernooi.setMinimumSize(new java.awt.Dimension(275, 27));
        jComboBox_Toernooi.setPreferredSize(new java.awt.Dimension(210, 27));
        jComboBox_Toernooi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ToernooiActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_Toernooi);
        jComboBox_Toernooi.setBounds(20, 40, 220, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_ToernooiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_ToernooiActionPerformed
        if(jToggleButton_Toernooi.isSelected())
        {
            jToggleButton_Toernooi.setText("Toernooi Geselecteerd");
            jComboBox_Toernooi.setVisible(true);
           // jToggleButton_Speler.setSelected(false);
            if(jToggleButton_Toernooi.hasFocus())
                {
                    jToggleButton_Speler.setSelected(false);
                    jComboBox_Speler.setVisible(false);
                    jToggleButton_Speler.setText("Selecteer Speler");
           
                }
            
        }
        else 
        {
            jToggleButton_Toernooi.setText("Selecteer Toernooi");
            jComboBox_Toernooi.setVisible(false);
            //jToggleButton_Speler.setSelected(true);
            
        }
    }//GEN-LAST:event_jToggleButton_ToernooiActionPerformed

    private void jToggleButton_SpelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_SpelerActionPerformed
       if(jToggleButton_Speler.isSelected())
       {
           jToggleButton_Speler.setText("Speler Geselecteerd");
           jComboBox_Speler.setVisible(true);
           
           if(jToggleButton_Speler.hasFocus())
                {
                    jToggleButton_Toernooi.setSelected(false);
                    jComboBox_Toernooi.setVisible(false);
                    jToggleButton_Toernooi.setText("Selecteer Toernooi");
                }
       }
       else
       {
            jToggleButton_Speler.setText("Selecteer Speler");
            jComboBox_Speler.setVisible(false);
            //jToggleButton_Toernooi.setSelected(true);
            
       }

    }//GEN-LAST:event_jToggleButton_SpelerActionPerformed

    private void jComboBox_ToernooiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ToernooiActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox_ToernooiActionPerformed

    private void jComboBox_SpelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SpelerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_SpelerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jf_Overzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_Overzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_Overzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_Overzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Jf_Overzicht().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox_Speler;
    private javax.swing.JComboBox jComboBox_Toernooi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Overzicht;
    private javax.swing.JToggleButton jToggleButton_Speler;
    private javax.swing.JToggleButton jToggleButton_Toernooi;
    // End of variables declaration//GEN-END:variables
}
