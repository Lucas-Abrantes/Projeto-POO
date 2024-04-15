package projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Reserva{
    Date dataAtual = new Date();
    int id;
    Date dataInicio, dataTermino, dataCheckin, dataCheckout;
    boolean validaReserva;

    //Construtor
    public Reserva(Date dataAtual, int id, Date dataInicio, Date dataTermino, Date dataCheckin, Date dataCheckout, boolean validaReserva) {
        this.dataAtual = dataAtual;
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.validaReserva = validaReserva;
    }

    //Gets e Sets
    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public Date getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(Date dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public boolean isValidaReserva() {
        return validaReserva;
    }

    public void setValidaReserva(boolean validaReserva) {
        this.validaReserva = validaReserva;
    }

    //ToString
    @Override
    public String toString() {
        return "Reserva [dataAtual=" + dataAtual + ", id=" + id + ", dataInicio=" + dataInicio + ", dataTermino="
                + dataTermino + ", dataCheckin=" + dataCheckin + ", dataCheckout=" + dataCheckout + ", validaReserva="
                + validaReserva + "]";
    }
    
    //metodos
    public void realizarReserva() {
        if (validaReserva) {
            System.out.println("A reserva já foi realizada anteriormente.");
        } else {
            validaReserva = true;
            System.out.println("Reserva realizada com sucesso.");
        }
    }

    public void confirmaReserva() {
        if (validaReserva) {
            System.out.println("A reserva já foi confirmada anteriormente.");
        } else {
            validaReserva = true;
            System.out.println("Reserva confirmada.");
        }
    }

    public void cancelarReserva() {
        if (!validaReserva) {
            System.out.println("A reserva já foi cancelada anteriormente.");
        } else {
            validaReserva = false;
            System.out.println("Reserva cancelada.");
        }
    }

    public void visualizarReserva() {
        System.out.println("ID da reserva: " + id);
        System.out.println("Data de início: " + dataInicio);
        System.out.println("Data de término: " + dataTermino);
        System.out.println("Data de check-in: " + dataCheckin);
        System.out.println("Data de check-out: " + dataCheckout);
        System.out.println("Status da reserva: " + (validaReserva ? "Confirmada" : "Cancelada"));
    }

    public void listarReservas() {
        System.out.println("Listando todas as reservas...");
    }

    public void realizarCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
        System.out.println("Check-in realizado em " + dataCheckin);
    }

    public void realizarCheckout(Date dataCheckout) {
        this.dataCheckout = dataCheckout;
        System.out.println("Check-out realizado em " + dataCheckout);
    }

    public void editarReserva() {
        System.out.println("Reserva editada.");
    }

    public void calcularCustos() {
        // Implementação para calcular custos
        System.out.println("Custos calculados.");
    }

    public void excluirReserva() {
        System.out.println("Reserva excluída.");
    }

    public static void main(String[] args) {

        
    }

}