package metodosDePago;

public class TransferenciaBancariaDirecta extends MetodoDePago{

    //atributos
    private ValidacionTransferenciaAPI transferenciaAPI;
    private String alias;
    private int cbu;
    private boolean transferenciaInmediata;
    private String fechaTransferencia;

    //constructor
    public TransferenciaBancariaDirecta(ValidacionTransferenciaAPI transferenciaAPI, String alias,int cbu, boolean transferenciaInmediata) {
        this.transferenciaAPI=transferenciaAPI;
        this.alias=alias;
        this.cbu=cbu;
        this.transferenciaInmediata=transferenciaInmediata;
    }
    public TransferenciaBancariaDirecta(ValidacionTransferenciaAPI transferenciaAPI, String alias,int cbu, String fechaTransferencia) {
        this.transferenciaAPI=transferenciaAPI;
        this.alias=alias;
        this.cbu=cbu;
        this.fechaTransferencia=fechaTransferencia;
        this.transferenciaInmediata=false;
    }

    //getters y setters

    //metodos
    @Override
    public void ejecutarTransaccion(double monto) {
        if(transferenciaInmediata) {
            transferenciaAPI.ejecutarTransferenciaInmediata(monto);
        }else transferenciaAPI.ejecutarTransferenciaProgramada(monto,fechaTransferencia);
    }

    @Override
    public void reservarFondos() {
        //no aplica
    }

    @Override
    public boolean validarDatos() {
        return transferenciaAPI.validarCuenta(alias,cbu);
    }

    @Override
    public void notificarResultado(){
        //hacer implementacion
    }
}
