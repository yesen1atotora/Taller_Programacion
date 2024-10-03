
package loginframe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


public class CarritoFrame extends javax.swing.JFrame {

    private MenuPrincipal menuPrincipal;
            
    public CarritoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.menuPrincipal = menuPrincipal;
        cargarPizzasEnCarrito();
        
    }

    CarritoFrame(MenuPrincipal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

private void cargarPizzasEnCarrito() {
    DefaultTableModel model = (DefaultTableModel) tablaPizzas.getModel();
    model.setRowCount(0); // Limpiar la tabla

    // Añadir las pizzas de la lista a la tabla
    for (Pizza pizza : MenuPrincipal.carritoPizzas) {
        model.addRow(new Object[]{pizza.getNombre(), pizza.getPrecio(), pizza.getTamaño()}); // Asegúrate de que el tamaño también esté incluido
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalirCarrito = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPizzas = new javax.swing.JTable();
        btnEliminarPizza = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Come primero, piensa después!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BAMBINO`S");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pizza");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido, Bambino`s");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carrito");

        btnSalirCarrito.setText("Salir");
        btnSalirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCarritoActionPerformed(evt);
            }
        });

        tablaPizzas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre de la Pizza", "Precio", "Tamaño"
            }
        ));
        jScrollPane2.setViewportView(tablaPizzas);

        btnEliminarPizza.setText("Eliminar");
        btnEliminarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPizzaActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setText("Finalizar compra");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSalirCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)
                        .addComponent(btnSalirCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

    private void btnSalirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCarritoActionPerformed
            this.dispose(); 
            menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnSalirCarritoActionPerformed

    private void btnEliminarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPizzaActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaPizzas.getModel();
    
    // Obtiene la fila seleccionada
    int selectedRow = tablaPizzas.getSelectedRow();
    
    // Verifica si se ha seleccionado una fila
    if (selectedRow != -1) {
        // Obtiene el nombre de la pizza de la fila seleccionada
        String pizzaNombre = (String) model.getValueAt(selectedRow, 0);
        
        // Busca y elimina la pizza del carrito
        Pizza pizzaToRemove = null;
        for (Pizza pizza : MenuPrincipal.carritoPizzas) {
            if (pizza.getNombre().equals(pizzaNombre)) {
                pizzaToRemove = pizza;
                break;
            }
        }
        
        // Si se encuentra la pizza, se elimina
        if (pizzaToRemove != null) {
            MenuPrincipal.carritoPizzas.remove(pizzaToRemove);
            JOptionPane.showMessageDialog(this, "Pizza eliminada del carrito");
            cargarPizzasEnCarrito(); // Actualiza la tabla
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una pizza para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarPizzaActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
       String filePath = "D:\\Metodos_2024\\LoginFrame/pedidos.txt"; 

    try (FileWriter writer = new FileWriter(filePath, true);
         BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
        
        
        DefaultTableModel model = (DefaultTableModel) tablaPizzas.getModel(); // Verifica aquí

        for (int i = 0; i < model.getRowCount(); i++) {
            String nombrePizza = (String) model.getValueAt(i, 0);
            double precioPizza = (Double) model.getValueAt(i, 1);
            String tamañoPizza = (String) model.getValueAt(i, 2); 

            bufferedWriter.write(nombrePizza + "," + precioPizza + "," + tamañoPizza);
            bufferedWriter.newLine();
        }

        JOptionPane.showMessageDialog(this, "¡Pedido realizado exitosamente!  " );
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage());
    }
    // Cierra la ventana del carrito
    this.dispose();
    
    // Muestra la ventana del menú principal
    new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarritoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarPizza;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnSalirCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPizzas;
    // End of variables declaration//GEN-END:variables

    private static class carrito {

        private static Iterable<Pizza> getPizzas() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public carrito() {
        }
    }
}
