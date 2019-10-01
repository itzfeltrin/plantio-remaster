/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.manutencao;

import DAO.AplicacaoDAO;
import DAO.AplicacaoDefensivoDAO;
import DAO.DefensivoDAO;
import entities.Aplicacao;
import entities.AplicacaoDefensivo;
import entities.Defensivo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import telas.listagem.ListagemLavouraDetalhada;

/**
 *
 * @author itzfeltrin
 */
public class PanelAplicacao extends javax.swing.JPanel {

    public javax.swing.JTabbedPane mainTabbedPane;
    public ArrayList<Defensivo> listaDef;
    public Defensivo defensivo;
    public Aplicacao aplicacao;
    public AplicacaoDefensivo aplicacaoDefensivo;
    public ListagemLavouraDetalhada lld;
        
    public PanelAplicacao(javax.swing.JTabbedPane mainTabbedPane) {
        initComponents();
        this.mainTabbedPane = mainTabbedPane;
        setHoverEffects();        
        attComboboxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinnerDose = new javax.swing.JSpinner();
        comboboxClasse = new javax.swing.JComboBox<>();
        comboboxNome = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JLabel();
        btnOutro = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Dose (mL)");

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplicação de defensivos");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Data (yyyy-MM-dd)");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Defensivo");

        spinnerDose.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        spinnerDose.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.1d, null, 0.1d));
        spinnerDose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboboxClasse.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboboxClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        comboboxClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxClasseActionPerformed(evt);
            }
        });

        comboboxNome.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        comboboxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxNomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Classe");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Nome");

        btnGravar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnGravar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGravar.setText("Gravar");
        btnGravar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGravar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGravar.setOpaque(true);
        btnGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGravarMouseClicked(evt);
            }
        });

        btnOutro.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnOutro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOutro.setText("Outra");
        btnOutro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOutro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOutro.setOpaque(true);
        btnOutro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOutroMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("Valor");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("Observação");

        txtObservacao.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtObservacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtValor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtData.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(129, 129, 129)
                                .addComponent(spinnerDose))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtObservacao))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtData)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(comboboxClasse, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboboxNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(220, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboboxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboboxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerDose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel8, txtObservacao});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboboxClasse, txtData});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGravarMouseClicked
        try {
            ManutencaoLavoura topFrame = (ManutencaoLavoura) SwingUtilities.getWindowAncestor(this);  
            Aplicacao auxAplicacao = new Aplicacao(txtData.getText(), txtObservacao.getText(), topFrame.lavoura);            
            Defensivo auxDefensivo = this.defensivo;
            if(auxDefensivo.codigo > 0) {
                AplicacaoDefensivo auxAplicacaoDefensivo = new AplicacaoDefensivo(auxAplicacao, auxDefensivo, Double.parseDouble(txtValor.getText()), (Double) spinnerDose.getValue());
                if(this.aplicacao == null) {
                    topFrame.listaAplicacao.add(auxAplicacao);
                    topFrame.listaAplicacaoDefensivo.add(auxAplicacaoDefensivo);
                    for(Aplicacao obj : topFrame.listaAplicacao) {
                        try {
                            AplicacaoDAO.insert(obj);
                            obj.codigo = AplicacaoDAO.getCodigo(obj);
                        } catch (ParseException ex) {
                            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
                        }
                    }
                    for(AplicacaoDefensivo obj : topFrame.listaAplicacaoDefensivo) {
                        AplicacaoDefensivoDAO.insert(obj);                    
                    }   
                }
                else {
                    auxAplicacao.codigo = this.aplicacao.codigo;
                    AplicacaoDAO.update(auxAplicacao);
                    AplicacaoDefensivoDAO.update(auxAplicacaoDefensivo);
                }
                PanelLavoura pl = (PanelLavoura) topFrame.tabbedPane.getComponentAt(0);
                if(pl.lld != null) {
                    pl.lld.atualizarTabelaAplicacao();                                    
                }
                JOptionPane.showMessageDialog(null, "Sucesso");
                topFrame.dispose();
            }
        }
        catch (Exception ex) {            
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGravarMouseClicked

    private void btnOutroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOutroMouseClicked
        if(btnOutro.isEnabled()) {
            try {
                ManutencaoLavoura topFrame = (ManutencaoLavoura) SwingUtilities.getWindowAncestor(this);  
                Aplicacao auxAplicacao = new Aplicacao(txtData.getText(), txtObservacao.getText(), topFrame.lavoura);
                Defensivo auxDefensivo = this.defensivo;
                if(auxDefensivo.codigo > 0) {
                    AplicacaoDefensivo auxAplicacaoDefensivo = new AplicacaoDefensivo(auxAplicacao, auxDefensivo, Double.parseDouble(txtValor.getText()), (Double) spinnerDose.getValue());
                    topFrame.listaAplicacao.add(auxAplicacao);
                    topFrame.listaAplicacaoDefensivo.add(auxAplicacaoDefensivo);
                }
                clearScreen();
            }
            catch (Exception ex) {            
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnOutroMouseClicked

    private void comboboxClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxClasseActionPerformed
        comboboxNome.removeAllItems();
        if(comboboxClasse.getSelectedIndex() > 0) {            
            ArrayList<Defensivo> resultNome = DefensivoDAO.getDefensivoByClasse(comboboxClasse.getSelectedItem().toString());
            this.listaDef = resultNome;
            resultNome.forEach((obj) -> {
                comboboxNome.addItem(obj.nome);
            });
            comboboxNome.setEnabled(true);
        }
        else {           
            comboboxNome.setEnabled(false);
        }
    }//GEN-LAST:event_comboboxClasseActionPerformed

    private void comboboxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxNomeActionPerformed
        if(comboboxNome.getSelectedItem() != null) {
            try {
                this.defensivo = new Defensivo(comboboxNome.getSelectedItem().toString(), comboboxClasse.getSelectedItem().toString());
                this.defensivo.codigo = this.listaDef.get(comboboxNome.getSelectedIndex()).codigo;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_comboboxNomeActionPerformed

    public void clearScreen() {
        txtData.setText(null);
        txtObservacao.setText(null);
        txtValor.setText(null);
        spinnerDose.setValue(1);
        comboboxClasse.setSelectedIndex(0);
        txtData.requestFocus();
    }
    
    public void attComboboxes() {               
        ArrayList<String> resultClasse = DefensivoDAO.getClasse();
        resultClasse.forEach((obj) -> {
            comboboxClasse.addItem(obj);
        });
        comboboxNome.setEnabled(false);
    }
    
    public void setHoverEffects() {
        javax.swing.JLabel lista[] = {btnCancelar, btnOutro, btnGravar};
        for(javax.swing.JLabel obj : lista) {
            obj.setCursor(new Cursor(Cursor.HAND_CURSOR));
            obj.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    obj.setSize(obj.getWidth() + 3, obj.getHeight() + 3);
                    obj.setForeground(Color.WHITE);
                    if(obj.equals(btnCancelar)) {
                        obj.setBackground(new Color(255, 0, 0));
                    }
                    else {
                        obj.setBackground(new Color(153, 153, 153));                        
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {                    
                    super.mouseExited(e); 
                    obj.setSize(obj.getWidth() - 3, obj.getHeight() - 3);
                    obj.setBackground(new Color(233, 230, 230));
                    obj.setForeground(Color.BLACK);
                }
            });
        }
    }
    
    
    public void setAplicacaoToEdit(ListagemLavouraDetalhada lld, Aplicacao aplicacao, AplicacaoDefensivo aplicacaoDefensivo, Defensivo defensivo) {
        this.lld = lld;
        this.aplicacao = aplicacao;
        this.aplicacaoDefensivo = aplicacaoDefensivo;
        this.defensivo = defensivo;
        txtData.setText(aplicacao.data);
        comboboxClasse.setSelectedItem(defensivo.classe);
        comboboxNome.setSelectedItem(defensivo.nome);
        txtValor.setText(aplicacaoDefensivo.valor.toString());
        txtObservacao.setText(aplicacao.observacao);
        spinnerDose.setValue(aplicacaoDefensivo.dose);
        btnOutro.setEnabled(false);
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGravar;
    private javax.swing.JLabel btnOutro;
    private javax.swing.JComboBox<String> comboboxClasse;
    private javax.swing.JComboBox<String> comboboxNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinnerDose;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
