//PROJECT NAME: prjBruno-quitanda
package bruno.com.dao;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:09
 * @version 1.0 beta
 */
public class DAOFactory {
    
    private static final FrutaDAO FRUtadao = new FrutaDAO();
    private static final QuitandaDAO quitandadao = new QuitandaDAO();
    private static final ClienteDAO clientedao = new ClienteDAO();
    
    public static FrutaDAO getFrutasDAO(){
        return FRUtadao;
    }
    
    public static QuitandaDAO getQuitandaDAO(){
        return quitandadao;
    }
    
    public static ClienteDAO getClienteDAO(){
        return clientedao;
    }
}
