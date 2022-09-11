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

    private final String SELECT = "SELECT * FROM frutas";

    public void insert(Fruta obj) throws SQLException, ClassNotFoundException {
        System.out.println("into method insert");

        Statement st;
        Connection conexaoMysqlBruno;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();
        try {
            String sql = "INSERT INTO frutas"
                    + " VALUES (NULL, '" + obj.getNome() + "'," + obj.getValorCusto() + "," + obj.getQuantidade() + ", NOW(), NOW());";
            st.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Inserir Fruta");
        } finally {
            st.close();
        }
    }

    public ArrayList<Fruta> find() throws SQLException, ClassNotFoundException {
        System.out.println("into method find");

        Statement st;
        Connection conexaoMysqlBruno;
        ArrayList<Fruta> lista;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();

        st = conexaoMysqlBruno.createStatement();

        try {
            try (ResultSet rs = st.executeQuery(this.SELECT)) {
                lista = new ArrayList<>();
                while (rs.next()) {
                    Fruta obj = new Fruta();
                    
                    obj.setIdFruta(rs.getLong("id_fruta"));
                    obj.setNome(rs.getString("nome"));
                    obj.setValorCusto(rs.getFloat("valor"));
                    obj.setQuantidade(rs.getInt("quantidade"));
                    lista.add(obj);
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Buscar Frutas");
        } finally {
            st.close();
        }

        conexaoMysqlBruno.close();

        return lista;
    }

    public ArrayList<Fruta> findBy(String query) throws SQLException, ClassNotFoundException {
        System.out.println("into method findBy");

        Statement st;
        Connection conexaoMysqlBruno;
        ArrayList<Fruta> lista = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();

        st = conexaoMysqlBruno.createStatement();

        try {
            try (ResultSet rs = st.executeQuery(this.SELECT + " " + query + ";")) {
                lista = new ArrayList<>();
                while (rs.next()) {
                    Fruta fruta = new Fruta();
                    fruta.setIdFruta(rs.getLong("id_fruta"));
                    fruta.setNome(rs.getString("nome"));
                    fruta.setValorCusto(rs.getFloat("valor"));
                    fruta.setQuantidade(rs.getInt("quantidade"));
                    lista.add(fruta);
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Buscar Fruta");
        } finally {
            st.close();
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
            String sql = "DELETE FROM frutas WHERE id_fruta = " + id + ";";
            st.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro Ao Deletar Cliente");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }
    }

    public void update(Fruta obj) throws SQLException, ClassNotFoundException {
        System.out.println("into method update");

        Statement st = null;
        Connection conexaoMysqlBruno = null;
        conexaoMysqlBruno = ConexaoMysqlBruno.conectar();
        st = conexaoMysqlBruno.createStatement();

        try {
            String sql = "UPDATE frutas SET nome = '" + obj.getNome() + "', valor = " + obj.getValorCusto() + ", quantidade = " + obj.getQuantidade() + " WHERE id_fruta = " + obj.getIdFruta() + ";";
            st.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Atualizar Fruta");
        } finally {
            st.close();
            conexaoMysqlBruno.close();
        }
    }
}
