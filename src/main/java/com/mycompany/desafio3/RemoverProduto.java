/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class RemoverProduto {

    public void removerProdutos(Connection con) {
        try {
            System.out.println("Digite o ID do produto que você quer remover:");
            PreparedStatement stmt = con.prepareStatement("DELETE FROM produto WHERE id = ? ;");
            Scanner leitor = new Scanner(System.in);
            stmt.setString(1,  leitor.next());
            
            stmt.execute();
            
            System.out.println("Produto removido!");

            
        } catch (SQLException ex) {
            Logger.getLogger(VerProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
