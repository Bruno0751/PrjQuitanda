//PROJECT NAME: prjBruno-quitanda
package bruno.com.dao;

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

    private final String SELECT = "SELECT * FROM quitandas";

    public void insert(Quitanda obj) throws SQLException, ClassNotFoundException {
        System.out.println("into method insert");

        Statement st = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            String sql = "INSERT INTO quitandas"
                    + " VALUES (NULL, '" + obj.getNome() + "', '" + obj.getClientes() + "', '" + obj.getFuncionarios() + "', NOW(), NOW());";
            st.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Inserir Quitanda");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }

    }

    public ArrayList<Quitanda> find() throws SQLException, ClassNotFoundException {
        System.out.println("into method find");

        ResultSet rs = null;
        Statement st;
        Connection conexaoMysqlBruno;
        ArrayList<Quitanda> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            rs = st.executeQuery(this.SELECT);
            lista = new ArrayList<>();
            while (rs.next()) {
                Quitanda obj = new Quitanda();
                obj.setIdQuitanda(rs.getLong("id_quitanda"));
                obj.setNome(rs.getString("nome"));
                obj.setClientes(rs.getString("cliente"));
                obj.setFuncionarios(rs.getString("funcionario"));
                lista.add(obj);
            }
            
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Buscar Quitandas");
        } finally {
            conexaoMysqlBruno.close();
            st.close();
            rs.close();
        }
        

        return lista;
    }

    public ArrayList<Quitanda> findBy(String query) throws SQLException, ClassNotFoundException {
        System.out.println("into method findBy");

        Statement st = null;
        Connection conexaoMysqlBruno = null;
        ArrayList<Quitanda> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            ResultSet rs = st.executeQuery(this.SELECT + " " + query + ";");
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
            throw new SQLException("Erro Ao Buscar Quitanda");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }
        return lista;
    }

    public void delte(long id) throws SQLException, ClassNotFoundException {
        System.out.println("into method delte");

        Statement st ;
        Connection conexaoMysqlBruno;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            String sql = "DELETE FROM quitandas_quitanda WHERE id_quitanda = " + id + ";";
            st.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro Ao Deletar Quitanda");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }
    }

    public void update(Quitanda obj) throws SQLException, ClassNotFoundException {
        System.out.println("into method update");

        Statement st = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {

            String sql = "UPDATE quitandas_quitanda SET nome = '" + obj.getNome() + "', cliente = '" + obj.getClientes() + "', funcionario = '" + obj.getFuncionarios() + "' WHERE id_quitanda = " + obj.getIdQuitanda() + ";";
            st.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Atualizar Quitanda");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }
    }
}
