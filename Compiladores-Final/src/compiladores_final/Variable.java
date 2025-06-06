/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladores_final;

/**
 *
 * @author CARLOS
 */
public class Variable {
    public String nombre;
    public Object valor;
    public String tipo;
    public String ambito;
    public String ambitoFinal;
    public Integer tamanio;
    public Integer posicion;
    
    public Variable(String nombre, String tipo, String ambito, String ambitoFinal, int tamano, int posicion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ambito = ambito;
        this.ambitoFinal = ambitoFinal;
        this.tamanio = tamano;
        this.posicion = posicion;
    }
    
    public Variable(){}
}

