/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author betyi
 */
public class ConnectFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/conexaoarlot", "root", "root");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão");

            return null;
        }

    }

}
