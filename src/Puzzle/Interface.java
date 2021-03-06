/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puzzle;

import java.awt.CardLayout;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Megatron
 */

public class Interface extends javax.swing.JFrame {

    private final QuebraCabeca QC = new QuebraCabeca();
    
        
    private final Icon[] icon = new Icon[9];
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        
        /*icon[0] = new ImageIcon(getClass().getResource("d1.png"));
        icon[1] = new ImageIcon(getClass().getResource("d2.png"));
        icon[2] = new ImageIcon(getClass().getResource("d3.png"));
        icon[3] = new ImageIcon(getClass().getResource("d4.png"));
        icon[4] = new ImageIcon(getClass().getResource("d5.png"));
        icon[5] = new ImageIcon(getClass().getResource("d6.png"));
        icon[6] = new ImageIcon(getClass().getResource("d7.png"));
        icon[7] = new ImageIcon(getClass().getResource("d8.png"));
        icon[8] = new ImageIcon(getClass().getResource(""));*/
        
        sliderRandVel.setValue(100);
        sliderSolveVel.setValue(100);
        movLabel.setText("Movimentos: "+QC.getMovs());
        
        CardLayout cl = (CardLayout)jPanel12.getLayout();
        cl.show(jPanel12, "card1");
        
        
        
    }
    
    public void setImg()
    {
        jLabel1.setIcon(icon[QC.getMatriz()[0]]);
        jLabel2.setIcon(icon[QC.getMatriz()[1]]);
        jLabel3.setIcon(icon[QC.getMatriz()[2]]);
        jLabel4.setIcon(icon[QC.getMatriz()[3]]);
        jLabel5.setIcon(icon[QC.getMatriz()[4]]);
        jLabel6.setIcon(icon[QC.getMatriz()[5]]);
        jLabel7.setIcon(icon[QC.getMatriz()[6]]);
        jLabel8.setIcon(icon[QC.getMatriz()[7]]);
        jLabel9.setIcon(icon[QC.getMatriz()[8]]);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelCarregando = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        sliderRandVel = new javax.swing.JSlider();
        BotãoAleatoriza = new javax.swing.JButton();
        BotãoPrinta = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sliderSolveVel = new javax.swing.JSlider();
        movLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quebra Cabeça de 8 Peças");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel12.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel12.setLayout(new java.awt.CardLayout());

        jPanel11.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel11.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel11.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel13.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel13.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel13.setLayout(new java.awt.GridLayout(2, 2, 0, 2));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/dd.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        jPanel13.add(jLabel13);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/aa.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel14);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/bb.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel15);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/cc.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel16);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Escolha uma imagem para jogar:");
        jLabel17.setPreferredSize(new java.awt.Dimension(155, 30));
        jPanel11.add(jLabel17, java.awt.BorderLayout.PAGE_START);

        jPanel12.add(jPanel11, "card3");

        jPanel10.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel10.setName(""); // NOI18N
        jPanel10.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 130));
        jPanel7.setLayout(new java.awt.GridLayout(3, 0));

        jLabel12.setText("Escolha o tipo da heurística:");
        jPanel7.add(jLabel12);

        jButton1.setText("Hamming");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        jButton2.setText("Manhattan");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel7.add(jButton2);

        jPanel1.add(jPanel7, new java.awt.GridBagConstraints());

        jPanel10.add(jPanel1);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton3.setText("Alterar imagem");
        jButton3.setAlignmentY(0.0F);
        jButton3.setMaximumSize(new java.awt.Dimension(600, 20));
        jButton3.setPreferredSize(new java.awt.Dimension(10, 20));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel9.add(jButton3, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d3.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d4.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d5.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d6.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d7.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puzzle/d8.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);

        jLabel9.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel9.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 200));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);

        jPanel9.add(jPanel2, java.awt.BorderLayout.CENTER);

        labelCarregando.setMaximumSize(new java.awt.Dimension(200, 40));
        labelCarregando.setMinimumSize(new java.awt.Dimension(200, 0));
        labelCarregando.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel9.add(labelCarregando, java.awt.BorderLayout.PAGE_END);

        jPanel8.add(jPanel9, new java.awt.GridBagConstraints());

        jPanel10.add(jPanel8);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(160, 220));
        jPanel4.setPreferredSize(new java.awt.Dimension(160, 220));
        jPanel4.setLayout(new java.awt.GridLayout(5, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel10.setText("Velocidade:");
        jPanel5.add(jLabel10, java.awt.BorderLayout.CENTER);

        sliderRandVel.setBackground(new java.awt.Color(255, 255, 255));
        sliderRandVel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(sliderRandVel, java.awt.BorderLayout.PAGE_END);

        jPanel4.add(jPanel5);

        BotãoAleatoriza.setText("Randomizar");
        BotãoAleatoriza.setMinimumSize(new java.awt.Dimension(150, 75));
        BotãoAleatoriza.setPreferredSize(new java.awt.Dimension(150, 75));
        BotãoAleatoriza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoAleatorizaMouseClicked(evt);
            }
        });
        BotãoAleatoriza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoAleatorizaActionPerformed(evt);
            }
        });
        jPanel4.add(BotãoAleatoriza);

        BotãoPrinta.setText("Resolver");
        BotãoPrinta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotãoPrintaMouseClicked(evt);
            }
        });
        BotãoPrinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoPrintaActionPerformed(evt);
            }
        });
        jPanel4.add(BotãoPrinta);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel11.setText("Velocidade:");
        jPanel6.add(jLabel11, java.awt.BorderLayout.CENTER);

        sliderSolveVel.setBackground(new java.awt.Color(255, 255, 255));
        sliderSolveVel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(sliderSolveVel, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel6);

        movLabel.setText("Movimentos: 0");
        jPanel4.add(movLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jPanel4, gridBagConstraints);

        jPanel10.add(jPanel3);

        jPanel12.add(jPanel10, "card2");

        getContentPane().add(jPanel12, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if(QC.MoveCasa(7))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(QC.MoveCasa(8))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
        
        
       
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(QC.MoveCasa(6))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(QC.MoveCasa(5))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(QC.MoveCasa(4))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(QC.MoveCasa(3))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(QC.MoveCasa(2))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if(QC.MoveCasa(1))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(QC.MoveCasa(0))
        {
            setImg();
            movLabel.setText("Movimentos: "+QC.getMovs());
            if(QC.VerificaVitoria())
            {
                JOptionPane.showMessageDialog(rootPane, "Parabéns! \nVoce completou o quebra cabeça.", null, WIDTH);
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BotãoPrintaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoPrintaMouseClicked
        if(!QC.VerificaVitoria()){
            AnimSolve anim = new AnimSolve();
            anim.start();
        }
    }//GEN-LAST:event_BotãoPrintaMouseClicked

    private void BotãoAleatorizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoAleatorizaActionPerformed

    }//GEN-LAST:event_BotãoAleatorizaActionPerformed

    private void BotãoAleatorizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotãoAleatorizaMouseClicked
        try{

            Animation anim = new Animation();
            anim.start();

        }catch(IllegalThreadStateException e)
        {

        }

    }//GEN-LAST:event_BotãoAleatorizaMouseClicked

    private void BotãoPrintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoPrintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotãoPrintaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        QC.heuristica=1;
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        QC.heuristica=0;
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        CardLayout cl = (CardLayout)jPanel12.getLayout();
        cl.show(jPanel12, "card2");
        setSize(1280, 720);
        icon[0] = new ImageIcon(getClass().getResource("d1.png"));
        icon[1] = new ImageIcon(getClass().getResource("d2.png"));
        icon[2] = new ImageIcon(getClass().getResource("d3.png"));
        icon[3] = new ImageIcon(getClass().getResource("d4.png"));
        icon[4] = new ImageIcon(getClass().getResource("d5.png"));
        icon[5] = new ImageIcon(getClass().getResource("d6.png"));
        icon[6] = new ImageIcon(getClass().getResource("d7.png"));
        icon[7] = new ImageIcon(getClass().getResource("d8.png"));
        icon[8] = new ImageIcon(getClass().getResource(""));
        setImg();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        CardLayout cl = (CardLayout)jPanel12.getLayout();
        cl.show(jPanel12, "card2");
        setSize(1280, 720);
        icon[0] = new ImageIcon(getClass().getResource("a1.png"));
        icon[1] = new ImageIcon(getClass().getResource("a2.png"));
        icon[2] = new ImageIcon(getClass().getResource("a3.png"));
        icon[3] = new ImageIcon(getClass().getResource("a4.png"));
        icon[4] = new ImageIcon(getClass().getResource("a5.png"));
        icon[5] = new ImageIcon(getClass().getResource("a6.png"));
        icon[6] = new ImageIcon(getClass().getResource("a7.png"));
        icon[7] = new ImageIcon(getClass().getResource("a8.png"));
        icon[8] = new ImageIcon(getClass().getResource(""));
        setImg();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        CardLayout cl = (CardLayout)jPanel12.getLayout();
        cl.show(jPanel12, "card2");
        setSize(1280, 720);
        icon[0] = new ImageIcon(getClass().getResource("b1.png"));
        icon[1] = new ImageIcon(getClass().getResource("b2.png"));
        icon[2] = new ImageIcon(getClass().getResource("b3.png"));
        icon[3] = new ImageIcon(getClass().getResource("b4.png"));
        icon[4] = new ImageIcon(getClass().getResource("b5.png"));
        icon[5] = new ImageIcon(getClass().getResource("b6.png"));
        icon[6] = new ImageIcon(getClass().getResource("b7.png"));
        icon[7] = new ImageIcon(getClass().getResource("b8.png"));
        icon[8] = new ImageIcon(getClass().getResource(""));
        setImg();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        CardLayout cl = (CardLayout)jPanel12.getLayout();
        cl.show(jPanel12, "card2");
        setSize(1280, 720);
        icon[0] = new ImageIcon(getClass().getResource("c1.png"));
        icon[1] = new ImageIcon(getClass().getResource("c2.png"));
        icon[2] = new ImageIcon(getClass().getResource("c3.png"));
        icon[3] = new ImageIcon(getClass().getResource("c4.png"));
        icon[4] = new ImageIcon(getClass().getResource("c5.png"));
        icon[5] = new ImageIcon(getClass().getResource("c6.png"));
        icon[6] = new ImageIcon(getClass().getResource("c7.png"));
        icon[7] = new ImageIcon(getClass().getResource("c8.png"));
        icon[8] = new ImageIcon(getClass().getResource(""));
        setImg();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        CardLayout cl = (CardLayout)jPanel12.getLayout();
        cl.show(jPanel12, "card3");
        setSize(600, 600);
    }//GEN-LAST:event_jButton3MouseClicked
    
    //Animation: classe que randomiza o tabuleiro e faz a movimentação na interface.
    class Animation extends Thread
    {
        public void run()
        {
            QC.ResetaMatriz();
            movLabel.setText("Movimentos: "+QC.getMovs()); //contador de movimentos realizados.
            while(QC.VerificaVitoria())//condição que garante que o estado inicial não seja o estado final.
            {
                for(int i = 0;i<250;i++)//cada movimento aleatorio é executado dentro do for (250 movimentos aleatorios nesse caso).
                {
                    try {
                        
                        sleep(100-sliderRandVel.getValue());//espera por um tempo para mover cada peça para que o jogador possa vizualizar os movimentos feitos.
                                } catch (InterruptedException ex) {
                        Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    QC.Aleatoriza();//faz um movimento aleatorio
                    setImg();//organiza as imagens na interface de acordo com a matriz do tabuleiro.
                }
            }
            int [] temp;
            temp = Arrays.copyOf(QC.getMatriz(), 9);  
            QC.setNodes(new ListaDePrioridade(temp,QC.heuristica)); //seta a lista de prioridades com o estado inicial.
            
        }
    };
    
    class AnimSolve extends Thread
    {
      public void run()
      {
          No path[];
          labelCarregando.setText("Calculando caminho...");
          path = QC.makePath(QC.astar()); //adquire o vetor com o caminho para a solução.
          labelCarregando.setText("");
          int i = 0;
          while(!QC.VerificaVitoria())//percorre o vetor e muda o estado da matriz até achar a solução.
          {
              QC.setMatriz(path[i].getState());//define a matriz do tabuleiro com o estado do passo atual do caminho.
              i++;
              QC.setMovs(i);//aumenta o numero de movimentos.
              movLabel.setText("Movimentos: "+QC.getMovs());
              setImg();//define a imagem na interface de acordo com a matriz.
              try {
                  sleep(5*(100-sliderSolveVel.getValue()));//espera por um tempo para mover cada peça para que o jogador possa vizualizar os movimentos feitos.
              } catch (InterruptedException ex) {
                  Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
          
      }
    };
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoAleatoriza;
    private javax.swing.JButton BotãoPrinta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCarregando;
    private javax.swing.JLabel movLabel;
    private javax.swing.JSlider sliderRandVel;
    private javax.swing.JSlider sliderSolveVel;
    // End of variables declaration//GEN-END:variables
}
