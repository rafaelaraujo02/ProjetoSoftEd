/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosofted;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author HD
 */
public class TerceiroNivel extends javax.swing.JFrame {

    /**
     * Creates new form Fase2
     */
    
    boolean resposta = false;
    boolean corretude = false;
    int i=1;
    int pontos = 0;
   
    
    public TerceiroNivel() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public String mostrarPontos(){
        return String.format("" + pontos);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelGif = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelResposta = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jLabelPontos = new javax.swing.JLabel();
        jLabelNomePontos = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/Alfabeto.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 20, 390, 70);

        jButtonA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/A.png"))); // NOI18N
        jButtonA.setBorderPainted(false);
        jButtonA.setContentAreaFilled(false);
        jButtonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonAMouseExited(evt);
            }
        });
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonA);
        jButtonA.setBounds(420, 150, 60, 60);

        jButtonB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/B.png"))); // NOI18N
        jButtonB.setBorderPainted(false);
        jButtonB.setContentAreaFilled(false);
        jButtonB.setPreferredSize(new java.awt.Dimension(50, 20));
        jButtonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBMouseExited(evt);
            }
        });
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonB);
        jButtonB.setBounds(500, 150, 60, 60);

        jButtonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/C.PNG"))); // NOI18N
        jButtonC.setBorderPainted(false);
        jButtonC.setContentAreaFilled(false);
        jButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCMouseExited(evt);
            }
        });
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonC);
        jButtonC.setBounds(580, 150, 60, 60);

        jButtonD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/D.PNG"))); // NOI18N
        jButtonD.setBorderPainted(false);
        jButtonD.setContentAreaFilled(false);
        jButtonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDMouseExited(evt);
            }
        });
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonD);
        jButtonD.setBounds(660, 150, 60, 60);

        jButtonE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/E.PNG"))); // NOI18N
        jButtonE.setBorderPainted(false);
        jButtonE.setContentAreaFilled(false);
        jButtonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonEMouseExited(evt);
            }
        });
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonE);
        jButtonE.setBounds(740, 150, 60, 60);

        jButtonF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/F.PNG"))); // NOI18N
        jButtonF.setBorderPainted(false);
        jButtonF.setContentAreaFilled(false);
        jButtonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonFMouseExited(evt);
            }
        });
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonF);
        jButtonF.setBounds(820, 150, 60, 60);

        jButtonG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/G.png"))); // NOI18N
        jButtonG.setBorderPainted(false);
        jButtonG.setContentAreaFilled(false);
        jButtonG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonGMouseExited(evt);
            }
        });
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonG);
        jButtonG.setBounds(890, 150, 60, 60);

        jButtonH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/H.png"))); // NOI18N
        jButtonH.setBorderPainted(false);
        jButtonH.setContentAreaFilled(false);
        jButtonH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonHMouseExited(evt);
            }
        });
        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonH);
        jButtonH.setBounds(420, 220, 60, 60);

        jButtonI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/I.png"))); // NOI18N
        jButtonI.setBorderPainted(false);
        jButtonI.setContentAreaFilled(false);
        jButtonI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIMouseExited(evt);
            }
        });
        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonI);
        jButtonI.setBounds(500, 220, 60, 60);

        jButtonJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/J.png"))); // NOI18N
        jButtonJ.setBorderPainted(false);
        jButtonJ.setContentAreaFilled(false);
        jButtonJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonJMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonJMouseExited(evt);
            }
        });
        jButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJ);
        jButtonJ.setBounds(580, 220, 60, 60);

        jButtonK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/K.png"))); // NOI18N
        jButtonK.setBorderPainted(false);
        jButtonK.setContentAreaFilled(false);
        jButtonK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonKMouseExited(evt);
            }
        });
        jButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonK);
        jButtonK.setBounds(660, 220, 60, 60);

        jButtonL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/L.png"))); // NOI18N
        jButtonL.setBorderPainted(false);
        jButtonL.setContentAreaFilled(false);
        jButtonL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLMouseExited(evt);
            }
        });
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonL);
        jButtonL.setBounds(740, 220, 60, 60);

        jButtonM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/M.png"))); // NOI18N
        jButtonM.setContentAreaFilled(false);
        jButtonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMMouseExited(evt);
            }
        });
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonM);
        jButtonM.setBounds(820, 220, 60, 60);

        jButtonN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/N.png"))); // NOI18N
        jButtonN.setContentAreaFilled(false);
        jButtonN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNMouseExited(evt);
            }
        });
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonN);
        jButtonN.setBounds(900, 220, 60, 60);

        jButtonO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/O.PNG"))); // NOI18N
        jButtonO.setContentAreaFilled(false);
        jButtonO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOMouseExited(evt);
            }
        });
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonO);
        jButtonO.setBounds(420, 290, 60, 60);

        jButtonP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/P.png"))); // NOI18N
        jButtonP.setContentAreaFilled(false);
        jButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonPMouseExited(evt);
            }
        });
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonP);
        jButtonP.setBounds(500, 290, 60, 60);

        jButtonQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/Q.png"))); // NOI18N
        jButtonQ.setContentAreaFilled(false);
        jButtonQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonQMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonQMouseExited(evt);
            }
        });
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQ);
        jButtonQ.setBounds(580, 290, 60, 60);

        jButtonR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/R.png"))); // NOI18N
        jButtonR.setContentAreaFilled(false);
        jButtonR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRMouseExited(evt);
            }
        });
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonR);
        jButtonR.setBounds(660, 290, 60, 60);

        jButtonS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/S.png"))); // NOI18N
        jButtonS.setContentAreaFilled(false);
        jButtonS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSMouseExited(evt);
            }
        });
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonS);
        jButtonS.setBounds(740, 290, 60, 60);

        jButtonT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/T.png"))); // NOI18N
        jButtonT.setContentAreaFilled(false);
        jButtonT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTMouseExited(evt);
            }
        });
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonT);
        jButtonT.setBounds(820, 290, 60, 60);

        jButtonU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/U.png"))); // NOI18N
        jButtonU.setContentAreaFilled(false);
        jButtonU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonUMouseExited(evt);
            }
        });
        jButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonU);
        jButtonU.setBounds(900, 290, 60, 60);

        jButtonV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/V.png"))); // NOI18N
        jButtonV.setContentAreaFilled(false);
        jButtonV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonVMouseExited(evt);
            }
        });
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonV);
        jButtonV.setBounds(420, 360, 60, 60);

        jButtonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/X.png"))); // NOI18N
        jButtonX.setContentAreaFilled(false);
        jButtonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonXMouseExited(evt);
            }
        });
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonX);
        jButtonX.setBounds(580, 360, 60, 60);

        jButtonY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/Y.png"))); // NOI18N
        jButtonY.setContentAreaFilled(false);
        jButtonY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonYMouseExited(evt);
            }
        });
        jButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonY);
        jButtonY.setBounds(660, 360, 60, 60);

        jButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/W.png"))); // NOI18N
        jButtonW.setContentAreaFilled(false);
        jButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonWMouseExited(evt);
            }
        });
        jButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonW);
        jButtonW.setBounds(500, 360, 60, 60);

        jButtonZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/Z.png"))); // NOI18N
        jButtonZ.setContentAreaFilled(false);
        jButtonZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonZMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonZMouseExited(evt);
            }
        });
        jButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonZ);
        jButtonZ.setBounds(740, 360, 60, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Continuar.png"))); // NOI18N
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
        jButton1.setBounds(380, 650, 210, 50);

        jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_A.png"))); // NOI18N
        getContentPane().add(jLabelGif);
        jLabelGif.setBounds(190, 210, 140, 140);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/NomeGesto.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 280, 110, 40);

        jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Invisivel.png"))); // NOI18N
        getContentPane().add(jLabelResposta);
        jLabelResposta.setBounds(380, 560, 190, 50);

        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png"))); // NOI18N
        jButtonInicio.setBorderPainted(false);
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
        jButtonInicio.setBounds(10, 650, 140, 50);

        jLabelPontos.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabelPontos.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPontos.setText("0");
        getContentPane().add(jLabelPontos);
        jLabelPontos.setBounds(110, 120, 170, 40);

        jLabelNomePontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Pontos-.png"))); // NOI18N
        getContentPane().add(jLabelNomePontos);
        jLabelNomePontos.setBounds(10, 130, 100, 30);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Sair.png"))); // NOI18N
        jButtonSair.setBorderPainted(false);
        jButtonSair.setContentAreaFilled(false);
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSairMouseExited(evt);
            }
        });
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(850, 660, 110, 40);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/newBackground.png"))); // NOI18N
        jLabelFundo.setMaximumSize(new java.awt.Dimension(1000, 800));
        jLabelFundo.setMinimumSize(new java.awt.Dimension(1000, 800));
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
        
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                pontos += 10;
                //anotação
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
                //anotação
                
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAMouseEntered
        jButtonA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/ABRILHO.png")));
    }//GEN-LAST:event_jButtonAMouseEntered

    private void jButtonAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAMouseExited
        jButtonA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/A.png")));
    }//GEN-LAST:event_jButtonAMouseExited

    private void jButtonBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBMouseEntered
        jButtonB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/BBRILHO.png")));
    }//GEN-LAST:event_jButtonBMouseEntered

    private void jButtonBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBMouseExited
        jButtonB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/B.png")));
    }//GEN-LAST:event_jButtonBMouseExited

    private void jButtonCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCMouseEntered
        jButtonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/CBRILHO.png")));
    }//GEN-LAST:event_jButtonCMouseEntered

    private void jButtonCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCMouseExited
        jButtonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/C.png")));
    }//GEN-LAST:event_jButtonCMouseExited

    private void jButtonDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDMouseEntered
        jButtonD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/DBRILHO.png")));
    }//GEN-LAST:event_jButtonDMouseEntered

    private void jButtonDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDMouseExited
        jButtonD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/D.png")));
    }//GEN-LAST:event_jButtonDMouseExited

    private void jButtonEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEMouseEntered
        jButtonE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/EBRILHO.png")));
    }//GEN-LAST:event_jButtonEMouseEntered

    private void jButtonEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEMouseExited
        jButtonE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/E.png")));
    }//GEN-LAST:event_jButtonEMouseExited

    private void jButtonFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFMouseEntered
        jButtonF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/FBRILHO.png")));
    }//GEN-LAST:event_jButtonFMouseEntered

    private void jButtonFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFMouseExited
        jButtonF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/F.png")));
    }//GEN-LAST:event_jButtonFMouseExited

    private void jButtonGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGMouseEntered
        jButtonG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/GBRILHO.png")));
    }//GEN-LAST:event_jButtonGMouseEntered

    private void jButtonGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGMouseExited
        jButtonG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/G.png")));
    }//GEN-LAST:event_jButtonGMouseExited

    private void jButtonHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHMouseEntered
        jButtonH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/HBRILHO.png")));
    }//GEN-LAST:event_jButtonHMouseEntered

    private void jButtonHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHMouseExited
        jButtonH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/H.png")));
    }//GEN-LAST:event_jButtonHMouseExited

    private void jButtonIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIMouseEntered
        jButtonI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/IBRILHO.png")));
    }//GEN-LAST:event_jButtonIMouseEntered

    private void jButtonIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIMouseExited
        jButtonI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/I.png")));
    }//GEN-LAST:event_jButtonIMouseExited

    private void jButtonJMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonJMouseEntered
        jButtonJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/JBRILHO.png")));
    }//GEN-LAST:event_jButtonJMouseEntered

    private void jButtonJMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonJMouseExited
        jButtonJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/J.png")));
    }//GEN-LAST:event_jButtonJMouseExited

    private void jButtonKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKMouseEntered
        jButtonK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/KBRILHO.png")));
    }//GEN-LAST:event_jButtonKMouseEntered

    private void jButtonKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKMouseExited
        jButtonK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/K.png")));
    }//GEN-LAST:event_jButtonKMouseExited

    private void jButtonLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLMouseEntered
        jButtonL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/LBRILHO.png")));
    }//GEN-LAST:event_jButtonLMouseEntered

    private void jButtonLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLMouseExited
        jButtonL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/L.png")));
    }//GEN-LAST:event_jButtonLMouseExited

    private void jButtonMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMMouseEntered
        jButtonM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/MBRILHO.png")));
    }//GEN-LAST:event_jButtonMMouseEntered

    private void jButtonMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMMouseExited
        jButtonM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/M.png")));
    }//GEN-LAST:event_jButtonMMouseExited

    private void jButtonNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNMouseEntered
        jButtonN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/NBRILHO.png")));
    }//GEN-LAST:event_jButtonNMouseEntered

    private void jButtonNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNMouseExited
        jButtonN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/N.png")));
    }//GEN-LAST:event_jButtonNMouseExited

    private void jButtonOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOMouseEntered
        jButtonO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/OBRILHO.png")));
    }//GEN-LAST:event_jButtonOMouseEntered

    private void jButtonOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOMouseExited
        jButtonO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/O.png")));
    }//GEN-LAST:event_jButtonOMouseExited

    private void jButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPMouseEntered
        jButtonP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/PBRILHO.png")));
    }//GEN-LAST:event_jButtonPMouseEntered

    private void jButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPMouseExited
        jButtonP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/P.png")));
    }//GEN-LAST:event_jButtonPMouseExited

    private void jButtonQMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQMouseEntered
        jButtonQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/QBRILHO.png")));
    }//GEN-LAST:event_jButtonQMouseEntered

    private void jButtonQMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQMouseExited
        jButtonQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/Q.png")));
    }//GEN-LAST:event_jButtonQMouseExited

    private void jButtonRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRMouseEntered
        jButtonR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/RBRILHO.png")));
    }//GEN-LAST:event_jButtonRMouseEntered

    private void jButtonRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRMouseExited
        jButtonR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/R.png")));
    }//GEN-LAST:event_jButtonRMouseExited

    private void jButtonSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSMouseEntered
        jButtonS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/SBRILHO.png")));
    }//GEN-LAST:event_jButtonSMouseEntered

    private void jButtonSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSMouseExited
        jButtonS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/S.png")));
    }//GEN-LAST:event_jButtonSMouseExited

    private void jButtonTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTMouseEntered
        jButtonT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/TBRILHO.png")));
    }//GEN-LAST:event_jButtonTMouseEntered

    private void jButtonTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTMouseExited
        jButtonT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/T.png")));
    }//GEN-LAST:event_jButtonTMouseExited

    private void jButtonUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUMouseEntered
        jButtonU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/UBRILHO.png")));
    }//GEN-LAST:event_jButtonUMouseEntered

    private void jButtonUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUMouseExited
        jButtonU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/U.png")));
    }//GEN-LAST:event_jButtonUMouseExited

    private void jButtonVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVMouseEntered
        jButtonV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/VBRILHO.png")));
    }//GEN-LAST:event_jButtonVMouseEntered

    private void jButtonVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVMouseExited
        jButtonV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/V.png")));
    }//GEN-LAST:event_jButtonVMouseExited

    private void jButtonXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonXMouseEntered
        jButtonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/XBRILHO.png")));
    }//GEN-LAST:event_jButtonXMouseEntered

    private void jButtonXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonXMouseExited
        jButtonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/X.png")));
    }//GEN-LAST:event_jButtonXMouseExited

    private void jButtonYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonYMouseEntered
        jButtonY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/YBRILHO.png")));
    }//GEN-LAST:event_jButtonYMouseEntered

    private void jButtonYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonYMouseExited
        jButtonY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/Y.png")));
    }//GEN-LAST:event_jButtonYMouseExited

    private void jButtonWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWMouseEntered
        jButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/WBRILHO.png")));
    }//GEN-LAST:event_jButtonWMouseEntered

    private void jButtonWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWMouseExited
        jButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/W.png")));
    }//GEN-LAST:event_jButtonWMouseExited

    private void jButtonZMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZMouseEntered
        jButtonZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/ZBRILHO.png")));
    }//GEN-LAST:event_jButtonZMouseEntered

    private void jButtonZMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZMouseExited
        jButtonZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Alfabeto/Z.png")));
    }//GEN-LAST:event_jButtonZMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/ContinuarBrilho.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButtonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicioMouseEntered
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/VoltarBrilho.png")));
    }//GEN-LAST:event_jButtonInicioMouseEntered

    private void jButtonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicioMouseExited
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Voltar.png")));
    }//GEN-LAST:event_jButtonInicioMouseExited

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        dispose();
        new TutorialFase3().setVisible(true);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(resposta == false){
            JOptionPane.showMessageDialog(null, "Selecione uma opção");
        }else{
            //ao clicar no botão continuar depois de escolher uma opção
            jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Invisivel.png")));
            i++;
            resposta = false;
            
            switch(i){
               
                case 2:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_D.png")));
                    break;
                case 3:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_M.png")));
                    break;
                case 4:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_J.gif")));
                    break;
                case 5:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_K.gif")));
                    break;
                case 6:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_O.png")));
                    break;
                case 7:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_B.png")));
                    break;
                case 8:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_C.png")));
                    break;
                case 9:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_Z.gif")));
                    break;
                case 10:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_U.png")));
                    break;
                case 11:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_Y.png")));
                    break;
                case 12:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_G.png")));
                    break;
                case 13:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_E.png")));
                    break;
                case 14:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_H.gif")));
                    break;
                case 15:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_S.png")));
                    break;
                case 16:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_T.png")));
                    break;
                case 17:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_N.png")));
                    break;
                case 18:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_W.png")));
                    break;
                case 19:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_Z.gif")));
                    break;
                case 20:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_F.png")));
                    break;
                case 21:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_I.png")));
                    break;
                case 22:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_L.png")));
                    break;
                case 23:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_V.png")));
                    break;
                case 24:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_Q.png")));
                    break;
                case 25:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_P.png")));
                    break;
                case 26:
                    jLabelGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GifLetrasAlfabeto/LETRA_R.png")));
                    break;
                case 27:
                    JOptionPane.showMessageDialog(null, "LEVEL 3 FINALIZADO");
                    
                    break;
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed

        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed

        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
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
                pontos += 10;
                jLabelPontos.setText(mostrarPontos());
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Continuar.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonIActionPerformed

    private void jButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonJActionPerformed

    private void jButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonKActionPerformed

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonLActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Correto.png")));
                resposta = true;
                pontos += 10;
                jLabelPontos.setText(mostrarPontos());
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonMActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonQActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonTActionPerformed

    private void jButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonUActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonWActionPerformed

    private void jButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonYActionPerformed

    private void jButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZActionPerformed
        switch(i){
            case 1:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 2:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 3:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 4:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 5:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 6:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação 
                break;
            case 7:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 8:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 9:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 10:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 11:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 12:              
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 13:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 14:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 15:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 16:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 17:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 18:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 19:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 20:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 21:
               if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 22:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 23:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 24:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 25:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
            case 26:
                if(resposta == false)
                    jLabelResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Errado.png")));
                resposta = true;
                //pontuação
                //anotação
                
                break;
        }
    }//GEN-LAST:event_jButtonZActionPerformed

    private void jButtonSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseEntered
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/SairBrilho.png")));
    }//GEN-LAST:event_jButtonSairMouseEntered

    private void jButtonSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseExited
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetosofted/imagens/Sair.png")));
    }//GEN-LAST:event_jButtonSairMouseExited

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
        new Niveis().setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(TerceiroNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerceiroNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerceiroNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerceiroNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FontManager fontManager = new FontManager();
                Font ArcadeFonte = fontManager.carregarFonte("/Fonte/ARCADEPI.TTF", Font.PLAIN, 34);
        
                UIManager.put("Label.font", ArcadeFonte);
                new TerceiroNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelGif;
    private javax.swing.JLabel jLabelNomePontos;
    private javax.swing.JLabel jLabelPontos;
    private javax.swing.JLabel jLabelResposta;
    // End of variables declaration//GEN-END:variables
}
