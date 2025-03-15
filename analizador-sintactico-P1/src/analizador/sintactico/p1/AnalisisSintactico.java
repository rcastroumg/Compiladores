/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador.sintactico.p1;

import java.util.Arrays;
import java.util.Stack;
import java.util.LinkedList;

/**
 *
 * @author roberto
 */
public class AnalisisSintactico {
    
    // Pila de análisis sintáctico
    Stack<String> pila = new Stack<>();
        
    public boolean parsear(String inputString, LinkedList<Simbolo> entrada) {
        // Agregar el símbolo de fin de entrada
        Simbolo s = new Simbolo();
        s.lexema = "$";
        s.token = "$";
        entrada.add(s);

        
        pila.push("$");
        pila.push("E");

        System.out.println("Pila inicial: " + pila);
        System.out.println("Entrada: " + inputString);

        boolean res = resultado(entrada);
        System.out.println("\nLa cadena es aceptada: "+res);
        
        if(res){
            System.out.println("\nResultado: "+Boolean.parseBoolean(inputString));
            System.out.println(Boolean.getBoolean("true"));
            System.out.println(false | ! false & true);
        }
        
        /*if(res == true){
            System.out.println("\n La cadena es aceptada por la gramática.");
        } else {
            System.out.println("\n Error: La entrada no se consumió completamente.");
        }*/
        return res;

        // Si la entrada esta vacía
        /*if(entrada.isEmpty()) {
            System.out.println("\n La cadena es aceptada por la gramática.");
            System.out.println(true | false);
            return true;
        } else {
            System.out.println("\n Error: La entrada no se consumió completamente.");
            return false;
        }*/
    }
    
    private boolean resultado(LinkedList<Simbolo> entrada){
        //while (!pila.isEmpty()) {
            System.out.println(pila);
            String topPila = pila.pop();
            String tokenActual = entrada.getFirst().lexema;

            System.out.println("\nTop de la pila: " + topPila + ", Entrada actual: " + tokenActual);

            // Si el top es un terminal o el símbolo de fin de entrada
            if (topPila.equals(tokenActual)) {
                if(tokenActual.equals("$"))
                    return true;
                
                System.out.println("Coincidencia: '" + topPila + "' == '" + tokenActual + "', avanzando en la entrada");
                entrada.removeFirst();
                return resultado(entrada);
            } 
            // Si el top es un no terminal
            else {
                java.util.List<String> production = getProduction(topPila, tokenActual);

                if (production != null) {
                    System.out.println("Expandiendo " + topPila + " → " + String.join(" ", production));

                    if(!production.get(0).equals("e"))
                    {
                        // Se guarda en orden inverso
                        java.util.Collections.reverse(production);
                        for (String symbol : production) {
                            pila.push(symbol);
                        }
                        java.util.Collections.reverse(production); // Restaurar el orden original
                    }
                    return resultado(entrada);
                } else {
                    System.out.println("Error: No hay producción para " + topPila + " con entrada '" + tokenActual + "'");
                    return false;
                }
            }
        //}
    }
    
    // Función que devuelve la producción según la gramática
    private static java.util.List<String> getProduction(String nonTerminal, String terminal) {
        switch (nonTerminal) {
            case "E" -> {
                if (terminal.equals("!")) return Arrays.asList("T", "E'");
                if (terminal.equals("true")) return Arrays.asList("T", "E'");
                if (terminal.equals("false")) return Arrays.asList("T", "E'");
                if (terminal.equals("(")) return Arrays.asList("T", "E'");
            }
            case "E'" -> {
                if (terminal.equals("|")) return Arrays.asList("|", "T", "E'");
                if (terminal.equals(")")) return Arrays.asList("e");
                if (terminal.equals("$")) return Arrays.asList("e");
            }
            case "T" -> {
                if (terminal.equals("!")) return Arrays.asList("G", "T'");
                if (terminal.equals("true")) return Arrays.asList("G", "T'");
                if (terminal.equals("false")) return Arrays.asList("G", "T'");
                if (terminal.equals("(")) return Arrays.asList("G", "T'");
            }
            case "T'" -> {
                if (terminal.equals("&")) return Arrays.asList("&", "G", "T'");
                if (terminal.equals("|")) return Arrays.asList("e");
                if (terminal.equals(")")) return Arrays.asList("e");
                if (terminal.equals("$")) return Arrays.asList("e");
            }
            case "G" -> {
                if (terminal.equals("!")) return Arrays.asList("!", "G");
                if (terminal.equals("true")) return Arrays.asList("F");
                if (terminal.equals("false")) return Arrays.asList("F");
                if (terminal.equals("(")) return Arrays.asList("F");
            }
            case "F" -> {
                if (terminal.equals("true")) return Arrays.asList("true");
                if (terminal.equals("false")) return Arrays.asList("false");
                if (terminal.equals("(")) return Arrays.asList("(", "E", ")");
            }
        }
        return null; // No hay producción válida
    }
}
