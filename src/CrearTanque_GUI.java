
import com.mongodb.MongoClient;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Zea y Rodolfo Alonzo
 * @version 02.11.17
 */
public class CrearTanque_GUI extends javax.swing.JFrame {
    public static ArrayList<Controles> controls3 = new ArrayList<>();
    albearControl ctrl = new albearControl();
    //Connection cn = new Connection();
    /**
     * Creates new form CrearTanque_GUI
     */
    public CrearTanque_GUI() {
        initComponents();
        hideOptions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblL = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        txtL = new javax.swing.JTextField();
        lblBC = new javax.swing.JLabel();
        txtBC = new javax.swing.JTextField();
        txtAC = new javax.swing.JTextField();
        lblAC = new javax.swing.JLabel();
        txtBO = new javax.swing.JTextField();
        lblBO = new javax.swing.JLabel();
        txtAO = new javax.swing.JTextField();
        lblAO = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnReg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Crear Tanque");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de Tanque: ");

        lblL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblL.setText("Longitud de Arista: ");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cubico", "Ortogonal", "Cilindrico" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        lblBC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBC.setText("Base del Cilindro:");

        lblAC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAC.setText("Altura del Cilindro:");

        lblBO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBO.setText("Base Ortogonal:");

        lblAO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAO.setText("Altura Ortogonal:");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnReg.setText("Regresar");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        jButton1.setText("Tanques Creados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblBC)
                                                .addComponent(lblL, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(lblAC, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(lblBO, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCrear)
                                        .addComponent(lblAO)
                                        .addComponent(btnReg)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtL)
                                    .addComponent(txtBC)
                                    .addComponent(txtAC)
                                    .addComponent(txtBO)
                                    .addComponent(txtAO, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblL)
                            .addComponent(txtL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBC)
                            .addComponent(txtBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAO))
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReg)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
        showOptions();
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(txtId.getText());
        Tanque tanque;
        try{
        if(ctrl.existeID(controls3, id) == false){
            
        
        switch (cmbTipo.getSelectedIndex()){
            case 0:
                float longitud = Float.parseFloat(txtL.getText());
                tanque = ctrl.crearTanqueCubico(id, 0, longitud);
                ctrl.agregarALista(tanque, controls3);
                 //cn.ds.save(tanque);
                break;
            case 1:
                float baseO = Float.parseFloat(txtBO.getText());
                float alturaO = Float.parseFloat(txtAO.getText());
                tanque = ctrl.crearTanqueOrtogonal(id, 0, baseO, alturaO);
                ctrl.agregarALista(tanque, controls3);
                // cn.ds.save(tanque);
                break;
            case 2:
                float base = Float.parseFloat(txtBC.getText());
                float altura = Float.parseFloat(txtAC.getText());
                tanque = ctrl.crearTanqueCilindrico(id, 0, base, altura);
                ctrl.agregarALista(tanque, controls3);
                 //cn.ds.save(tanque);
                
                break;
        }
        
        }else{
            JOptionPane.showMessageDialog(null, "Este ID ya existe");
        }
        
        }catch (Exception ex){
            
        }

       
    }//GEN-LAST:event_btnCrearActionPerformed

   
    
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        // TODO add your handling code here:
        PantallaInicio ini = new PantallaInicio();
        
        ctrl.salvar(controls3);
        
        ini.controls = controls3;
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ctrl.showTanquesCreados(jTextArea1, controls3);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * Muestra opciones dependiendo del tipo de tanque que se está creando
     */
    public void showOptions(){
        switch (cmbTipo.getSelectedIndex()){
            case 0:
                txtL.setVisible(true);
                lblL.setVisible(true);
                
                txtBO.setVisible(false);
                lblBO.setVisible(false);
                txtAO.setVisible(false);
                lblAO.setVisible(false);
                txtAC.setVisible(false);
                lblAC.setVisible(false);
                txtBC.setVisible(false);
                lblBC.setVisible(false);
                break;
            case 1:
                txtBO.setVisible(true);
                lblBO.setVisible(true);
                txtAO.setVisible(true);
                lblAO.setVisible(true);
                
                txtAC.setVisible(false);
                lblAC.setVisible(false);
                txtBC.setVisible(false);
                lblBC.setVisible(false);
                txtL.setVisible(false);
                lblL.setVisible(false);
                
                break;
            case 2:
                txtAC.setVisible(true);
                lblAC.setVisible(true);
                txtBC.setVisible(true);
                lblBC.setVisible(true);
                
                txtL.setVisible(false);
                lblL.setVisible(false);
                txtBO.setVisible(false);
                lblBO.setVisible(false);
                txtAO.setVisible(false);
                lblAO.setVisible(false);
                break;
        }
    }

    /**
     * Esconde opciones dependiendo del tipo de tanque que se está creando
     */
    public void hideOptions(){
         txtBO.setVisible(false);
                lblBO.setVisible(false);
                txtAO.setVisible(false);
                lblAO.setVisible(false);
                txtAC.setVisible(false);
                lblAC.setVisible(false);
                txtBC.setVisible(false);
                lblBC.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(CrearTanque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTanque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTanque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTanque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearTanque_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAC;
    private javax.swing.JLabel lblAO;
    private javax.swing.JLabel lblBC;
    private javax.swing.JLabel lblBO;
    private javax.swing.JLabel lblL;
    private javax.swing.JTextField txtAC;
    private javax.swing.JTextField txtAO;
    private javax.swing.JTextField txtBC;
    private javax.swing.JTextField txtBO;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtL;
    // End of variables declaration//GEN-END:variables
}
