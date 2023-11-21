/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ConexaoDAO {
    public Connection conectarBD(){
        Connection conn = null;
        try{
      String url = "jdbc:mysql//" + "localhost:3306/" + "ConsultorioMedico" + "user=root&passowrd=root";
          /* Armazenar o driver de gerenciamento na variavel conn usando o metodo
             getConnection*/
      conn = DriverManager.getConnection(url);
  } catch (SQLException erro){// catch se não 
  JOptionPane.showMessageDialog(null, "falha ao conectar com o banco de dados com admins entre em contato com o Adiministrador do Sistema" + erro.getMessage());
    // nome ao nosso metodo
  }
    return conn;
  } 
}
