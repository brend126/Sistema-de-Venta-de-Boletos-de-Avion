/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemadevuelos.BusquedaVuelos;
import java.awt.Color;
import sistemadevuelos.FondoPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sistemadevuelos.Home.Inicio;
import sistemadevuelos.InicioSesion.RoundedCornerBorder;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;



public class Busqueda extends javax.swing.JFrame {
//para el fondo
    FondoPanel fondo2 = new FondoPanel();
    
    public Busqueda() {
        this.setContentPane(fondo2);
        
        initComponents();
        //Centrar el formulario
        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new FondoPanel();
        Inicio_btn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buscar_btn = new javax.swing.JButton();
        origen_txt = new javax.swing.JTextField();
        destino_txt = new javax.swing.JTextField();
        cantidad_txt = new javax.swing.JTextField();
        FechaDeIda = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1260, 986));

        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 986));

        Inicio_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemadevuelos/Imagenes/VOLANDO.png"))); // NOI18N
        Inicio_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inicio_btnMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new RoundedCornerBorder(8));

        jPanel3.setBorder(new RoundedCornerBorder(8));
        jPanel3.setPreferredSize(new java.awt.Dimension(1160, 101));

        buscar_btn.setBackground(new java.awt.Color(255, 202, 85));
        buscar_btn.setText("Buscar");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        origen_txt.setForeground(java.awt.Color.darkGray);
        origen_txt.setText("Origen");
        origen_txt.setBorder(new RoundedCornerBorder(8));
        origen_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                origen_txtMouseClicked(evt);
            }
        });
        origen_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origen_txtActionPerformed(evt);
            }
        });

        destino_txt.setForeground(java.awt.Color.darkGray);
        destino_txt.setText("Destino");
        destino_txt.setBorder(new RoundedCornerBorder(8));
        destino_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destino_txtMouseClicked(evt);
            }
        });
        destino_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destino_txtActionPerformed(evt);
            }
        });

        cantidad_txt.setForeground(new java.awt.Color(102, 102, 102));
        cantidad_txt.setText("Cantidad de pasajeros");
        destino_txt.setBorder(new RoundedCornerBorder(8));
        cantidad_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidad_txtMouseClicked(evt);
            }
        });
        cantidad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_txtActionPerformed(evt);
            }
        });
        cantidad_txt.setBorder(new RoundedCornerBorder(8));

        JTextField dateTextField = (JTextField) FechaDeIda.getDateEditor().getUiComponent();
        dateTextField.setText("Fecha de ida");
        dateTextField.setForeground(Color.DARK_GRAY);

        dateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (dateTextField.getText().equals("Fecha de ida")) {
                    dateTextField.setText("");
                    dateTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (dateTextField.getText().isEmpty()) {
                    dateTextField.setText("Seleccione una fecha");
                    dateTextField.setForeground(Color.GRAY);
                }
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(origen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(destino_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(FechaDeIda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(origen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(destino_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FechaDeIda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemadevuelos/Imagenes/airplane-sharp.png"))); // NOI18N
        jLabel1.setText("Vuelos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("¿Compras en dólares? Considera que al ser una compra en el exterior estará sujeta a las leyes de ese país, y la entidad emisora de tu tarjeta de crédito puede aplicar cargos adicionales e impuestos.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemadevuelos/Imagenes/Group 2_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Inicio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Inicio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inicio_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inicio_btnMouseClicked
        //Para volver al inicio haciendo click en el logo
        Inicio inicio = new Inicio();

        // Hacer visible el JFrame 
        inicio.setVisible(true);

        // Cerrar el JFrame actual (Inicio)
        this.dispose();
    }//GEN-LAST:event_Inicio_btnMouseClicked

    private void cantidad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_txtActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed

    String origen = origen_txt.getText();
    String destino = destino_txt.getText();
    Date fechaDeIda = FechaDeIda.getDate();
    
    int cantidadPasajeros = Integer.parseInt(cantidad_txt.getText());
    
    // Validación básica
    if (origen.isEmpty() || destino.isEmpty() || fechaDeIda == null || cantidadPasajeros <= 0) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos correctamente.");
        return;
    }
    
    // Convertir fechas a Strings formateados
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String fechaDeIdaFormateada = sdf.format(fechaDeIda);
    
    
    // Crear instancia de VuelosDisponibles
    VuelosDisponibles vuelosdisponibles = new VuelosDisponibles(origen, destino, fechaDeIdaFormateada, String.valueOf(cantidadPasajeros));
    vuelosdisponibles.setVisible(true);
    dispose();
    
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void origen_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origen_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origen_txtActionPerformed

    private void destino_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destino_txtActionPerformed
         
    }//GEN-LAST:event_destino_txtActionPerformed

    private void destino_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destino_txtMouseClicked
         destino_txt.setText("");
    }//GEN-LAST:event_destino_txtMouseClicked

    private void origen_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_origen_txtMouseClicked
         origen_txt.setText("");
    }//GEN-LAST:event_origen_txtMouseClicked

    private void cantidad_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidad_txtMouseClicked
         cantidad_txt.setText("");
    }//GEN-LAST:event_cantidad_txtMouseClicked

  
  
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaDeIda;
    private javax.swing.JLabel Inicio_btn;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField cantidad_txt;
    private javax.swing.JTextField destino_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField origen_txt;
    // End of variables declaration//GEN-END:variables

}
