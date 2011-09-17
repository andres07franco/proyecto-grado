package ventanas;

import beans.Articulo;
import beans.Documento;
import interfaces.Constantes;
import java.awt.Frame;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utilidades.Calendario;

public class VentanaImprimeFactura extends javax.swing.JDialog {

    /** Creates new form VentanaKardex */
    Vector v;
    Articulo a;
    Frame parent;
    Documento d;

    public VentanaImprimeFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        setTitle("Imprimir Documento");
        this.setLocationRelativeTo(null);
    }

    private VentanaImprimeFactura(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buscara = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        buscaFactrura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Artículos ");

        jPanel1.setBackground(new java.awt.Color(212, 233, 255));

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print-16x16.png"))); // NOI18N
        imprimir.setText("Imprimir");
        imprimir.setToolTipText("Imprimir y Contabilizar");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        numero.setEditable(false);
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        jLabel4.setText("Numero:");

        buscara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-16x16.png"))); // NOI18N
        buscara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaraActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Venta", "Compra", "Cotización" }));

        buscaFactrura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-16x16.png"))); // NOI18N
        buscaFactrura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaFactruraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo, 0, 162, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscara, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscaFactrura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(buscara)
                    .addComponent(buscaFactrura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(imprimir))
                .addGap(44, 44, 44))
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

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        // can=1;
        this.dispose();
}//GEN-LAST:event_cancelarActionPerformed

public void imprimir(String numero){
       Map parametro = new HashMap();
       parametro.put("numero", numero);
       if(tipo.getSelectedIndex() == 0){
           parametro.put("titulo", "FACTURA DE VENTA");
           parametro.put("tipo", Constantes.DOCUMENTO_FACTURA_VENTA);
      }else  if(tipo.getSelectedIndex() == 1){
           parametro.put("titulo", "FACTURA DE COMPRA");
           parametro.put("tipo", Constantes.DOCUMENTO_FACTURA_COMPRA);
      }else  if(tipo.getSelectedIndex() == 2){
           parametro.put("titulo", "COTIZACIÓN");
           parametro.put("tipo", Constantes.DOCUMENTO_COTIZACION);         
      }
       this.dispose();
       new utilidades.Reporte().runReporte("reportes/Factura.jasper", parametro);
   }
    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
if(d != null )
    imprimir(d.getNumero());
else
    JOptionPane.showMessageDialog(null, "Seleccione un Documento");
          
}//GEN-LAST:event_imprimirActionPerformed


    
        private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
            // TODO add your handling code here:
}//GEN-LAST:event_numeroActionPerformed

        private void buscaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaraActionPerformed

}//GEN-LAST:event_buscaraActionPerformed

        private void buscaFactruraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaFactruraActionPerformed
            // TODO add your handling code here:
            adicionarDocumento();
}//GEN-LAST:event_buscaFactruraActionPerformed

     public void adicionarDocumento(){
        Documento doc = null;
        if(tipo.getSelectedIndex() == 0)
            doc = (new BuscarFactura(parent, true, Constantes.DOCUMENTO_FACTURA_VENTA).getDocumento());
        else if(tipo.getSelectedIndex() == 1)
            doc = (new BuscarFactura(parent, true, Constantes.DOCUMENTO_FACTURA_COMPRA).getDocumento());
        else if(tipo.getSelectedIndex() == 2)
            doc = (new BuscarFactura(parent, true, Constantes.DOCUMENTO_COTIZACION).getDocumento());
        if (doc != null) {
            d = doc;
            numero.setText(d.getNumero());
        }else{
            if(d!=null){
                if(d.getTipo().getId()==Constantes.DOCUMENTO_FACTURA_VENTA)
                    tipo.setSelectedIndex(0);
                else if(d.getTipo().getId()==Constantes.DOCUMENTO_FACTURA_COMPRA)
                    tipo.setSelectedIndex(1);
                else if(d.getTipo().getId()==Constantes.DOCUMENTO_COTIZACION)
                    tipo.setSelectedIndex(2);
            }
        }


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaFactrura;
    private javax.swing.JButton buscara;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField numero;
    private javax.swing.JComboBox tipo;
    // End of variables declaration//GEN-END:variables
}