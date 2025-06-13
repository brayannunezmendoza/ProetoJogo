/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.JogadorDTO;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.JogadorSql;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import connect.ConnectFactory;

/**
 *
 * @author betyi
 */
public class PlayerDAO {

    Connection conn;

    public ResultSet autenticacao(JogadorDTO jogadorDTO) {
        conn = new ConnectFactory().getConnection();

        try {
            String sql = "SELECT  * FROM tabelaplayer WHERE EMAIL = ?  AND SENHA =?";

            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(2, jogadorDTO.getEmail());
            psmt.setString(1, jogadorDTO.getSenha());
            ResultSet rs = psmt.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro" + erro);
            return null;
        }

    }
}
