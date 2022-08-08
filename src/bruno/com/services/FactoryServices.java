//PROJECT NAME: prjBruno-quitanda
package bruno.com.services;
/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:04
 * @version 1.0 beta
 */
public class FactoryServices {
    
    private static final FrutaServices FRUTASERVICES = new FrutaServices();
    private static final QuitandaServices QUITANDASERVICES = new QuitandaServices();
    private static final ClienteServices CLIENTEERVICES = new ClienteServices();
    
    public static FrutaServices getFrutasServices(){
        return FRUTASERVICES;
    }
    
    public static QuitandaServices getQuitandaServices(){
        return QUITANDASERVICES;
    }
    
    public static ClienteServices getClieteServices(){
        return CLIENTEERVICES;
    }
    
}
