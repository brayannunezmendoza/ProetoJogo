package DAO;

import java.sql.PreparedStatement;
import connect.ConnectFactory;
import java.sql.Connection;
import javax.swing.JOptionPane;

import model.JogadorSql;

/**
 *
 * @author betyi
 */
public class JogadorSqlDAO {
    
    private Connection conn;
    
    public JogadorSqlDAO() {
        conn = new ConnectFactory().getConnection();
        
    }
    
    public void cadastrarJogador(JogadorSql p) {
        String sql = "INSERT INTO TABELAPLAYER( NOME, EMAIL, CELULAR, USERNAME, SENHA  )"+ "VALUES(?,?,?,?,?)";
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getCelular());
            ps.setString(4, p.getUsarname());
            ps.setString(5, p.getSenha());
            
            
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Player cadastrado com sucesso");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "ERRO, Player não foi cadastrado");
        } finally {
        }
        
    }
    
}
