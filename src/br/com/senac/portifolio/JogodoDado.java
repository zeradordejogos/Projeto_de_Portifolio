/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.portifolio;

/**
 *
 * @author Victor
 */
public class JogodoDado extends javax.swing.JFrame {

    
    public void dado(){
         int dado = (int) (Math.random() * 6 + 1);
         
         if (dado == 1) {
            lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/face1.png")));
        } else if (dado == 2){
            lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/face2.png")));
        }else if (dado == 3){
            lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/face3.png")));
            
        }else if (dado == 4){
            lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/face4.png")));
        }else if (dado == 5){
            lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/face5.png")));
        }else if(dado == 6){
            lblDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/face6.png")));
        }
    }
    
    
    
    /**
     * Creates new form JogodoDado
     */
    public JogodoDado() {
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

        btnSortearface = new javax.swing.JButton();
        lblDado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSortearface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/dado.png"))); // NOI18N
        btnSortearface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearfaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnSortearface, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(719, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnSortearface, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(lblDado, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1049, 763);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortearfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearfaceActionPerformed
        dado();
    }//GEN-LAST:event_btnSortearfaceActionPerformed

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
            java.util.logging.Logger.getLogger(JogodoDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogodoDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogodoDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogodoDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogodoDado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSortearface;
    private javax.swing.JLabel lblDado;
    // End of variables declaration//GEN-END:variables
}