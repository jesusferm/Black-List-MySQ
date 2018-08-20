/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbasedatos.interfaces;

import gestionbasedatos.clases.AdminBDListaNegra;
import gestionbasedatos.clases.CifradoMD5;
import gestionbasedatos.clases.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author m2 <linuxitos@gmail.com>
 */
public class LoginBD extends javax.swing.JFrame {

    /**
     * Creates new form LoginBD
     */
    public LoginBD() {
        initComponents();
        setLocationRelativeTo(null);
        Image icon3 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/favicon.png"));
        setIconImage(icon3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtNickName = new javax.swing.JTextField();
        jpasswd = new javax.swing.JPasswordField();
        jbCrearNuevoUsuario = new javax.swing.JButton();
        jbAcceder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminBD");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jtxtNickName.setText("NickName");
        jtxtNickName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNickNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNickNameFocusLost(evt);
            }
        });
        jtxtNickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNickNameKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtNickName);
        jtxtNickName.setBounds(240, 110, 170, 28);

        jpasswd.setText("password");
        jpasswd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpasswdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpasswdFocusLost(evt);
            }
        });
        jpasswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpasswdKeyPressed(evt);
            }
        });
        jPanel1.add(jpasswd);
        jpasswd.setBounds(240, 160, 170, 28);

        jbCrearNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbasedatos/png/32x32/user.png"))); // NOI18N
        jbCrearNuevoUsuario.setText("Registrarse");
        jbCrearNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearNuevoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jbCrearNuevoUsuario);
        jbCrearNuevoUsuario.setBounds(420, 300, 140, 30);

        jbAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbasedatos/png/32x32/next.png"))); // NOI18N
        jbAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAccederActionPerformed(evt);
            }
        });
        jPanel1.add(jbAcceder);
        jbAcceder.setBounds(240, 200, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbasedatos/images/login.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 590, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNickNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNickNameKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            jbAcceder.doClick();
        }
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_jtxtNickNameKeyPressed

    private void jpasswdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpasswdKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            jbAcceder.doClick();
        }
        if (evt.getKeyCode()==KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_jpasswdKeyPressed

    private void jtxtNickNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNickNameFocusGained
        if(jtxtNickName.getText().equals("NickName")){
            jtxtNickName.setText("");
        }
    }//GEN-LAST:event_jtxtNickNameFocusGained

    private void jpasswdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpasswdFocusGained
        if(jpasswd.getText().equals("password")){
            jpasswd.setText("");
        }
    }//GEN-LAST:event_jpasswdFocusGained

    private void jtxtNickNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNickNameFocusLost
        if(jtxtNickName.getText().equals("")){
            jtxtNickName.setText("NickName");
        }
    }//GEN-LAST:event_jtxtNickNameFocusLost

    private void jpasswdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpasswdFocusLost
        if(new String(jpasswd.getPassword()).equals("")){
            jpasswd.setText("password");
        }
    }//GEN-LAST:event_jpasswdFocusLost

    private void jbAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAccederActionPerformed
        if(jtxtNickName.getText().length()>0 && (new String(jpasswd.getPassword())).length()>0){
            AdminBDListaNegra  newUser = new AdminBDListaNegra();
            Usuario user = new Usuario();
            user = newUser.validateUser(jtxtNickName.getText().toLowerCase(), CifradoMD5.Cifrado(new String(jpasswd.getPassword())));
            if(!user.getNick().equals("")){
                ModificarBD nueModi = new ModificarBD(this, user);
                this.setVisible(false);
                /*Se envia el objeto login para regresar en caso de cerrar sesión, y se
                envía el objeto usuario, que contiene toda la información del usuario*/
                nueModi.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellena todos los campos.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAccederActionPerformed

    private void jbCrearNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearNuevoUsuarioActionPerformed
        NuevoUsuario nuevoUsuario = new NuevoUsuario(this, true);
        nuevoUsuario.setVisible(true);
    }//GEN-LAST:event_jbCrearNuevoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAcceder;
    private javax.swing.JButton jbCrearNuevoUsuario;
    private javax.swing.JPasswordField jpasswd;
    private javax.swing.JTextField jtxtNickName;
    // End of variables declaration//GEN-END:variables
}