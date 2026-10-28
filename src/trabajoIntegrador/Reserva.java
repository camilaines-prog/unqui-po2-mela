package trabajoIntegrador;

public class Reserva {
    private MetodoDeTraslado metodoDeTraslado;
    private Direccion destino;
    private int cantidadDePasajeros;

    //constructor

    public Reserva(MetodoDeTraslado metodoDeTraslado, Direccion destino , int cantidadDePasajeros){
        this.metodoDeTraslado= metodoDeTraslado;
        this.destino= destino;
        this.cantidadDePasajeros= cantidadDePasajeros;
    }

    //metodos

    public double calcularCostoDeTraslado(){
        return metodoDeTraslado.calcularCosto(this);
    }

    //getters y setters

    public MetodoDeTraslado getMetodoDeTraslado() {
        return metodoDeTraslado;
    }

    public void setMetodoDeTraslado(MetodoDeTraslado metodoDeTraslado) {
        this.metodoDeTraslado = metodoDeTraslado;
    }

    public Direccion getDestino() {
        return destino;
    }

    public void setDestino(Direccion destino) {
        this.destino = destino;
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
}
