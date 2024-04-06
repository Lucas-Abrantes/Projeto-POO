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
    public Reserva(Date dataAtual, int id, Date dataInicio, Date dataTermino, Date dataCheckin, Date dataCheckout,
            boolean validaReserva) {
        this.dataAtual = dataAtual;
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.dataCheckin = dataCheckin;
        this.dataCheckout = dataCheckout;
        this.validaReserva = validaReserva;
    }

    public void realizarReserva(){

    }

    public void confirmaReserva(){

    }

    public void cancelarReserva(){

    }

    public void visualizarReserva(){

    }

    public void listarReservas(){

    }

    public void realizarCheckin(Date dataCheckin){

    }

    public void realizarCheckout(Date datacheckout){

    }

    public void editarReserva(){

    }

    public void calcularCustos(){

    }

    public void excluirReserva(){

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
    
}