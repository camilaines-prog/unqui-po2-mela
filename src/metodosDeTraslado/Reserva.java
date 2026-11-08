package metodosDeTraslado;

import Registros.ArchivoDeRegistro;
import metodosDePago.MetodoDePago;

public class Reserva {

    //atributos
    private MetodoDeTraslado metodoDeTraslado;
    private Direccion destino;
    private int cantidadDePasajeros;
    private MetodoDePago metodoDePago;
    private ArchivoDeRegistro registro;
    private double valorTotal;

    //constructor
    public Reserva(MetodoDeTraslado metodoDeTraslado, Direccion destino , int cantidadDePasajeros, MetodoDePago metodoDePago, ArchivoDeRegistro registro){
        this.metodoDeTraslado= metodoDeTraslado;
        this.destino= destino;
        this.cantidadDePasajeros= cantidadDePasajeros;
        this.metodoDePago=metodoDePago;
        this.registro=registro;
    }

    //getters y setters
    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public String getDestino() {
        return destino;
    }

    public double getValorTotal(){return valorTotal ;}

    public ArchivoDeRegistro getRegistro(){
        return registro;
    }
    //metodos
    public double calcularCostoDeTraslado(){
        return metodoDeTraslado.calcularCosto(this);
    }

    public void realizarPago(){
        metodoDePago.procesamientoDePago(this);
    }
}
