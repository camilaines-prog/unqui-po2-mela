package metodosDePago;

import metodosDeTraslado.Reserva;

public class TransferenciaBancariaInmediata extends TransferenciaBancariaDirecta{


    //constructor
    public TransferenciaBancariaInmediata(ValidacionTransferenciaAPI transferenciaAPI, String alias, int cbu) {
        super(transferenciaAPI, alias, cbu);
    }

    //metodos
    @Override
    public void ejecutarTransaccion(Reserva reserva){
        transferenciaAPI.ejecutarTransferenciaInmediata(reserva.getValorTotal());
    }
}
