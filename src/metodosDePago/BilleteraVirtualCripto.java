package metodosDePago;

public class BilleteraVirtualCripto extends MetodoDePago{

    //atributos
    private ValidacionBilleteraVirtualAPI billeteraVirtualAPI;

    //constructor
    public BilleteraVirtualCripto() {
    }

    //getters y setters
    public ValidacionBilleteraVirtualAPI getBilleteraVirtualAPI() {
        return billeteraVirtualAPI;
    }

    public void setBilleteraVirtualAPI(ValidacionBilleteraVirtualAPI billeteraVirtualAPI) {
        billeteraVirtualAPI = billeteraVirtualAPI;
    }

    //metodos
    @Override
    public void ejecutarTransaccion() {
        billeteraVirtualAPI.acreditacion();
    }

    @Override
    public void reservarFondos() {
        billeteraVirtualAPI.bloquearSaldo();
    }

    @Override
    public boolean validarDatos() {
        billeteraVirtualAPI.validarSaldo();
    }
}
