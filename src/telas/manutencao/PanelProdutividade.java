/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.manutencao;

import entities.LavouraPlanta;
import entities.Planta;
import entities.Produtividade;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author itzfeltrin
 */
public class PanelProdutividade extends javax.swing.JPanel {

    private javax.swing.JTabbedPane mainTabbedPane;
    
    public PanelProdutividade(javax.swing.JTabbedPane mainTabbedPane) {
        initComponents();
        this.mainTabbedPane = mainTabbedPane;
        setHoverEffects();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboboxTipo = new javax.swing.JComboBox<>();
        spinnerQtd = new javax.swing.JSpinner();
        spinnerAno = new javax.swing.JSpinner();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboboxCultivar = new javax.swing.JComboBox<>();
        btnGravar = new javax.swing.JLabel();
        btnOutro = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        btnProximo = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Safra");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Cultivar");

        comboboxTipo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxTipo.setBorder(null);
        comboboxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxTipoActionPerformed(evt);
            }
        });

        spinnerQtd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        spinnerQtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinnerQtd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        spinnerAno.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        spinnerAno.setModel(new javax.swing.SpinnerNumberModel(2019, 1900, 2019, 1));
        spinnerAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtData.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Quantidade em sacas");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Data de Plantio (dd/MM/yyyy)");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Produtividade");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Tipo");

        comboboxCultivar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboboxCultivar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCultivar.setBorder(null);
        comboboxCultivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCultivarActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnGravar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGravar.setText("Gravar");
        btnGravar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnGravar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGravarMouseClicked(evt);
            }
        });

        btnOutro.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnOutro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOutro.setText("Outro");
        btnOutro.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnOutro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOutro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOutroMouseClicked(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnProximo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnProximo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProximo.setText("Próximo");
        btnProximo.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        btnProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProximoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnProximo)
                                .addGap(20, 20, 20)
                                .addComponent(btnOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtData))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboboxCultivar, 0, 229, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spinnerQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                        .addComponent(spinnerAno)))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnProximo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spinnerQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(spinnerAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboboxCultivar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(comboboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboboxCultivar, comboboxTipo, jLabel10, jLabel11, jLabel7, jLabel8, jLabel9, spinnerAno, spinnerQtd, txtData});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnProximo});

    }// </editor-fold>//GEN-END:initComponents

    private void comboboxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxTipoActionPerformed
       
    }//GEN-LAST:event_comboboxTipoActionPerformed

    private void comboboxCultivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCultivarActionPerformed

    }//GEN-LAST:event_comboboxCultivarActionPerformed

    private void btnGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGravarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGravarMouseClicked

    private void btnOutroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOutroMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseClicked
        try {
            ManutencaoLavoura topFrame = (ManutencaoLavoura) SwingUtilities.getWindowAncestor(this);
            Planta planta = new Planta(comboboxTipo.getSelectedItem().toString(), comboboxCultivar.getSelectedItem().toString());            
            topFrame.planta = planta;
            Produtividade prod = new Produtividade((int) spinnerQtd.getValue(), (int) spinnerAno.getValue(), topFrame.lavoura, topFrame.planta);
            topFrame.produtividade = prod;
            LavouraPlanta lavouraPlanta = new LavouraPlanta(topFrame.lavoura, topFrame.planta, txtData.getText());
            topFrame.lavouraPlanta = lavouraPlanta;
            topFrame.tabbedPane.setSelectedIndex(2);            
        }
        catch (Exception ex){            
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnProximoMouseClicked

    public void setHoverEffects() {
        javax.swing.JLabel lista[] = {btnCancelar, btnProximo, btnOutro, btnGravar};
        for(javax.swing.JLabel obj : lista) {
            obj.setCursor(new Cursor(Cursor.HAND_CURSOR));
            obj.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    obj.setSize(obj.getWidth() + 3, obj.getHeight() + 3);
                    obj.setBackground(new Color(50, 50, 50));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGravar;
    private javax.swing.JLabel btnOutro;
    private javax.swing.JLabel btnProximo;
    private javax.swing.JComboBox<String> comboboxCultivar;
    private javax.swing.JComboBox<String> comboboxTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinnerAno;
    private javax.swing.JSpinner spinnerQtd;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
