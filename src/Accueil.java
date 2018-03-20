/*
    Projet Ingénierie Logicielle M1 MTII
*/


import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents(); // Initialisation des composants
        showBillet(); // Remplissage du tableau
        JRB_oui.setSelected(true);
    }
    
    int pos = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTF_nom = new javax.swing.JTextField();
        JTF_prenom = new javax.swing.JTextField();
        JTF_email = new javax.swing.JTextField();
        JCB_concert = new javax.swing.JComboBox<>();
        JB_modifier = new javax.swing.JButton();
        JRB_oui = new javax.swing.JRadioButton();
        JRB_non = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_billet = new javax.swing.JTable();
        JB_precedent = new javax.swing.JButton();
        JB_suivant = new javax.swing.JButton();
        JB_supprimer = new javax.swing.JButton();
        JB_reserver = new javax.swing.JButton();
        JTF_num = new javax.swing.JTextField();
        JTF_nump = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JT_billetR = new javax.swing.JTable();
        JTF_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        JCB_type = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nom :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Prénom :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Email :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Concert :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Place assise :");

        JTF_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        JTF_prenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        JTF_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        JCB_concert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCB_concert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zaho le 12/12/2018", "Diams le 31/12/2018" }));

        JB_modifier.setText("Modifier");
        JB_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_modifierActionPerformed(evt);
            }
        });

        JRB_oui.setText("Oui");
        JRB_oui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_ouiActionPerformed(evt);
            }
        });

        JRB_non.setText("Non");
        JRB_non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_nonActionPerformed(evt);
            }
        });

        JT_billet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Commande", "Nom", "Prénom", "Email", "Concert", "Place assise", "Numéro place", "Prix"
            }
        ));
        JT_billet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_billetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JT_billet);

        JB_precedent.setText("Précèdent");
        JB_precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_precedentActionPerformed(evt);
            }
        });

        JB_suivant.setText("Suivant");
        JB_suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_suivantActionPerformed(evt);
            }
        });

        JB_supprimer.setText("Supprimer");
        JB_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_supprimerActionPerformed(evt);
            }
        });

        JB_reserver.setText("Enregistrer");
        JB_reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_reserverActionPerformed(evt);
            }
        });

        JTF_num.setEnabled(false);

        jLabel6.setText("Numéro place :");

        jLabel7.setText("ID :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(JB_precedent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_suivant, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_num, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JTF_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(JCB_concert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JRB_oui)
                                .addGap(11, 11, 11)
                                .addComponent(JRB_non))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JTF_nump, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB_reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB_modifier)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JB_supprimer))
                            .addComponent(jLabel6))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_concert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JRB_oui)
                    .addComponent(JRB_non)
                    .addComponent(JB_modifier)
                    .addComponent(JB_supprimer)
                    .addComponent(JTF_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_nump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_reserver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_precedent)
                    .addComponent(JB_suivant))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Commande", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        JT_billetR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Commande", "Nom", "Prénom", "Email", "Concert", "Place assise", "Numéro place", "Prix"
            }
        ));
        jScrollPane3.setViewportView(JT_billetR);

        JTF_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_idActionPerformed(evt);
            }
        });

        jButton1.setText("Lancer la recherche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Rechercher par :");

        JCB_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "nom", "prenom", "email" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCB_type, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel8)
                    .addComponent(JCB_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        jTabbedPane3.addTab("Recherche", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Affichage des résultats de la recherche au niveau du JTable
        DefaultTableModel model = (DefaultTableModel)JT_billetR.getModel();
        model.setRowCount(0);
        showSearchBillet();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JB_reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_reserverActionPerformed
         Connection con = getConnection();

        if(checkInput()) { // Si les cases sont bien remplies
            try {
                // Utilisation des requetes préparées
                PreparedStatement ps = con.prepareStatement("INSERT INTO billet(nom, prenom, email, concert, place_assise, numero_place, prix) " + "VALUES(?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, JTF_nom.getText());
                ps.setString(2, JTF_prenom.getText());
                ps.setString(3, JTF_email.getText());
                ps.setString(4, JCB_concert.getSelectedItem().toString());
                if (JRB_oui.isSelected()) {
                    ps.setString(5, "Oui");
                    ps.setInt(6,  Integer.parseInt(JTF_nump.getText()));
                    ps.setInt(7, 30);
                } else {
                    ps.setString(5, "Non");
                    ps.setInt(6, 0);
                    ps.setInt(7, 20);
                }
                ps.executeUpdate();
                showBillet();
                JOptionPane.showMessageDialog(null, "Réservation enregistré");
            } catch (SQLException ex) {
                Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Veuillez renseigner correctement les champs !");
        }

        // Nettoyage des input
        clearInput();
    }//GEN-LAST:event_JB_reserverActionPerformed

    private void JB_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_supprimerActionPerformed
        // Suppression des éléments
        Connection con = getConnection();

        if(checkInput()) { // Si les cases sont bien remplies
            try {
                // Utilisation des requetes préparées
                PreparedStatement ps = con.prepareStatement("DELETE FROM billet WHERE id = ?");
                ps.setString(1, JTF_num.getText());
                ps.executeUpdate();
                showBillet();
                JOptionPane.showMessageDialog(null, "Données supprimées avec succès");
            } catch (SQLException ex) {
                Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Veuillez renseigner correctement les champs !");
        }

        // Nettoyage des input
        clearInput();
    }//GEN-LAST:event_JB_supprimerActionPerformed

    private void JB_suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_suivantActionPerformed
        // Parcours de la liste des billets avec le bouttton suivant
        pos++;
        if (pos >= getBillet().size()) {
            pos = getBillet().size() - 1 ;
        }
        showElements(pos);
    }//GEN-LAST:event_JB_suivantActionPerformed

    private void JB_precedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_precedentActionPerformed
        // Parcours de la liste des billets avec le bouttton précèdent
        pos--;
        if (pos < 0) {
            pos = 0;
        }
        showElements(pos);
    }//GEN-LAST:event_JB_precedentActionPerformed

    private void JT_billetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_billetMouseClicked
        // Remplissage des inputs au click sur une ligne du JTable
        int index = JT_billet.getSelectedRow();
        showElements(index);
    }//GEN-LAST:event_JT_billetMouseClicked

    private void JRB_nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_nonActionPerformed
        if(JRB_non.isSelected()) {
            JRB_oui.setSelected(false);
            JTF_nump.setEnabled(false);
        }
    }//GEN-LAST:event_JRB_nonActionPerformed

    private void JRB_ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_ouiActionPerformed
        if(JRB_oui.isSelected()) {
            JRB_non.setSelected(false);
            JTF_nump.setEnabled(true);
        }
    }//GEN-LAST:event_JRB_ouiActionPerformed

    private void JB_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_modifierActionPerformed
        // Mise à jour des données
        Connection con = getConnection();

        if(checkInput()) { // Si les cases sont bien remplies
            try {
                // Utilisation des requetes préparées
                PreparedStatement ps = con.prepareStatement("UPDATE billet SET nom = ?, prenom = ?, email = ?, concert = ?, place_assise = ?, numero_place = ?, prix = ? WHERE id = ?");
                ps.setString(1, JTF_nom.getText());
                ps.setString(2, JTF_prenom.getText());
                ps.setString(3, JTF_email.getText());
                ps.setString(4, JCB_concert.getSelectedItem().toString());
                if (JRB_oui.isSelected()) {
                    ps.setString(5, "Oui");
                    ps.setInt(6, Integer.parseInt(JTF_nump.getText()));
                    ps.setInt(7, 30);
                } else {
                    ps.setString(5, "Non");
                    ps.setInt(6, 0);
                    ps.setInt(7, 20);
                }
                ps.setString(8, JTF_num.getText());
                ps.executeUpdate();
                showBillet();
                JOptionPane.showMessageDialog(null, "Modifications enregistrés avec succès");
            } catch (SQLException ex) {
                Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Veuillez renseigner correctement les champs !");
        }

        // Nettoyage des input
        clearInput();
    }//GEN-LAST:event_JB_modifierActionPerformed

    private void JTF_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_idActionPerformed

    // On vérifie que les inputs sont bien remplies
    public boolean checkInput() {
        if (JTF_nom.getText().equals("") && JTF_prenom.getText().equals("") && JTF_email.getText().equals(""))
            return false;
        else
            return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_modifier;
    private javax.swing.JButton JB_precedent;
    private javax.swing.JButton JB_reserver;
    private javax.swing.JButton JB_suivant;
    private javax.swing.JButton JB_supprimer;
    private javax.swing.JComboBox<String> JCB_concert;
    private javax.swing.JComboBox<String> JCB_type;
    private javax.swing.JRadioButton JRB_non;
    private javax.swing.JRadioButton JRB_oui;
    private javax.swing.JTextField JTF_email;
    private javax.swing.JTextField JTF_id;
    private javax.swing.JTextField JTF_nom;
    private javax.swing.JTextField JTF_num;
    private javax.swing.JTextField JTF_nump;
    private javax.swing.JTextField JTF_prenom;
    private javax.swing.JTable JT_billet;
    private javax.swing.JTable JT_billetR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
    
    // Get connexion
    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/billeterie?autoReconnect=true&useSSL=false", "billeterie", "billeterie");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Affichage des données contenues dans la classe Billet
    public ArrayList<Billet> getBillet() {
        
        ArrayList<Billet> listBillet = new ArrayList<Billet>();
        Connection con = getConnection();
        String query = "SELECT * FROM billet";
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Billet billet;
            
            while (rs.next()) {
                billet = new Billet(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("concert"), rs.getString("place_assise"), rs.getInt("numero_place"), rs.getFloat("prix"));
                listBillet.add(billet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBillet;
    }
    
    // Affichage des données au niveau du JTable
    public void showBillet() {
        ArrayList<Billet> list = getBillet();
        DefaultTableModel model = (DefaultTableModel)JT_billet.getModel();
        Object[] row = new Object[8];
        model.setRowCount(0);
        for(int i = 0 ; i < list.size() ; i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getNom();
            row[2] = list.get(i).getPrenom();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getConcert();
            row[5] = list.get(i).getPlaceAssise();
            row[6] = list.get(i).getNumeroPlace();
            row[7] = list.get(i).getPrix();
            model.addRow(row);
        }   
    }
    
      // Récupération des résultats de la recherche au niveau du JTable
    public ArrayList<Billet> getResultBillet() {
        ArrayList<Billet> listBillet = new ArrayList<Billet>();
        Connection con = getConnection();
        PreparedStatement ps;
        ResultSet rs;
        if (JCB_type.getSelectedItem().toString() == "Id") {
            try {
            ps = con.prepareStatement("SELECT * FROM billet WHERE id = ?");
            ps.setInt(1, Integer.parseInt(JTF_id.getText()));
            rs = ps.executeQuery();
            Billet billet;
            
            // Tant qu'il ya des données à lire, on parcours la liste et on les ajoute dans listBillet
            while (rs.next()) {
                billet = new Billet(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("concert"), rs.getString("place_assise"), rs.getInt("numero_place"), rs.getFloat("prix"));
                listBillet.add(billet);
            }
            } catch (SQLException ex) {
                Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listBillet;
    }
    
    // Affichage des résultats de la recherche dans la JTable
    public void showSearchBillet() {
        ArrayList<Billet> list = getResultBillet();
        DefaultTableModel model = (DefaultTableModel)JT_billetR.getModel();
        Object[] row = new Object[8];
        
        if (!(list.isEmpty())) { // Si la liste n'est pas vide
            for(int i = 0 ; i < list.size() ; i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getNom();
            row[2] = list.get(i).getPrenom();
            row[3] = list.get(i).getEmail();
            row[4] = list.get(i).getConcert();
            row[5] = list.get(i).getPlaceAssise();
            row[6] = list.get(i).getNumeroPlace();
            row[7] = list.get(i).getPrix();
        }
        model.addRow(row);
        } else {
                JOptionPane.showMessageDialog(null, "La recherche n'a donné aucun résultat");
        }
    }
    
    // Affichage des éléments
    public void showElements(int index) {
        JTF_num.setText(String.valueOf(getBillet().get(index).getId()));
        JTF_nom.setText(getBillet().get(index).getNom());
        JTF_prenom.setText(getBillet().get(index).getPrenom());
        JTF_email.setText(getBillet().get(index).getEmail());
        JTF_nump.setText(String.valueOf(getBillet().get(index).getNumeroPlace()));
    }
    
    // Nettoyage des inputs
    public void clearInput() {
        JTF_nom.setText("");
        JTF_prenom.setText("");
        JTF_email.setText("");
        JTF_nump.setText("");
    }
}