package metodosDePago;

public interface ValidacionTarjetaAPI {

    public boolean validarTarjeta();
    public void reservarFondosBanco();
    public void ejecutarTransferencia();
}
