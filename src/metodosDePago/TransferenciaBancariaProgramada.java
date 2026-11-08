package metodosDePago;

import metodosDeTraslado.Reserva;

import java.util.Date;

public class TransferenciaBancariaProgramada extends TransferenciaBancariaDirecta{

    private Date fechaTransferencia;

    //constructor
    public TransferenciaBancariaProgramada(ValidacionTransferenciaAPI transferenciaAPI, String alias, int cbu, Date fechaTransferencia) {
        super(transferenciaAPI, alias, cbu);
        this.fechaTransferencia=fechaTransferencia;
    }

    //metodos
    @Override
    public void ejecutarTransaccion(Reserva reserva){
        transferenciaAPI.ejecutarTransferenciaProgramada(reserva.getValorTotal(),fechaTransferencia);
    }

}
