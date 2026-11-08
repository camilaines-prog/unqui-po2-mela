package metodosDePago;

import metodosDeTraslado.Reserva;

public class BilleteraVirtualCripto extends MetodoDePago{

    //atributos
    private ValidacionBilleteraVirtualAPI billeteraVirtualAPI;

    //constructor
    public BilleteraVirtualCripto(ValidacionBilleteraVirtualAPI billeteraVirtualAPI) {
        this.billeteraVirtualAPI=billeteraVirtualAPI;
    }

    //getters y setters

    //metodos
    @Override
    public void ejecutarTransaccion(Reserva reserva) {

        if (!billeteraVirtualAPI.acreditacion(reserva.getValorTotal())){
            throw new IllegalArgumentException("ocurrio un error en la acreditacion al vendedor");
        };
    }

    @Override
    public void reservarFondos() {

        if(!billeteraVirtualAPI.bloquearSaldo(this)){
            throw new IllegalArgumentException("ocurrio un error al bloquear el salgo");
        };
    }

    @Override
    public void validarDatos() {
        if (!billeteraVirtualAPI.validarSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente en la cuenta");
        };
    }
    @Override
    public void notificarResultado(Reserva reserva){
        billeteraVirtualAPI.notificacionPush();
    }
}
