/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.InformeController;
import Model.ProyectoCasaCampestreDTO;
import java.sql.SQLException;

import java.util.List;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class Inform2 extends javax.swing.JFrame {
    public static final InformeController controller = new InformeController();
    /**
     * Creates new form Inform2
     */
    public Inform2() {
        initComponents();
        setLocationRelativeTo(null);
        LlenarTabla();
    }
    public void LlenarTabla(){
        DefaultTableModel informeuno = new DefaultTableModel();
        informeuno.addColumn("ID");
        informeuno.addColumn("CONSTRUCTORA");
        informeuno.addColumn("N° HABITACIONES");
        informeuno.addColumn("CIUDAD");
        
        tabla2.setModel(informeuno);
        
        Object[] objeto = new Object[4];
        try{
            List<ProyectoCasaCampestreDTO> project3 = controller.Listatotalproyectocasacampestre();
            
            for (ProyectoCasaCampestreDTO vo : project3) {
              objeto[0]= vo.getId();
              objeto[1]=vo.getConstructora();
              objeto[2]=vo.getNumbersRooms();
              objeto[3]=vo.getCity();
              informeuno.addRow(objeto);  
            }
            tabla2.setModel(informeuno);
        }catch(SQLException ex){
            System.err.println("ERROR: "+ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFORME 2");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INFORME 2 - PROYECTOS CASA CAMPESTRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 430, -1));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla2.getTableHeader().setResizingAllowed(false);
        tabla2.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 60, 480, 240));

        volver.setText("Volver");
        volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.setBorderPainted(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoparainformes.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        interfaz inter = new interfaz();
        inter.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(Inform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inform2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla2;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
