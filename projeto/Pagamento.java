package projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pagamento {

    private int id;
    private Date data;
    private float valor;
    private String metodoPagamento;
    private static List<Pagamento> pagamentos = new ArrayList<>();

    public Pagamento(int id, Date data, float valor, String metodoPagamento) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
    }
//Método para registrar o pagamento
    public void registrarPagamento(Date data, float valor, String metodoPagamento) {
        Pagamento novoPagamento = new Pagamento(pagamentos.size() + 1, data, valor, metodoPagamento);
        pagamentos.add(novoPagamento);
    }
// Método para visualizar os detalhes de um pagamento específico
    public void visualizarPagamento(int idPagamento) {
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getId() == idPagamento) {
                System.out.println(pagamento.toString());
                return;
            }
        }
        // Caso nenhum pagamento com o ID fornecido seja encontrado
        System.out.println("Pagamento não encontrado.");
    }
// Método para listar todos os pagamentos registrados
    public void listarPagamentos() {
        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.toString());
        }
    }
// Método para deletar um pagamento específico
    public void deletarPagamento(int idPagamento) {
        pagamentos.removeIf(pagamento -> pagamento.getId() == idPagamento);
    }
// Método para editar os detalhes de um pagamento existente
    public void editarPagamento(int idPagamento, Date newData, float newValor, String newMetodoPagamento) {
        for (Pagamento pagamento : pagamentos) {
            if (pagamento.getId() == idPagamento) {
                pagamento.setData(newData);
                pagamento.setValor(newValor);
                pagamento.setMetodoPagamento(newMetodoPagamento);
                return;
            }
        }
// Caso nenhum pagamento com o ID fornecido seja encontrado
        System.out.println("Pagamento não encontrado.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
        return "Pagamento [id=" + id + ", data=" + data + ", valor=" + valor + ", metodoPagamento=" + metodoPagamento + "]";
    }
}