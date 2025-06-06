/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compiladores_final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author roberto
 */
public class TablaSimbolos {
    private List<Variable> simbolos = new ArrayList<>();
    private Stack<String> ambito = new Stack<>();
    private Stack<String> ambitoFinal = new Stack<>();
    private Map<String, Integer> contadorPosicion = new HashMap<>();
    private Map<String, Integer> contadorTamano = new HashMap<>();
    
    void entrarAmbito(String _ambito, Boolean _esFinal) {
        if(!_esFinal)
        {
            ambito.push(_ambito);
        }
        ambitoFinal.push(_ambito);
        //contadorPosicion.put(_ambito, 0);
    }
    
    void salirAmbito(Boolean _esFinal) {
        if (!ambito.isEmpty()) {
            if(!_esFinal)
            {
                ambito.pop();
            }
            ambitoFinal.pop();
        }
    }
    
    String getAmbitoActual() {
        return ambito.isEmpty() ? "-" : ambito.peek();
    }
    String getAmbitoFinalActual() {
        return ambitoFinal.isEmpty() ? "-" : ambitoFinal.peek();
    }
    
    public boolean actualizarTamanioSimbolo(String nombre, int nuevoTamanio) {
        for (Variable v : simbolos) {
            if (v.nombre.equals(nombre)) {
                v.tamanio = nuevoTamanio;
                return true; // Se actualizó correctamente
            }
        }
        return false; // No se encontró el símbolo
    }
    
    void agregarSimbolo(String nombre, String tipo, int tamano) {
        String ambito = getAmbitoActual();
        String ambitoFinal = getAmbitoFinalActual();
        int posicion = contadorPosicion.getOrDefault(ambito, 1);        
        
        // Para métodos no incrementamos posición
        if (tipo.contains("()")) {
            posicion = 0; // Métodos no tienen posición específica
            tamano = contadorTamano.getOrDefault(nombre, 0);
            if(tipo.contains("void"))
                tamano += 1;
            else
                tamano += 2;
            
            actualizarTamanioSimbolo(nombre,tamano);
            contadorTamano.put(nombre, tamano);
        }
        if(tipo.equals("clase")) {
            posicion = 0; // Clases no tienen posición específica
            tamano = contadorTamano.getOrDefault(nombre, 0);
            actualizarTamanioSimbolo(nombre,tamano);
            contadorTamano.put(nombre, tamano);
            contadorPosicion.put(nombre, posicion);
        }
        
        simbolos.add(new Variable(nombre, tipo, ambito, ambitoFinal, tamano, posicion));
        
        // Solo incrementar posición para variables
        if (!tipo.contains("()") && !tipo.equals("clase") && !tipo.equals("void")) {
            contadorPosicion.put(ambito, posicion + 1);
            
            String ambitoPrincipal = ambito.substring(ambito.lastIndexOf('.') + 1);
            int tamanio = contadorTamano.getOrDefault(ambitoPrincipal, 0);
            actualizarTamanioSimbolo(ambitoPrincipal,tamanio+1);
            contadorTamano.put(ambitoPrincipal, tamanio+1);
        }
    }
    
    public List getSimbolos(){
        return simbolos;
    }
    
}
