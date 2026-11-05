package metodosDePago;

public class TarjetaDeCreditoInternacional extends MetodoDePago{

    //atributos
    private ValidacionTarjetaAPI tarjetaAPI;
    private String numeroTarjeta;
    private int cvv;
    private String vencimiento;
    private RegistroVoucher registroDeVoucher;

    //constructor
    public TarjetaDeCreditoInternacional(ValidacionTarjetaAPI tarjetaAPI, String numeroTarjeta, int cvv,RegistroVoucher registroDeVoucher, String vencimiento) {
        this.tarjetaAPI=tarjetaAPI;
        this.numeroTarjeta=numeroTarjeta;
        this.cvv=cvv;
        this.vencimiento=vencimiento;
        this.registroDeVoucher=registroDeVoucher;
    }

    //getters y setters



    //metodos
    @Override
    public void ejecutarTransaccion(double monto) {
        tarjetaAPI.ejecutarTransferencia(monto);
    }

    @Override
    public void reservarFondos() {

        if (!tarjetaAPI.preAutorizar()){
            throw new IllegalArgumentException("pre-autorizacion denegada");
        };
    }

    @Override
    public void validarDatos() {
           if (!tarjetaAPI.validarTarjeta(numeroTarjeta,cvv,vencimiento)){
               throw new IllegalArgumentException("error en la validacion de datos");
           };
    }

    @Override
    public void notificarResultado(){
        registroDeVoucher.registrar(new Voucher(this.getCodigoDeTransaccion()));

    }
}
