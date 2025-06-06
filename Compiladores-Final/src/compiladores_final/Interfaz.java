/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compiladores_final;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java_cup.runtime.ComplexSymbolFactory;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class Interfaz extends javax.swing.JFrame {

    private ListaVariables variables;
    private TablaSimbolos instrucciones;
    private String salida;
    
    NumeroLinea numeroLinea;
    
    DefaultTableModel dtm = new DefaultTableModel();
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        inicializador();
        String[] titulo = new String[] {"Nombre","Tipo","Ámbito","Tamaño","Posición"};
        dtm.setColumnIdentifiers(titulo);
        jtSimbolos.setModel(dtm);
    }
    
    private void inicializador(){
        numeroLinea = new NumeroLinea(jtpCode);
        jScrollPane3.setRowHeaderView(numeroLinea);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtaResult = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jta_output = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSimbolos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtaResult.setEditable(false);
        jtaResult.setColumns(20);
        jtaResult.setRows(5);
        jScrollPane2.setViewportView(jtaResult);

        jLabel1.setText("Codigo de entrada:");

        jLabel2.setText("Codigo de salida:");

        jButton1.setText("Compilar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jta_output.setEditable(false);
        jta_output.setColumns(20);
        jta_output.setRows(5);
        jScrollPane4.setViewportView(jta_output);

        btnArchivo.setText("Abrir archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jtpCode);

        jtSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jtSimbolos);

        jLabel3.setText("Tabla de simbolos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(btnArchivo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jta_output.setText("");
        jtaResult.setText("");
        limpiarTabla();
        try {
            notificar_err("---------------Analisis iniciado---------------");
            Reader reader = new StringReader(jtpCode.getText());
            AnalisisLexico scanner = new AnalisisLexico(reader);
            ComplexSymbolFactory sf = new ComplexSymbolFactory();
            scanner.setSymbolFactory(sf);
            AnalisisSintactico parser = new AnalisisSintactico(scanner,sf);
            parser.parse();
            variables = new ListaVariables();
            salida = "";
            instrucciones = parser.instrucciones;
            //ejecutar(instrucciones);
            jtaResult.setText(salida);
            llenarTabla(instrucciones);
            notificar_err("---------------Analisis finalizado---------------");
        } catch (Exception exception) {
            System.out.println("ERR: "+exception.getMessage());
            notificar_err(exception.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            jtpCode.setText(ST);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnArchivoActionPerformed

   private void ejecutar(Nodo instrucciones) throws Exception {
        int i = 0;
        Nodo instruccion;
        while (i < instrucciones.hijos.size()) {
            instruccion = instrucciones.hijos.get(i);
            if (instruccion.valor.equals("declaracion")) {
                int c = 0;
                while(c < instruccion.hijos.get(0).hijos.get(0).hijos.size()){
                    Nodo decVar = instruccion.hijos.get(0).hijos.get(0).hijos.get(c);
                    String id = decVar.valor;
                    String tipoVar = instruccion.hijos.get(0).hijos.get(1).valor.toLowerCase();
                    String ambitoVar = instruccion.hijos.get(0).hijos.get(2).valor.toLowerCase();
                    Variable val = evaluarExpresion(instruccion.hijos.get(1));
                    //Object val = evaluarExpresion(instruccion.hijos.get(1));
                    Variable var = new Variable();
                    validarTipos(tipoVar,val.tipo);
                    var.nombre = id;
                    var.valor = val.valor;
                    var.tipo = tipoVar;
                    var.ambito = ambitoVar;
                    variables.agregar(var);
                    c++;
                }
            } else if (instruccion.valor.equals("asignacion")) {
                Variable buscar = evaluarExpresion(instruccion.hijos.get(0));
                String id = instruccion.hijos.get(0).hijos.get(0).valor;
                Variable val;
                if(instruccion.hijos.get(1).valor == "ternario")
                {
                    if((Boolean) evaluarExpresion(instruccion.hijos.get(1).hijos.get(0)).valor)
                    {
                        val = evaluarExpresion(instruccion.hijos.get(1).hijos.get(1));
                    }
                    else
                    {
                        val = evaluarExpresion(instruccion.hijos.get(1).hijos.get(2));
                    }
                }
                else
                {
                    val = evaluarExpresion(instruccion.hijos.get(1));
                }
                Variable var = new Variable();
                var.nombre = id;
                var.valor = val.valor;
                var.tipo = val.tipo;
                var.ambito = buscar.ambito;
                variables.agregar(var);
            } else if (instruccion.valor.equals("if")) {
                if ((Boolean) evaluarExpresion(instruccion.hijos.get(0)).valor) {
                    ejecutar(instruccion.hijos.get(1));
                } else {
                    if (instruccion.hijos.size() == 3) {
                        ejecutar(instruccion.hijos.get(2));
                    }
                }
            } else if (instruccion.valor.equals("while")) {
                while ((Boolean) evaluarExpresion(instruccion.hijos.get(0)).valor) {
                    ejecutar(instruccion.hijos.get(1));
                }
            } else if (instruccion.valor.equals("for")) {
                ejecutar(instruccion.hijos.get(0));
                while ((Boolean) evaluarExpresion(instruccion.hijos.get(1)).valor) {                    
                    ejecutar(instruccion.hijos.get(3));                    
                    ejecutar(instruccion.hijos.get(2));
                }
            } else if (instruccion.valor.equals("dowhile")) {
                do {
                    ejecutar(instruccion.hijos.get(1));
                } while ((Boolean) evaluarExpresion(instruccion.hijos.get(0)).valor);                
            } else if (instruccion.valor.equals("puts")) {
                salida += evaluarExpresion(instruccion.hijos.get(0)).valor+"\n";
            }
            i++;
        }
    }

    private Variable evaluarExpresion(Nodo nodo) throws Exception {
        Nodo aux = nodo.hijos.get(0);
        Variable var = new Variable();
        switch (nodo.valor) {
            case "valor":
                var.tipo = aux.valor;
                if (aux.valor.equals("int")) {
                    var.valor = Integer.valueOf(aux.hijos.get(0).valor);
                    return var;
                } else if (aux.valor.equals("double")) {
                    var.valor = Double.valueOf(aux.hijos.get(0).valor);
                    return var;
                } else if (aux.valor.equals("char")) {
                    var.valor = aux.hijos.get(0).valor.charAt(0);
                    return var;
                } else if (aux.valor.equals("boolean")) {
                    var.valor = Boolean.valueOf(aux.hijos.get(0).valor);
                    return var;
                } else {
                    var.valor = aux.hijos.get(0).valor;
                    return var;
                }
            case "variable":
                Variable varb = variables.buscar(aux.valor);
                if (varb == null) {
                    throw new Exception("No se ha declarado la variable: "+aux.valor);
                } else {
                    var.tipo = varb.tipo;
                    var.valor = varb.valor;
                    var.ambito = varb.ambito;
                    return var;
                }
            case "concatenar":
                var.tipo = "string";
                String t = "";
                for (int i = 0; i < aux.hijos.size(); i++) {
                    t += String.valueOf(evaluarExpresion(aux.hijos.get(i)).valor);
                }
                var.valor = t;
                return var;
            case "==": case "<": case "<=": case ">": case ">=": case "*": case "+":
            case "-": case "/": case "^": case "%":
            {
                Variable primera = evaluarExpresion(nodo.hijos.get(0));
                Variable segunda = evaluarExpresion(nodo.hijos.get(1));
                if(primera.tipo.equals(segunda.tipo)) // || 
                //   ((primera instanceof Integer && segunda instanceof Double) || 
                //    (primera instanceof Double && segunda instanceof Integer)))
                {
                    switch (nodo.valor) {
                        case "==":
                        {
                            var.tipo = primera.tipo;
                            var.valor = Objects.equals(primera.valor, segunda.valor);
                            return var;
                        }
                        case "<":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor < (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor < (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case "<=":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor <= (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor <= (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case ">":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor > (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor > (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case ">=":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor >= (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor >= (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case "+":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor + (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor + (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case "-":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor - (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor - (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case "*":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor * (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor * (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case "/":
                        {
                            if (primera.valor instanceof Integer) {
                                if((Integer)segunda.valor == 0.0){
                                    throw new Exception("No se puede dividir por cero");
                                }
                                var.tipo = primera.tipo;
                                var.valor = ((Integer) primera.valor / (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                if((Double)segunda.valor == 0.0){
                                    throw new Exception("No se puede dividir por cero");
                                }
                                var.tipo = primera.tipo;
                                var.valor = (Double) primera.valor / (Double) segunda.valor;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case "^":
                        {
                            if (primera.valor instanceof Integer) {
                                var.tipo = primera.tipo;
                                //var.valor = ((Integer) primera.valor ^ (Integer) segunda.valor);
                                int result = 1;
                                int base = (Integer)primera.valor;
                                int exponente = (Integer)segunda.valor;
                                if(exponente < 0){
                                    base = 1 / base;
                                    exponente = -exponente;
                                }
                                for(int i=0; i < exponente; i++){
                                    result *= base;
                                }
                                var.valor = result;
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                var.tipo = primera.tipo;
                                //var.valor = (Double) primera.valor ^ (Double) segunda.valor;
                                double result = 1.0;
                                double base = (Double)primera.valor;
                                double exponente = (Double)segunda.valor;
                                if(exponente < 0){
                                    base = 1 / base;
                                    exponente = -exponente;
                                }
                                for(int i=0; i < exponente; i++){
                                    result *= base;
                                }
                                var.valor = result;
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        case "%":
                        {
                            if (primera.valor instanceof Integer) {
                                if((Integer)segunda.valor == 0.0){
                                    throw new Exception("No se puede dividir por cero");
                                }
                                var.tipo = primera.tipo;
                                int tmp = ((Integer) primera.valor / (Integer) segunda.valor);
                                var.valor = (Integer) primera.valor - (tmp * (Integer) segunda.valor);
                                return var;
                            } else if (primera.valor instanceof Double ) {
                                if((Double)segunda.valor == 0.0){
                                    throw new Exception("No se puede dividir por cero");
                                }
                                var.tipo = primera.tipo;
                                double tmp = (Double) primera.valor / (Double) segunda.valor;
                                var.valor = (Double) primera.valor - (tmp * (Double) segunda.valor);
                                return var;
                            } else {
                                throw new Exception("No se reconoce el nodo");
                            }
                        }
                        default:
                            throw new Exception("No se reconoce el nodo: "+nodo.valor);
                    }
                }
                else
                {
                    throw new Exception("No se puede convertir "+ primera.tipo +" en "+ segunda.tipo);
                }
            }
            case "and":
            {
                var.tipo = "boolean";
                Boolean primera = (Boolean) evaluarExpresion(nodo.hijos.get(0)).valor;
                Boolean segunda = (Boolean) evaluarExpresion(nodo.hijos.get(1)).valor;
                var.valor = primera == true && segunda == true;
                return var;
            }
            case "or":
            {
                var.tipo = "boolean";
                Boolean primera = (Boolean) evaluarExpresion(nodo.hijos.get(0)).valor;
                Boolean segunda = (Boolean) evaluarExpresion(nodo.hijos.get(1)).valor;
                var.valor = primera == true || segunda == true;
                return var;
            }
            case "not":
                var.tipo = "boolean";
                var.valor = !(Boolean) evaluarExpresion(nodo.hijos.get(0)).valor;
                return var;
            /*case "==":
            {
                Object primera = evaluarExpresion(nodo.hijos.get(0));
                Object segunda = evaluarExpresion(nodo.hijos.get(1));
                if(primera.getClass().equals(segunda.getClass()))
                {
                    if (primera instanceof Integer) {
                        return Objects.equals((Integer) primera, (Integer) segunda);
                    } else if (primera instanceof String) {
                        return ((String) primera).equals((String) segunda);
                    } else if (primera instanceof Boolean) {
                        return Objects.equals((Boolean) primera, (Boolean) segunda);
                    } else {
                        throw new Exception("No se reconoce el nodo");
                    }
                }
                else
                {
                    throw new Exception("Los tipos de operandos no coinciden");
                }
            }
            case "<":
            {
                Object primera = evaluarExpresion(nodo.hijos.get(0));
                Object segunda = evaluarExpresion(nodo.hijos.get(1));
                if(primera.getClass().equals(segunda.getClass()))
                {
                    if (primera instanceof Integer) {
                        return (Integer) primera < (Integer) segunda;
                    } else {
                        throw new Exception("No se reconoce el nodo");
                    }
                }
                else
                {
                    throw new Exception("Los tipos de operandos no coinciden");
                }
            }
            case "<=":
            {
                Object primera = evaluarExpresion(nodo.hijos.get(0));
                Object segunda = evaluarExpresion(nodo.hijos.get(1));
                if(primera.getClass().equals(segunda.getClass()))
                {
                    if (primera instanceof Integer) {
                        return (Integer) primera <= (Integer) segunda;
                    } else {
                        throw new Exception("No se reconoce el nodo");
                    }
                }
                else
                {
                    throw new Exception("Los tipos de operandos no coinciden");
                }
            }
            case ">":
            {
                Object primera = evaluarExpresion(nodo.hijos.get(0));
                Object segunda = evaluarExpresion(nodo.hijos.get(1));
                if (primera instanceof Integer) {
                    return (Integer) primera > (Integer) segunda;
                } else {
                    throw new Exception("No se reconoce el nodo");
                }
            }
            case "*":
            {
                Object primera = evaluarExpresion(nodo.hijos.get(0));
                Object segunda = evaluarExpresion(nodo.hijos.get(1));
                if (primera instanceof Integer) {
                    return (Integer) primera * (Integer) segunda;
                } else {
                    throw new Exception("No se reconoce el nodo");
                }
            }
            case "+":
            {
                Object primera = evaluarExpresion(nodo.hijos.get(0));
                Object segunda = evaluarExpresion(nodo.hijos.get(1));
                if (primera instanceof Integer) {
                    return (Integer) primera + (Integer) segunda;
                } else if(primera instanceof Double) {
                    return (Double) primera + (Integer) segunda;
                } else {
                    throw new Exception("No se reconoce el nodo");
                }
            }*/
            default:
                throw new Exception("No se reconoce el nodo: "+nodo.valor);
        }
    }
    
    public Boolean validarTipos(String _tipo1, String _tipo2) throws Exception {
        if(_tipo1.equals(_tipo2))
        {
            return true;
        }
        else
        {
            throw new Exception("No se puede convertir "+ _tipo1 +" en "+ _tipo2);
        }
    }
    
    public static void notificar(String cad){
        jta_output.append(cad+"\n");
    }
    
    public static void notificar_err(String cad){
        jta_output.append(cad+"\n");
    }
    
    public void llenarTabla(ListaVariables variables){
        for(Map.Entry<String,Variable> objeto : variables.var.entrySet()) {
            Variable var = objeto.getValue();
            dtm.addRow(new Object[]{
                var.nombre,var.tipo,var.ambito,var.valor
            });
        }
    }
    
    public void llenarTabla(TablaSimbolos variables){
        List<Variable> lvar = variables.getSimbolos();
        for(Variable var : lvar) {
            dtm.addRow(new Object[]{
                var.nombre,var.tipo,var.ambitoFinal,var.tamanio,var.posicion
            });
        }
    }
    
    public void limpiarTabla(){
        int filas = dtm.getRowCount();
        for(int i=0; i<filas;i++){
            dtm.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtSimbolos;
    private javax.swing.JTextArea jtaResult;
    private static javax.swing.JTextArea jta_output;
    private javax.swing.JTextPane jtpCode;
    // End of variables declaration//GEN-END:variables
}
