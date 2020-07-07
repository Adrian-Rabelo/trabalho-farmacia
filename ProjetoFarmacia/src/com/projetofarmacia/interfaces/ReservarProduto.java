/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.projetofarmacia.interfaces;

import com.projetofarmacia.DAO.ReservasDAO;
import com.projetofarmacia.dialogs.camposVazios;
import com.projetofarmacia.dialogs.nenhumaLinha;
import com.projetofarmacia.dialogs.produtoReservadoFalha;
import com.projetofarmacia.dialogs.produtoReservadoSucess;
import com.projetofarmacia.dialogs.selecioneTabela;
import static com.projetofarmacia.interfaces.TelaFarmaceutico.pane;
import static com.projetofarmacia.interfaces.TelaFarmaceutico.tabelaProdutos;
import com.projetofarmacia.javabeans.Farmacia;
import com.projetofarmacia.javabeans.Produto;
import com.projetofarmacia.javabeans.Reservas;
import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Calendoscopio
 */
public class ReservarProduto extends javax.swing.JInternalFrame {

    /** Creates new form cadastrarProduto */
    public ReservarProduto() {
        initComponents();
        if (!Carrinho.campoNome.getText().equals("")) {
            campoNome.setText(Carrinho.campoNome.getText());
        } else {
            campoNome.setText("");
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel01 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        campoReservar = new javax.swing.JButton();

        setBackground(new java.awt.Color(52, 152, 219));
        setClosable(true);

        painel01.setBackground(new java.awt.Color(52, 152, 219));

        campoNome.setBackground(new java.awt.Color(52, 152, 219));
        campoNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RESERVA DE MEDICAMENTO");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nome");

        campoTelefone.setBackground(new java.awt.Color(52, 152, 219));
        campoTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefone.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        javax.swing.GroupLayout painel01Layout = new javax.swing.GroupLayout(painel01);
        painel01.setLayout(painel01Layout);
        painel01Layout.setHorizontalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel01Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel9))
                            .addGroup(painel01Layout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(jLabel6))))
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        painel01Layout.setVerticalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        campoReservar.setBackground(new java.awt.Color(52, 152, 219));
        campoReservar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoReservar.setForeground(new java.awt.Color(255, 255, 255));
        campoReservar.setText("Reservar");
        campoReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoReservar)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoReservar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reservar(JTable tabela) {
        try {

                Reservas obj = new Reservas();
                Farmacia f = new Farmacia();
                Produto p = new Produto();
                ReservasDAO dao = new ReservasDAO();

                obj.setNomeCliente(campoNome.getText());
                obj.setTelefone(campoTelefone.getText());
                if (tabela == ConsultarFarmacias.tabelaFarmacias) {
                    p.setNomeProduto(ConsultarFarmacias.tabelaFarmacias.getValueAt(ConsultarFarmacias.tabelaFarmacias.getSelectedRow(), 1).toString());
                    p.setIdProduto(Integer.parseInt(ConsultarFarmacias.tabelaFarmacias.getValueAt(ConsultarFarmacias.tabelaFarmacias.getSelectedRow(), 0).toString()));
                     
                } else {
                    p.setNomeProduto(Carrinho.tabelaCarrinho.getValueAt(Carrinho.tabelaCarrinho.getSelectedRow(), 1).toString());
                    p.setIdProduto(Integer.parseInt(Carrinho.tabelaCarrinho.getValueAt(Carrinho.tabelaCarrinho.getSelectedRow(), 0).toString()));
                    
                }
                f.setIdFarmacia(TelaLogin.idFar);
                obj.setFarmacia(f);
                obj.setProduto(p);
//                Object[] obj01 = {
//                    tabelaOrigem.getValueAt(Carrinho.tabelaCarrinho.getSelectedRow(), 1), // nome produto
//                    1, // quantidade
//                    tabelaOrigem.getValueAt(Carrinho.tabelaCarrinho.getSelectedRow(), 4), // tarja
//                    tabelaOrigem.getValueAt(Carrinho.tabelaCarrinho.getSelectedRow(), 5), // preco
//                    tabelaOrigem.getValueAt(Carrinho.tabelaCarrinho.getSelectedRow(), 6), // validade
//                };
//                tabelaDestino.addRow(obj01);
                dao.reservarProduto(obj);

        } catch (Exception e) {
            new produtoReservadoFalha(null, true).setVisible(true);
            throw new RuntimeException(e);
        }
            
    }
    private void campoReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoReservarActionPerformed
        if (campoNome.getText().equals("") || campoTelefone.getText().equals("")) {
            new camposVazios(null, true).setVisible(true);
        } else {
            if (Carrinho.tabelaCarrinho.getSelectedRow() != -1) {
                Reservar(Carrinho.tabelaCarrinho);
                DefaultTableModel tabela = (DefaultTableModel) Carrinho.tabelaCarrinho.getModel();
                new produtoReservadoSucess(null, true).setVisible(true);
                tabela.removeRow(Carrinho.tabelaCarrinho.getSelectedRow());
                this.dispose();
            } else if (ConsultarFarmacias.tabelaFarmacias.getSelectedRow() != -1){
                Reservar(ConsultarFarmacias.tabelaFarmacias);
                DefaultTableModel tabela = (DefaultTableModel) ConsultarFarmacias.tabelaFarmacias.getModel();
                new produtoReservadoSucess(null, true).setVisible(true);
                this.dispose();
            } else {
                new selecioneTabela(null, true).setVisible(true);

            }
        }
    }//GEN-LAST:event_campoReservarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField campoNome;
    private javax.swing.JButton campoReservar;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painel01;
    // End of variables declaration//GEN-END:variables

}
