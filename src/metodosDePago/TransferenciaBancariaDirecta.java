package metodosDePago;

import Registros.Comprobante;
import metodosDeTraslado.Reserva;

public abstract class TransferenciaBancariaDirecta extends MetodoDePago{

    //atributos
    protected ValidacionTransferenciaAPI transferenciaAPI;
    private String alias;
    private int cbu;

    //constructor
    public TransferenciaBancariaDirecta(ValidacionTransferenciaAPI transferenciaAPI, String alias,int cbu) {
        this.transferenciaAPI = transferenciaAPI;
        this.alias = alias;
        this.cbu = cbu;
    }

    //getters y setters

    //metodos


    @Override
    public void reservarFondos() {
        //no aplica
    }

    @Override
    public void validarDatos() {
        if(!transferenciaAPI.validarCuenta(alias,cbu)){
            throw new IllegalArgumentException("error en la validacion de cbu y alias");
        };
    }

    @Override
    public void notificarResultado(Reserva reserva){
        reserva.getRegistro().archivarRegistro(new Comprobante(this.getCodigoDeTransaccion()));

    }
}
