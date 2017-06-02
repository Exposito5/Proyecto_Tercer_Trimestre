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
public class ComprarBilletes extends javax.swing.JFrame {

    /**
     * Creates new form ComprarBilletes
     */
    public ComprarBilletes() {
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

        jPanel1 = new javax.swing.JPanel();
        Origen_Combo = new javax.swing.JComboBox<>();
        Destino_Combo = new javax.swing.JComboBox<>();
        Origen_Calendario = new com.toedter.calendar.JCalendar();
        Destino_Calendario = new com.toedter.calendar.JCalendar();
        Origen_Text = new javax.swing.JLabel();
        Destino_Text = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Siguiente_Boton = new javax.swing.JButton();
        Billetes_Text = new javax.swing.JLabel();
        Billetes_Field = new javax.swing.JTextField();
        Compañia_Text = new javax.swing.JLabel();
        Compañia_Combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Origen_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(Origen_Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, 40));

        Destino_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(Destino_Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, 40));
        jPanel1.add(Origen_Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel1.add(Destino_Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        Origen_Text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Origen_Text.setText("Origen");
        jPanel1.add(Origen_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        Destino_Text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Destino_Text.setText("Destino");
        jPanel1.add(Destino_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setAlignmentX(3.0F);
        jSeparator1.setAlignmentY(3.0F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 330));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 540, -1));

        Siguiente_Boton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Siguiente_Boton.setText("Siguiente paso");
        jPanel1.add(Siguiente_Boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        Billetes_Text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Billetes_Text.setText("Número de billetes:");
        jPanel1.add(Billetes_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        jPanel1.add(Billetes_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 130, 30));

        Compañia_Text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Compañia_Text.setText("Escoja compañía:");
        jPanel1.add(Compañia_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        Compañia_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(Compañia_Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ComprarBilletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarBilletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarBilletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarBilletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarBilletes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Billetes_Field;
    private javax.swing.JLabel Billetes_Text;
    private javax.swing.JComboBox<String> Compañia_Combo;
    private javax.swing.JLabel Compañia_Text;
    private com.toedter.calendar.JCalendar Destino_Calendario;
    private javax.swing.JComboBox<String> Destino_Combo;
    private javax.swing.JLabel Destino_Text;
    private com.toedter.calendar.JCalendar Origen_Calendario;
    private javax.swing.JComboBox<String> Origen_Combo;
    private javax.swing.JLabel Origen_Text;
    private javax.swing.JButton Siguiente_Boton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
