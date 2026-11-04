package metodosDeTraslado;

import metodosDePago.MetodoDePago;

public class Reserva {

    //atributos
    private MetodoDeTraslado metodoDeTraslado;
    private Direccion destino;
    private int cantidadDePasajeros;
    private MetodoDePago metodoDePago;
    private double valorTotal;

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

    public double getValorTotal(){return valorTotal ;}

    //metodos
    public double calcularCostoDeTraslado(){
        return metodoDeTraslado.calcularCosto(this);
    }


    public void realizarPago(){
        metodoDePago.procesamientoDePago(this.getValorTotal());
    }
}
