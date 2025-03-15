/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automatapila;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Carlos
 */
public class Automata {

    Stack<String> pila = new Stack<>();

    public boolean parsear(LinkedList<Simbolo> entrada) {

        pila.push("$");
        pila.push("E");
        return reconocer(entrada);

    }

    private boolean reconocer(LinkedList<Simbolo> entrada) {
        boolean aceptar = true;
        switch (entrada.getFirst().token) {
            case "+" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        aceptar = false;
                    }
                    case "E'" -> {
                        pila.pop();
                        pila.push("E'");
                        pila.push("T");
                        pila.push("+");
                        aceptar = reconocer(entrada);
                    }
                    case "T" -> {
                        aceptar = false;
                    }
                    case "T'" -> {
                        pila.pop();
                        aceptar = reconocer(entrada);
                    }
                    case "F" -> {
                        aceptar = false;
                    }
                    case "+"->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case "-" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        aceptar = false;
                    }
                    case "E'" -> {
                        pila.pop();
                        pila.push("E'");
                        pila.push("T");
                        pila.push("-");
                        aceptar = reconocer(entrada);
                    }
                    case "T" -> {
                        aceptar = false;
                    }
                    case "T'" -> {
                        pila.pop();
                        aceptar = reconocer(entrada);
                    }
                    case "F" -> {
                        aceptar = false;
                    }
                    case "-"->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case "*" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        aceptar = false;
                    }
                    case "E'" -> {
                       aceptar = false;
                    }
                    case "T" -> {
                        aceptar = false;
                    }
                    case "T'" -> {
                        pila.pop();
                        pila.push("T'");
                        pila.push("F");
                        pila.push("*");
                        aceptar = reconocer(entrada);
                    }
                    case "F" -> {
                        aceptar = false;
                    }
                    case "*"->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case "/" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        aceptar = false;
                    }
                    case "E'" -> {
                       aceptar = false;
                    }
                    case "T" -> {
                        aceptar = false;
                    }
                    case "T'" -> {
                        pila.pop();
                        pila.push("T'");
                        pila.push("F");
                        pila.push("/");
                        aceptar = reconocer(entrada);
                    }
                    case "F" -> {
                        aceptar = false;
                    }
                    case "/"->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case "(" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        pila.pop();
                        pila.push("E'");
                        pila.push("T");
                        aceptar = reconocer(entrada);
                    }
                    case "E'" -> {
                       aceptar = false;
                    }
                    case "T" -> {
                        pila.pop();
                        pila.push("T'");
                        pila.push("F");
                        aceptar = reconocer(entrada);
                    }
                    case "T'" -> {
                         aceptar = false;
                    }
                    case "F" -> {
                        pila.pop();
                        pila.push(")");
                        pila.push("E");
                        pila.push("(");
                        aceptar = reconocer(entrada);
                    }
                    case "("->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case ")" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        aceptar = false;
                    }
                    case "E'" -> {
                       pila.pop();
                       aceptar = reconocer(entrada);
                    }
                    case "T" -> {
                        aceptar = false;
                    }
                    case "T'" -> {
                        pila.pop();
                        aceptar = reconocer(entrada);
                    }
                    case "F" -> {
                        aceptar = false;
                    }
                    case ")"->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case "num" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        pila.pop();
                        pila.push("E'");
                        pila.push("T");
                        aceptar = reconocer(entrada);
                    }
                    case "E'" -> {
                       aceptar = false;
                    }
                    case "T" -> {
                        pila.pop();
                        pila.push("T'");
                        pila.push("F");
                        aceptar = reconocer(entrada);
                    }
                    case "T'" -> {
                         aceptar = false;
                    }
                    case "F" -> {
                        pila.pop();
                        pila.push("num");                   
                        aceptar = reconocer(entrada);
                    }
                    case "num"->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case "id" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        pila.pop();
                        pila.push("E'");
                        pila.push("T");
                        aceptar = reconocer(entrada);
                    }
                    case "E'" -> {
                       aceptar = false;
                    }
                    case "T" -> {
                        pila.pop();
                        pila.push("T'");
                        pila.push("F");
                        aceptar = reconocer(entrada);
                    }
                    case "T'" -> {
                         aceptar = false;
                    }
                    case "F" -> {
                        pila.pop();
                        pila.push("id");                   
                        aceptar = reconocer(entrada);
                    }
                    case "id"->{
                        pila.pop();
                        entrada.removeFirst();
                        aceptar = reconocer(entrada);
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
            case "$" -> {
                switch (pila.peek()) {
                    case "E" -> {
                        aceptar = false;
                    }
                    case "E'" -> {
                       pila.pop();
                       aceptar = reconocer(entrada);
                    }
                    case "T" -> {
                        aceptar = false;
                    }
                    case "T'" -> {
                        pila.pop();
                        aceptar = reconocer(entrada);
                    }
                    case "F" -> {
                        aceptar = false;
                    }
                    case "$"->{
                        return true;
                    }
                    default ->{
                        aceptar = false;
                    }                    
                }
            }
        }

        return aceptar;
    }

}
