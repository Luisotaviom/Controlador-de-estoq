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
public class VerProdutosPorId {
    public void verProdutosPorId(Connection con) {
      
        try {
            System.out.println("Digite o ID do produto que você quer ver: ");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM produto where id = ?");
            
            Scanner leitor = new Scanner(System.in);
            stmt.setString(1,  leitor.next());
            
            ResultSet response = stmt.executeQuery();
            response.next();
            
            System.out.println("O ID que você digitou, é o produto: " + response.getString(2));

        } catch (SQLException ex) {
            Logger.getLogger(VerProdutosPorId.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
}
