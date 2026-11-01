package metodosDePago;

public interface ValidacionBilleteraVirtualAPI {

    public boolean validarSaldo();
    public boolean bloquearSaldo(BilleteraVirtualCripto billeteraVirtualCripto);
    public boolean acreditacion(double monto);
    public void notificacionPush();
}
