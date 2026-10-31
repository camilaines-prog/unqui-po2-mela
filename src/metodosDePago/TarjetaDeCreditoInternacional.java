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
    public void ejecutarTransaccion() {
        tarjetaAPI.ejecutarTransferencia();
    }

    @Override
    public void reservarFondos() {
        tarjetaAPI.reservarFondosBanco();
    }

    @Override
    public boolean validarDatos() {
            tarjetaAPI.validarTarjeta(numeroTarjeta,cvv,vencimiento);
    }
}
