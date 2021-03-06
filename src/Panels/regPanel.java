/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

//import PanelForms.Test.RegistrationFrame;
import Dao.DataBase_Connection;
import PanelForms.Test.Encryption;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ranjan
 */
public class regPanel extends javax.swing.JPanel {
    protected Connection conInstance;
     protected Statement smtInstance;
     ResultSet rs;
     DataBase_Connection dao;
     public String namefromDatabase;
     public String Warning;

    /**
     * Creates new form regPanel
     */
    public regPanel() {
        initComponents();
        dao = new DataBase_Connection();
        conInstance = dao.getConnection();
        txtName.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pwdConfirmUserPassword = new javax.swing.JPasswordField();
        submittButton = new javax.swing.JButton();
        pwdUserPassword = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblWarning = new javax.swing.JLabel();
        lblUserPwdNotification = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.control);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel5.setText("Username :");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel6.setText("Full Name :");

        jLabel7.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel7.setText("Password :");

        jLabel8.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        jLabel8.setText("Re-Password :");

        pwdConfirmUserPassword.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        pwdConfirmUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdConfirmUserPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdConfirmUserPasswordKeyReleased(evt);
            }
        });

        submittButton.setFont(new java.awt.Font("Century Schoolbook L", 3, 15)); // NOI18N
        submittButton.setText("Register");
        submittButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submittButtonActionPerformed(evt);
            }
        });

        pwdUserPassword.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        pwdUserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdUserPasswordKeyPressed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        lblWarning.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        lblWarning.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblUserPwdNotification.setFont(new java.awt.Font("Century Schoolbook L", 1, 12)); // NOI18N
        lblUserPwdNotification.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwdUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submittButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pwdConfirmUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(lblUserPwdNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(55, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(pwdConfirmUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(pwdUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUserPwdNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addComponent(submittButton)
                .addGap(40, 40, 40))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, jLabel8, pwdConfirmUserPassword, pwdUserPassword, txtName, txtUserName});

    }// </editor-fold>//GEN-END:initComponents

    public void reset(){
        txtUserName.setText("");
        txtName.setText("");
        pwdUserPassword.setText("");
        pwdConfirmUserPassword.setText("");
        lblWarning.setText("");
        lblUserPwdNotification.setText("");
    }
    
    private void pwdConfirmUserPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdConfirmUserPasswordKeyReleased
        String pass = new String (pwdUserPassword.getPassword());
        String pass1 = new String (pwdConfirmUserPassword.getPassword());

        String mpass = "0000";
        if((pass.equals(pass1))){
            lblUserPwdNotification.setText("match");
            lblUserPwdNotification.setForeground(Color.green);
        }
        else
        {
            lblUserPwdNotification.setText("error");
            lblUserPwdNotification.setForeground(Color.red);
        }
    }//GEN-LAST:event_pwdConfirmUserPasswordKeyReleased

    private void registerUser(){
        try {
            String pass = new String (pwdUserPassword.getPassword());
            String pass1 = new String (pwdConfirmUserPassword.getPassword());

            String mpass = "0000";
            if((pass.equals(pass1)) && !"".equals(pass)){
                String Userpassword = Encryption.SHA1(pass);
                String Masterpassword = Encryption.SHA1(mpass);
                String insertUser = "insert ignore into Login_tbl values ('"+txtUserName.getText()+"','"+txtName.getText()+"','"+Userpassword+"','"+Masterpassword+"')";
                smtInstance = conInstance.createStatement();
                int r = smtInstance.executeUpdate(insertUser);
                if(r!=0){
                    JOptionPane.showMessageDialog(null,"User Registered");
                    reset();
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(regPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void submittButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submittButtonActionPerformed
        if(txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Name",
                            "Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocus();
        }
        else if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Username",
                            "Error", JOptionPane.ERROR_MESSAGE);
            txtUserName.requestFocus();
        }
        else{
            registerUser();
        }

    }//GEN-LAST:event_submittButtonActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained

    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        if(!txtUserName.getText().isEmpty()){
            try {
                String check = "select * from Login_tbl where UserId ='"+txtUserName.getText()+"'";
                smtInstance = conInstance.createStatement();
                ResultSet rs = smtInstance.executeQuery(check);

                if(!rs.next()){
                    Warning = "available.";
                    submittButton.setEnabled(true);
                }
                else{
                    Warning = "unavailable.";
                    submittButton.setEnabled(false);

                }

            } catch (SQLException ex) {
                Logger.getLogger(regPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{
            Warning = "Error";
            txtUserName.requestFocus();

        }
        lblWarning.setText(Warning);
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            txtUserName.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            pwdUserPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void pwdUserPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdUserPasswordKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            pwdConfirmUserPassword.requestFocus();
        }
    }//GEN-LAST:event_pwdUserPasswordKeyPressed

    private void pwdConfirmUserPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdConfirmUserPasswordKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            submittButton.requestFocus();
        }
    }//GEN-LAST:event_pwdConfirmUserPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblUserPwdNotification;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JPasswordField pwdConfirmUserPassword;
    private javax.swing.JPasswordField pwdUserPassword;
    private javax.swing.JButton submittButton;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
