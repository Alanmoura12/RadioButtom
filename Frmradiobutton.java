/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alanm
 */
public class Frmradiobutton extends javax.swing.JFrame {

    /**
     * Creates new form Frmradiobutton
     */
    public Frmradiobutton() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblprojeto = new java.awt.Label();
        lblnumero = new javax.swing.JLabel();
        txtresposta = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        rbjava = new javax.swing.JRadioButton();
        rbphp = new javax.swing.JRadioButton();
        rbjs = new javax.swing.JRadioButton();
        txtescolher = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblprojeto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblprojeto.setName(""); // NOI18N
        lblprojeto.setText("Exemplo RadioButton");

        lblnumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblnumero.setText("Resposta:");

        txtresposta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtresposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespostaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Linguagens de programação"));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        buttonGroup1.add(rbjava);
        rbjava.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbjava.setText("Java");
        rbjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjavaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbphp);
        rbphp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbphp.setText("PHP");
        rbphp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbphpActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbjs);
        rbjs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbjs.setText("JavaScript");
        rbjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rbjava)
                .addGap(51, 51, 51)
                .addComponent(rbjs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(rbphp)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbjs)
                    .addComponent(rbphp)
                    .addComponent(rbjava))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        txtescolher.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtescolher.setLabel("Escolher");
        txtescolher.setName(""); // NOI18N
        txtescolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtescolherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblprojeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(txtescolher, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblprojeto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumero)
                    .addComponent(txtresposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtescolher, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Linguagens de programação");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespostaActionPerformed

    private void rbjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbjavaActionPerformed

    private void rbjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbjsActionPerformed

    private void rbphpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbphpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbphpActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void txtescolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtescolherActionPerformed

        // Botão escolher 
        if (rbjava.isSelected() == true ){
            // A opção foi Java
            txtresposta.setText("Java");
        } 
        else if (rbjs.isSelected()){
            // A opção foi  JavaScript
            txtresposta.setText(rbjs.getText());
        }
        else if (rbphp.isSelected() == true ) {
            // A opção foi PHP
            txtresposta.setText("PHP");
        }
        
    }//GEN-LAST:event_txtescolherActionPerformed

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
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmradiobutton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblnumero;
    private java.awt.Label lblprojeto;
    private javax.swing.JRadioButton rbjava;
    private javax.swing.JRadioButton rbjs;
    private javax.swing.JRadioButton rbphp;
    private java.awt.Button txtescolher;
    private java.awt.TextField txtresposta;
    // End of variables declaration//GEN-END:variables
}
