package projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pagamento {

    int id;
    Date Data;
    float valor;
    String metodoPagamento;

    public Pagamento(int id, Date data, float valor, String metodoPagamento) {
        this.id = id;
        Data = data;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
    }
    public void RegistrarPagamento (Date Data, float valor, String metodoPagamento) {

    }  
    public void visualizarPagamento() {

    }
    public void listarPagamento() {

    }
    public void deletarPagamento() {

    }
    public void editarPagamento() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getData() {
        return Data;
    }
    public void setData(Date data) {
        Data = data;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    @Override
    public String toString() {
        return "Pagamento [id=" + id + ", Data=" + Data + ", valor=" + valor + ", metodoPagamento=" + metodoPagamento
                + "]";
    }

}