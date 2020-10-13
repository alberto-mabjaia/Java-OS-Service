/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.bittech.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mabjaia
 */
public class ModuloConexao {
    
    
    public static Connection conector(){
        // string url -> mostra o caminho do banco de dados
        // string driver -> que mostra o caminho da classe Driver qe esta na biblioteca mysql_connector;
        // conexao -> e uma variavel do tipo Connection que vai receber o DriverManager para gerenciar a ligacao.
        // url do banco de dados
        String db_url = "jdbc:mysql://localhost:3306/dbinformatica";
        
        //credencias
        String user = "root";
        String pass = "";
        
        // chamando o Driver que sera usado no Class.forname.
        String driver = "com.mysql.cj.jdbc.Driver";
        
        // variavel do tipo conexao que vai receber o DriverManager
        Connection conexao = null;
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(db_url, user, pass);
            
            return conexao;
        }catch(Exception e){
            System.out.println(e);
        
        }
        
        
        return null;
        
    }
 }
   
 
    

