package main;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class ScreenHome extends javax.swing.JFrame {

    public ScreenHome() {
        initComponents();
        JButton btns[] = {btnHome, btnUser, btnSettings};
        for (JButton btn : btns)  {
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(54, 81, 207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(21, 25, 28));
                }
            
            });
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelNav = new javax.swing.JPanel();
        panelUsing = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(60, 60, 60));
        panelMain.setForeground(new java.awt.Color(60, 60, 60));

        panelNav.setBackground(new java.awt.Color(75, 75, 75));

        panelUsing.setBackground(new java.awt.Color(75, 75, 75));
        panelUsing.setPreferredSize(new java.awt.Dimension(100, 200));
        panelUsing.setLayout(new java.awt.GridBagLayout());

        btnHome.setBackground(new java.awt.Color(75, 75, 75));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon("D:\\Codigos\\dataBase\\src\\main\\java\\icons\\iconHome.png")); // NOI18N
        btnHome.setBorder(null);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHome.setPreferredSize(new java.awt.Dimension(50, 50));
        panelUsing.add(btnHome, new java.awt.GridBagConstraints());

        panelNav.add(panelUsing);

        btnUser.setBackground(new java.awt.Color(75, 75, 75));
        btnUser.setIcon(new javax.swing.ImageIcon("D:\\Codigos\\dataBase\\src\\main\\java\\icons\\iconUser.png")); // NOI18N
        btnUser.setBorder(null);
        btnUser.setContentAreaFilled(false);
        btnUser.setPreferredSize(new java.awt.Dimension(50, 50));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        panelNav.add(btnUser);

        btnSettings.setBackground(new java.awt.Color(75, 75, 75));
        btnSettings.setIcon(new javax.swing.ImageIcon("D:\\Codigos\\dataBase\\src\\main\\java\\icons\\iconSettings.png")); // NOI18N
        btnSettings.setBorder(null);
        btnSettings.setContentAreaFilled(false);
        btnSettings.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        panelNav.add(btnSettings);

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelNav, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 762, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNav, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
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

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        new ScreenUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        // TODO add your handling code here:
        new ScreenSettings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnUser;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelNav;
    private javax.swing.JPanel panelUsing;
    // End of variables declaration//GEN-END:variables
}
