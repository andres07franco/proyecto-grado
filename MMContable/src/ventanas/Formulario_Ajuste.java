package ventanas;
/*
import beans.Articulos;
import beans.Documentos;
import beans.Grupo;
import beans.Marcas;
import beans.Movimientokardex;
import interfaces.Buscadores;
import java.awt.Frame;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import managers.ManejadorArticulos;
import managers.ManejadorDocumentos;
import managers.Model;

public class Formulario_Ajuste extends javax.swing.JDialog {

    /** Creates new form Formulario_Ajuste 
    Articulos a = null;
    ManejadorArticulos ma;
    ManejadorDocumentos md;
    Buscadores buscador;
    Model m;

    public Formulario_Ajuste(Frame parent, boolean modal, Model m) {
        super(parent, modal);
        this.m = m;
        ma = new ManejadorArticulos(m);
        md = new ManejadorDocumentos(m);
        initComponents();
        llenar_Combox();
        this.setLocationRelativeTo(null);
    }

    public void llenar_Combox() {
        List<Grupo> l = ma.listarGrupos("grupo", "");
        for (int i = 0; i < l.size(); i++) {
            grupo.addItem(l.get(i));
        }
        List<Marcas> l2 = ma.listarMarcas("marca", "");
        for (int i = 0; i < l2.size(); i++) {
            marca.addItem(l2.get(i));
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        grupo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        existencia = new javax.swing.JTextField();
        existecianueva = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tipoajuste = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        guardar = new javax.swing.JButton();
        marca = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        buscara = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo de Barras");

        salir.setBackground(new java.awt.Color(0, 153, 255));
        salir.setFont(new java.awt.Font("Tahoma", 1, 11));
        salir.setForeground(new java.awt.Color(0, 51, 153));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bulletCritical.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion Comercial");

        descripcion.setEditable(false);

        grupo.setEnabled(false);

        jLabel10.setText("Grupo");

        jPanel1.setBackground(new java.awt.Color(212, 233, 255));

        jPanel5.setBackground(new java.awt.Color(212, 233, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar Existencias"));

        jLabel6.setText("Cantidad Actual");

        jLabel11.setText("Cantidad");

        existencia.setEditable(false);

        existecianueva.setEditable(false);

        jLabel12.setText("Nueva Existencia");

        tipoajuste.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adicionar", "Restar" }));
        tipoajuste.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoajusteItemStateChanged(evt);
            }
        });

        jLabel15.setText("Tipo de Ajuste");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoajuste, 0, 95, Short.MAX_VALUE)
                    .addComponent(existencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(existecianueva, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoajuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(existecianueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(212, 233, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Notas y Observaciones"));

        observaciones.setColumns(20);
        observaciones.setRows(5);
        jScrollPane1.setViewportView(observaciones);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tab.addTab("Ajustes", jPanel1);

        guardar.setBackground(new java.awt.Color(0, 153, 255));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 11));
        guardar.setForeground(new java.awt.Color(0, 51, 153));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        marca.setEnabled(false);

        jLabel13.setText("Marca");

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Articulo", "Servicio", "Arriendo", "Combo/Kit" }));
        tipo.setEnabled(false);
        tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoItemStateChanged(evt);
            }
        });

        jLabel14.setText("Tipo");

        buscara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-16x16.png"))); // NOI18N
        buscara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaraActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(105, 181, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setAutoscrolls(true);
        jScrollPane3.setViewportView(imagen);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cod, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo, 0, 165, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(190, 190, 190)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(buscara)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(guardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();

}//GEN-LAST:event_salirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            Documentos d = new Documentos();
            if (d != null) {
                if (d.getMovimientokardexCollection() != null) {
                    for (int i = 0; i < d.getMovimientokardexCollection().size(); i++) {
                        md.eliminar(d.getMovimientokardexCollection().get(i));
                    }
                }

                List<Movimientokardex> lmk = new LinkedList();
                Movimientokardex mk = new Movimientokardex();

                mk.setArticulo(a);
                mk.setDocumento(d);
                if (tipoajuste.getSelectedIndex() == 0) {
                    mk.setEntrada(Double.parseDouble(cantidad.getText() + ""));
                    mk.setSalida(0.0);
                } else {
                    mk.setSalida(Double.parseDouble(cantidad.getText() + ""));
                    mk.setEntrada(0.0);
                }

                mk.setExistencia(Double.parseDouble(existecianueva.getText()));
                mk.setFecha(new Date());
                mk.setTercero("Ajuste");
                mk.setDescripcion("Ajuste de Inventerio");
                mk.setVlrunit(a.getVlrpromedio());
                a.setExistencia(mk.getExistencia());
                mk.setSaldo(mk.getExistencia() * a.getVlrpromedio());
                lmk.add(mk);
                d.setTipo(4);
                d.setEstado(3);
                d.setTerceros(md.getTercero("1"));
                d.setNota(descripcion.getText());
                d.setMovimientokardexCollection(lmk);

                ma.modificar(a);
                md.crear(d);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Datos guardados con exito");

            } else {
                JOptionPane.showMessageDialog(null, "Error #0001 no se ha registrado documento de ajuste");
            }
        }
}//GEN-LAST:event_guardarActionPerformed

    public boolean validar() {
        if (a == null) {
            JOptionPane.showMessageDialog(null, "Selecione un Articulo");
            cod.requestFocus();
            return false;
        }
        return true;
    }

    private void tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoItemStateChanged
        // TODO add your handling code here:
        // if(tipo.getSelectedIndex()==3)
        //    this.tab.add("Combo/Kit",this.combo);
}//GEN-LAST:event_tipoItemStateChanged

    private void buscaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaraActionPerformed
        // TODO add your handling code here:


        a = new BuscaArticulo((Frame) this.getParent(), true, m).getArticulo();
        if (a != null) {

            cod.setText("" + a.getCodigobarras());
            descripcion.setText("" + a.getDescripcioncomercial());
            cantidad.requestFocus();
            existencia.setText(a.getExistencia() + "");
            imagen.setIcon(new ImageIcon(a.getImagen()));
            cantidad.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un Articulo");
        }
}//GEN-LAST:event_buscaraActionPerformed

    private void tipoajusteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoajusteItemStateChanged
        // TODO add your handling code here:
        cantidad.setText("");
        cantidad.requestFocus();
    }//GEN-LAST:event_tipoajusteItemStateChanged

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
        if (cod.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Codigo de Barras");
        } else {
            a = ma.getArticulo("codigobarras", BigInteger.valueOf(Long.parseLong(cod.getText())));
        }
        if (a == null) {
            JOptionPane.showMessageDialog(null, "Articulo no Existe ");
        } else {
            cod.setText("" + a.getCodigobarras());
            descripcion.setText("" + a.getDescripcioncomercial());
            cantidad.requestFocus();
            existencia.setText(a.getExistencia() + "");
            imagen.setIcon(new ImageIcon(a.getImagen()));
            tipoajuste.requestFocus();
        }

    }//GEN-LAST:event_codActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
        guardar.requestFocus();
    }//GEN-LAST:event_cantidadActionPerformed

    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased
        // TODO add your handling code here:
        if (a != null) {
            if (!cantidad.getText().trim().equals("")) {
                if (tipoajuste.getSelectedIndex() == 0) {
                    this.existecianueva.setText((Integer.parseInt(cantidad.getText()) + a.getExistencia().intValue()) + "");
                } else {
                    this.existecianueva.setText((a.getExistencia().intValue() - Integer.parseInt(cantidad.getText())) + "");
                }
            }
        }
    }//GEN-LAST:event_cantidadKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscara;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField existecianueva;
    private javax.swing.JTextField existencia;
    private javax.swing.JComboBox grupo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox marca;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JButton salir;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JComboBox tipo;
    private javax.swing.JComboBox tipoajuste;
    // End of variables declaration//GEN-END:variables
}
 */