package view;

import javax.swing.JOptionPane;
import model.Banco;
import model.Credito;
import model.Debito;

public class GestionTarjetas extends javax.swing.JFrame {

    private Banco banco;

    public GestionTarjetas() {
        initComponents();
        banco = new Banco();
        rb1Debito.setSelected(true);
        txtLimite.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1TipoTarjeta = new javax.swing.ButtonGroup();
        btnTipoOperacion = new javax.swing.ButtonGroup();
        rb1Debito = new javax.swing.JRadioButton();
        rb1Credito = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLimite = new javax.swing.JTextField();
        btnReporte = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblSaldoDebito = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSaldoCredito = new javax.swing.JLabel();
        btnAgregarTarjeta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rbExtraccion = new javax.swing.JRadioButton();
        rbDeposito = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnOperar = new javax.swing.JButton();
        cboTipoTarjeta = new javax.swing.JComboBox<>();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1TipoTarjeta.add(rb1Debito);
        rb1Debito.setText("Tarjeta de débito");
        rb1Debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1DebitoActionPerformed(evt);
            }
        });

        btn1TipoTarjeta.add(rb1Credito);
        rb1Credito.setText("Tarjeta de crédito");
        rb1Credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1CreditoActionPerformed(evt);
            }
        });

        jLabel1.setText("Número:");

        jLabel2.setText("Saldo:");

        jLabel3.setText("Titular:");

        jLabel4.setText("Límite:");

        btnReporte.setText("Generar reportes");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel5.setText("Saldo total de las tarjetas de débito: ");

        lblSaldoDebito.setText("0,0");

        jLabel7.setText("Promedio de saldo de las tarjetas de crédito:");

        lblSaldoCredito.setText("0,0");

        btnAgregarTarjeta.setText("Agregar tarjeta");
        btnAgregarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTarjetaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Reportes");

        btnTipoOperacion.add(rbExtraccion);
        rbExtraccion.setText("Extracción");

        btnTipoOperacion.add(rbDeposito);
        rbDeposito.setText("Depósito");

        jLabel10.setText("Número:");

        jLabel11.setText("Importe:");

        btnOperar.setText("Operar");
        btnOperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperarActionPerformed(evt);
            }
        });

        cboTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de débito", "Tarjeta de crédito" }));
        cboTipoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb1Debito, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb1Credito, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbExtraccion)
                                .addGap(18, 71, Short.MAX_VALUE)
                                .addComponent(rbDeposito)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnOperar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cboTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSaldoDebito, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(lblSaldoCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb1Debito)
                            .addComponent(rb1Credito)
                            .addComponent(rbExtraccion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbDeposito)
                        .addGap(18, 18, 18)
                        .addComponent(cboTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOperar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTarjeta)
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSaldoDebito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblSaldoCredito))
                .addGap(18, 18, 18)
                .addComponent(btnReporte)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        lblSaldoDebito.setText(String.valueOf(banco.saldoTotalDebito()));
        lblSaldoCredito.setText(String.valueOf(banco.promSaldoCredito()));
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnAgregarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTarjetaActionPerformed
        int numero = Integer.parseInt(txtNumero.getText());
        double saldo = Double.parseDouble(txtSaldo.getText());
        String titular = txtTitular.getText();

        if (rb1Debito.isSelected()) {
            Debito d = new Debito(numero, saldo, titular);

            banco.addTarjeta(d);
        } else {
            double limite = Double.parseDouble(txtLimite.getText());

            Credito c = new Credito(numero, saldo, titular, limite);

            banco.addTarjeta(c);
        }
        JOptionPane.showMessageDialog(this, "Nueva tarjeta registrada.");
        this.DataAddedCleaner();
    }//GEN-LAST:event_btnAgregarTarjetaActionPerformed

    private void rb1CreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1CreditoActionPerformed
        txtLimite.setEnabled(true);
    }//GEN-LAST:event_rb1CreditoActionPerformed

    private void btnOperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperarActionPerformed
        int numero = Integer.parseInt(txtNumero2.getText());
        double importe = Double.parseDouble(txtImporte.getText());
        int tipo = cboTipoTarjeta.getSelectedIndex();
        boolean resultado = false;
        
        if (rbExtraccion.isSelected()) {
            resultado = banco.extraer(numero, tipo, importe);
        }   else    {
            resultado = banco.depositar(numero, tipo, importe);
        }
        if (resultado) {
            lblResultado.setText("Operación realizada con éxito.");           
        }   else    {
            lblResultado.setText("Ocurrió un error."); 
        }
        this.DataAddedCleaner();
    }//GEN-LAST:event_btnOperarActionPerformed

    private void cboTipoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoTarjetaActionPerformed
        
    }//GEN-LAST:event_cboTipoTarjetaActionPerformed

    private void rb1DebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1DebitoActionPerformed
        txtLimite.setEnabled(false);
    }//GEN-LAST:event_rb1DebitoActionPerformed
    
    public void DataAddedCleaner(){
        txtImporte.setText("");
        txtLimite.setText("");
        txtNumero.setText("");
        txtNumero2.setText("");
        txtSaldo.setText("");
        txtTitular.setText("");
        rb1Credito.setSelected(false);
        rb1Debito.setSelected(false);
        rbDeposito.setSelected(false);
        rbExtraccion.setSelected(false);
        cboTipoTarjeta.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(GestionTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTarjetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btn1TipoTarjeta;
    private javax.swing.JButton btnAgregarTarjeta;
    private javax.swing.JButton btnOperar;
    private javax.swing.JButton btnReporte;
    private javax.swing.ButtonGroup btnTipoOperacion;
    private javax.swing.JComboBox<String> cboTipoTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSaldoCredito;
    private javax.swing.JLabel lblSaldoDebito;
    private javax.swing.JRadioButton rb1Credito;
    private javax.swing.JRadioButton rb1Debito;
    private javax.swing.JRadioButton rbDeposito;
    private javax.swing.JRadioButton rbExtraccion;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}
/*Made by Maxepe*/
