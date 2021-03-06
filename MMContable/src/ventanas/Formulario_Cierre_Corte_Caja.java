package ventanas;
/*
import beans.Caja;
import beans.Movimientoscaja;
import interfaces.Buscadores;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import managers.ManejadorDocumentos;
import managers.Model;

public class Formulario_Cierre_Corte_Caja extends javax.swing.JDialog {

    ManejadorDocumentos md;
    Model m;
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dtme = new DefaultTableModel();
    DefaultTableModel dtmi = new DefaultTableModel();
    Caja c;
    Buscadores bu;
    Frame parent;

    /** Creates new form Formulario_Cierre_Corte_Caja 
    public Formulario_Cierre_Corte_Caja(java.awt.Frame parent, boolean modal, Model m, Buscadores bu) {
        super(parent, modal);
        this.m = m;
        this.parent = parent;
        this.bu = bu;
        md = new ManejadorDocumentos(m);
        c = md.getCaja();
        initComponents();
        if (c != null) {
            llenar();
        }
        //   this.setLocationRelativeTo(null);
        setLocation(223, 128);
        this.setVisible(true);

    }

    public void llenar() {
        llenarEgresosIngresos();
        llenartabalacaja();

        anticipos.setText(utilidades.FormatoNumeros.formatear(c.getAnticipos() + ""));
        devolucionesa.setText(utilidades.FormatoNumeros.formatear(c.getDevolucionesa() + ""));
        devolucionesv.setText(utilidades.FormatoNumeros.formatear(c.getDevolucionesv() + ""));
        ganancia.setText(utilidades.FormatoNumeros.formatear(c.getGanancia() + ""));
        otrosingresos.setText(utilidades.FormatoNumeros.formatear(c.getOtrosingresos() + ""));
        pagoaproveedor.setText(utilidades.FormatoNumeros.formatear(c.getPagoaproveedor() + ""));
        pagosdecliente.setText(utilidades.FormatoNumeros.formatear(c.getPagosdecliente() + ""));
        retirocaja.setText(utilidades.FormatoNumeros.formatear(c.getRetirocaja() + ""));
        saldoactual.setText(utilidades.FormatoNumeros.formatear(c.getSaldoactual() + ""));
        ventasacredito.setText(utilidades.FormatoNumeros.formatear(c.getVentasacredito() + ""));
        ventasefectivo.setText(utilidades.FormatoNumeros.formatear(c.getVentasefectivo() + ""));
        iniciodia.setText(utilidades.FormatoNumeros.formatear(c.getIniciodia() + ""));
        gastosvarios.setText(utilidades.FormatoNumeros.formatear(c.getGastosvarios() + ""));

    }

    public void llenartabalacaja() {

        dtm = new DefaultTableModel();
        dtm.addColumn("Fecha");
        dtm.addColumn("Estado");
        dtm.addColumn("Hora I");
        dtm.addColumn("Hora f");
        dtm.addColumn("Saldo");

        List<Caja> l = md.listarCajas();
        for (int i = 0; i < l.size(); i++) {
            Object fila[] = new Object[5];
            fila[0] = l.get(i);
            fila[1] = l.get(i).getEstado() == 0 ? "Abierta" : "Cerrada";
            fila[2] = l.get(i).getHoraabre();
            fila[3] = l.get(i).getHoracierre() == null ? "18:45:30" : l.get(i).getHoracierre() + "";
            fila[4] = utilidades.FormatoNumeros.formatear(l.get(i).getSaldoactual() + "");
            dtm.addRow(fila);
        }

        tablacierre.setModel(dtm);

    }

    public void llenarEgresosIngresos() {

        dtme = new DefaultTableModel();
        dtme.addColumn("Numero");
        dtme.addColumn("Tercero");
        dtme.addColumn("Concepto");
        dtme.addColumn("Valor");

        dtmi = new DefaultTableModel();
        dtmi.addColumn("Numero");
        dtmi.addColumn("Tercero");
        dtmi.addColumn("Concepto");
        dtmi.addColumn("Valor");

        List<Movimientoscaja> l = c.getMovimientoscajaList();

        if (l != null) {
            for (int i = 0; i < l.size(); i++) {
                Object fila[] = new Object[5];

                fila[0] = l.get(i).getDoc() + "";
                fila[1] = l.get(i).getTercero();
                fila[3] = l.get(i).getConcepto();
                fila[4] = utilidades.FormatoNumeros.formatear(l.get(i).getValor() + "");

                if (l.get(i).getTipo() == 0) {
                    dtmi.addRow(fila);
                } else {
                    dtme.addRow(fila);
                }
            }
        }

        tablae.setModel(dtme);
        tablai.setModel(dtmi);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablai = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablae = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablacierre = new javax.swing.JTable();
        imprimir1 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ventasefectivo = new javax.swing.JLabel();
        ventasacredito = new javax.swing.JLabel();
        pagosdecliente = new javax.swing.JLabel();
        anticipos = new javax.swing.JLabel();
        otrosingresos = new javax.swing.JLabel();
        gastosvarios = new javax.swing.JLabel();
        pagoaproveedor = new javax.swing.JLabel();
        devolucionesv = new javax.swing.JLabel();
        devolucionesa = new javax.swing.JLabel();
        retirocaja = new javax.swing.JLabel();
        saldoactual = new javax.swing.JLabel();
        iniciodia = new javax.swing.JLabel();
        ganancia = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        devolucionesa1 = new javax.swing.JLabel();
        retirocaja1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimiento Caja");

        jPanel1.setBackground(new java.awt.Color(212, 233, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Inicio del Dia");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tablai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doc", "Tercero", "Concepto", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablai);

        tablae.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doc", "Tercero", "Concepto", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tablae);

        tablacierre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Estado", "Hora I", "Hota F", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablacierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacierreMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablacierre);

        imprimir1.setBackground(new java.awt.Color(0, 153, 255));
        imprimir1.setFont(new java.awt.Font("Tahoma", 1, 11));
        imprimir1.setForeground(new java.awt.Color(0, 51, 153));
        imprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print-16x16.png"))); // NOI18N
        imprimir1.setText("Imprimir");
        imprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir1ActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 153, 255));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 11));
        guardar.setForeground(new java.awt.Color(0, 51, 153));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        guardar.setText("Cerrar Caja");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("Ingresos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("Egresos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Cierres Realizados");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText("Arqueo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Ingresos (Dinero Recibido)");

        jLabel7.setText("Ventas en Efectivo");

        jLabel8.setText("Ventas a Credito");

        jLabel9.setText("Pagos de Cliente");

        jLabel10.setText("Anticipo (Prefacturas)");

        jLabel11.setText("Otros Ingresos");

        jLabel12.setText("Retiros de Caja");

        jLabel13.setText("Devolucion de Anticipo");

        jLabel14.setText("Devoluciones Venta");

        jLabel15.setText("Pagos a Proveedor");

        jLabel16.setText("Gastos Varios");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel17.setText("Egresos  (Dinero Pagado)");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel18.setText("Saldo Actual Caja");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel19.setText("Ganancia del Dia");

        ventasefectivo.setFont(new java.awt.Font("Tahoma", 1, 11));
        ventasefectivo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ventasefectivo.setText("0.00");

        ventasacredito.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ventasacredito.setText("0.00");

        pagosdecliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pagosdecliente.setText("0.00");

        anticipos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        anticipos.setText("0.00");

        otrosingresos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        otrosingresos.setText("0.00");

        gastosvarios.setFont(new java.awt.Font("Tahoma", 1, 11));
        gastosvarios.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gastosvarios.setText("0.00");

        pagoaproveedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pagoaproveedor.setText("0.00");

        devolucionesv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        devolucionesv.setText("0.00");

        devolucionesa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        devolucionesa.setText("0.00");

        retirocaja.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        retirocaja.setText("0.00");

        saldoactual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saldoactual.setText("0.00");

        iniciodia.setFont(new java.awt.Font("Tahoma", 1, 11));
        iniciodia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iniciodia.setText("0.00");

        ganancia.setFont(new java.awt.Font("Tahoma", 1, 11));
        ganancia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ganancia.setText("0.00");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel20.setText("P de Venta - P de Costo");

        jLabel21.setText("Ganancia en Efectivo");

        jLabel22.setText("Ganancia a Credito");

        devolucionesa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        devolucionesa1.setText("0.00");

        retirocaja1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        retirocaja1.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel17)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel11)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel16)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel12)))
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(saldoactual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(retirocaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(devolucionesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(devolucionesv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pagoaproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(gastosvarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(otrosingresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(anticipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pagosdecliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ventasacredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(iniciodia, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                                        .addComponent(ventasefectivo)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel21))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(retirocaja1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(devolucionesa1)))))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(iniciodia)
                                .addGap(38, 38, 38)
                                .addComponent(ventasefectivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ventasacredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagosdecliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anticipos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otrosingresos)
                                .addGap(38, 38, 38)
                                .addComponent(gastosvarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagoaproveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(devolucionesv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(devolucionesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retirocaja)
                                .addGap(14, 14, 14)
                                .addComponent(saldoactual))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(ganancia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(devolucionesa1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retirocaja1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(guardar)
                    .addComponent(imprimir1))
                .addGap(31, 31, 31))
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

    private void imprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir1ActionPerformed

}//GEN-LAST:event_imprimir1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "Esta Seguro de Hacer el Cierre");
        if (op == JOptionPane.YES_OPTION) {
            op = JOptionPane.showConfirmDialog(null, "Saldo en Caja esta Cuadrado");
            if (op == JOptionPane.YES_OPTION) {
                op = Formulario_Cuadre_Caja.cuadrarCaja(parent, true, md, bu, 1, c);

                // this.dispose();
            } else {
                op = Formulario_Cuadre_Caja.cuadrarCaja(parent, true, md, bu, 0, c);
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_salirActionPerformed

    private void tablacierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacierreMouseClicked
        // TODO add your handling code here:
        if (tablacierre.getSelectedRow() > -1) {
            c = (Caja) tablacierre.getValueAt(tablacierre.getSelectedRow(), 0);
            llenar();
            if (c.getEstado() == 1) {
                guardar.setEnabled(false);
            } else {
                guardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_tablacierreMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anticipos;
    private javax.swing.JLabel devolucionesa;
    private javax.swing.JLabel devolucionesa1;
    private javax.swing.JLabel devolucionesv;
    private javax.swing.JLabel ganancia;
    private javax.swing.JLabel gastosvarios;
    private javax.swing.JButton guardar;
    private javax.swing.JButton imprimir1;
    private javax.swing.JLabel iniciodia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel otrosingresos;
    private javax.swing.JLabel pagoaproveedor;
    private javax.swing.JLabel pagosdecliente;
    private javax.swing.JLabel retirocaja;
    private javax.swing.JLabel retirocaja1;
    private javax.swing.JLabel saldoactual;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablacierre;
    private javax.swing.JTable tablae;
    private javax.swing.JTable tablai;
    private javax.swing.JLabel ventasacredito;
    private javax.swing.JLabel ventasefectivo;
    // End of variables declaration//GEN-END:variables
}
     */