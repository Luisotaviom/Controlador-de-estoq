/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AdicionarProduto {

    public void adicionarProduto(Connection con) {
        try {
            Statement stmt = con.createStatement();
            Scanner leitor = new Scanner(System.in);
            System.out.println("Vamos cadastrar um produto! ");
            System.out.println(" ");
            System.out.println("Digite o ID do produto: ");
            String id = leitor.next().strip();
            System.out.println("Digite o nome do Produto: ");
            String nome = leitor.next().strip();
            System.out.println("Digite o tipo do Produto: ");
            String tipo = leitor.next().strip();
            System.out.println("Digite o preço do Produto: ");
            String preco = leitor.next().strip();

            stmt.execute("INSERT INTO produto (id,nome,tipo,preco) VALUES (" + "\'" + id + "\'," + "\'" + nome + "\'" + ", " + "\'" + tipo + "\'" + ", " + "\'" + preco + "\'" + ");");
        } catch (SQLException ex) {
            Logger.getLogger(VerProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
