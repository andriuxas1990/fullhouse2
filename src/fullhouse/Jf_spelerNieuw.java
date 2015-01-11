/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karen
 */
public class Jf_spelerNieuw extends javax.swing.JFrame {

    /**
     * Creates new form Jf_NewEvent
     */
    public Jf_spelerNieuw() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/resources/pokerSpade.png")).getImage());
        this.getContentPane().setBackground(Color.white);

    }

//     private void getSpelersNr(){
//        try {
//            //DefaultTableModel datamodel = createVoedingModel();
//            //this.jt_Voedsel.setModel(datamodel);
//            Connection connection = FullhouseDB.getConnection();
//            
//           
//            String query = "select spelernr from Speler where spelernr = '100';";
//            PreparedStatement statement = connection.prepareStatement(query);
//             ResultSet results = statement.executeQuery();
//            
//            while(results.next()){
//                int spelernr = results.getInt("spelernr");
//                System.out.println(spelernr);
//                // Object[row][column]
//                //datamodel.addRow(rij);
//             }
//            //this.jt_Voedsel.setModel(datamodel);
//        } catch (SQLException ex) {
//            Logger.getLogger(Jf_spelerNieuw.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jT_nieuwSpeTelefoon = new javax.swing.JTextField();
        jT_nieuwSpePostcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jT_nieuwSpeEmail = new javax.swing.JTextField();
        jT_nieuwSpeStad = new javax.swing.JTextField();
        jT_nieuwSpeRank = new javax.swing.JTextField();
        jT_nieuwSpeMob = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jT_nieuwSpeNaam = new javax.swing.JTextField();
        jT_nieuwSpeAdr = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jC_nieuwSpeInstr = new javax.swing.JCheckBox();
        jB_spelerToevoegen = new javax.swing.JButton();
        jD_nieuwSpeGeb = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATIE NIEUWE SPELER ");
        jLabel1.setToolTipText("");

        jLabel3.setText("Naam:");

        jLabel4.setText("Adres:");

        jLabel6.setText("Postcode:");

        jLabel7.setText("Geboortedatum:");

        jLabel8.setText("Telefoonnummer:");

        jLabel9.setText("Email:");

        jT_nieuwSpeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nieuwSpeEmailActionPerformed(evt);
            }
        });

        jT_nieuwSpeStad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nieuwSpeStadActionPerformed(evt);
            }
        });

        jLabel16.setText("Mobiel:");

        jT_nieuwSpeNaam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nieuwSpeNaamActionPerformed(evt);
            }
        });

        jT_nieuwSpeAdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nieuwSpeAdrActionPerformed(evt);
            }
        });

        jLabel17.setText("Stad:");

        jLabel18.setText("Ranking:");

        jC_nieuwSpeInstr.setText("Instructor?");

        jB_spelerToevoegen.setText("Opslaan");
        jB_spelerToevoegen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_spelerToevoegenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jT_nieuwSpeNaam, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jT_nieuwSpeAdr, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jT_nieuwSpeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jT_nieuwSpeTelefoon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jT_nieuwSpeMob, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jD_nieuwSpeGeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel18))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jT_nieuwSpeStad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jT_nieuwSpePostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jT_nieuwSpeRank, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(jC_nieuwSpeInstr))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jB_spelerToevoegen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jT_nieuwSpePostcode, jT_nieuwSpeRank, jT_nieuwSpeStad});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jT_nieuwSpeNaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jT_nieuwSpeAdr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jD_nieuwSpeGeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jT_nieuwSpeTelefoon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jT_nieuwSpeMob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jT_nieuwSpeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jC_nieuwSpeInstr))
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_nieuwSpePostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_nieuwSpeStad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jT_nieuwSpeRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(jB_spelerToevoegen)
                .addGap(172, 172, 172))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_nieuwSpeAdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nieuwSpeAdrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nieuwSpeAdrActionPerformed

    private void jT_nieuwSpeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nieuwSpeEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nieuwSpeEmailActionPerformed

    private void jT_nieuwSpeStadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nieuwSpeStadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nieuwSpeStadActionPerformed

    private void jB_spelerToevoegenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_spelerToevoegenActionPerformed


        //int nr = Integer.parseInt(jT_nieuweSpeNr.getText());
        String naam = jT_nieuwSpeNaam.getText();
        String adres = jT_nieuwSpeAdr.getText();
        String postcode = jT_nieuwSpePostcode.getText();
        String woonplaats = jT_nieuwSpeStad.getText();
        String telnr = jT_nieuwSpeTelefoon.getText();
        //int mob = Integer.parseInt(jT_nieuwSpeMob.getText());
        String mail = jT_nieuwSpeEmail.getText();
        Date gebortedatum = jD_nieuwSpeGeb.getDate();
        
        jD_nieuwSpeGeb.setDateFormatString("dd-MM-yyyy");
        SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String gebdatum = dateFormate.format(jD_nieuwSpeGeb.getDate());
      
       
        //JOptionPane.showMessageDialog(null, "Speler " + gebdatum);
        int ranking = Integer.parseInt(jT_nieuwSpeRank.getText());
        boolean instructeur = jC_nieuwSpeInstr.isSelected();
        System.out.println(gebdatum);



        String query = "INSERT INTO Speler (s_naam, s_adres, s_postcode, s_woonplaats, s_telefoonnr, s_mail, s_geb_datum, s_ranking, s_isMasterClassInstr)"
                + " VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? );";


        try {
            Connection connection = FullhouseDB.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            //statement.setInt(1, nr);
            statement.setString(1, naam);
            statement.setString(2, adres);
            statement.setString(3, postcode);
            statement.setString(4, woonplaats);
            statement.setString(5, telnr);
            statement.setString(6, mail);
            statement.setString(7, gebdatum);
            statement.setInt(8, ranking);
            statement.setBoolean(9, instructeur);



            int rows = statement.executeUpdate();

            //vulVoedselTabel();

            if (rows != 1) {
                System.out.println("FOUT!!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jf_spelerNieuw.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jB_spelerToevoegenActionPerformed

    private void jT_nieuwSpeNaamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nieuwSpeNaamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nieuwSpeNaamActionPerformed

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
            java.util.logging.Logger.getLogger(Jf_spelerNieuw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jf_spelerNieuw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jf_spelerNieuw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jf_spelerNieuw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Jf_spelerNieuw().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_spelerToevoegen;
    private javax.swing.JCheckBox jC_nieuwSpeInstr;
    private com.toedter.calendar.JDateChooser jD_nieuwSpeGeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jT_nieuwSpeAdr;
    private javax.swing.JTextField jT_nieuwSpeEmail;
    private javax.swing.JTextField jT_nieuwSpeMob;
    private javax.swing.JTextField jT_nieuwSpeNaam;
    private javax.swing.JTextField jT_nieuwSpePostcode;
    private javax.swing.JTextField jT_nieuwSpeRank;
    private javax.swing.JTextField jT_nieuwSpeStad;
    private javax.swing.JTextField jT_nieuwSpeTelefoon;
    // End of variables declaration//GEN-END:variables
}
