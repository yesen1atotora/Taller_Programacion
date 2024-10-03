/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginframe;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MenuPrincipal extends javax.swing.JFrame {
    private final Carrito carrito;
    
    // Lista de pizzas agregadas al carrito
    public static ArrayList<Pizza> carritoPizzas = new ArrayList<>();

    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        carrito = new Carrito();
        
    }
     private double calcularPrecio(String tipoPizza, String tamaño) {
        double basePrice = 0.0;

        switch (tipoPizza) {
            case "Española":
                basePrice = 50.0;
                break;
            case "Napolitana":
                basePrice = 45.0;
                break;
            case "Boloñesa":
                basePrice = 55.0;
                break;
            case "Hawaiana":
                basePrice = 40.0;
                break;
            case "Funghi":
                basePrice = 55.0;
                break;
        }

        switch (tamaño) {
            case "Mediana":
                basePrice += 10.0;
                break;
            case "Grande":
                basePrice += 20.0;
                break;
        }

        return basePrice;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Carrito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_SalirMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelHawaiana = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarHawaiana = new javax.swing.JButton();
        boxHawaiana = new javax.swing.JComboBox<>();
        panelBoloñesa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarBoloñesa = new javax.swing.JButton();
        boxBoloñesa = new javax.swing.JComboBox<>();
        panelFunghi = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarFunghi = new javax.swing.JButton();
        boxFunghi = new javax.swing.JComboBox<>();
        panelNapolitana = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarNapolitana = new javax.swing.JButton();
        boxNapolitana = new javax.swing.JComboBox<>();
        panelEspañola = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregarEspañola = new javax.swing.JButton();
        boxEspañola = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú");

        btn_Carrito.setText("Carrito");
        btn_Carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CarritoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BAMBINO`S");

        btn_SalirMenu.setText("Salir");
        btn_SalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirMenuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pizza");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Come primero, piensa después!");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido, Bambino`s");

        panelHawaiana.setBackground(new java.awt.Color(255, 255, 255));
        panelHawaiana.setPreferredSize(new java.awt.Dimension(165, 140));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hawaiana.jpg"))); // NOI18N

        btnAgregarHawaiana.setText("Agregar");
        btnAgregarHawaiana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHawaianaActionPerformed(evt);
            }
        });

        boxHawaiana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña", "Mediana", "Grande" }));

        javax.swing.GroupLayout panelHawaianaLayout = new javax.swing.GroupLayout(panelHawaiana);
        panelHawaiana.setLayout(panelHawaianaLayout);
        panelHawaianaLayout.setHorizontalGroup(
            panelHawaianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHawaianaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHawaianaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxHawaiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarHawaiana)
                .addContainerGap())
        );
        panelHawaianaLayout.setVerticalGroup(
            panelHawaianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHawaianaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHawaianaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarHawaiana)
                    .addComponent(boxHawaiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelBoloñesa.setBackground(new java.awt.Color(255, 255, 255));
        panelBoloñesa.setPreferredSize(new java.awt.Dimension(165, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boloñesa.jpg"))); // NOI18N

        btnAgregarBoloñesa.setText("Agregar");
        btnAgregarBoloñesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBoloñesaActionPerformed(evt);
            }
        });

        boxBoloñesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña", "Mediana", "Grande" }));

        javax.swing.GroupLayout panelBoloñesaLayout = new javax.swing.GroupLayout(panelBoloñesa);
        panelBoloñesa.setLayout(panelBoloñesaLayout);
        panelBoloñesaLayout.setHorizontalGroup(
            panelBoloñesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoloñesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxBoloñesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarBoloñesa)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoloñesaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelBoloñesaLayout.setVerticalGroup(
            panelBoloñesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoloñesaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBoloñesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarBoloñesa)
                    .addComponent(boxBoloñesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFunghi.setBackground(new java.awt.Color(255, 255, 255));
        panelFunghi.setPreferredSize(new java.awt.Dimension(165, 140));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/funghi.jpg"))); // NOI18N

        btnAgregarFunghi.setText("Agregar");
        btnAgregarFunghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFunghiActionPerformed(evt);
            }
        });

        boxFunghi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña", "Mediana", "Grande" }));

        javax.swing.GroupLayout panelFunghiLayout = new javax.swing.GroupLayout(panelFunghi);
        panelFunghi.setLayout(panelFunghiLayout);
        panelFunghiLayout.setHorizontalGroup(
            panelFunghiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunghiLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFunghiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boxFunghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarFunghi)
                .addContainerGap())
        );
        panelFunghiLayout.setVerticalGroup(
            panelFunghiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunghiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFunghiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarFunghi)
                    .addComponent(boxFunghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        panelNapolitana.setBackground(new java.awt.Color(255, 255, 255));
        panelNapolitana.setPreferredSize(new java.awt.Dimension(165, 140));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Napolitana.png"))); // NOI18N

        btnAgregarNapolitana.setText("Agregar");
        btnAgregarNapolitana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNapolitanaActionPerformed(evt);
            }
        });

        boxNapolitana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña", "Mediana", "Grande" }));

        javax.swing.GroupLayout panelNapolitanaLayout = new javax.swing.GroupLayout(panelNapolitana);
        panelNapolitana.setLayout(panelNapolitanaLayout);
        panelNapolitanaLayout.setHorizontalGroup(
            panelNapolitanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNapolitanaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNapolitanaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boxNapolitana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarNapolitana)
                .addContainerGap())
        );
        panelNapolitanaLayout.setVerticalGroup(
            panelNapolitanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNapolitanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNapolitanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarNapolitana)
                    .addComponent(boxNapolitana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        panelEspañola.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/española.png.jpg"))); // NOI18N

        btnAgregarEspañola.setText("Agregar");
        btnAgregarEspañola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEspañolaActionPerformed(evt);
            }
        });

        boxEspañola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña", "Mediana", "Grande" }));
        boxEspañola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEspañolaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEspañolaLayout = new javax.swing.GroupLayout(panelEspañola);
        panelEspañola.setLayout(panelEspañolaLayout);
        panelEspañolaLayout.setHorizontalGroup(
            panelEspañolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspañolaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEspañolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEspañolaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEspañolaLayout.createSequentialGroup()
                        .addComponent(boxEspañola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarEspañola)
                        .addContainerGap())))
        );
        panelEspañolaLayout.setVerticalGroup(
            panelEspañolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspañolaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelEspañolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEspañola)
                    .addComponent(boxEspañola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Carrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelFunghi, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(panelEspañola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(panelNapolitana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(panelBoloñesa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(panelHawaiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(btn_SalirMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelEspañola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelHawaiana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelBoloñesa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelFunghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelNapolitana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btn_Carrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                        .addComponent(btn_SalirMenu)
                        .addGap(59, 59, 59))))
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
        
    
    
    private void btn_SalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirMenuActionPerformed
        this.dispose(); // Cierra la ventana de registro
    
    
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_SalirMenuActionPerformed

    private void btn_CarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CarritoActionPerformed
        CarritoFrame carritoFrame = new CarritoFrame();
        carritoFrame.setVisible(true);
    }//GEN-LAST:event_btn_CarritoActionPerformed

    private void btnAgregarEspañolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEspañolaActionPerformed
    
         // Obtener el tamaño seleccionado de la pizza Española
    String tamañoSeleccionado = (String) boxEspañola.getSelectedItem();
    
    // Calcular el precio basado en el tamaño seleccionado
    double precio = calcularPrecio("Española", tamañoSeleccionado); // Usamos "Española" correctamente
    
    // Crear un objeto Pizza con el tamaño y precio calculado
    Pizza pizzaEspañola = new Pizza("Pizza Española", precio, tamañoSeleccionado);
    
    // Agregar la pizza al carrito
    carritoPizzas.add(pizzaEspañola);
    
    // Mostrar un mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Pizza Española añadida al carrito");
    
    // Actualizar la tabla con las pizzas del carrito
    cargarPizzasEnCarrito();
    }//GEN-LAST:event_btnAgregarEspañolaActionPerformed

    private void btnAgregarNapolitanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNapolitanaActionPerformed
        // Obtener el tamaño seleccionado de la pizza Española
    String tamañoSeleccionado = (String) boxNapolitana.getSelectedItem();
    
    // Calcular el precio basado en el tamaño seleccionado
    double precio = calcularPrecio("Napolitana", tamañoSeleccionado); // Usamos "Española" correctamente
    
    // Crear un objeto Pizza con el tamaño y precio calculado
    Pizza pizzaNapolitana = new Pizza("Pizza Napolitana", precio, tamañoSeleccionado);
    
    // Agregar la pizza al carrito
    carritoPizzas.add(pizzaNapolitana);
    
    // Mostrar un mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Pizza Napolitana añadida al carrito");
    
    // Actualizar la tabla con las pizzas del carrito
    cargarPizzasEnCarrito();
    }//GEN-LAST:event_btnAgregarNapolitanaActionPerformed

    private void btnAgregarBoloñesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBoloñesaActionPerformed
        // Obtener el tamaño seleccionado de la pizza Española
    String tamañoSeleccionado = (String) boxBoloñesa.getSelectedItem();
    
    // Calcular el precio basado en el tamaño seleccionado
    double precio = calcularPrecio("Boloñesa", tamañoSeleccionado); // Usamos "Española" correctamente
    
    // Crear un objeto Pizza con el tamaño y precio calculado
    Pizza pizzaBoloñesa = new Pizza("Pizza Boloñesa", precio, tamañoSeleccionado);
    
    // Agregar la pizza al carrito
    carritoPizzas.add(pizzaBoloñesa);
    
    // Mostrar un mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Pizza Boloñesa añadida al carrito");
    
    // Actualizar la tabla con las pizzas del carrito
    cargarPizzasEnCarrito();
    }//GEN-LAST:event_btnAgregarBoloñesaActionPerformed

    private void btnAgregarHawaianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHawaianaActionPerformed
         // Obtener el tamaño seleccionado de la pizza Española
    String tamañoSeleccionado = (String) boxHawaiana.getSelectedItem();
    
    // Calcular el precio basado en el tamaño seleccionado
    double precio = calcularPrecio("Hawaiana", tamañoSeleccionado); // Usamos "Española" correctamente
    
    // Crear un objeto Pizza con el tamaño y precio calculado
    Pizza pizzaHawaiana = new Pizza("Pizza Hawaiana", precio, tamañoSeleccionado);
    
    // Agregar la pizza al carrito
    carritoPizzas.add(pizzaHawaiana);
    
    // Mostrar un mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Pizza Hawaiana añadida al carrito");
    
    // Actualizar la tabla con las pizzas del carrito
    cargarPizzasEnCarrito();
    }//GEN-LAST:event_btnAgregarHawaianaActionPerformed

    private void btnAgregarFunghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFunghiActionPerformed
        // Obtener el tamaño seleccionado de la pizza Española
    String tamañoSeleccionado = (String) boxFunghi.getSelectedItem();
    
    // Calcular el precio basado en el tamaño seleccionado
    double precio = calcularPrecio("Funghi", tamañoSeleccionado); // Usamos "Española" correctamente
    
    // Crear un objeto Pizza con el tamaño y precio calculado
    Pizza pizzaFunghi = new Pizza("Pizza Funghi", precio, tamañoSeleccionado);
    
    // Agregar la pizza al carrito
    carritoPizzas.add(pizzaFunghi);
    
    // Mostrar un mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Pizza Funghi añadida al carrito");
    
    // Actualizar la tabla con las pizzas del carrito
    cargarPizzasEnCarrito();
    }//GEN-LAST:event_btnAgregarFunghiActionPerformed

    private void boxEspañolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEspañolaActionPerformed
        
    }//GEN-LAST:event_boxEspañolaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxBoloñesa;
    private javax.swing.JComboBox<String> boxEspañola;
    private javax.swing.JComboBox<String> boxFunghi;
    private javax.swing.JComboBox<String> boxHawaiana;
    private javax.swing.JComboBox<String> boxNapolitana;
    private javax.swing.JButton btnAgregarBoloñesa;
    private javax.swing.JButton btnAgregarEspañola;
    private javax.swing.JButton btnAgregarFunghi;
    private javax.swing.JButton btnAgregarHawaiana;
    private javax.swing.JButton btnAgregarNapolitana;
    private javax.swing.JButton btn_Carrito;
    private javax.swing.JButton btn_SalirMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBoloñesa;
    private javax.swing.JPanel panelEspañola;
    private javax.swing.JPanel panelFunghi;
    private javax.swing.JPanel panelHawaiana;
    private javax.swing.JPanel panelNapolitana;
    // End of variables declaration//GEN-END:variables

    private void cargarPizzasEnCarrito() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
    
