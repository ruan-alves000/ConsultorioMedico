package DAO;
import Model.Administrador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class AdmDAO {
    Connection conn;
    public ResultSet autenticarAdministrador(Administrador objAdm){
        conn = new ConexaoDAO().conectarBD();
        try{
            String sql = "select * from login where usuario = ? and senha = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAdm.getNome());
            pstm.setString(2, objAdm.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        }
            catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"falha ao selecioar a tabela login contactar o ADM" + erro);
        } 

  return null;
    }}
    
    


