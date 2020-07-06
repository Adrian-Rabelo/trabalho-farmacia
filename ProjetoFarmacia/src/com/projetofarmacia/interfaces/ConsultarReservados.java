/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetofarmacia.interfaces;

import com.projetofarmacia.DAO.FuncionarioDAO;
import com.projetofarmacia.DAO.ReservasDAO;
import com.projetofarmacia.javabeans.Funcionario;
import com.projetofarmacia.javabeans.Reservas;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Calendoscopio
 */
public class ConsultarReservados extends javax.swing.JInternalFrame {

    /**
     * Creates new form consultaReservados
     */
    public ConsultarReservados() {
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

        painel01 = new javax.swing.JPanel();
        btnProcurar = new javax.swing.JButton();
        campoPesquisa = new javax.swing.JTextField();
        lblReserva = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tabelaConsultaReserva = new javax.swing.JTable();
        btnCarrinho = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Farmacia");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        painel01.setBackground(new java.awt.Color(52, 152, 219));

        btnProcurar.setBackground(new java.awt.Color(52, 152, 219));
        btnProcurar.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        btnProcurar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/Folder Search-certo.png"))); // NOI18N
        btnProcurar.setText("Procurar");

        campoPesquisa.setBackground(new java.awt.Color(52, 152, 219));
        campoPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        campoPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoPesquisa.setCaretColor(new java.awt.Color(52, 152, 219));
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });

        lblReserva.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblReserva.setForeground(new java.awt.Color(255, 255, 255));
        lblReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReserva.setText("Reserva de Medicamentos");

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        tabelaConsultaReserva.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        tabelaConsultaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Telefone", "Status", "produtos", "Farmacia", "tarja", "quantidade", "preco", "datavalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConsultaReserva.setGridColor(new java.awt.Color(51, 102, 255));
        tabelaConsultaReserva.setSurrendersFocusOnKeystroke(true);
        tabelaConsultaReserva.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(tabelaConsultaReserva);

        btnCarrinho.setBackground(new java.awt.Color(52, 152, 219));
        btnCarrinho.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        btnCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/basket_put.png"))); // NOI18N
        btnCarrinho.setText("Carrinho");
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel01Layout = new javax.swing.GroupLayout(painel01);
        painel01.setLayout(painel01Layout);
        painel01Layout.setHorizontalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane)
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel01Layout.createSequentialGroup()
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnCarrinho)))
                .addContainerGap())
        );
        painel01Layout.setVerticalGroup(
            painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel01Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public void Listar() {
        try {
            ReservasDAO dao = new ReservasDAO();
            List<Reservas> listaDeProdutos = dao.listarReservados();
            DefaultTableModel modelo = (DefaultTableModel) tabelaConsultaReserva.getModel();
            modelo.setNumRows(0);
            
            for (Reservas r : listaDeProdutos) {
                DefaultTableModel tabelaOrigem = (DefaultTableModel) TelaFarmaceutico.tabelaProdutos.getModel();
                modelo.addRow(new Object[] {
                    r.getIdReserva(),
                    r.getNomeCliente(),
                    r.getTelefone(),
                    "RESERVADO",
                    r.getProduto().getNomeProduto(),
                    r.getFarmacia().getNomeFarmacia(),
                    r.getProduto().getTarja(),
                    1,
                    r.getProduto().getPreco(),
                    new SimpleDateFormat("dd/MM/yyyy").format(r.getProduto().getDataValidade())
                });
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Listar();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
        DefaultTableModel tabelaOrigem = (DefaultTableModel) tabelaConsultaReserva.getModel();
        DefaultTableModel tabelaDestino = (DefaultTableModel) Carrinho.tabelaCarrinho.getModel();
        Funcionario f = new Funcionario();
        FuncionarioDAO dao = new FuncionarioDAO();
        Reservas r = new Reservas();
        ReservasDAO dao1 = new ReservasDAO();
        f.setIdFuncionario(TelaLogin.idFunc);
        Object[] obj = {
            tabelaOrigem.getValueAt(tabelaConsultaReserva.getSelectedRow(), 0),
            tabelaOrigem.getValueAt(tabelaConsultaReserva.getSelectedRow(), 4),
            1,
            tabelaOrigem.getValueAt(tabelaConsultaReserva.getSelectedRow(), 6),
            tabelaOrigem.getValueAt(tabelaConsultaReserva.getSelectedRow(), 8),
            tabelaOrigem.getValueAt(tabelaConsultaReserva.getSelectedRow(), 9),
            tabelaOrigem.getValueAt(tabelaConsultaReserva.getSelectedRow(), 5),
            dao.nomeFuncionario(f)
        };
        tabelaDestino.addRow(obj);
        r.setIdReserva(Integer.parseInt(tabelaConsultaReserva.getValueAt(tabelaConsultaReserva.getSelectedRow(), 0).toString()));
        dao1.removeReserva(r);
        tabelaOrigem.removeRow(tabelaConsultaReserva.getSelectedRow());
    }//GEN-LAST:event_btnCarrinhoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JPanel painel01;
    private javax.swing.JTable tabelaConsultaReserva;
    // End of variables declaration//GEN-END:variables
}
