package metodosDePago;

public abstract class MetodoDePago {

    //atributos
    private MetodoDePago metodoDePago;

    //constructor
    public MetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
    public MetodoDePago() {

    }

    //getters y setters
    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    //metodos
    public void procesamientoDePago(){
        metodoDePago.validarDatos();
        metodoDePago.reservarFondos();
        metodoDePago.ejecutarTransaccion();
        metodoDePago.notificarResultado();
    }

    public abstract void ejecutarTransaccion();

    public abstract void reservarFondos() ;

    public abstract void validarDatos() ;

    public void notificarResultado() {
        //hook method
    }
}
