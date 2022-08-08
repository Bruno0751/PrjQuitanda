//PROJECT NAME: prjBruno-quitanda
package bruno.com.services;
import bruno.com.dao.ClienteDAO;
import bruno.com.dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import bruno.com.model.Cliente;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class ClienteServices {
    
    public void insert(Cliente obj) throws SQLException, ClassNotFoundException{
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.insert(obj);
    }
    
    public ArrayList<Cliente> find() throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        return clienteDAO.find();
    }
    
    public ArrayList<Cliente> findBy(String query) throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        return clienteDAO.findBy(query);
    }
    
    public  void delete(long id) throws SQLException, ClassNotFoundException {
      ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
      clienteDAO.delete(id);
    }
    
    public void update(Cliente obj) throws SQLException, ClassNotFoundException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.update(obj);
    }
}
