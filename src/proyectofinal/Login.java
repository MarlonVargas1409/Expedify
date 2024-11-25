/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;
import java.awt.Color;
public class Login extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        LE = new javax.swing.JLabel();
        IS = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JLabel();
        TextPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        FOTO = new javax.swing.JLabel();
        JPbotonentrar = new javax.swing.JPanel();
        JLentrar = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LE.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        LE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favicon.png"))); // NOI18N
        LE.setText("FourStack");
        Background.add(LE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        IS.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        IS.setText("Iniciar Sesion");
        Background.add(IS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        Usuario.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Usuario.setText("Usuario");
        Background.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        TextUser.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        TextUser.setForeground(new java.awt.Color(204, 204, 204));
        TextUser.setText("Ingrese su usuario");
        TextUser.setBorder(null);
        TextUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextUserMousePressed(evt);
            }
        });
        TextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserActionPerformed(evt);
            }
        });
        Background.add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, 10));

        Contraseña.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Contraseña.setText("Contraseña");
        Background.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        TextPass.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        TextPass.setForeground(new java.awt.Color(204, 204, 204));
        TextPass.setText("***********");
        TextPass.setBorder(null);
        TextPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextPassMousePressed(evt);
            }
        });
        TextPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPassActionPerformed(evt);
            }
        });
        Background.add(TextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 10));

        FOTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edificio 6 (2).png"))); // NOI18N
        Background.add(FOTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 410, 500));

        JPbotonentrar.setBackground(new java.awt.Color(0, 134, 190));
        JPbotonentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPbotonentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPbotonentrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPbotonentrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPbotonentrarMousePressed(evt);
            }
        });

        JLentrar.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        JLentrar.setForeground(new java.awt.Color(255, 255, 255));
        JLentrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLentrar.setText("ENTRAR");

        javax.swing.GroupLayout JPbotonentrarLayout = new javax.swing.GroupLayout(JPbotonentrar);
        JPbotonentrar.setLayout(JPbotonentrarLayout);
        JPbotonentrarLayout.setHorizontalGroup(
            JPbotonentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPbotonentrarLayout.createSequentialGroup()
                .addComponent(JLentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        JPbotonentrarLayout.setVerticalGroup(
            JPbotonentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPbotonentrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(JPbotonentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 60));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFocusable(false);

        exit.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("x");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 768, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPassActionPerformed

    private void TextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserActionPerformed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exitBtn.setBackground(Color.RED);
        exit.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exitBtn.setBackground(Color.white);
        exit.setForeground(Color.black);
    }//GEN-LAST:event_exitMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
    
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
      
        this.setLocation(x - Xmouse,y - Ymouse);
    }//GEN-LAST:event_headerMouseDragged

    private void JPbotonentrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPbotonentrarMouseEntered

        JPbotonentrar.setBackground(new Color(0,110,177));
        
    }//GEN-LAST:event_JPbotonentrarMouseEntered

    private void JPbotonentrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPbotonentrarMouseExited
        
        JPbotonentrar.setBackground(new Color(0,134,190));
        
    }//GEN-LAST:event_JPbotonentrarMouseExited

    private void TextUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextUserMousePressed
    if (TextUser.getText().equals("Ingrese su usuario")) {
        TextUser.setText("");
        TextUser.setForeground(Color.black);
    }
    if (String.valueOf(TextPass.getPassword()).isEmpty()) {
        TextPass.setText("***********");
        TextPass.setForeground(Color.gray);
    }
    }//GEN-LAST:event_TextUserMousePressed

    private void TextPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextPassMousePressed
    if (String.valueOf(TextPass.getPassword()).equals("***********")){
        TextPass.setText("");
        TextPass.setForeground(Color.black);
    }
    
    if (TextUser.getText().isEmpty()) {
        TextUser.setText("Ingrese su usuario");
        TextUser.setForeground(Color.gray); 
    }
            
    }//GEN-LAST:event_TextPassMousePressed

    private void JPbotonentrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPbotonentrarMousePressed
        javax.swing.JOptionPane.showMessageDialog(this,"intento de login con los datos:\nUsuario: " + TextUser.getText() + "\nPassword: " + String.valueOf(TextPass.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JPbotonentrarMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel FOTO;
    private javax.swing.JLabel IS;
    private javax.swing.JLabel JLentrar;
    private javax.swing.JPanel JPbotonentrar;
    private javax.swing.JLabel LE;
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JTextField TextUser;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
