//PROJECT NAME: prjBruno-quitanda
package bruno.com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import bruno.com.model.Cliente;
import bruno.com.persistence.ConexaoMysqlBruno;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:08
 * @version 1.0 beta
 */
public class ClienteDAO {

    private final String SELECT = "SELECT * FROM clientes";

    public void insert(Cliente obj) throws SQLException, ClassNotFoundException {
        System.out.println("into method insert");

        Statement st = null;
        Connection conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();
        try {
            String sql = "INSERT INTO clientes "
                    + "VALUES (NULL, '" + obj.getNome() + "', '" + obj.getCpf() + "', " + obj.getIdade() + ", NOW(), NOW());";
            st.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Inserir Cliente");
        } finally {
            conexaoMysqlBruno.close();
            st.close();
        }
    }

    public ArrayList<Cliente> find() throws SQLException, ClassNotFoundException {
        System.out.println("into method find");

        ResultSet rs = null;
        Statement st = null;
        ArrayList<Cliente> lista = null;
        Connection conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            rs = st.executeQuery(this.SELECT + ";");
            lista = new ArrayList<>();
            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setIdCliente(rs.getLong("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setIdade(rs.getInt("idade"));
                obj.setDataRegistro(rs.getString("data_registro"));
                obj.setHoraRegistro(rs.getString("hora_registro"));
                lista.add(obj);
            }

        } catch (SQLException e) {
            throw new SQLException("Erro Ao Buscar Clientes");
        } finally {
            rs.close();
            st.close();
            conexaoMysqlBruno.close();
        }

        return lista;
    }

    public ArrayList<Cliente> findBy(String query) throws SQLException, ClassNotFoundException {
        System.out.println("into method findBy");

        ResultSet rs = null;
        Statement st = null;
        Connection conexaoMysqlBruno = null;
        ArrayList<Cliente> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();
        try {
            rs = st.executeQuery(this.SELECT + " " + query + ";");
            lista = new ArrayList<>();
            while (rs.next()) {
                Cliente obj = new Cliente();

                obj.setIdCliente(rs.getLong("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setIdade(rs.getInt("idade"));
                lista.add(obj);
            }

        } catch (SQLException e) {
            throw new SQLException("Erro Ao Buscar Cliente");
        } finally {
            st.close();
            rs.close();
            conexaoMysqlBruno.close();
        }
        return lista;
    }

    public void delete(long id) throws SQLException, ClassNotFoundException {
        System.out.println("into method delete");

        Statement st = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            String sql = "DELETE FROM clientes WHERE id_cliente = " + id + ";";
            st.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro Ao Deletar Cliente");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }
    }

    public void update(Cliente obj) throws SQLException, ClassNotFoundException {
        System.out.println("into method update");

        Statement st = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            String sql = "UPDATE clientes SET nome = '" + obj.getNome() + "', cpf = '" + obj.getCpf() + "', idade = " + obj.getIdade() + " WHERE id_cliente = " + obj.getIdCliente() + ";";
            st.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Atualizar Cliente");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }
    }
}
