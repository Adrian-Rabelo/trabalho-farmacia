/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetofarmacia.interfaces;



/**
 *
 * @author Calendoscopio
 */
public class TelaEstoquista extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form telaprincipalAdm
     */
    public TelaEstoquista() {
        initComponents();
        this.setExtendedState(TelaEstoquista.MAXIMIZED_BOTH);
        //this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("logocerto (2).png")).getImage());
       // ImageIcon icon = new ImageIcon("src/recursos/logo_barra.png");
        //barra.setIcon(icon);
        //icon.setImage(icon.getImage().getScaledInstance(barra.getWidth(), barra.getHeight(), Image.SCALE_DEFAULT));
        //barra.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        menuConsutaProduto = new javax.swing.JMenu();
        menuCadastraProduto = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );

        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuConsutaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/Folder Search-certo.png"))); // NOI18N
        menuConsutaProduto.setText("Consultar Produto");
        menuConsutaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConsutaProdutoMouseClicked(evt);
            }
        });
        menu.add(menuConsutaProduto);

        menuCadastraProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/projetofarmacia/resources/product-add.png"))); // NOI18N
        menuCadastraProduto.setText("Cadastrar Produto");
        menuCadastraProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadastraProdutoMouseClicked(evt);
            }
        });
        menuCadastraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastraProdutoActionPerformed(evt);
            }
        });
        menu.add(menuCadastraProduto);

        setJMenuBar(menu);

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

    private void menuCadastraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastraProdutoActionPerformed
        
    }//GEN-LAST:event_menuCadastraProdutoActionPerformed

    private void menuCadastraProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastraProdutoMouseClicked
        CadastroProduto cadp = new CadastroProduto();
        painel.add(cadp);
        cadp.setVisible(true);
        
    }//GEN-LAST:event_menuCadastraProdutoMouseClicked

    private void menuConsutaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsutaProdutoMouseClicked
        ConsultarProduto conp = new ConsultarProduto();
        painel.add(conp);
        conp.setVisible(true);
    }//GEN-LAST:event_menuConsutaProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(TelaEstoquista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaEstoquista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JMenuBar menu;
    private static javax.swing.JMenu menuCadastraProduto;
    private static javax.swing.JMenu menuConsutaProduto;
    public static javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables

   
}
