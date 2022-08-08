//PROJECT NAME: prjBruno-quitanda
package bruno.com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import bruno.com.model.Fruta;
import bruno.com.persistence.ConexaoMysqlBruno;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:10
 * @version 1.0 beta
 */
public class FrutaDAO {

    private String selectAll = "SELECT * FROM frutas_quitanda";

    public void insert(Fruta fruta) throws SQLException, ClassNotFoundException {
        System.out.println("into method insert");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();

            statement = conexaoMysqlBruno.createStatement();
        

        try {
            String sql = "INSERT INTO frutas_quitanda(id_fruta, nome, valor, quantidade, data_registro, hora_registro)"
                    + "VALUES (NULL, '" + fruta.getNome() + "'," + fruta.getValorCusto() + "," + fruta.getQuantidade() + ", NOW(), NOW());";
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
    }

    public ArrayList<Fruta> selectAll() throws SQLException, ClassNotFoundException {
        System.out.println("into method selectAll");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        ArrayList<Fruta> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();

            statement = conexaoMysqlBruno.createStatement();
        

        try {
            ResultSet resultSet = statement.executeQuery(this.selectAll);
            lista = new ArrayList<>();
            while (resultSet.next()) {
                Fruta fruta = new Fruta();

                fruta.setIdFruta(resultSet.getLong("id_fruta"));
                fruta.setNome(resultSet.getString("nome"));
                fruta.setValorCusto(resultSet.getFloat("valor"));
                fruta.setQuantidade(resultSet.getInt("quantidade"));
                lista.add(fruta);
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

    public ArrayList<Fruta> selectBy(String query) throws SQLException, ClassNotFoundException {
        System.out.println("into method selectBy");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        ArrayList<Fruta> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();

            statement = conexaoMysqlBruno.createStatement();
        

        try {
            String sql = "SELECT * FROM frutas_quitanda " + query + ";";
            ResultSet resultSet = statement.executeQuery(this.selectAll + " " + query + ";");
            lista = new ArrayList<>();
            while (resultSet.next()) {
                Fruta fruta = new Fruta();
                fruta.setIdFruta(resultSet.getLong("id_fruta"));
                fruta.setNome(resultSet.getString("nome"));
                fruta.setValorCusto(resultSet.getFloat("valor"));
                fruta.setQuantidade(resultSet.getInt("quantidade"));
                lista.add(fruta);
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

    public void delete(long id) throws SQLException, ClassNotFoundException {
        System.out.println("into method delete");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
            statement = conexaoMysqlBruno.createStatement();
        
        try {
            String sql = "DELETE FROM frutas_quitanda WHERE id_fruta = " + id + ";";
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
            conexaoMysqlBruno.close();
        
            
    }

    public void update(Fruta fruta) throws SQLException, ClassNotFoundException {
        System.out.println("into method update");

        Statement statement = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
            statement = conexaoMysqlBruno.createStatement();
        
        try {
            String sql = "UPDATE frutas_quitanda SET nome = '" + fruta.getNome() + "', valor = " + fruta.getValorCusto() + ", quantidade = " + fruta.getQuantidade() + " WHERE id_fruta = " + fruta.getIdFruta() + ";";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro Ao Efetuar QUERY \n" + e.getMessage() + "\n");
        } finally {
            statement.close();
        }
            conexaoMysqlBruno.close();
        
    }
}
