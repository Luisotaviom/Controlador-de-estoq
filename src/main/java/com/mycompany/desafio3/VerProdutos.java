/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class VerProdutos {
    public void verProdutos(Connection con) {
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM produto;");
            ResultSet response = stmt.executeQuery();
            
            System.out.println("Aqui estão todos os produtos");
            while(response.next()){
                System.out.println(response.getString(2));
                System.out.println(response.getString(4));
                System.out.println("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VerProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}