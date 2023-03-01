/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.desafio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Desafio3 {

    public static Statement stmt;
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        String user = "root";
        String passoword = "";
        String url = "jdbc:mysql://localhost:3306/estoque1";
        Connection con = DriverManager.getConnection(url, user, passoword);

        Menu menu = new Menu();
        VerProdutos verProduto = new VerProdutos();
        VerProdutosPorId verProdutoPorId = new VerProdutosPorId();
        AdicionarProduto addProduto = new AdicionarProduto();
        RemoverProduto removerProduto = new RemoverProduto();

        int opcao = 1;
        while (opcao != 0) {
            menu.menu();
            
            String resposta = reader.next();
            
            
            switch (resposta) {
                case "1":
                    verProduto.verProdutos(con);
                    break;
                case "2":
                    verProdutoPorId.verProdutosPorId(con);
                    break;
                case "3":
                    addProduto.adicionarProduto(con);
                    break;
                case "4":
                    removerProduto.removerProdutos(con);
                    break;
                case "5":
                    return;
            }
        }
    }
}
 