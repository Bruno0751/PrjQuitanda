//PROJECT NAME: prjBruno-quitanda
package bruno.com.model;

import java.util.Date;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:00
 * @version 1.0 beta
 */
public class Cliente {

    private long idCliente;
    private String nome;
    private String cpf;
    private Integer idade;
    private String dataRegistro;
    private String horaRegistro;

    public Cliente() {
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(String horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", dataRegistro=" + dataRegistro + ", horaRegistro=" + horaRegistro + '}';
    }

}
