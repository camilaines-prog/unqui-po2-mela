package metodosDePago;

public interface ValidacionTransferenciaAPI {

    public boolean validarCuenta(String alias, int cbu);
    public void ejecutarTransferenciaInmediata(double monto);
    public void ejecutarTransferenciaProgramada(double monto,String fecha);
}
