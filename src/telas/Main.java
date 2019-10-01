/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entities.Usuario;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import telas.listagem.ListagemDefensivo;
import telas.listagem.ListagemLavoura;
import telas.listagem.ListagemPlanta;
import telas.manutencao.ManutencaoDefensivo;
import telas.manutencao.ManutencaoLavoura;
import telas.manutencao.ManutencaoPlanta;
import telas.manutencao.TelaEntrega;

/**
 *
 * @author Administrador
 */
public class Main extends javax.swing.JFrame {

    private Usuario usuarioAtual;
    
    public Main(Usuario user) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        this.usuarioAtual = user;
        //lblNome.setText(this.usuarioAtual.user);
        
        setHoverEffects();
    }

    private Main() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGerLavoura = new javax.swing.JLabel();
        btnVisLavoura = new javax.swing.JLabel();
        btnEntrega = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGerDefensivo = new javax.swing.JLabel();
        btnVisDefensivo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGerPlanta = new javax.swing.JLabel();
        btnVisPlanta = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plant.png"))); // NOI18N
        jLabel1.setText("  Sistema de Manejo de Lavouras");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Lavouras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Trebuchet MS", 0, 24))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(12, 130));

        btnGerLavoura.setBackground(new java.awt.Color(233, 230, 230));
        btnGerLavoura.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnGerLavoura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGerLavoura.setText("Adicionar");
        btnGerLavoura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGerLavoura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerLavoura.setOpaque(true);
        btnGerLavoura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerLavouraMouseClicked(evt);
            }
        });

        btnVisLavoura.setBackground(new java.awt.Color(233, 230, 230));
        btnVisLavoura.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnVisLavoura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisLavoura.setText("Visualizar");
        btnVisLavoura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisLavoura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisLavoura.setOpaque(true);
        btnVisLavoura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisLavouraMouseClicked(evt);
            }
        });

        btnEntrega.setBackground(new java.awt.Color(233, 230, 230));
        btnEntrega.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEntrega.setText("Cadastrar Entrega");
        btnEntrega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrega.setOpaque(true);
        btnEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntregaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnGerLavoura, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisLavoura)
                .addGap(18, 18, 18)
                .addComponent(btnEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEntrega, btnGerLavoura, btnVisLavoura});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVisLavoura)
                        .addComponent(btnGerLavoura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEntrega, btnGerLavoura, btnVisLavoura});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Defensivos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Trebuchet MS", 0, 24))); // NOI18N
        jPanel3.setOpaque(false);

        btnGerDefensivo.setBackground(new java.awt.Color(233, 230, 230));
        btnGerDefensivo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnGerDefensivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGerDefensivo.setText("Adicionar");
        btnGerDefensivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGerDefensivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerDefensivo.setOpaque(true);
        btnGerDefensivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerDefensivoMouseClicked(evt);
            }
        });

        btnVisDefensivo.setBackground(new java.awt.Color(233, 230, 230));
        btnVisDefensivo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnVisDefensivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisDefensivo.setText("Visualizar");
        btnVisDefensivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisDefensivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisDefensivo.setOpaque(true);
        btnVisDefensivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisDefensivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(btnGerDefensivo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVisDefensivo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnGerDefensivo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisDefensivo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Plantas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Trebuchet MS", 0, 24))); // NOI18N
        jPanel4.setOpaque(false);

        btnGerPlanta.setBackground(new java.awt.Color(233, 230, 230));
        btnGerPlanta.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnGerPlanta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGerPlanta.setText("Adicionar");
        btnGerPlanta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGerPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerPlanta.setOpaque(true);
        btnGerPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGerPlantaMouseClicked(evt);
            }
        });

        btnVisPlanta.setBackground(new java.awt.Color(233, 230, 230));
        btnVisPlanta.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnVisPlanta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisPlanta.setText("Visualizar");
        btnVisPlanta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisPlanta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisPlanta.setOpaque(true);
        btnVisPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisPlantaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(btnGerPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnVisPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisPlanta))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGerPlanta, btnVisPlanta});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel3, jPanel4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jMenuBar1.setBackground(new java.awt.Color(233, 230, 230));
        jMenuBar1.setBorder(null);
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setOpaque(false);

        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu1.setText("Conta");
        jMenu1.setMargin(new java.awt.Insets(2, 2, 2, 25));

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/004-enter.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu2.setText("Relatório");
        jMenu2.setMargin(new java.awt.Insets(2, 2, 2, 25));
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jMenu3.setText("Sobre");
        jMenu3.setMargin(new java.awt.Insets(2, 25, 2, 2));
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        UserLogin ul = new UserLogin();
        ul.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnGerLavouraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerLavouraMouseClicked
        ManutencaoLavoura ml = new ManutencaoLavoura();
        ml.setVisible(true);
    }//GEN-LAST:event_btnGerLavouraMouseClicked

    private void btnGerDefensivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerDefensivoMouseClicked
        ManutencaoDefensivo md = new ManutencaoDefensivo();
        md.setVisible(true);
    }//GEN-LAST:event_btnGerDefensivoMouseClicked

    private void btnGerPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerPlantaMouseClicked
        ManutencaoPlanta mp = new ManutencaoPlanta();
        mp.setVisible(true);
    }//GEN-LAST:event_btnGerPlantaMouseClicked

    private void btnVisLavouraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisLavouraMouseClicked
        ListagemLavoura ll = new ListagemLavoura();
        ll.setVisible(true);
    }//GEN-LAST:event_btnVisLavouraMouseClicked

    private void btnVisDefensivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisDefensivoMouseClicked
        ListagemDefensivo ld = new ListagemDefensivo();
        ld.setVisible(true);
    }//GEN-LAST:event_btnVisDefensivoMouseClicked

    private void btnVisPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisPlantaMouseClicked
        ListagemPlanta lp = new ListagemPlanta();
        lp.setVisible(true);
    }//GEN-LAST:event_btnVisPlantaMouseClicked

    private void btnEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntregaMouseClicked
        TelaEntrega te = new TelaEntrega();
        te.setVisible(true);
    }//GEN-LAST:event_btnEntregaMouseClicked
   
    public void setHoverEffects() {
        javax.swing.JLabel lista[] = {btnGerDefensivo, btnGerLavoura, btnGerPlanta, btnVisDefensivo, btnVisLavoura, btnVisPlanta, btnEntrega};
        for(javax.swing.JLabel obj : lista) {
            obj.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    obj.setSize(obj.getWidth() + 3, obj.getHeight() + 3);
                    obj.setBackground(new Color(153, 153, 153));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e); 
                    obj.setSize(obj.getWidth() - 3, obj.getHeight() - 3);
                    obj.setBackground(new Color(233, 230, 230));
                }
            });
        }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEntrega;
    private javax.swing.JLabel btnGerDefensivo;
    private javax.swing.JLabel btnGerLavoura;
    private javax.swing.JLabel btnGerPlanta;
    private javax.swing.JLabel btnVisDefensivo;
    private javax.swing.JLabel btnVisLavoura;
    private javax.swing.JLabel btnVisPlanta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
