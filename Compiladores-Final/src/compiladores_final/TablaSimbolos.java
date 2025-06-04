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
    
    void entrarAmbito(String _ambito) {
        ambito.push(_ambito);
        contadorPosicion.put(_ambito, 0);
    }
    
    void salirAmbito() {
        if (!ambito.isEmpty()) {
            ambito.pop();
        }
    }
    
    String getAmbitoActual() {
        return ambito.isEmpty() ? "-" : ambito.peek();
    }
    
    void agregarSimbolo(String nombre, String tipo, int tamano) {
        String ambito = getAmbitoActual();
        int posicion = contadorPosicion.getOrDefault(ambito, 0);
        
        // Para métodos no incrementamos posición
        if (tipo.contains("()")) {
            posicion = -1; // Métodos no tienen posición específica
        }
        
        simbolos.add(new Variable(nombre, tipo, ambito, tamano, posicion));
        
        // Solo incrementar posición para variables
        if (!tipo.contains("()") && !tipo.equals("clase") && !tipo.equals("void")) {
            contadorPosicion.put(ambito, posicion + 1);
        }
    }
    
    public List getSimbolos(){
        return simbolos;
    }
    
}
