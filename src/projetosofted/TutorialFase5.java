/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosofted;

/**
 *
 * @author HD
 */
public class TutorialFase5 extends javax.swing.JFrame {

    /**
     * Creates new form TutorialFase1
     */
    public TutorialFase5() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLayout = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButtonContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelTeladeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Animais/Animais.png"))); // NOI18N
        getContentPane().add(jLabelLayout);
        jLabelLayout.setBounds(330, 10, 420, 70);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Animais/aranha.gif"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(20, 220, 470, 350);

        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Continuar.png"))); // NOI18N
        jButtonContinuar.setBorderPainted(false);
        jButtonContinuar.setContentAreaFilled(false);
        jButtonContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonContinuarMouseExited(evt);
            }
        });
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContinuar);
        jButtonContinuar.setBounds(380, 650, 210, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Animais/baleia.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 220, 460, 350);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 210, 970, 370);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAnimais/Baleia.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 180, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAnimais/Aranha.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 180, 100, 28);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png"))); // NOI18N
        jButtonVoltar.setBorderPainted(false);
        jButtonVoltar.setContentAreaFilled(false);
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseExited(evt);
            }
        });
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(20, 660, 140, 50);

        jLabelTeladeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/newBackground.png"))); // NOI18N
        jLabelTeladeFundo.setFocusable(false);
        getContentPane().add(jLabelTeladeFundo);
        jLabelTeladeFundo.setBounds(0, 0, 1070, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonContinuarMouseEntered
        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/ContinuarBrilho.png")));
    }//GEN-LAST:event_jButtonContinuarMouseEntered

    private void jButtonContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonContinuarMouseExited
        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Continuar.png")));
    }//GEN-LAST:event_jButtonContinuarMouseExited

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        new TutorialFase5p2().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/VoltarBrilho.png")));
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png")));
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        dispose();
        new Niveis().setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TutorialFase5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorialFase5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorialFase5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorialFase5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorialFase5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLayout;
    private javax.swing.JLabel jLabelTeladeFundo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
