package metodosDePago;

public class BilleteraVirtualCripto extends MetodoDePago{

    //atributos
    private ValidacionBilleteraVirtualAPI billeteraVirtualAPI;

    //constructor
    public BilleteraVirtualCripto() {
    }

    //getters y setters

    //metodos
    @Override
    public void ejecutarTransaccion(double monto) {

        if (!billeteraVirtualAPI.acreditacion(monto)){
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
    public void notificarResultado(){
        billeteraVirtualAPI.notificacionPush();
    }
}
