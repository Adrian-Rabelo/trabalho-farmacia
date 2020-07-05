/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetofarmacia.interfaces;

import com.projetofarmacia.DAO.FuncionarioDAO;
import com.projetofarmacia.dialogs.confirmarExclusaoFunc;
import com.projetofarmacia.dialogs.selecioneTabela;
import com.projetofarmacia.javabeans.*;
import java.util.List;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Calendoscopio
 */
public class ConsultarFuncionario extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;
    public static boolean isEditing;
    /**
     * Creates new form consutarProduto
     */
    public ConsultarFuncionario() {
        initComponents();
       //  -----------------------------------------------------
            ScrollPane.setOpaque(false);
            ScrollPane.getViewport().setOpaque(false);
            tabelaFuncionario.setOpaque(false);
            tabelaFuncionario.setBackground(new Color(255, 255, 255, 0));
        //    ---------------------------------------------------
      //  ImageIcon icon = new ImageIcon("src/recursos/logo.png");
       //logo2.setIcon(icon);
       // icon.setImage(icon.getImage().getScaledInstance(logo2.getWidth(), 
        //        logo2.getHeight(), Image.SCALE_DEFAULT));
       // logo2.setIcon(icon);
        
        
        //-------------------------------------------------------
            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painell01 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        setBackground(new java.awt.Color(52, 152, 219));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Produto");
        setFocusable(false);
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        painell01.setBackground(new java.awt.Color(52, 152, 219));

        campoNome.setBackground(new java.awt.Color(52, 152, 219));
        campoNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        campoNome.setForeground(new java.awt.Color(255, 255, 255));
        campoNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        campoNome.setCaretColor(new java.awt.Color(52, 152, 219));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoNomeKeyReleased(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(52, 152, 219));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/user_edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnProcurar.setBackground(new java.awt.Color(52, 152, 219));
        btnProcurar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnProcurar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/Folder Search-certo.png"))); // NOI18N
        btnProcurar.setText("Procurar");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consultar Funcionário");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        tabelaFuncionario.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "íd", "Nome", "Função", "Departamento", "Login", "Data de Nascimento", "RG", "CPF", "Endereço", "sexo", "senha", "farmacia", "data de admissaol", "data de desligamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelaFuncionario.setGridColor(new java.awt.Color(51, 102, 255));
        tabelaFuncionario.setSurrendersFocusOnKeystroke(true);
        tabelaFuncionario.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(tabelaFuncionario);
        if (tabelaFuncionario.getColumnModel().getColumnCount() > 0) {
            tabelaFuncionario.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(5).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(5).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(5).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(6).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(6).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(6).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(7).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(7).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(7).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(8).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(8).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(8).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(9).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(9).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(9).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(10).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(10).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(10).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(12).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(12).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(12).setMaxWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(13).setMinWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(13).setPreferredWidth(0);
            tabelaFuncionario.getColumnModel().getColumn(13).setMaxWidth(0);
        }

        btnExcluir.setBackground(new java.awt.Color(52, 152, 219));
        btnExcluir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/user_delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painell01Layout = new javax.swing.GroupLayout(painell01);
        painell01.setLayout(painell01Layout);
        painell01Layout.setHorizontalGroup(
            painell01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painell01Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(painell01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painell01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painell01Layout.createSequentialGroup()
                        .addComponent(campoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProcurar))
                    .addGroup(painell01Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addGap(689, 689, 689)))
                .addGroup(painell01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painell01Layout.setVerticalGroup(
            painell01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painell01Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGroup(painell01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painell01Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                    .addGroup(painell01Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(6, 6, 6)))
                .addGroup(painell01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painell01Layout.createSequentialGroup()
                        .addGroup(painell01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProcurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar))
                        .addGap(19, 19, 19))
                    .addGroup(painell01Layout.createSequentialGroup()
                        .addComponent(campoNome)
                        .addGap(21, 21, 21)))
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painell01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painell01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Listar() {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            Farmacia far = new Farmacia();
            far.setIdFarmacia(TelaLogin.idFar);
            List<Funcionario> listaDeFuncionarios = dao.listarFuncionario(far);
            DefaultTableModel modelo = (DefaultTableModel) tabelaFuncionario.getModel();
            modelo.setNumRows(0);
            
            for (Funcionario f: listaDeFuncionarios) {
                modelo.addRow(new Object[] {
                    f.getIdFuncionario(),
                    f.getNomeFuncionario(),
                    f.getTipoFuncionario().getTipoFuncionario(),
                    f.getDepartamento().getNomeDepartamento(),
                    f.getLoginFuncionario(),
                    new SimpleDateFormat("dd/MM/yyyy").format(f.getDataNascimento()),
                    f.getRgFuncionario(),
                    f.getCpfFuncionario(),
                    f.getEnderecoFuncionario(),
                    f.getSexo(),
                    f.getSenhaFuncionario(),
                    f.getFarmacia().getNomeFarmacia(),
                    new SimpleDateFormat("dd/MM/yyyy").format(f.getDataAdmissao()),
                    new SimpleDateFormat("dd/MM/yyyy").format(f.getDataDesligamento())
                });
            }
        } catch (Exception e) {
            System.out.println("erro" + e);
            e.printStackTrace();
        }
    }
    
    public void Buscar(String nome) {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            Farmacia far = new Farmacia();
            far.setIdFarmacia(TelaLogin.idFar);
            List<Funcionario> listaDeFuncionarios = dao.buscarFuncionario(nome, far);
            DefaultTableModel modelo = (DefaultTableModel) tabelaFuncionario.getModel();
            modelo.setNumRows(0);
            
            for (Funcionario f: listaDeFuncionarios) {
                modelo.addRow(new Object[] {
                    f.getIdFuncionario(),
                    f.getNomeFuncionario(),
                    f.getTipoFuncionario().getTipoFuncionario(),
                    f.getDepartamento().getNomeDepartamento(),
                    f.getLoginFuncionario(),
                    new SimpleDateFormat("dd/MM/yyyy").format(f.getDataNascimento()),
                    f.getRgFuncionario(),
                    f.getCpfFuncionario(),
                    f.getEnderecoFuncionario(),
                    f.getSexo(),
                    f.getSenhaFuncionario(),
                    f.getFarmacia().getNomeFarmacia(),
                    new SimpleDateFormat("dd/MM/yyyy").format(f.getDataAdmissao()),
                    new SimpleDateFormat("dd/MM/yyyy").format(f.getDataDesligamento())
                });
            }
        } catch (Exception e) {
            System.out.println("erro" + e);
            e.printStackTrace();
        }
    }
    public static void excluirFuncionario() {
        try {
            Funcionario obj = new Funcionario();
            obj.setIdFuncionario(Integer.parseInt(ConsultarFuncionario.tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0).toString()));
            FuncionarioDAO dao = new FuncionarioDAO();
            
            dao.excluirFuncionario(obj);
            dao.corrigeId(obj);
        } catch (NumberFormatException | HeadlessException e) {
            throw new RuntimeException(e);
        }
    }
    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Listar();
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Listar();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            if (tabelaFuncionario.getSelectedRow() == -1) {
                System.out.println("EEEEEERRRRO");
            } else {
                CadastroFuncionario cf = new CadastroFuncionario();
                isEditing = true;
                cf.listarFuncionarios(Integer.parseInt(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0).toString()),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 1).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 2).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 3).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 4).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 5).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 6).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 7).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 8).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 9).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 10).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 11).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 12).toString(),
                        tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 13).toString(),
                        isEditing);
                
                TelaPrincipalAdm.painel.add(cf);
                cf.setVisible(true);
                
                Object[] obj = cf.recuperaDados();
                
                for (int i = 0; i < obj.length && i < tabelaFuncionario.getColumnCount(); i++) {
                    tabelaFuncionario.setValueAt(obj[i], tabelaFuncionario.getSelectedRow(), i);
                }
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaFuncionario.getSelectedRow() == -1) {
            new selecioneTabela(null, true).setVisible(true);
        } else {
            confirmarExclusaoFunc ce = new confirmarExclusaoFunc(null, true);
            ce.setVisible(true);
            Listar();
            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void campoNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_ALPHANUMERIC) {
                    Buscar(campoNome.getText());
        }
    }//GEN-LAST:event_campoNomeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painell01;
    private static javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables
}
