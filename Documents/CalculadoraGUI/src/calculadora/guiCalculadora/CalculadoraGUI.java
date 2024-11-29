/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.guiCalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author jquezada
 */
public class CalculadoraGUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraGUI
     */
    public CalculadoraGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        plValores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        plOperaciones = new javax.swing.JPanel();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnResetear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Basica");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plTitulo.setBackground(new java.awt.Color(102, 102, 102));
        plTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora Básica");
        plTitulo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/guiCalculadora/imagenes/calculadora.png"))); // NOI18N
        plTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 40, 46));

        getContentPane().add(plTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 80));

        plValores.setBackground(new java.awt.Color(153, 153, 153));
        plValores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Respuesta:");
        plValores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        txtRespuesta.setEditable(false);
        txtRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtRespuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });
        txtRespuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespuestaKeyTyped(evt);
            }
        });
        plValores.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 160, 50));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor 1:");
        plValores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtValor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor1ActionPerformed(evt);
            }
        });
        txtValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor1KeyTyped(evt);
            }
        });
        plValores.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 120, 30));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor 2:");
        plValores.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtValor2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValor2ActionPerformed(evt);
            }
        });
        txtValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValor2KeyTyped(evt);
            }
        });
        plValores.add(txtValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 120, 30));

        getContentPane().add(plValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 260));

        plOperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        plOperaciones.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, 30));

        btnRestar.setText("Restar");
        plOperaciones.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 90, 30));
        btnRestar.getAccessibleContext().setAccessibleDescription("");

        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        plOperaciones.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, 40));

        btnDividir.setText("Dividir");
        plOperaciones.add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 90, 30));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        plOperaciones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, 40));

        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });
        plOperaciones.add(btnResetear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 40));

        getContentPane().add(plOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 260, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor1KeyTyped
        char numeros = evt.getKeyChar();
        if ((numeros < '0' || numeros > '9') && (numeros < ',' || numeros > '.')) {
            JOptionPane.showMessageDialog(null, "Favor ingresar numeros para realizar la operacion.");
            evt.consume();
        }
    }//GEN-LAST:event_txtValor1KeyTyped

    private void txtValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor2ActionPerformed

    }//GEN-LAST:event_txtValor2ActionPerformed

    private void txtValor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValor2KeyTyped
        char numeros = evt.getKeyChar();
        if ((numeros < '0' || numeros > '9') && (numeros < ',' || numeros > '.')) {
            JOptionPane.showMessageDialog(null, "Favor ingresar numeros para realizar la operacion.");
            evt.consume();
        }
    }//GEN-LAST:event_txtValor2KeyTyped

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        validarCampos();
        sumarValores();
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnResetearActionPerformed

    private void txtValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValor1ActionPerformed

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void txtRespuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespuestaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaKeyTyped

    private void validarCampos(){
        if(txtValor1.getText().trim().length() <= 0){
            JOptionPane.showMessageDialog(null, "Favor ingresar valor 1, porque el campo esta vacio.");
            txtValor1.requestFocus();
        } else if(txtValor2.getText().trim().length() <= 0){
            JOptionPane.showMessageDialog(null, "Favor ingresar valor 2, porque el campo esta vacio.");
            txtValor2.requestFocus();
        }
    }
    
    private void sumarValores(){
        Calculadora cal = new Calculadora();
        Double respuesta = cal.sumar(Double.parseDouble(txtValor1.getText()), Double.parseDouble(txtValor2.getText()));
        txtRespuesta.setText(respuesta +"");
    }
    
    private void limpiarCampos(){
        txtValor1.setText("");
        txtValor2.setText("");
        txtRespuesta.setText("");
        txtValor1.requestFocus();
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
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel plOperaciones;
    private javax.swing.JPanel plTitulo;
    private javax.swing.JPanel plValores;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}