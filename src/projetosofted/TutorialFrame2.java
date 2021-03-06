/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosofted;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HD
 */
public class TutorialFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form TutorialFrame2
     */
    public TutorialFrame2() {
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

        jLabel1 = new javax.swing.JLabel();
        opcaoA = new javax.swing.JButton();
        opcaoB = new javax.swing.JButton();
        opcaoC = new javax.swing.JButton();
        gesto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTutorial = new javax.swing.JLabel();
        jLabelEscolha = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        TelaDeFundoTutorialFrame2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/EmSeguida.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 180, 750, 60);

        opcaoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraA.png"))); // NOI18N
        opcaoA.setContentAreaFilled(false);
        opcaoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcaoAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcaoAMouseExited(evt);
            }
        });
        opcaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoAActionPerformed(evt);
            }
        });
        getContentPane().add(opcaoA);
        opcaoA.setBounds(400, 380, 130, 30);

        opcaoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraB.png"))); // NOI18N
        opcaoB.setContentAreaFilled(false);
        opcaoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcaoBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcaoBMouseExited(evt);
            }
        });
        opcaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoBActionPerformed(evt);
            }
        });
        getContentPane().add(opcaoB);
        opcaoB.setBounds(400, 430, 130, 30);

        opcaoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraC.png"))); // NOI18N
        opcaoC.setContentAreaFilled(false);
        opcaoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcaoCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcaoCMouseExited(evt);
            }
        });
        opcaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCActionPerformed(evt);
            }
        });
        getContentPane().add(opcaoC);
        opcaoC.setBounds(400, 470, 130, 37);

        gesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/GestoA.png"))); // NOI18N
        getContentPane().add(gesto);
        gesto.setBounds(280, 410, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/NomeGesto.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 420, 100, 30);

        jLabelTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Tutorial2D.png"))); // NOI18N
        getContentPane().add(jLabelTutorial);
        jLabelTutorial.setBounds(310, 0, 360, 80);

        jLabelEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Invisivel.png"))); // NOI18N
        getContentPane().add(jLabelEscolha);
        jLabelEscolha.setBounds(380, 520, 240, 57);

        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Sair.png"))); // NOI18N
        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonInicioMouseExited(evt);
            }
        });
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio);
        jButtonInicio.setBounds(10, 0, 130, 60);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png"))); // NOI18N
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
        jButtonVoltar.setBounds(840, 0, 150, 60);

        TelaDeFundoTutorialFrame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/TesteBackground.png"))); // NOI18N
        getContentPane().add(TelaDeFundoTutorialFrame2);
        TelaDeFundoTutorialFrame2.setBounds(0, 0, 1200, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoAMouseEntered
        opcaoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraABrilho.png")));
    }//GEN-LAST:event_opcaoAMouseEntered

    private void opcaoAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoAMouseExited
        opcaoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraA.png")));
    }//GEN-LAST:event_opcaoAMouseExited

    private void opcaoBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoBMouseEntered
        opcaoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraBBrilho.png")));
    }//GEN-LAST:event_opcaoBMouseEntered

    private void opcaoBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoBMouseExited
        opcaoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraB.png")));
    }//GEN-LAST:event_opcaoBMouseExited

    private void opcaoCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoCMouseEntered
        opcaoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraCBrilho.png")));
    }//GEN-LAST:event_opcaoCMouseEntered

    private void opcaoCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoCMouseExited
        opcaoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraC.png")));
    }//GEN-LAST:event_opcaoCMouseExited

    private void opcaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoAActionPerformed
        jLabelEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
        
    }//GEN-LAST:event_opcaoAActionPerformed

    private void opcaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoBActionPerformed
        jLabelEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
    }//GEN-LAST:event_opcaoBActionPerformed

    private void opcaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCActionPerformed
        jLabelEscolha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
    }//GEN-LAST:event_opcaoCActionPerformed

    private void jButtonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicioMouseEntered
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/SairBrilho.png")));
    }//GEN-LAST:event_jButtonInicioMouseEntered

    private void jButtonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicioMouseExited
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Sair.png")));
    }//GEN-LAST:event_jButtonInicioMouseExited

    private void jButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseEntered
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/VoltarBrilho.png")));
    }//GEN-LAST:event_jButtonVoltarMouseEntered

    private void jButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseExited
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png")));
    }//GEN-LAST:event_jButtonVoltarMouseExited

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        dispose();
        new TutorialFrame().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(TutorialFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorialFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorialFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorialFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorialFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TelaDeFundoTutorialFrame2;
    private javax.swing.JLabel gesto;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEscolha;
    private javax.swing.JLabel jLabelTutorial;
    private javax.swing.JButton opcaoA;
    private javax.swing.JButton opcaoB;
    private javax.swing.JButton opcaoC;
    // End of variables declaration//GEN-END:variables
}
