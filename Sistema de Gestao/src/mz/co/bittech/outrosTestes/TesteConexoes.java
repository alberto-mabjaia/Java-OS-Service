/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.bittech.outrosTestes;
import java.sql.*;
import mz.co.bittech.dao.ModuloConexao;


/**
 *
 * @author Mabjaia
 */
public class TesteConexoes {
    
    
    public static void main(String[] args) {
    Connection conexao = null; //conexao com o banco
    ResultSet rs = null;// resultado da busca
    Statement stmt = null; // query
    
    conexao = ModuloConexao.conector();
    
    
        System.out.println(conexao);
    
    }  
}
