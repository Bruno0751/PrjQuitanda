//PROJECT NAME: prjBruno-quitanda
package bruno.com.dao;

import bruno.com.model.Fruta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import bruno.com.model.Quitanda;
import bruno.com.persistence.ConexaoMysqlBruno;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:11
 * @version 1.0 beta
 */
public class QuitandaDAO {

    private String selectAll = "SELECT * FROM quitandas_quitanda";

    public void insert(Quitanda quitanda) throws SQLException, ClassNotFoundException {
        System.out.println("into method insert");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
            statement = conexaoMysqlBruno.createStatement();
        
        try {
            String sql = "INSERT INTO quitandas_quitanda(id_quitanda, nome, cliente, funcionario, data_registro, hora_registro)"
                    + "VALUES (NULL, '" + quitanda.getNome() + "', '" + quitanda.getClientes() + "', '" + quitanda.getFuncionarios() + "', NOW(), NOW());";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
            conexaoMysqlBruno.close();
        
    }

    public ArrayList<Quitanda> select() throws SQLException, ClassNotFoundException {
        System.out.println("into method select");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        ArrayList<Quitanda> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
            statement = conexaoMysqlBruno.createStatement();
        
        try {
            ResultSet resultSet = statement.executeQuery(this.selectAll);
            lista = new ArrayList<>();
            while (resultSet.next()) {
                Quitanda quitanda = new Quitanda();
                quitanda.setIdQuitanda(resultSet.getLong("id_quitanda"));
                quitanda.setNome(resultSet.getString("nome"));
                quitanda.setClientes(resultSet.getString("cliente"));
                quitanda.setFuncionarios(resultSet.getString("funcionario"));
                lista.add(quitanda);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
            conexaoMysqlBruno.close();
        
        return lista;
    }

    public ArrayList<Quitanda> filter(String query) throws SQLException, ClassNotFoundException {
        System.out.println("into method filter");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        ArrayList<Quitanda> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
            statement = conexaoMysqlBruno.createStatement();
       
        try {

            String sql = "SELECT * FROM quitandas_quitanda " + query + ";";

            ResultSet rs = statement.executeQuery(sql);

            lista = new ArrayList<>();

            while (rs.next()) {

                Quitanda quitanda = new Quitanda();

                quitanda.setIdQuitanda(rs.getLong("id_quitanda"));
                quitanda.setNome(rs.getString("nome"));
                quitanda.setClientes(rs.getString("cliente"));
                quitanda.setFuncionarios(rs.getString("funcionario"));

                lista.add(quitanda);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
            conexaoMysqlBruno.close();
        }
        return lista;
    }

    public void delte(long id) throws SQLException, ClassNotFoundException {
        System.out.println("into method delte");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
            statement = conexaoMysqlBruno.createStatement();
        
        try {
            String sql = "DELETE FROM quitandas_quitanda WHERE id_quitanda = " + id + ";";
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
            conexaoMysqlBruno.close();
        }
    }

    public void update(Quitanda quitanda) throws SQLException, ClassNotFoundException {
        System.out.println("into method update");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
            statement = conexaoMysqlBruno.createStatement();
        
        try {

            String sql = "UPDATE quitandas_quitanda SET nome = '" + quitanda.getNome() + "', cliente = '" + quitanda.getClientes() + "', funcionario = '" + quitanda.getFuncionarios() + "' WHERE id_quitanda = " + quitanda.getIdQuitanda() + ";";

            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
            conexaoMysqlBruno.close();
        }
    }
}
