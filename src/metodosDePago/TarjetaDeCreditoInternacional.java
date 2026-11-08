package metodosDePago;

import Registros.Voucher;
import metodosDeTraslado.Reserva;

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

    //metodos
    @Override
    public void ejecutarTransaccion(Reserva reserva) {
        tarjetaAPI.ejecutarTransferencia(reserva.getValorTotal());
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
    public void notificarResultado(Reserva reserva){
        reserva.getArchivoDeRegistros().archivarRegistro(new Voucher(this.getCodigoDeTransaccion()));

    }
}
