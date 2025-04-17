package neoscript.p2;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import neoscript.p2.Interfaz;

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
tipo    =   ([iI][nN][tT] | [sS][tT][rR][iI][nN][gG] | [cH][hH][aA][rR] | [bB][oO][oO][lL][eE][aA][nN] | [dD][oO][uU][bB][lL][eE])
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

    ","     {   return symbol("COMA",Simbolo.COMA);                  }

    ":"     {   return symbol("DOS_PUNTOS",Simbolo.DOS_PUNTOS);                  }

    ";"     {   return symbol("PUNTO_COMA",Simbolo.PUNTO_COMA,yytext());                  }

    "&"     {   return symbol("AMPERSAND",Simbolo.AMPERSAND);                  }
    
    [sS][iI]    {   return symbol("SI",Simbolo.SI);                    }

    [eE][nN][tT][oO][nN][cC][eE][sS]  {   return symbol("ENTONCES",Simbolo.ENTONCES);                    }

    [nN][oO]  {   return symbol("NO",Simbolo.NO);                  }

    [fF][iI][nN][sS][iI]  {   return symbol("FINSI",Simbolo.FINSI);                   }

    [mM][iI][eE][nN][tT][rR][aA][sS] {   return symbol("MIENTRAS",Simbolo.MIENTRAS);                 }

    [fF][iI][nN][mM][iI][eE][nN][tT][rR][aA][sS] {   return symbol("FINMIENTRAS",Simbolo.FINMIENTRAS);                 }

    [pP][aA][rR][aA] {   return symbol("PARA",Simbolo.PARA);                 }

    [hH][aA][sS][tT][aA] {   return symbol("HASTA",Simbolo.HASTA);                 }

    [pP][aA][sS][oO] {   return symbol("PASO",Simbolo.PASO);                 }

    [sS][iI][gG][uU][iI][eE][nN][tT][eE] {   return symbol("SIGUIENTE",Simbolo.SIGUIENTE);                 }

    [hH][aA][cC][eE][rR] {   return symbol("HACER",Simbolo.HACER);                 }

    [rR][eE][pP][eE][tT][iI][rR][mM][iI][eE][nN][tT][rR][aA][sS] {   return symbol("REPETIRMIENTRAS",Simbolo.REPETIRMIENTRAS);                 }

    [sS][eE][lL][eE][cC][cC][iI][oO][nN][aA][rR] {   return symbol("SELECCIONAR",Simbolo.SELECCIONAR);                 }

    [cC][aA][sS][oO] {   return symbol("CASO",Simbolo.CASO);                 }

    [cC][oO][nN][tT][rR][aA][rR][iI][oO] {   return symbol("CONTRARIO",Simbolo.CONTRARIO);                 }

    [fF][iI][nN][cC][aA][sS][oO] {   return symbol("FINCASO",Simbolo.FINCASO);                 }

    [fF][iI][nN][sS][eE][lL][eE][cC][cC][iI][oO][nN][aA][rR] {   return symbol("FINSELECCIONAR",Simbolo.FINSELECCIONAR);                 }

    [dD][iI][mM] {   return symbol("DIM",Simbolo.DIM);                 }

    [cC][oO][mM][oO] {   return symbol("COMO",Simbolo.COMO);                 }

    [iI][mM][pP][rR][iI][mM][iI][rR]  {   return symbol("IMPRIMIR",Simbolo.IMPRIMIR);                  }

    "or"    {   return symbol("OR",Simbolo.OR);                    }

    "and"   {   return symbol("AND",Simbolo.AND);                   }

    "not"   {   return symbol("NOT",Simbolo.NOT);                  }

    "=="    {   return symbol("IGUAL_IGUAL",Simbolo.IGUAL_IGUAL);           }

    "<"     {   return symbol("MENOR",Simbolo.MENOR);                 }

    ">"     {   return symbol("MAYOR",Simbolo.MAYOR);                 }

    "="     {   return symbol("IGUAL",Simbolo.IGUAL);                 }

    "+"     {   return symbol("MAS",Simbolo.MAS);                   }

    "*"     {   return symbol("ASTERISCO",Simbolo.ASTERISCO);             }

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