package metodosDePago;

public class TransferenciaBancariaDirecta extends MetodoDePago{

    //atributos
    private ValidacionTransferenciaAPI transferenciaAPI;

    //constructor
    public TransferenciaBancariaDirecta() {
    }

    //getters y setters
    public ValidacionTarjetaAPI getTransferenciaAPI() {
        return transferenciaAPI;
    }

    public void setTransferenciaAPI(ValidacionTarjetaAPI transferenciaAPI) {
        this.transferenciaAPI = transferenciaAPI;
    }

    //metodos
    @Override
    public void ejecutarTransaccion() {
        transferenciaAPI.ejecutarTransferencia();
    }

    @Override
    public void reservarFondos() {
        //no aplica
    }

    @Override
    public boolean validarDatos() {
        transferenciaAPI.validarCuenta();
    }
}
