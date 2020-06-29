/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetofarmacia.interfaces;

import com.projetofarmacia.DAO.FuncionarioDAO;


/**
 *
 * @author Calendoscopio
 */
public class TelaPrincipalAdm extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form telaprincipalAdm
     */
    public TelaPrincipalAdm() {
        initComponents();
        TelaPrincipalAdm.this.setExtendedState(TelaPrincipalAdm.MAXIMIZED_BOTH);
        //this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("logocerto (2).png")).getImage());
       // ImageIcon icon = new ImageIcon("src/recursos/logo_barra.png");
        //barra.setIcon(icon);
        //icon.setImage(icon.getImage().getScaledInstance(barra.getWidth(), barra.getHeight(), Image.SCALE_DEFAULT));
        //barra.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        barraProdutos = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        barraFuncionarios = new javax.swing.JMenu();
        cadastrarFuncionario = new javax.swing.JMenuItem();
        consultarFuncionar = new javax.swing.JMenuItem();
        barraCaixa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );

        barraMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        barraProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/product.png"))); // NOI18N
        barraProdutos.setText("Produtos");
        barraProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraProdutosActionPerformed(evt);
            }
        });

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/Folder Search-certo.png"))); // NOI18N
        jMenuItem4.setText("Consultar Produto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        barraProdutos.add(jMenuItem4);

        barraMenu.add(barraProdutos);

        barraFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/user.png"))); // NOI18N
        barraFuncionarios.setText("Funcionários");

        cadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/user_add.png"))); // NOI18N
        cadastrarFuncionario.setText("Cadastrar Funcionário");
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });
        barraFuncionarios.add(cadastrarFuncionario);

        consultarFuncionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/people_search.png"))); // NOI18N
        consultarFuncionar.setText("Consultar Funcionário");
        consultarFuncionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFuncionarActionPerformed(evt);
            }
        });
        barraFuncionarios.add(consultarFuncionar);

        barraMenu.add(barraFuncionarios);

        barraCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/basket.png"))); // NOI18N
        barraCaixa.setText("Caixa");
        barraCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraCaixaMouseClicked(evt);
            }
        });
        barraMenu.add(barraCaixa);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarFuncionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFuncionarActionPerformed
        ConsultarFuncionario cf1 = new ConsultarFuncionario();
        painel.add(cf1);
        cf1.setVisible(true);
    }//GEN-LAST:event_consultarFuncionarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ConsultarProduto cp1 = new ConsultarProduto();
        painel.add(cp1);
        cp1.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void barraProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraProdutosActionPerformed
    }//GEN-LAST:event_barraProdutosActionPerformed

    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioActionPerformed
       CadastroFuncionario cf1 = new CadastroFuncionario();
       FuncionarioDAO dao = new FuncionarioDAO();
       painel.add(cf1);
       CadastroFuncionario.campoFarmacia.setText(TelaLogin.nomeFarm);
       cf1.setVisible(true);
    }//GEN-LAST:event_cadastrarFuncionarioActionPerformed

    private void barraCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraCaixaMouseClicked
        TelaCaixa tc1 = new TelaCaixa();
        tc1.setVisible(true);
    }//GEN-LAST:event_barraCaixaMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipalAdm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu barraCaixa;
    private javax.swing.JMenu barraFuncionarios;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu barraProdutos;
    private javax.swing.JMenuItem cadastrarFuncionario;
    private javax.swing.JMenuItem consultarFuncionar;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables

   
}
