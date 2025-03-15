/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador.sintactico.p1;

import java.util.Stack;

/**
 *
 * @author roberto
 */
public class ExpressionEvaluator {
    public static boolean evaluateExpression(String expression) {
        // Eliminar espacios en blanco
        expression = expression.replaceAll("\\s+", "");
        
        return evaluateBooleanExpression(expression);
    }
    
    private static boolean evaluateBooleanExpression(String expression) {
        if (expression.equals("true")) return true;
        if (expression.equals("false")) return false;
        
        // Buscar operaciones entre paréntesis primero
        int openIndex = expression.lastIndexOf('(');
        if (openIndex != -1) {
            int closeIndex = findClosingParenthesis(expression, openIndex);
            String subExpr = expression.substring(openIndex + 1, closeIndex);
            boolean result = evaluateBooleanExpression(subExpr);
            
            // Reemplazar la subexpresión evaluada
            String newExpr = expression.substring(0, openIndex) + 
                             (result ? "true" : "false") + 
                             expression.substring(closeIndex + 1);
            
            return evaluateBooleanExpression(newExpr);
        }
        
        // Evaluar NOT (!)
        if (expression.contains("!")) {
            int notIndex = expression.indexOf('!');
            // Si el ! está seguido por un valor booleano directo
            if (expression.substring(notIndex + 1).startsWith("true") || 
                expression.substring(notIndex + 1).startsWith("false")) {
                boolean operand = Boolean.parseBoolean(expression.substring(notIndex + 1, 
                    expression.substring(notIndex + 1).startsWith("true") ? notIndex + 5 : notIndex + 6));
                boolean result = !operand;
                
                String newExpr = expression.substring(0, notIndex) + 
                               (result ? "true" : "false") + 
                               expression.substring(notIndex + (operand ? 5 : 6));
                
                return evaluateBooleanExpression(newExpr);
            }
        }
        
        // Evaluar AND (&)
        int andIndex = expression.indexOf('&');
        if (andIndex != -1) {
            String leftExpr = expression.substring(0, andIndex);
            String rightExpr = expression.substring(andIndex + 1);
            
            boolean leftResult = evaluateBooleanExpression(leftExpr);
            boolean rightResult = evaluateBooleanExpression(rightExpr);
            
            return leftResult && rightResult;
        }
        
        // Evaluar XOR (?)
        int xorIndex = expression.indexOf('?');
        if (xorIndex != -1) {
            String leftExpr = expression.substring(0, xorIndex);
            String rightExpr = expression.substring(xorIndex + 1);
            
            boolean leftResult = evaluateBooleanExpression(leftExpr);
            boolean rightResult = evaluateBooleanExpression(rightExpr);
            
            return ((leftResult && rightResult) ? false : true);
        }
        
        // Evaluar OR (|)
        int orIndex = expression.indexOf('|');
        if (orIndex != -1) {
            String leftExpr = expression.substring(0, orIndex);
            String rightExpr = expression.substring(orIndex + 1);
            
            boolean leftResult = evaluateBooleanExpression(leftExpr);
            boolean rightResult = evaluateBooleanExpression(rightExpr);
            
            return leftResult || rightResult;
        }
        
        throw new IllegalArgumentException("Expresión no válida: " + expression);
    }
    
    private static int findClosingParenthesis(String expression, int openIndex) {
        int count = 1;
        for (int i = openIndex + 1; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') count++;
            else if (expression.charAt(i) == ')') count--;
            
            if (count == 0) return i;
        }
        throw new IllegalArgumentException("Paréntesis no equilibrados");
    }
    
    public static void main(String[] args) {
        String expression = "(false | true) & ! (true | true)";
        boolean result = evaluateExpression(expression);
        System.out.println("El resultado de evaluar '" + expression + "' es: " + result);
    }
}
