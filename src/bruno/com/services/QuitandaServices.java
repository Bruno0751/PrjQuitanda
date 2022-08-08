//PROJECT NAME: prjBruno-quitanda
package bruno.com.services;
import bruno.com.dao.DAOFactory;
import bruno.com.dao.QuitandaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import bruno.com.model.Quitanda;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class QuitandaServices {
    
    public void insert(Quitanda quitanda) throws SQLException, ClassNotFoundException{
        QuitandaDAO quitandaDAO = DAOFactory.getQuitandaDAO();
        quitandaDAO.insert(quitanda);
    }
    
    public ArrayList<Quitanda> select() throws SQLException, ClassNotFoundException {
        QuitandaDAO quitandaDAO = DAOFactory.getQuitandaDAO();
        return quitandaDAO.select();
    }
    
    public ArrayList<Quitanda> filter(String query) throws SQLException, ClassNotFoundException {
        QuitandaDAO quitandaDAO = DAOFactory.getQuitandaDAO();
        return quitandaDAO.filter(query);
    }
    
    public  void deletarQuitanda(long id) throws SQLException, ClassNotFoundException {
      QuitandaDAO quitandaDAO = DAOFactory.getQuitandaDAO();
      quitandaDAO.delte(id);
    }
    
    public void update(Quitanda quitanda) throws SQLException, ClassNotFoundException {
        QuitandaDAO quitandaDAO = DAOFactory.getQuitandaDAO();
        quitandaDAO.update(quitanda);
    }
}
