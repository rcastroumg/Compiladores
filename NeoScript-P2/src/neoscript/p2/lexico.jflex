package neoscript.p2;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;

%%

%public
%class AnalisisLexico
%cupsym Simbolo
%cup
%unicode
%line
%column

digito  =   [0-9]
entero  =   {digito}+
letra   =   [a-zA-Z]
id      =   ({letra} | "_") ({letra} | "_" | {digito})*
espacio =   (" " | \r | \n | \t | \f)+

%{
//variables, metodos y funciones que necesite (codigo java)

  ComplexSymbolFactory symbolFactory;
  
  public void setSymbolFactory(ComplexSymbolFactory sf){
      symbolFactory = sf;
  }

  private Symbol symbol(String name, int sym) {
      return symbolFactory.newSymbol(name, sym, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+yylength(),yychar+yylength()));
  }

  private Symbol symbol(String name, int sym, Object val) {
      Location left = new Location(yyline+1,yycolumn+1,yychar);
      Location right= new Location(yyline+1,yycolumn+yylength(), yychar+yylength());
      return symbolFactory.newSymbol(name, sym, left, right,val);
  }
  private Symbol symbol(String name, int sym, Object val,int buflength) {
      Location left = new Location(yyline+1,yycolumn+yylength()-buflength,yychar+yylength()-buflength);
      Location right= new Location(yyline+1,yycolumn+yylength(), yychar+yylength());
      return symbolFactory.newSymbol(name, sym, left, right,val);
  }
  private void error(String message) {
    System.out.println("Error en linea "+(yyline+1)+", columna "+(yycolumn+1)+" caracter: "+message);
  }


%}

%eofval{
     return symbolFactory.newSymbol("EOF", Simbolo.EOF, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+1,yychar+1));
%eofval}


%%

<YYINITIAL>{
    "("     {   return symbol("PARENTESIS_ABIERTO",Simbolo.PARENTESIS_ABIERTO);    }

    ")"     {   return symbol("PARENTESIS_CERRADO",Simbolo.PARENTESIS_CERRADO);    }

    "{"     {   return symbol("LLAVE_ABIERTO",Simbolo.LLAVE_ABIERTO);    }

    "}"     {   return symbol("LLAVE_CERRADO",Simbolo.LLAVE_CERRADO);    }

    ","     {   return symbol("COMA",Simbolo.COMA);                  }

    ":"     {   return symbol("DOS_PUNTOS",Simbolo.DOS_PUNTOS);                  }

    ";"     {   return symbol("PUNTO_COMA",Simbolo.PUNTO_COMA);                  }
    
    "si"    {   return symbol("SI",Simbolo.SI);                    }

    "entonces"    {   return symbol("ENTONCES",Simbolo.ENTONCES);                    }

    "no"  {   return symbol("NO",Simbolo.NO);                  }

    "finsi"   {   return symbol("FINSI",Simbolo.FINSI);                   }

    "mientras" {   return symbol("MIENTRAS",Simbolo.MIENTRAS);                 }

    "finmientras" {   return symbol("FINMIENTRAS",Simbolo.FINMIENTRAS);                 }

    "para" {   return symbol("PARA",Simbolo.PARA);                 }

    "hasta" {   return symbol("HASTA",Simbolo.HASTA);                 }

    "paso" {   return symbol("PASO",Simbolo.PASO);                 }

    "siguiente" {   return symbol("SIGUIENTE",Simbolo.SIGUIENTE);                 }

    "hacer" {   return symbol("HACER",Simbolo.HACER);                 }

    "repetirmientras" {   return symbol("REPETIRMIENTRAS",Simbolo.REPETIRMIENTRAS);                 }

    "switch" {   return symbol("SWITCH",Simbolo.SWITCH);                 }

    "case" {   return symbol("CASE",Simbolo.CASE);                 }

    "default" {   return symbol("DEFAULT",Simbolo.DEFAULT);                 }

    "concat"    {   return symbol("CONCAT",Simbolo.CONCAT);                }

    "puts"  {   return symbol("PUTS",Simbolo.PUTS);                  }

    "or"    {   return symbol("OR",Simbolo.OR);                    }

    "and"   {   return symbol("AND",Simbolo.AND);                   }

    "not"   {   return symbol("NOT",Simbolo.NOT);                  }

    "=="    {   return symbol("IGUAL_IGUAL",Simbolo.IGUAL_IGUAL);           }

    "<"     {   return symbol("MENOR",Simbolo.MENOR);                 }

    ">"     {   return symbol("MAYOR",Simbolo.MAYOR);                 }

    "="     {   return symbol("IGUAL",Simbolo.IGUAL);                 }

    "+"     {   return symbol("MAS",Simbolo.MAS);                   }

    "*"     {   return symbol("ASTERISCO",Simbolo.ASTERISCO);             }

    {entero}    {   return symbol("ENTERO",Simbolo.ENTERO, yytext());      }

    [\"] ~[\"]  {
                String t = yytext();
                return symbol("CADENA",Simbolo.CADENA, t.substring(1, t.length() - 1));
                }

    {id}    {   return symbol("ID",Simbolo.ID, yytext());          }

    {espacio}   { }

    "/*" ~"*/"  { }

    .   {   error(yytext());      }

}