
package loginframe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Esta clase maneja el proceso de inicio de sesión de un usuario en la aplicación.
 * Verifica las credenciales contra un archivo de texto que contiene usuarios registrados.
 * Si las credenciales son válidas, redirige al usuario a la ventana del menú principal.
 * Si no, muestra un mensaje de error.
 * 
 * @author ortun
 */
public class Login extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de la ventana de inicio de sesión.
     * Llama al método initComponents() para inicializar los componentes gráficos.
     * Establece la ubicación de la ventana al centro de la pantalla.
     */
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null);  // Posiciona la ventana en el centro de la pantalla
    }

    /**
     * Inicializa los componentes gráficos de la interfaz.
     * Este método es llamado automáticamente por el constructor.
     * Contiene la lógica de configuración de los botones, campos de texto, y demás elementos gráficos.
     * No se recomienda modificar este código manualmente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpass_Contraseña = new javax.swing.JPasswordField();
        btn_IniciarSesion = new javax.swing.JButton();
        btn_Registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesión");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        btn_IniciarSesion.setText("Iniciar Sesión");
        btn_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarSesionActionPerformed(evt);
            }
        });

        btn_Registrarse.setText("Registrarse");
        btn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpass_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(btn_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(btn_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpass_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btn_Registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
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
    /**
     * Maneja el evento cuando el usuario hace clic en el botón "Registrarse".
     * Abre una nueva ventana que permite al usuario registrarse.
     * 
     * @param evt El evento de acción que ocurre cuando se presiona el botón "Registrarse".
     */
    private void btn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarseActionPerformed
        Registrarse newframe = new Registrarse(); // Crea una nueva ventana de registro
        newframe.setVisible(true); // Hace visible la ventana de registro
        
    }//GEN-LAST:event_btn_RegistrarseActionPerformed
    /**
     * Maneja el evento cuando el usuario hace clic en el botón "Iniciar Sesión".
     * Verifica el nombre de usuario y la contraseña ingresados contra los datos almacenados en un archivo de texto.
     * Si las credenciales coinciden, abre la ventana del menú principal. Si no, muestra un mensaje de error.
     * 
     * @param evt El evento de acción que ocurre cuando se presiona el botón "Iniciar Sesión".
     */
    private void btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarSesionActionPerformed
        String nombreUsuario = txt_NombreUsuario.getText(); // Obtiene el nombre de usuario ingresado
        String contraseña = new String(jpass_Contraseña.getPassword()); // Obtiene la contraseña ingresada
         

        // Verifica que los campos de nombre de usuario y contraseña no estén vacíos
    if (nombreUsuario.isEmpty() || contraseña.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
        return; // Termina el método si algún campo está vacío
    }

    boolean accesoConcedido = false; // Variable para determinar si se concede el acceso
    
    
    
    try {
         // Ruta al archivo usuarios.txt que contiene los usuarios registrados 
        File archivoUsuarios = new File("D:\\Metodos_2024\\LoginFrame/usuarios.txt");
        // Verifica si el archivo de usuarios existe
        if (!archivoUsuarios.exists()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay usuarios registrados.");
            return; // Termina el método si el archivo no existe
        }
            // Lee el archivo de usuarios
            try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {
                String linea;
                
                // Revisa cada línea del archivo
                while ((linea = br.readLine()) != null) {
                    String[] datosUsuario = linea.split(",");
                    
                    // Asegura que la línea tenga el formato correcto (debería tener 3 campos)
                    if (datosUsuario.length == 3) {
                        String usuarioRegistrado = datosUsuario[1];
                        String contraseñaRegistrada = datosUsuario[2];
                        
                        // Verifica si coinciden el nombre de usuario y la contraseña
                        if (nombreUsuario.equals(usuarioRegistrado) && contraseña.equals(contraseñaRegistrada)) {
                            accesoConcedido = true; // Se concede el acceso si las credenciales son correctas
                            break; // Termina el bucle si las credenciales coinciden
                        }
                    }
                }   }

        // Si el acceso es concedido, abre la ventana del menú principal
    if (accesoConcedido) {
        javax.swing.JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso.");
        this.dispose(); // Cierra la ventana de inicio de sesión
        new MenuPrincipal().setVisible(true); // Abre la ventana del menú principal
    } else {
        // Muestra un mensaje de error si las credenciales son incorrectas
        javax.swing.JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos.");
    }

        } catch (IOException e) {
        // Muestra un mensaje de error si ocurre un problema al leer el archivo de usuarios
        javax.swing.JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios.");
    }                                              
    

        
    }//GEN-LAST:event_btn_IniciarSesionActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_IniciarSesion;
    private javax.swing.JButton btn_Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpass_Contraseña;
    private javax.swing.JTextField txt_NombreUsuario;
    // End of variables declaration//GEN-END:variables
}
