package ventanas;
/*
import beans.Alquileres;
import beans.Articulos;
import java.awt.Frame;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import managers.ManejadorArticulos;
import managers.Model;
import utilidades.Calendario;
import utilidades.Fechavo;

public class BuscaArticuloParaAriendo extends javax.swing.JDialog {

    /** Creates new form BuscaArticulo 
    JTabbedPane tab;
    JDesktopPane dp;
    DefaultTableModel dtm = new DefaultTableModel();
    ManejadorArticulos ma;
    List<Articulos> l = new LinkedList();
    Model m;

    public BuscaArticuloParaAriendo(java.awt.Frame parent, boolean modal, Model m) {
        super(parent, modal);
        this.m = m;
        ma = new ManejadorArticulos(m);
        initComponents();
        setTitle("Buscar Articulos");
        Date date = new Date();
        fecha.setText(Calendar.getInstance().get(Calendar.YEAR) + "-" + (date.getMonth() + 1) + "-" + date.getDate());
        fecha1.setText(new Fechavo().fechaSiguiente(fecha.getText().replaceAll("-", "/")));
        fecha1.setText(fecha1.getText().replaceAll("/", "-"));

        buscar();

    }

    public Alquileres getArticulo() {
        this.setVisible(true);

        if (tabla.getSelectedRow() > -1) {
            Alquileres al = new Alquileres();
            al.setArticulo(l.get(tabla.getSelectedRow()));
            al.setFechaIni(new Date(fecha.getText().replaceAll("-", "/")));
            al.setFechaFin(new Date(fecha1.getText().replaceAll("-", "/")));
            return al;
        }
        return null;
    }

    public void buscar() {

        dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Codigo");
        dtm.addColumn("Descripcion");
        dtm.addColumn("Disponibles");

        if (por.getSelectedIndex() == 0) {
            l = ma.listarArticulos("codigobarras", busqueda.getText(), "2");
        } else if (por.getSelectedIndex() == 1) {
            l = ma.listarArticulos("descripcioncomercial", busqueda.getText(), "2");
        } else {
            l = ma.listarArticulos(por.getSelectedItem() + "", busqueda.getText(), "2");
        }

        for (int i = 0; i < l.size(); i++) {
            Object fila[] = new Object[5];
            fila[0] = l.get(i).getId() + "";
            fila[1] = l.get(i).getCodigobarras() + "";
            fila[2] = l.get(i).getDescripcioncomercial();

            fila[3] = ma.getDisponibles(l.get(i), Fechavo.convertirFecha(fecha.getText()), Fechavo.convertirFecha(fecha1.getText()));
            dtm.addRow(fila);
        }

        tabla.setModel(dtm);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        por = new javax.swing.JComboBox();
        salir = new javax.swing.JButton();
        fecha = new javax.swing.JTextField();
        buscafecha = new javax.swing.JButton();
        fecha1 = new javax.swing.JTextField();
        buscafecha1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 241, 247));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(177, 214, 250));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 153));
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 11));

        tabla.setAutoCreateRowSorter(true);
        tabla.setFont(new java.awt.Font("Arial", 1, 11));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Descripcion", "Disponibles"
            }
        ));
        tabla.setGridColor(new java.awt.Color(153, 204, 255));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));

        jLabel1.setText("Buscar por");

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        busqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                busquedaFocusGained(evt);
            }
        });
        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaKeyTyped(evt);
            }
        });

        por.setBackground(new java.awt.Color(121, 188, 252));
        por.setFont(new java.awt.Font("Arial", 1, 11));
        por.setForeground(new java.awt.Color(0, 0, 102));
        por.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Descripcion", "Marca", "Grupo" }));

        salir.setBackground(new java.awt.Color(121, 188, 252));
        salir.setFont(new java.awt.Font("Arial", 1, 11));
        salir.setForeground(new java.awt.Color(0, 0, 102));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        buscafecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calendar-16x16.png"))); // NOI18N
        buscafecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscafechaActionPerformed(evt);
            }
        });

        buscafecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calendar-16x16.png"))); // NOI18N
        buscafecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscafecha1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Ini");

        jLabel3.setText("Fecha Fin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscafecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buscafecha1)
                        .addComponent(buscafecha)
                        .addComponent(salir)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        if (tabla.getSelectedRow() > -1) {
            this.dispose();
        }

}//GEN-LAST:event_tablaMouseClicked

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_busquedaActionPerformed

    private void busquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_busquedaFocusGained
        // TODO add your handling code here:
}//GEN-LAST:event_busquedaFocusGained

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        // TODO add your handling code here:
        buscar();
}//GEN-LAST:event_busquedaKeyReleased

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped
        // TODO add your handling code here:
        if (por.getSelectedIndex() == 0) {
            if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_busquedaKeyTyped

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_salirActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
}//GEN-LAST:event_jPanel1FocusGained

    private void buscafechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscafechaActionPerformed
        // TODO add your handling code here:
        fecha.setText(new Calendario((Frame) this.getParent(), true).getFecha());
        buscar();
}//GEN-LAST:event_buscafechaActionPerformed

    private void buscafecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscafecha1ActionPerformed
        // TODO add your handling code here:
        fecha1.setText(new Calendario((Frame) this.getParent(), true).getFecha());
        buscar();
    }//GEN-LAST:event_buscafecha1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscafecha;
    private javax.swing.JButton buscafecha1;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField fecha1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox por;
    private javax.swing.JButton salir;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
 */