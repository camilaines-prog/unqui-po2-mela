package metodosDePago;

public class TarjetaDeCreditoInternacional extends MetodoDePago{

    //atributos
    private ValidacionTarjetaAPI tarjetaAPI;
    private String numeroTarjeta;
    private int cvv;
    private String vencimiento;

    //constructor
    public TarjetaDeCreditoInternacional(ValidacionTarjetaAPI tarjetaAPI, String numeroTarjeta, int cvv, String vencimiento) {
        this.tarjetaAPI=tarjetaAPI;
        this.numeroTarjeta=numeroTarjeta;
        this.cvv=cvv;
        this.vencimiento=vencimiento;

    }

    //getters y setters
    public ValidacionTarjetaAPI getTarjetaAPI() {
        return tarjetaAPI;
    }

    public void setTarjetaAPI(ValidacionTarjetaAPI tarjetaAPI) {
        this.tarjetaAPI = tarjetaAPI;
    }

    //metodos
    @Override
    public void ejecutarTransaccion(double monto) {
        tarjetaAPI.ejecutarTransferencia(monto);
    }

    @Override
    public void reservarFondos() {
        tarjetaAPI.preAutorizar();
    }

    @Override
    public boolean validarDatos() {
           return tarjetaAPI.validarTarjeta(numeroTarjeta,cvv,vencimiento);
    }
    @Override
    public void notificarResultado(){
        //completar despues

    }
}
