/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tercer_trimestre;

/**
 *
 * @author artur
 */
public class InsertarAviones extends javax.swing.JFrame {

    /**
     * Creates new form InsertarAviones
     */
    public InsertarAviones() {
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonInsertar = new javax.swing.JButton();
        fabricantename = new javax.swing.JLabel();
        fabricante = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nserie = new javax.swing.JTextField();
        potencia = new javax.swing.JTextField();
        npasajeros = new javax.swing.JTextField();
        origen = new javax.swing.JComboBox<>();
        destino = new javax.swing.JComboBox<>();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Esta clase te la hago asi rápido para que le hagas el tema base de datos ya te explicaré lo que quiero hacer con ella");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        BotonInsertar.setText("Insertar el Avión");
        jPanel1.add(BotonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        fabricantename.setText("Nombre del fabricante");
        jPanel1.add(fabricantename, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        jPanel1.add(fabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, -1));
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 190, 20));

        jLabel2.setText("Modelo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, 20));

        jLabel3.setText("Número de serie de la aeronave");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel4.setText("Potencia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel5.setText("Número de pasajeros máximos que soporta la embarcación");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel6.setText("Origen");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel8.setText("Destino");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        nserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nserieActionPerformed(evt);
            }
        });
        jPanel1.add(nserie, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 30));
        jPanel1.add(potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 170, 30));
        jPanel1.add(npasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 210, 30));

        origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Coruña", "Albacete", "Alicante", "Almería", "Asturias", "Barcelona", "Badajoz", "Bilbao", "Burgos", "Córdoba", "Girona", "Gran Canaria", "Granada", "Huesca", "Ibiza", "Jerez", "Lanzarote", "León", "Madrid", "Melilla", "Menorca", "Palma de Mallorca", "Reus", "Sabadell", "Salamanca", "Santander", "Santiago de Compostela", "Sevilla", "Tenerife", "Valencia", "Valladolid", "Vigo", "Vitoria", "Zaragoza" }));
        origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenActionPerformed(evt);
            }
        });
        jPanel1.add(origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Coruña", "Albacete", "Alicante", "Almería", "Asturias", "Barcelona", "Badajoz", "Bilbao", "Burgos", "Córdoba", "Girona", "Gran Canaria", "Granada", "Huesca", "Ibiza", "Jerez", "Lanzarote", "León", "Madrid", "Melilla", "Menorca", "Palma de Mallorca", "Reus", "Sabadell", "Salamanca", "Santander", "Santiago de Compostela", "Sevilla", "Tenerife", "Valencia", "Valladolid", "Vigo", "Vitoria", "Zaragoza" }));
        jPanel1.add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

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

    private void nserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nserieActionPerformed

    private void origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origenActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarAviones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarAviones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JTextField fabricante;
    private javax.swing.JLabel fabricantename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField npasajeros;
    private javax.swing.JTextField nserie;
    private javax.swing.JComboBox<String> origen;
    private javax.swing.JTextField potencia;
    // End of variables declaration//GEN-END:variables
}
