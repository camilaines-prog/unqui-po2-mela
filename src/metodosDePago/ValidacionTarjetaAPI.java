package metodosDePago;

public interface ValidacionTarjetaAPI {

    public boolean validarTarjeta(String numeroTarjeta, int cvv, String vencimiento);
    public void reservarFondosBanco();
    public void ejecutarTransferencia();
}
