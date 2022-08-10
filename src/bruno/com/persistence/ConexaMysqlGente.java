/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruno.com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bruno.silveira
 */
public class ConexaMysqlGente {
    
    
    private static final String DRIVE = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://10.1.0.201:3306/test?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "kaiser";
    
    public static Connection conectar() throws SQLException, ClassNotFoundException, Exception {
        Connection conexao = null;
        try {
            Class.forName(DRIVE);
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new Exception("Erro ao conectar MysqlGente");
        }
        return conexao;
    }
}
