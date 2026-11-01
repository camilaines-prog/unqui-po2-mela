package metodosDePago;

public class BilleteraVirtualCripto extends MetodoDePago{

    //atributos
    private ValidacionBilleteraVirtualAPI billeteraVirtualAPI;

    //constructor
    public BilleteraVirtualCripto() {
    }

    //getters y setters

    //metodos
    @Override
    public void ejecutarTransaccion(double monto) {
        billeteraVirtualAPI.acreditacion();
    }

    @Override
    public void reservarFondos() {
        billeteraVirtualAPI.bloquearSaldo();
    }

    @Override
    public boolean validarDatos() {
        return billeteraVirtualAPI.validarSaldo();
    }
}
