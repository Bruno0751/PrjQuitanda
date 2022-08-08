//PROJECT NAME: prjBruno-quitanda
package bruno.com.model;

import java.util.Date;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:00
 * @version 1.0 beta
 */
public class Quitanda {
    
    private long idQuitanda;
    private String nome;
    private String clientes;
    private String funcionarios;
    private Date dataRegistro;

    public Quitanda() {
    }

    public long getIdQuitanda() {
        return idQuitanda;
    }

    public void setIdQuitanda(long idQuitanda) {
        this.idQuitanda = idQuitanda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    
    
}
