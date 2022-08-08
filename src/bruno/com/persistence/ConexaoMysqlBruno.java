//PROJECT NAME: prjBruno-quitanda
package bruno.com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class ConexaoMysqlBruno {

    private static final String DRIVE = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/quitanda?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "9320";
    
    public static Connection conectar() throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        try {
            Class.forName(DRIVE);
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Nâo Conectado ConexaoMysqlBruno");
        }
        return conexao;
    }
}
