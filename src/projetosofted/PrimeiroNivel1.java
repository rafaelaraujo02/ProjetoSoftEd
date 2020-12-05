/*
 * O TESTE COM O SWITCH PARA CONTROLE DE FASES FUNCIONOU
 * NÃO SERÁ PRECISO CRIAR UM JFRAME PARA CADA ETAPA DE UMA FASE
 * BASTA ADICIONAR A ETAPA NO SWITCH E CONFIGURAR A IMAGEM DE CADA RESPOSTA, SEU BRILHO E SUA CORRETUDE
 * EM RELAÇÃO À CADA PERGUNTA;
 * NO PRIMEIRO NÍVEL SÃO 10 NÚMEROS, SENDO DE 0 ATÉ 9
 *  1 > A , B , C
 *  
 */
// COLOQUEI OS NÚMEROS 2,0 E 7, MAS FALTA CONFIGURAR OS NÚMEROSBRILHO 
package projetosofted;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author manon
 */
public class PrimeiroNivel1 extends javax.swing.JFrame {

    
        
    int i=1;
    int pontuacao=0;
    int combo=1;
    boolean corretude = false; //VARIÁVEL PARA SABER SE O JOGADOR ACERTOU 
    boolean resposta = false; //VARIÁVEL PARA CONTROLAR SE O JOGADOR ESCOLHEU ALGUMA OPÇÃO
    public PrimeiroNivel1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    public String toString(){
        return String.format(""+ pontuacao);
    }
    public String mostrarMultiplicador(){
        return String.format(""+ combo +"x");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonEditarA = new javax.swing.JButton();
        jButtonEditarB = new javax.swing.JButton();
        jButtonEditarC = new javax.swing.JButton();
        jLabelResposta = new javax.swing.JLabel();
        jButtonContinuar = new javax.swing.JButton();
        jLabelGif = new javax.swing.JLabel();
        jLabelLayoutNumero = new javax.swing.JLabel();
        jLabelAcento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelPontos = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabelFundoNível1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/NomeGesto.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 290, 110, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaA.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
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
        jButton1.setBounds(580, 210, 230, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaB.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
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
        jButton2.setBounds(580, 280, 230, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaC.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
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
        jButton3.setBounds(580, 360, 230, 50);

        jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/dois.png"))); // NOI18N
        jButtonEditarA.setBorderPainted(false);
        jButtonEditarA.setContentAreaFilled(false);
        jButtonEditarA.setFocusPainted(false);
        getContentPane().add(jButtonEditarA);
        jButtonEditarA.setBounds(820, 220, 30, 40);

        jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/zero.png"))); // NOI18N
        jButtonEditarB.setBorderPainted(false);
        jButtonEditarB.setContentAreaFilled(false);
        jButtonEditarB.setFocusPainted(false);
        getContentPane().add(jButtonEditarB);
        jButtonEditarB.setBounds(820, 280, 30, 50);

        jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/sete.png"))); // NOI18N
        jButtonEditarC.setBorderPainted(false);
        jButtonEditarC.setContentAreaFilled(false);
        jButtonEditarC.setFocusPainted(false);
        getContentPane().add(jButtonEditarC);
        jButtonEditarC.setBounds(820, 360, 30, 40);

        jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Invisivel.png"))); // NOI18N
        getContentPane().add(jLabelResposta);
        jLabelResposta.setBounds(400, 480, 240, 80);

        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Continuar.png"))); // NOI18N
        jButtonContinuar.setBorderPainted(false);
        jButtonContinuar.setContentAreaFilled(false);
        jButtonContinuar.setFocusPainted(false);
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
        jButtonContinuar.setBounds(380, 640, 220, 40);

        jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoZero.png"))); // NOI18N
        getContentPane().add(jLabelGif);
        jLabelGif.setBounds(370, 260, 110, 100);

        jLabelLayoutNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LayoutNumeros.png"))); // NOI18N
        getContentPane().add(jLabelLayoutNumero);
        jLabelLayoutNumero.setBounds(310, 40, 380, 60);

        jLabelAcento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/acento.png"))); // NOI18N
        getContentPane().add(jLabelAcento);
        jLabelAcento.setBounds(390, 30, 20, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 120, 290, 60);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("1x");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 170, 150, 50);

        jLabelPontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Pontos-.png"))); // NOI18N
        getContentPane().add(jLabelPontos);
        jLabelPontos.setBounds(0, 150, 100, 20);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png"))); // NOI18N
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
        jButton4.setBounds(20, 640, 150, 40);

        jLabelFundoNível1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/newBackground.png"))); // NOI18N
        jLabelFundoNível1.setFocusable(false);
        jLabelFundoNível1.setMaximumSize(new java.awt.Dimension(1000, 800));
        jLabelFundoNível1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jLabelFundoNível1.setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(jLabelFundoNível1);
        jLabelFundoNível1.setBounds(0, -130, 1000, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //controle de respostas nos botões a partir do i para cada rodada
        switch(i){
        case 1:
            if(resposta == false)
                jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
            resposta = true;
            combo = 1;
            jLabel3.setText(mostrarMultiplicador());
            break;
        case 2:
            if(resposta == false)
                jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
            resposta = true;
            combo = 1;
            jLabel3.setText(mostrarMultiplicador());
            break;
        case 3:
            if(resposta == false) //8
                jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
            resposta = true;
            //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++;
          
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
                
            }
            corretude = false;
            break;
        case 4:
            if(resposta == false)
                jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
            resposta = true;
            combo = 1;
            jLabel3.setText(mostrarMultiplicador());
            break;
        case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
        case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++;
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
               
            }
            corretude = false;
                break;
                
        case 7:
            if(resposta == false) //8
                jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
            resposta = true;
            //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++;
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
                
            }
            corretude = false;
            break;
        case 8:
            if(resposta == false)
                jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
            resposta = true;
            combo = 1;
            jLabel3.setText(mostrarMultiplicador());
            break;
        case 9:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
        case 10:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++;
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
                
            }
            corretude = false;
                break;
        }    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(i){
            case 1:
                if(resposta == false) //0
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
                corretude = true;
                pontuacao += 10;
                
                if(corretude == true){
                    pontuacao *= combo; 
                    combo++;
                    //jTextField1.setText(toString());
                    jLabel2.setText(toString());
                    jLabel3.setText(mostrarMultiplicador());
                    
                }
                corretude = false;
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;   
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 3:
                if(resposta == false) //8
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                 resposta = true;
                 combo = 1;
                 jLabel3.setText(mostrarMultiplicador());
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++;
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
               
            }
            corretude = false;
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 9:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++;
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
                
            }
            corretude = false;
                break;
            case 10:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switch(i){
            case 1:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 2:
                if(resposta == false){
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                    resposta = true;
                    //pontuação
                    corretude = true;
                    pontuacao += 10;

                    if(corretude == true){
                        pontuacao *= combo; 
                        combo++;
                        //jTextField1.setText(toString());
                        jLabel2.setText(toString());
                        jLabel3.setText(mostrarMultiplicador());

                    }
                    corretude = false;
                }
                break;
            case 3:
                if(resposta == false) //8
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;    
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++;
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
                
            }
            corretude = false;
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break; 
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                //pontuação
            corretude = true;
            pontuacao += 10;
                
            if(corretude == true){
                pontuacao *= combo; 
                combo++; 
                //jTextField1.setText(toString());
                jLabel2.setText(toString());
                jLabel3.setText(mostrarMultiplicador());
                
            }
            corretude = false;
                break;
            case 9:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
            case 10:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                combo = 1;
                jLabel3.setText(mostrarMultiplicador());
                break;
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaABrilho.png")));
     
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaA.png")));
        //jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraA.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaBBrilho.png")));
        //jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraBBrilho.png")));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaB.png")));
        //jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraB.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaCBrilho.png")));
        //jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraCBrilho.png")));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/AlternativaC.png")));
        //jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/LetraC.png")));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
        if(resposta == false){
            JOptionPane.showMessageDialog(null, "Selecione uma opção");
        }else{
            //ao clicar no botão continuar depois de escolher uma opção
            jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Invisivel.png")));
            i++;
            resposta = false;
            /*
                FAZER AS SEQUENCIAS DE RESPOSTAS:
                GESTO   ALTERNATIVAS
                0       2,0,7
                4       1,3,4
                8       8,2,6
                3       0,3,5
                9       1,7,9
                5       5,4,6
                7       7,2,8
                1       5,3,1
                2       4,2,7
                6       6,8,0
            
            ALTERNATIVA A = 4 CORRETAS, SÃO ELAS: TERCEIRA,SEXTA,SÉTIMA,DÉCIMA
            ALTERNATIVA B = 3 CORRETAS, SÃO ELAS: PRIMEIRA,QUARTA,NONA
            ALTERNATIVA C = 3 CORRETAS, SÃO ELAS: SEGUNDA,QUINTA,OITAVA
            */
            switch(i){
                case 2: 
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/um.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/tres.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/quatro.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoQuatro.png")));
                    break;
                case 3:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/oito.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/dois.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/seis.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoOito.png")));
                    break;
                case 4:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/zero.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/tres.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/cinco.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoTres.png")));
                    break;
                case 5:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/um.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/sete.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/nove.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoNove.png")));
                    break;
                case 6:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/cinco.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/quatro.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/seis.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoCinco.png")));
                    break;
                case 7:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/sete.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/dois.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/oito.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoSete.png")));
                    break;
                case 8:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/cinco.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/tres.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/um.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoUm.png")));
                    break;
                case 9:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/quatro.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/dois.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/sete.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoDois.png")));
                    break;
                case 10:
                    jButtonEditarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/seis.png")));
                    jButtonEditarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/oito.png")));
                    jButtonEditarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/zero.png")));
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Números/GestoSeis.png")));
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "LEVEL 1 FINALIZADO");
                    
                    break;
            }
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButtonContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonContinuarMouseEntered
        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/ContinuarBrilho.png")));
    }//GEN-LAST:event_jButtonContinuarMouseEntered

    private void jButtonContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonContinuarMouseExited
        jButtonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Continuar.png")));
    }//GEN-LAST:event_jButtonContinuarMouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/VoltarBrilho.png")));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png")));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        new TelaPrincipal().setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* 
        FontManager fontManager = new FontManager();
        Font ArcadeFonte = fontManager.carregarFonte("/Fonte/ARCADEPI.TTF", Font.PLAIN, 34);
        
        UIManager.put("Label.font", ArcadeFonte);
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FontManager fontManager = new FontManager();
                Font ArcadeFonte = fontManager.carregarFonte("/Fonte/ARCADEPI.TTF", Font.PLAIN, 34);
        
                UIManager.put("Label.font", ArcadeFonte);
                new PrimeiroNivel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonEditarA;
    private javax.swing.JButton jButtonEditarB;
    private javax.swing.JButton jButtonEditarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAcento;
    private javax.swing.JLabel jLabelFundoNível1;
    private javax.swing.JLabel jLabelGif;
    private javax.swing.JLabel jLabelLayoutNumero;
    private javax.swing.JLabel jLabelPontos;
    private javax.swing.JLabel jLabelResposta;
    // End of variables declaration//GEN-END:variables
}
