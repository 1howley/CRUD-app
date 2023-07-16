package login;

import DAO.UsuarioDAO;
import entity.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScreenSignUP extends javax.swing.JFrame {

    public ScreenSignUP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        labelConfirmPass = new javax.swing.JLabel();
        txtConfirmPass = new javax.swing.JPasswordField();
        btnSignUP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(60, 60, 60));

        labelLogin.setBackground(new java.awt.Color(255, 255, 255));
        labelLogin.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login:");

        txtLogin.setBackground(new java.awt.Color(75, 75, 75));
        txtLogin.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setAlignmentY(0.0F);
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 75, 75), 3));
        txtLogin.setPreferredSize(new java.awt.Dimension(7, 20));

        labelPass.setBackground(new java.awt.Color(255, 255, 255));
        labelPass.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setText("Pass:");

        txtEmail.setBackground(new java.awt.Color(75, 75, 75));
        txtEmail.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setAlignmentY(0.0F);
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 75, 75), 3));
        txtEmail.setPreferredSize(new java.awt.Dimension(7, 20));

        labelName.setBackground(new java.awt.Color(255, 255, 255));
        labelName.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Name:");

        txtName.setBackground(new java.awt.Color(75, 75, 75));
        txtName.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setAlignmentY(0.0F);
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 75, 75), 3));
        txtName.setPreferredSize(new java.awt.Dimension(7, 20));

        labelEmail.setBackground(new java.awt.Color(255, 255, 255));
        labelEmail.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email:");

        txtPass.setBackground(new java.awt.Color(75, 75, 75));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 75, 75), 3));

        labelConfirmPass.setBackground(new java.awt.Color(255, 255, 255));
        labelConfirmPass.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        labelConfirmPass.setText("Confirm Pass:");

        txtConfirmPass.setBackground(new java.awt.Color(75, 75, 75));
        txtConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 75, 75), 3));
        txtConfirmPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPassKeyPressed(evt);
            }
        });

        btnSignUP.setBackground(new java.awt.Color(102, 255, 102));
        btnSignUP.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnSignUP.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUP.setText("SIGN UP");
        btnSignUP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSignUP.setContentAreaFilled(false);
        btnSignUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelConfirmPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelEmail)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPass, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtConfirmPass)
                    .addComponent(btnSignUP, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelLogin)
                .addGap(6, 6, 6)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelName)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelEmail)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPass)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelConfirmPass)
                .addGap(18, 18, 18)
                .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnSignUP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUPActionPerformed
        // TODO add your handling code here:
        SignUp();
    }//GEN-LAST:event_btnSignUPActionPerformed

    private void txtConfirmPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SignUp();
        }
    }//GEN-LAST:event_txtConfirmPassKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenSignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenSignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenSignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenSignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenSignUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUP;
    private javax.swing.JLabel labelConfirmPass;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPass;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

    public boolean verificaCampos() {
        
        ArrayList<JTextField> camposTxt = new ArrayList<>();
        camposTxt.add(txtName);
        camposTxt.add(txtEmail);
        camposTxt.add(txtLogin);
        camposTxt.add(txtConfirmPass);
        camposTxt.add(txtPass);
        
        ArrayList<JLabel> camposLabel = new ArrayList<>();
        camposLabel.add(labelName);
        camposLabel.add(labelEmail);
        camposLabel.add(labelLogin);
        camposLabel.add(labelConfirmPass);
        camposLabel.add(labelPass);

        int aux = 0;
        
        for (int x = 0; x < 5; x++) {
            if (camposTxt.get(x).getText().isBlank()) {
                aux += 1;
                camposLabel.get(x).setForeground(Color.red);
            }
        }
        return aux > 0;
    }
    
    public boolean verificaEmail() {
        if (txtEmail.getText().contains("@") && txtEmail.getText().contains(".com")) {
            return false;
        } else {
            labelEmail.setForeground(Color.red);
            txtEmail.setText("");
            return true;
        }
    }
    
    public void SignUp() {
        
        ArrayList<JLabel> camposLabel = new ArrayList<>();
        camposLabel.add(labelName);
        camposLabel.add(labelEmail);
        camposLabel.add(labelLogin);
        camposLabel.add(labelConfirmPass);
        camposLabel.add(labelPass);
        
        for (int x = 0; x < 5; x++) {
            camposLabel.get(x).setForeground(Color.WHITE);
        }
        
        UsuarioDAO user = new UsuarioDAO();    
        
        if (txtPass.getText().equals(txtConfirmPass.getText()) && user.existeLogin(txtLogin.getText()) == false && verificaCampos() == false && verificaEmail() == false) {
            Usuario u = new Usuario();
        
            u.setLogin(txtLogin.getText());
            u.setEmail(txtEmail.getText());
            u.setNome(txtName.getText());
            u.setSenha(txtConfirmPass.getText());
            
            new UsuarioDAO().cadastrarUsuario(u);
            
            new ScreenLogin().setVisible(true);
            this.dispose();
        } else {
            if (txtPass.getText() == null ? txtConfirmPass.getText() != null : !txtPass.getText().equals(txtConfirmPass.getText())) {
                txtPass.setText("");
                txtConfirmPass.setText("");
                labelPass.setForeground(Color.red);
                labelConfirmPass.setForeground(Color.red);
            }
            if (user.existeLogin(txtLogin.getText()) == true) {
                labelLogin.setForeground(Color.red);
                txtLogin.setText("");
            }

        }
    }
}
