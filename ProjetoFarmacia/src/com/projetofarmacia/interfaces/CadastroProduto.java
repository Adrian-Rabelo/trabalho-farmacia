/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetofarmacia.interfaces;

import com.projetofarmacia.DAO.ProdutoDAO;
import com.projetofarmacia.DAO.TipoProdutoDAO;
import com.projetofarmacia.dialogs.camposVazios;
import com.projetofarmacia.dialogs.dadosAlteradosFalha;
import com.projetofarmacia.dialogs.dadosAlteradosSucces;
import com.projetofarmacia.dialogs.dadosCadastradosFalha;
import com.projetofarmacia.dialogs.dadosCadastradosSucces;
import com.projetofarmacia.javabeans.Farmacia;
import com.projetofarmacia.javabeans.Produto;
import com.projetofarmacia.javabeans.TipoProduto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Calendoscopio
 */
public class CadastroProduto extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;
    private int id;
    public static boolean edit;

    public CadastroProduto() {
        initComponents();
        campoTipo.setBackground(Color.WHITE);
        campoTarja.setBackground(Color.WHITE);
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        NumberFormatter numFormatter = new NumberFormatter(decimal);
        numFormatter.setFormat(decimal);
        numFormatter.setAllowsInvalid(false);
        DefaultFormatterFactory dfFactory = new DefaultFormatterFactory(numFormatter);
        campoPreco.setFormatterFactory(dfFactory);
    }

    private void limparCampos() {
        campoNome.setText("");
        campoFornecedor.setText("");
        campoLote.setText("");
        campoPreco.setText("");
        campoQuantidade.setText("");
        campoCodBar.setText("");
        campoValidade.setText("");
        campoFabricacao.setText("");
        campoTipo.setSelectedIndex(0);
        campoTarja.setSelectedIndex(0);
    }
    private void Cadastrar() {
        try {
            Produto obj = new Produto();
            Farmacia f = new Farmacia();
            ProdutoDAO dao = new ProdutoDAO();
            TipoProduto tipo = new TipoProduto();
            
            obj.setNomeProduto(campoNome.getText());
            obj.setFornecedor(campoFornecedor.getText());
            obj.setLote(campoLote.getText());
            obj.setPreco(Double.parseDouble(campoPreco.getText().replace(",", ".")));
            obj.setQuantidade(Integer.parseInt(campoQuantidade.getText()));
            obj.setCodigoBarras(Long.parseLong(campoCodBar.getText()));
            obj.setDataValidade(new SimpleDateFormat("dd/MM/yyyy").parse(campoValidade.getText()));
            obj.setDataFabricacao(new SimpleDateFormat("dd/MM/yyyy").parse(campoFabricacao.getText()));
//            obj.setStatus(campoReserva.getSelectedItem().toString());
            if (!campoTipo.getSelectedItem().equals("Medicamento")) {
                obj.setTarja("Sem tarja");
            } else {
                obj.setTarja(String.valueOf(campoTarja.getSelectedItem()));
            }
            tipo.setIdTipoProduto(campoTipo.getSelectedIndex());
            f.setIdFarmacia(TelaLogin.idFar);
            obj.setFarmacia(f);
            obj.setTipoProduto(tipo);
            dao.cadastrarProduto(obj);
            limparCampos();
            
            
        } catch (Exception e) {
            new dadosCadastradosFalha(null, true).setVisible(true);
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
        campoNome = new javax.swing.JTextField();
        campoTipo = new javax.swing.JComboBox<String>();
        campoTarja = new javax.swing.JComboBox<String>();
        campoFabricacao = new javax.swing.JFormattedTextField();
        campoValidade = new javax.swing.JFormattedTextField();
        campoPreco = new javax.swing.JFormattedTextField();
        campoFornecedor = new javax.swing.JTextField();
        campoLote = new javax.swing.JTextField();
        campoCodBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(52, 152, 219));
        setClosable(true);
        setResizable(true);
        setOpaque(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        painel01.setBackground(new java.awt.Color(52, 152, 219));

        campoNome.setBackground(new java.awt.Color(52, 152, 219));
        campoNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setToolTipText("");
        campoNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoNome.setCaretColor(new java.awt.Color(255, 0, 51));
        campoNome.setOpaque(false);

        campoTipo.setBackground(new java.awt.Color(52, 152, 219));
        campoTipo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Medicamento", "Higiene", "Alimentação", "Cosméticos" }));
        campoTipo.setOpaque(false);

        campoTarja.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoTarja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Sem tarja", "Tarja amarela", "Tarja vermelha (sem retenção da receita)", "Tarja vermelha (com retenção da receita)", "Tarja preta" }));

        campoFabricacao.setBackground(new java.awt.Color(52, 152, 219));
        campoFabricacao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoFabricacao.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoFabricacao.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFabricacaoActionPerformed(evt);
            }
        });

        campoValidade.setBackground(new java.awt.Color(52, 152, 219));
        campoValidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoValidade.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoValidade.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValidadeActionPerformed(evt);
            }
        });

        campoPreco.setBackground(new java.awt.Color(52, 152, 219));
        campoPreco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoPreco.setForeground(new java.awt.Color(255, 255, 255));
        campoPreco.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPrecoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPrecoKeyReleased(evt);
            }
        });

        campoFornecedor.setBackground(new java.awt.Color(52, 152, 219));
        campoFornecedor.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        campoFornecedor.setToolTipText("");
        campoFornecedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoFornecedor.setCaretColor(new java.awt.Color(255, 0, 51));
        campoFornecedor.setOpaque(false);

        campoLote.setBackground(new java.awt.Color(52, 152, 219));
        campoLote.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoLote.setForeground(new java.awt.Color(255, 255, 255));
        campoLote.setToolTipText("");
        campoLote.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoLote.setCaretColor(new java.awt.Color(255, 0, 51));
        campoLote.setOpaque(false);

        campoCodBar.setBackground(new java.awt.Color(52, 152, 219));
        campoCodBar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoCodBar.setForeground(new java.awt.Color(255, 255, 255));
        campoCodBar.setToolTipText("");
        campoCodBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoCodBar.setCaretColor(new java.awt.Color(255, 0, 51));
        campoCodBar.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produtos");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de Fabricação");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data de Validade");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lote");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fornecedor");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Codigo de Barras");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Preço");

        btnSalvar.setBackground(new java.awt.Color(52, 152, 219));
        btnSalvar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/save icon.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantidade");

        campoQuantidade.setBackground(new java.awt.Color(52, 152, 219));
        campoQuantidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        campoQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        campoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel01Layout = new javax.swing.GroupLayout(painel01);
        painel01.setLayout(painel01Layout);
        painel01Layout.setHorizontalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel01Layout.createSequentialGroup()
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTarja, 0, 210, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(campoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel01Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painel01Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(campoCodBar, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(campoFornecedor)
                    .addComponent(jLabel4)
                    .addComponent(campoLote))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel01Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        painel01Layout.setVerticalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel01Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 164, Short.MAX_VALUE))
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painel01Layout.createSequentialGroup()
                                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoTarja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(campoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(painel01Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(22, 22, 22)))
                                .addComponent(jLabel9)
                                .addGap(7, 7, 7)
                                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 208, Short.MAX_VALUE))
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCodBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar)
                                .addGap(58, 58, 58))))))
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

    private void campoFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFabricacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFabricacaoActionPerformed

    private void campoValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValidadeActionPerformed

    private void alteracaoECadastro() {
        if (campoNome.getText().equals("") || campoFornecedor.getText().equals("")
            || campoTipo.getSelectedIndex() < 1 || campoTarja.getSelectedIndex() < 1
            || campoLote.getText().equals("") || campoFabricacao.getText().equals("")
            || campoValidade.getText().equals("") || campoCodBar.getText().equals("")
            || campoPreco.getText().equals("")){
            
            new camposVazios(null, true).setVisible(true);
        } else {
            if (edit) {
                setarDados();
                edit = false;
                new dadosAlteradosSucces(null, true).setVisible(true);
            } else {
                Cadastrar();
                new dadosCadastradosSucces(null, true).setVisible(true);
            }
        }
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        alteracaoECadastro();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void campoQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQuantidadeActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void campoPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alteracaoECadastro();
        }
    }//GEN-LAST:event_campoPrecoKeyReleased

    private void campoPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecoKeyPressed

    }//GEN-LAST:event_campoPrecoKeyPressed
    private void setarDados() {
        try {
            TipoProduto tp = new TipoProduto();
            Produto obj = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            
            obj.setIdProduto(this.getId());
            obj.setNomeProduto(campoNome.getText());
            obj.setFornecedor(campoFornecedor.getText());
            obj.setQuantidade(Integer.parseInt(campoQuantidade.getText()));
            obj.setLote(campoLote.getText());
            obj.setCodigoBarras(Long.parseLong(campoCodBar.getText()));
//            obj.setStatus(String.valueOf(campoReserva.getSelectedItem()));
            obj.setPreco(Double.parseDouble(campoPreco.getText()));
            if (!campoTipo.getSelectedItem().equals("Medicamento")) {
                obj.setTarja("Sem tarja");
            } else {
                obj.setTarja(String.valueOf(campoTarja.getSelectedItem()));
            }
            obj.setDataValidade(new SimpleDateFormat("dd/MM/yyyy").parse(campoValidade.getText()));
            obj.setDataFabricacao(new SimpleDateFormat("dd/MM/yyyy").parse(campoFabricacao.getText()));
            tp.setIdTipoProduto(campoTipo.getSelectedIndex());
            obj.setTipoProduto(tp);
            dao.alterarProduto(obj);
        } catch (RuntimeException | ParseException e) {
            new dadosAlteradosFalha(null, true);
            throw new RuntimeException(e);
        }
    }
    
    private void excluirProduto() {
        try {
            Produto obj = new Produto();
            obj.setIdProduto(getId());
            ProdutoDAO dao = new ProdutoDAO();
            
            dao.excluirProduto(obj);
            dao.corrigeId();
            
            this.dispose();
        } catch (NumberFormatException | HeadlessException e) {
            System.out.println(e);
        }
    }
    public void listarProdutos(int id, String nome, String fornecedor, int quantidade, String tarja, double preco, String dataVal, String dataFab,  String farm, String lote, String tipo, long codBars, boolean isedit) {
        TipoProdutoDAO dao = new TipoProdutoDAO();
        setId(id);
        campoNome.setText(nome);
        campoFornecedor.setText(fornecedor);
        campoQuantidade.setText(String.valueOf(quantidade));
        campoTarja.setSelectedItem(tarja);
        campoPreco.setText(String.valueOf(preco));
        campoFabricacao.setText(String.valueOf(dataFab));
        campoValidade.setText(String.valueOf(dataVal));
        campoLote.setText(lote);
        dao.listarTipoProduto(campoTipo);
        campoTipo.setSelectedItem(tipo);
        campoCodBar.setText(String.valueOf(codBars));
        edit = isedit;
    }
    
    public Object[] recuperaDados() {
        Object[] obj = {
            campoNome.getText(),
            campoFornecedor.getText(),
            campoQuantidade.getText(),
            campoTarja.getSelectedItem(),
            campoPreco.getText(),
            campoFabricacao.getText(),
            campoValidade.getText(),
            campoLote.getText(),
//            campoReserva.getSelectedItem(),
            campoTipo.getSelectedItem(),
            campoCodBar.getText()
        };
        return obj;
    }

    private String getEstado(String estado) {
        return estado;
    }
    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoCodBar;
    private javax.swing.JFormattedTextField campoFabricacao;
    private javax.swing.JTextField campoFornecedor;
    private javax.swing.JTextField campoLote;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoPreco;
    private javax.swing.JFormattedTextField campoQuantidade;
    private javax.swing.JComboBox<String> campoTarja;
    private javax.swing.JComboBox<String> campoTipo;
    private javax.swing.JFormattedTextField campoValidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painel01;
    // End of variables declaration//GEN-END:variables
}
