package atributosheredados;
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
%%

%cupsym Simbolo
%class AnalisisLexico
%cup
%public
%unicode
%public
%line
%char
%ignorecase

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
/* PALABRAS RESERVADAS */

"boolean"           {return symbol("boolean",Simbolo.booleanT); }
"float"             {return symbol("float",Simbolo.floatT); }
"double"            {return symbol("double",Simbolo.doubleT); }
"char"              {return symbol("char",Simbolo.charT); }
"int"               {return symbol("int",Simbolo.intT); }  
"short"             {return symbol("short",Simbolo.shortT); }  
"long"              {return symbol("long",Simbolo.longT); }  
";"                 {return symbol(";",Simbolo.pcoma); }  
","                 {return symbol(",",Simbolo.coma); }  
{id}                {return symbol("id",Simbolo.id, yytext()); }  


{espacio}        { /* Se ignoran */}


.                    { System.out.println("Error lexico: "+yytext());    }

}
