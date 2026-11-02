package metodosDeTraslado;

import metodosDePago.MetodoDePago;

public class Reserva {

    //atributos
    private MetodoDeTraslado metodoDeTraslado;
    private Direccion destino;
    private int cantidadDePasajeros;
    private MetodoDePago metodoDePago;

    //constructor
    public Reserva(MetodoDeTraslado metodoDeTraslado, Direccion destino , int cantidadDePasajeros, MetodoDePago metodoDePago){
        this.metodoDeTraslado= metodoDeTraslado;
        this.destino= destino;
        this.cantidadDePasajeros= cantidadDePasajeros;
        this.metodoDePago=metodoDePago;
    }

    //getters y setters
    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public Direccion getDestino() {
        return destino;
    }

    //metodos
    public double calcularCostoDeTraslado(){
        return metodoDeTraslado.calcularCosto(this);
    }

    public double calcularValorTotal() { return 0.0;};

    public void realizarPago(){
        metodoDePago.procesamientoDePago(this);
    }
}
