//PROJECT NAME: prjBruno-quitanda
package bruno.com.services;
import bruno.com.dao.FrutaDAO;
import bruno.com.dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import bruno.com.model.Fruta;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class FrutaServices {
    
    public void insert(Fruta obj) throws SQLException, ClassNotFoundException{
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        frutaDAO.insert(obj);
    }
    
    public ArrayList<Fruta> selectAll() throws SQLException, ClassNotFoundException {
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        return frutaDAO.selectAll();
    }
    
    public ArrayList<Fruta> selectBy(String query) throws SQLException, ClassNotFoundException {
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        return frutaDAO.selectBy(query);
    }
    
    public  void delete(long id) throws SQLException, ClassNotFoundException {
      FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
      frutaDAO.delete(id);
    }
    
    public void update(Fruta obj) throws SQLException, ClassNotFoundException {
        FrutaDAO frutaDAO = DAOFactory.getFrutasDAO();
        frutaDAO.update(obj);
    }
}
