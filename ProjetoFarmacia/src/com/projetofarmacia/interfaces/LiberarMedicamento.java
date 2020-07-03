/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetofarmacia.interfaces;

import com.projetofarmacia.DAO.FuncionarioDAO;
import com.projetofarmacia.DAO.ProdutoDAO;
import com.projetofarmacia.DAO.ReceitaDAO;
import com.projetofarmacia.dialogs.camposVazios;
import com.projetofarmacia.dialogs.falhaReceita;
import com.projetofarmacia.dialogs.receitaSalva;
import com.projetofarmacia.javabeans.Farmacia;
import com.projetofarmacia.javabeans.Funcionario;
import com.projetofarmacia.javabeans.Produto;
import com.projetofarmacia.javabeans.Receita;
import com.projetofarmacia.javabeans.TipoProduto;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Calendoscopio
 */
public class LiberarMedicamento extends javax.swing.JInternalFrame {
    private Funcionario f = new Funcionario();
    private Farmacia far = new Farmacia();
    /**
     * Creates new form liberarMedicamento
     */
    public LiberarMedicamento() {
        initComponents();
    }

    private void Cadastrar() {
        try {
            Receita obj = new Receita();
            ReceitaDAO dao = new ReceitaDAO();
            f.setIdFuncionario(TelaLogin.idFunc);
            far.setIdFarmacia(TelaLogin.idFar);
            obj.setNomeProfissional(campoNomeProf.getText());
            obj.setNomePaciente(campoNomePac.getText());
            obj.setEnderecoProfissional(campoEnderecoProf.getText());
            obj.setEnderecoPaciente(campoEnderecoPaciente.getText());
            obj.setCrm(campoCRM.getText());
            obj.setCpf(campoCPF.getText());
            obj.setFarmacia(far);
            obj.setFuncionario(f);

            dao.cadastrarReceita(obj);
            
        } catch (Exception e) {
            new falhaReceita(null, true).setVisible(true);
            throw new RuntimeException(e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel01 = new javax.swing.JPanel();
        campoNomeProf = new javax.swing.JTextField();
        campoCRM = new javax.swing.JTextField();
        campoEnderecoProf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNomePac = new javax.swing.JTextField();
        campoCPF = new javax.swing.JFormattedTextField();
        campoEnderecoPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        brnCarrinho = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setClosable(true);

        painel01.setBackground(new java.awt.Color(52, 152, 219));

        campoNomeProf.setBackground(new java.awt.Color(52, 152, 219));
        campoNomeProf.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoNomeProf.setForeground(new java.awt.Color(255, 255, 255));
        campoNomeProf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoNomeProf.setCaretColor(new java.awt.Color(52, 152, 219));
        campoNomeProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeProfActionPerformed(evt);
            }
        });

        campoCRM.setBackground(new java.awt.Color(52, 152, 219));
        campoCRM.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoCRM.setForeground(new java.awt.Color(255, 255, 255));
        campoCRM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoCRM.setCaretColor(new java.awt.Color(52, 152, 219));
        campoCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCRMActionPerformed(evt);
            }
        });

        campoEnderecoProf.setBackground(new java.awt.Color(52, 152, 219));
        campoEnderecoProf.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoEnderecoProf.setForeground(new java.awt.Color(255, 255, 255));
        campoEnderecoProf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoEnderecoProf.setCaretColor(new java.awt.Color(52, 152, 219));
        campoEnderecoProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoProfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Endereço");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço");

        campoNomePac.setBackground(new java.awt.Color(52, 152, 219));
        campoNomePac.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoNomePac.setForeground(new java.awt.Color(255, 255, 255));
        campoNomePac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoNomePac.setCaretColor(new java.awt.Color(52, 152, 219));
        campoNomePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomePacActionPerformed(evt);
            }
        });

        campoCPF.setBackground(new java.awt.Color(52, 152, 219));
        campoCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoCPF.setForeground(new java.awt.Color(255, 255, 255));
        campoCPF.setOpaque(false);
        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });

        campoEnderecoPaciente.setBackground(new java.awt.Color(52, 152, 219));
        campoEnderecoPaciente.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoEnderecoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        campoEnderecoPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoEnderecoPaciente.setCaretColor(new java.awt.Color(52, 152, 219));
        campoEnderecoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoPacienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Liberação de Medicamento Controlado");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CRM");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF");

        brnCarrinho.setBackground(new java.awt.Color(52, 152, 219));
        brnCarrinho.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        brnCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        brnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/basket-go.png"))); // NOI18N
        brnCarrinho.setText("Carrinho");
        brnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCarrinhoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Profissional");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Paciente");

        javax.swing.GroupLayout painel01Layout = new javax.swing.GroupLayout(painel01);
        painel01.setLayout(painel01Layout);
        painel01Layout.setHorizontalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel01Layout.createSequentialGroup()
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(brnCarrinho)
                            .addComponent(campoEnderecoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel01Layout.createSequentialGroup()
                                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(campoNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addComponent(campoNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoEnderecoProf)
                                .addGroup(painel01Layout.createSequentialGroup()
                                    .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(painel01Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(148, 148, 148)
                                            .addComponent(jLabel6)))
                                    .addGap(289, 289, 289)))))
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel01Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        painel01Layout.setVerticalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel01Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEnderecoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEnderecoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(brnCarrinho)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCRMActionPerformed

    private void campoEnderecoProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoProfActionPerformed

    private void campoEnderecoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoPacienteActionPerformed

    private void campoNomePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomePacActionPerformed

    private void campoNomeProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeProfActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed
    private void enviaCaixa() {
        DefaultTableModel tabelaOrigem = (DefaultTableModel) TelaFarmaceutico.tabelaProdutos.getModel();
        DefaultTableModel tabelaDestino = (DefaultTableModel) Carrinho.tabelaCarrinho.getModel();
        FuncionarioDAO dao = new FuncionarioDAO();
        Object[] obj = {
            tabelaOrigem.getValueAt(TelaFarmaceutico.tabelaProdutos.getSelectedRow(), 0),
            tabelaOrigem.getValueAt(TelaFarmaceutico.tabelaProdutos.getSelectedRow(), 1),
            tabelaOrigem.getValueAt(TelaFarmaceutico.tabelaProdutos.getSelectedRow(), 3),
            tabelaOrigem.getValueAt(TelaFarmaceutico.tabelaProdutos.getSelectedRow(), 4),
            tabelaOrigem.getValueAt(TelaFarmaceutico.tabelaProdutos.getSelectedRow(), 5),
            tabelaOrigem.getValueAt(TelaFarmaceutico.tabelaProdutos.getSelectedRow(), 6),
            tabelaOrigem.getValueAt(TelaFarmaceutico.tabelaProdutos.getSelectedRow(), 8),
            dao.nomeFuncionario(f)
        };
        tabelaDestino.addRow(obj);
    }
    private void brnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCarrinhoActionPerformed
        if (campoNomeProf.getText().equals("") || campoNomePac.getText().equals("")
            || campoCRM.getText().equals("") || campoCPF.getText().equals("")
            || campoEnderecoProf.getText().equals("") || campoEnderecoPaciente.getText().equals("")) {
            
            new camposVazios(null, true).setVisible(true);
        } else {
            Cadastrar();
            new receitaSalva(null, true).setVisible(true);
            enviaCaixa();
        }
    }//GEN-LAST:event_brnCarrinhoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnCarrinho;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JTextField campoCRM;
    private javax.swing.JTextField campoEnderecoPaciente;
    private javax.swing.JTextField campoEnderecoProf;
    private javax.swing.JTextField campoNomePac;
    private javax.swing.JTextField campoNomeProf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel painel01;
    // End of variables declaration//GEN-END:variables
}
