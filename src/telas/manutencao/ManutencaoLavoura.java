/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.manutencao;

import entities.Aplicacao;
import entities.AplicacaoDefensivo;
import entities.Defensivo;
import entities.Lavoura;
import java.util.ArrayList;

/**
 *
 * @author itzfeltrin
 */
public class ManutencaoLavoura extends javax.swing.JFrame {
        
    public Lavoura lavoura;    
    public ArrayList<Aplicacao> listaAplicacao = new ArrayList<>();     
    public ArrayList<Defensivo> listaDefensivo = new ArrayList<>(); 
    public ArrayList<AplicacaoDefensivo> listaAplicacaoDefensivo = new ArrayList<>(); 
    
    public ManutencaoLavoura() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);         
        this.tabbedPane.setEnabledAt(1, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        setTitle("Info Lavoura");
        tabbedPane.add("Lavoura", new PanelLavoura(tabbedPane));
        //tabbedPane.add("Produtividade", new PanelProdutividade(tabbedPane));
        tabbedPane.add("Aplicação", new PanelAplicacao(tabbedPane));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setarIndex(int index) {
        tabbedPane.setSelectedIndex(index);
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
            java.util.logging.Logger.getLogger(ManutencaoLavoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoLavoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoLavoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoLavoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManutencaoLavoura().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
