/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosofted;

import javax.swing.JOptionPane;

/**
 *
 * @author HD
 */
public class QuartoNivel extends javax.swing.JFrame {

    boolean resposta = false;
    boolean corretude = false;
    int i=1;
    int pontos = 0;
    int combo;
    
    public QuartoNivel() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public String mostrarPontos(){
        return String.format("" + pontos);
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
        jButtonContinuar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabelGif = new javax.swing.JLabel();
        jLabelResposta = new javax.swing.JLabel();
        jLabelPontos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonAcento = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabelTeladeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelLayout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/Alimentos.png"))); // NOI18N
        getContentPane().add(jLabelLayout);
        jLabelLayout.setBounds(310, 30, 430, 70);

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
        jButtonContinuar.setBounds(380, 640, 210, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Arroz.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(810, 230, 80, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Biscoito.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 280, 110, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Bolo.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(830, 330, 60, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Chiclete.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(800, 380, 110, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Sanduiche.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(790, 430, 130, 30);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/FileDePeixe.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(770, 490, 170, 20);

        jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/bolo.gif"))); // NOI18N
        getContentPane().add(jLabelGif);
        jLabelGif.setBounds(170, 210, 500, 330);

        jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Invisivel.png"))); // NOI18N
        getContentPane().add(jLabelResposta);
        jLabelResposta.setBounds(390, 580, 180, 50);

        jLabelPontos.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabelPontos.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPontos.setText("0");
        getContentPane().add(jLabelPontos);
        jLabelPontos.setBounds(110, 120, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Pontos-.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 140, 100, 20);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 200, 520, 350);

        jButtonAcento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestosComuns/acentoAmarelo.png"))); // NOI18N
        jButtonAcento.setBorderPainted(false);
        jButtonAcento.setContentAreaFilled(false);
        jButtonAcento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAcentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAcentoMouseExited(evt);
            }
        });
        jButtonAcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcentoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcento);
        jButtonAcento.setBounds(800, 480, 30, 20);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(20, 660, 140, 40);

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
        if(resposta == false){
            JOptionPane.showMessageDialog(null, "Selecione uma opção");
        }else{
            //ao clicar no botão continuar depois de escolher uma opção
            jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Invisivel.png")));
            i++;
            resposta = false;
            
            switch(i){
               
                case 2:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/arroz.gif")));
                    break;
                case 3:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/chiclete.gif")));
                    break;
                case 4:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/sanduiche.gif")));
                    break;
                case 5:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/biscoito.gif")));
                    break;
                case 6:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alimentos/filé-de-peixe.gif")));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Parabéns!!! Você concluiu o nível 4.");
                    dispose();
                    new Niveis().setVisible(true);
                    break;
            }
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
                pontos += 10;
                combo += 1;
                jLabelPontos.setText(mostrarPontos());
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;    
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
          
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
               pontos += 10;
                combo += 1;
                jLabelPontos.setText(mostrarPontos());
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                pontos += 10;
                combo += 1;
                jLabelPontos.setText(mostrarPontos());
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                break;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
          
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
               pontos += 10;
                combo += 1;
                jLabelPontos.setText(mostrarPontos());
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
          
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
                
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               pontos += 10;
                combo += 1;
                jLabelPontos.setText(mostrarPontos());
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                break;
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/ArrozBrilho.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Arroz.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/BiscoitoBrilho.png")));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Biscoito.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/BoloBrilho.png")));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Bolo.png")));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/ChicleteBrilho.png")));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Chiclete.png")));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/SanduicheBrilho.png")));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/Sanduiche.png")));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/FileDePeixeBrilho.png")));
        jButtonAcento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestosComuns/acentoAmareloBrilho.png")));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotoesAlimentos/FileDePeixe.png")));
        jButtonAcento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestosComuns/acentoAmarelo.png")));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
          
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
               
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
                
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
                pontos += 10;
                combo += 1;
                jLabelPontos.setText(mostrarPontos());
                break;
                
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonAcentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAcentoMouseEntered
        jButtonAcento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestosComuns/acentoAmareloBrilho.png")));
    }//GEN-LAST:event_jButtonAcentoMouseEntered

    private void jButtonAcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcentoActionPerformed
        
    }//GEN-LAST:event_jButtonAcentoActionPerformed

    private void jButtonAcentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAcentoMouseExited
        jButtonAcento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestosComuns/acentoAmarelo.png")));
    }//GEN-LAST:event_jButtonAcentoMouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/VoltarBrilho.png")));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png")));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        new TutorialFase4().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(QuartoNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuartoNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuartoNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuartoNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuartoNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonAcento;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGif;
    private javax.swing.JLabel jLabelLayout;
    private javax.swing.JLabel jLabelPontos;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JLabel jLabelTeladeFundo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}