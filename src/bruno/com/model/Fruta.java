//PROJECT NAME: prjBruno-quitanda
package bruno.com.model;

/**
 *
 * @author Bruno Gressler da Silveira
 * @since 25/04/2018 - 14:00
 * @version 1.0 beta
 */
public class Fruta {
    
    private long idFruta;
    private String nome;
    private float valorCusto;
    private int quantidade;

    public Fruta() {
    }

    public long getIdFruta() {
        return idFruta;
    }

    public void setIdFruta(long idProduto) {
        this.idFruta = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
