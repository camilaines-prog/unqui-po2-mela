package metodosDeTraslado;

import Registros.ArchivoDeRegistros;
import metodosDePago.MetodoDePago;

public class Reserva {

    //atributos
    private MetodoDeTraslado metodoDeTraslado;
    private Direccion destino;
    private int cantidadDePasajeros;
    private MetodoDePago metodoDePago;
    private ArchivoDeRegistros archivoDeRegistros;
    private double valorTotal;

    //constructor
    public Reserva(MetodoDeTraslado metodoDeTraslado, Direccion destino , int cantidadDePasajeros, MetodoDePago metodoDePago, ArchivoDeRegistros archivoDeRegistros){
        this.metodoDeTraslado= metodoDeTraslado;
        this.destino= destino;
        this.cantidadDePasajeros= cantidadDePasajeros;
        this.metodoDePago=metodoDePago;
        this.archivoDeRegistros=archivoDeRegistros;
    }

    //getters y setters
    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public Direccion getDestino() {
        return destino;
    }

    public double getValorTotal(){return valorTotal ;}

    public ArchivoDeRegistros getArchivoDeRegistros(){
        return archivoDeRegistros;
    }

    //metodos
    public double calcularCostoDeTraslado(){
        return metodoDeTraslado.calcularCosto(this);
    }

    public void realizarPago(){
        metodoDePago.procesamientoDePago(this);
    }
}
