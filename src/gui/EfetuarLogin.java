
package gui;

import dao.UsuariosDao;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EfetuarLogin extends javax.swing.JFrame {

    /**
     * Creates new form EfetuarLogin
     */
    public EfetuarLogin() {
        initComponents();
        this.addComponentListener(new ComponentAdapter() {

public void componentMoved(ComponentEvent e) {

setEnabled(false);

setEnabled(true);

}

});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButtonCadUsu = new javax.swing.JButton();
        jButtonEfetuarLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfSenha = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonCadUsu.setText("Cadastrar Usuario");
        jButtonCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadUsuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadUsu);
        jButtonCadUsu.setBounds(230, 190, 150, 27);

        jButtonEfetuarLogin.setText("Login");
        jButtonEfetuarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEfetuarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEfetuarLogin);
        jButtonEfetuarLogin.setBounds(160, 130, 80, 27);

        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 50, 80, 27);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 90, 100, 27);
        getContentPane().add(tfLogin);
        tfLogin.setBounds(130, 50, 170, 27);
        getContentPane().add(tfSenha);
        tfSenha.setBounds(130, 90, 170, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEfetuarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEfetuarLoginActionPerformed
        try {
            UsuariosDao dao = new UsuariosDao();
            
            if(dao.checkLogin(tfLogin.getText(), tfSenha.getText())){
                MenuSele frame = new MenuSele();
                frame.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Senha incorreta!");
            }} catch (ClassNotFoundException ex) {
            Logger.getLogger(EfetuarLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EfetuarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEfetuarLoginActionPerformed

    private void jButtonCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadUsuActionPerformed
        new CadastrarUsuarios2_1( this, true ).setVisible( true );
    }//GEN-LAST:event_jButtonCadUsuActionPerformed

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
            java.util.logging.Logger.getLogger(EfetuarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EfetuarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EfetuarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EfetuarLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EfetuarLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadUsu;
    private javax.swing.JButton jButtonEfetuarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfSenha;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel lbPrincipal;
}