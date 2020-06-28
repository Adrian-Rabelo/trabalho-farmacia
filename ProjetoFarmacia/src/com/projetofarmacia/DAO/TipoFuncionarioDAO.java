/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetofarmacia.DAO;

import com.projetofarmacia.javabeans.Farmacia;
import com.projetofarmacia.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Ádrian Rabelo
 */
public class TipoFuncionarioDAO {
    private final Connection conecta;
    public TipoFuncionarioDAO() {
        this.conecta = new ConnectionFactory().conecta();
    }

    @SuppressWarnings("unchecked")
    public void listarTipoFuncionario(JComboBox cb) {
        // MÉTODO QUE LISTA AS FARMÁCIAS CADASTRADAS NO BANCO DE DADOS A PARTIR DE UM COMBO BOX
        try {
            List<Farmacia> lista = new ArrayList<>();
            
            String cmdsql = "SELECT * FROM Tipo_Funcionario;";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // ADICIONA ITEM NO COMBOBOX
                cb.addItem(rs.getString("tipo_funcionario"));
            }
        } catch (Exception e) {
        }
    }
}
