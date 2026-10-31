package metodosDePago;

public interface ValidacionBilleteraVirtualAPI {

    public boolean validarSaldo();
    public void bloquearSaldo();
    public void acreditacion();
}
