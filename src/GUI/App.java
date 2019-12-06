/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ServiciosStock.Servicios;
import com.sun.javafx.image.impl.IntArgb;
import java.util.List;
import javax.swing.JOptionPane;
import webservice.SalidaProducto;
import webservice.Stock;

/**
 *
 * @author jofas
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnValidaStock = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtNumeroSalida = new javax.swing.JTextField();
        txtSku = new javax.swing.JTextField();
        txtCantidadSalida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Salida");

        jLabel1.setText("Numero salida:");

        jLabel2.setText("SKU:");

        jLabel3.setText("Cantidad Salida:");

        btnValidaStock.setText("Valida Stock");
        btnValidaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidaStockActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnValidaStock)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(btnGuardar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumeroSalida)
                                .addComponent(txtSku))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValidaStock)
                    .addComponent(btnGuardar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidaStockActionPerformed
        Servicios servicios = new Servicios();
        //s.listaProducto(this.txtSku.getText());
        List<Stock> datos = servicios.listaProducto(this.txtSku.getText());
        int stock;
        for (int i = 0; i < datos.size(); i++) {
            Stock s = new Stock();
            s = datos.get(i);
            stock = s.getCantidad();
            if (stock >= Integer.parseInt(this.txtCantidadSalida.getText())) {
                JOptionPane.showMessageDialog(this, "Todo correcto. Stock disponible: " + s.getCantidad());
            } else {
                JOptionPane.showMessageDialog(this, "Stock es menor a la cantidad de salida. Stock disponible: " + s.getCantidad());
            }
        }

    }//GEN-LAST:event_btnValidaStockActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Servicios servicios = new Servicios();
        //s.listaProducto(this.txtSku.getText());
        List<Stock> datos = servicios.listaProducto(this.txtSku.getText());
        int stock;
        for (int i = 0; i < datos.size(); i++) {
            Stock s = new Stock();
            s = datos.get(i);
            stock = s.getCantidad();
            if (stock >= Integer.parseInt(this.txtCantidadSalida.getText())) {

                SalidaProducto sp = new SalidaProducto();

                sp.setNuemroSalida(Integer.parseInt(this.txtNumeroSalida.getText()));
                sp.setSku(this.txtSku.getText());
                sp.setCantidadSalida(Integer.parseInt(this.txtCantidadSalida.getText()));

                if (servicios.varificarProducto(Integer.parseInt(this.txtNumeroSalida.getText())) != 1) {
                    servicios.guardarRegistro(sp);
                    servicios.actualizaSctock(Integer.parseInt(this.txtCantidadSalida.getText()), this.txtSku.getText(), stock);
                    JOptionPane.showMessageDialog(this, "Registro de salida nro: "+ sp.getNuemroSalida()+" realizado.");
                }else{
                    JOptionPane.showMessageDialog(this, "ERROR: Numero de salida "+sp.getNuemroSalida()+" duplicado");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnValidaStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCantidadSalida;
    private javax.swing.JTextField txtNumeroSalida;
    private javax.swing.JTextField txtSku;
    // End of variables declaration//GEN-END:variables
}
