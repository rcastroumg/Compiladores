package compiladores_final;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import compiladores_final.Interfaz;

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
double =   {digito}+ "." {digito}+
letra   =   [a-zA-Z]
id      =   ({letra} | "_") ({letra} | "_" | {digito})*
tipo    =   ([iI][nN][tT] | [sS][tT][rR][iI][nN][gG] | [cH][hH][aA][rR] | [bB][oO][oO][lL][eE][aA][nN] | [dD][oO][uU][bB][lL][eE] | [fF][lL][oO][aA][tT] )
espacio =   (" " | \r | \n | \t | \f)+
boolean =   ("true" | "false")

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
    System.out.println("Error lexico en linea "+(yyline+1)+", columna "+(yycolumn+1)+" caracter: "+message);
    String errLex = "Error lexico en linea "+(yyline+1)+", columna "+(yycolumn+1)+" caracter: "+message;
    Interfaz.notificar_err(errLex);
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

    ";"     {   return symbol("PUNTO_COMA",Simbolo.PUNTO_COMA,yytext());                  }

    "&"     {   return symbol("AMPERSAND",Simbolo.AMPERSAND);                  }

    "?"     {   return symbol("TERNARIO",Simbolo.TERNARIO);                  }
    
    [iI][fF]    {   return symbol("IF",Simbolo.IF);                    }

    [eE][lL][sS][eE]  {   return symbol("ELSE",Simbolo.ELSE);                  }

    [wW][hH][iI][lL][eE] {   return symbol("WHILE",Simbolo.WHILE);                 }

    [fF][oO][rR] {   return symbol("FOR",Simbolo.FOR);                 }

    [cC][lL][aA][sS][eE] { return symbol("CLASE",Simbolo.CLASE);    }

    [vV][oO][iI][dD] { return symbol("VOID",Simbolo.VOID);    }

    [rR][eE][tT][uU][rR][nN] { return symbol("RETURN",Simbolo.RETURN);    }

    "||"    {   return symbol("OR",Simbolo.OR);                    }

    "&&"   {   return symbol("AND",Simbolo.AND);                   }

    "!"   {   return symbol("NOT",Simbolo.NOT);                  }

    "=="    {   return symbol("IGUAL_IGUAL",Simbolo.IGUAL_IGUAL);           }

    "<"     {   return symbol("MENOR",Simbolo.MENOR);                 }

    ">"     {   return symbol("MAYOR",Simbolo.MAYOR);                 }

    "="     {   return symbol("IGUAL",Simbolo.IGUAL);                 }

    "+"     {   return symbol("MAS",Simbolo.MAS);                   }

    "-"     {   return symbol("MENOS",Simbolo.MENOS);               }

    "*"     {   return symbol("ASTERISCO",Simbolo.ASTERISCO);             }

    "/"     {   return symbol("SLASH",Simbolo.SLASH);                     }

    "^"     {   return symbol("POTENCIA",Simbolo.POTENCIA);             }

    "%"     {   return symbol("MODULO",Simbolo.MODULO);                 }

    {tipo}      {   return symbol("TIPO",Simbolo.TIPO,yytext());             }

    {entero}    {   return symbol("ENTERO",Simbolo.ENTERO, yytext());      }
    
    {double}    {   return symbol("DOUBLE",Simbolo.DOUBLE, yytext());      }

    {boolean}    {   return symbol("BOOLEANO",Simbolo.BOOLEANO, yytext());      }

    [\"] ~[\"]  {
                String t = yytext();
                return symbol("CADENA",Simbolo.CADENA, t.substring(1, t.length() - 1));
                }

    [\'] [^\'\\] [\']  {
                String t = yytext();
                return symbol("CARACTER",Simbolo.CARACTER, t.substring(1, t.length() - 1));
                }

    {id}    {   return symbol("ID",Simbolo.ID, yytext());          }

    {espacio}   { }

    "/*" ~"*/"  { }

    "#" [^\n]* { }

    .   {   error(yytext());      }

}