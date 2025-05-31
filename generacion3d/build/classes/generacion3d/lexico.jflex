package generacion3d;
import java.util.LinkedList;
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
public LinkedList<ErrorCompilador> lista=new LinkedList<ErrorCompilador>();
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
    lista.add(new ErrorCompilador(yyline+1,yycolumn+1,"Error lexico caracter " +message + " no reconocido." ));
    
  }


%}

%eofval{
     return symbolFactory.newSymbol("EOF", Simbolo.EOF, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+1,yychar+1));
%eofval}

%%
<YYINITIAL>{
"True"             {return symbol("verdadero",Simbolo.verdadero);}
"False"            {return symbol("falso",Simbolo.falso);}
"print"            {return symbol("imprimir",Simbolo.imprimir);}
"if"		   {return symbol("si",Simbolo.si);}
"else"		   {return symbol("sino",Simbolo.sino);}
"switch"	   {return symbol("seleccionar",Simbolo.seleccionar);}
"case"		   {return symbol("caso",Simbolo.caso);}
"break"		   {return symbol("salir",Simbolo.salir);}
"default"	   {return symbol("defecto",Simbolo.defecto);}
"while"            {return symbol("mientras",Simbolo.mientras);}
"for"              {return symbol("para",Simbolo.para);}
"("		   {return symbol("aparen",Simbolo.aparen);}
")"	           {return symbol("cparen",Simbolo.cparen);}
"{"		   {return symbol("allave",Simbolo.allave);}	
"}"	           {return symbol("cllave",Simbolo.cllave);}
"<"		   {return symbol("menor",Simbolo.menor);}
">"		   {return symbol("mayor",Simbolo.mayor);}
"and"		   {return symbol("opy",Simbolo.opy);}
"or"		   {return symbol("opo",Simbolo.opo);}
"not"		   {return symbol("opn",Simbolo.opn);}
"="		   {return symbol("igual",Simbolo.igual);}
"=="		   {return symbol("igualIgual",Simbolo.igualIgual);}
"!="		   {return symbol("diferente",Simbolo.diferente);}
";"		   {return symbol("pcoma",Simbolo.pcoma);}
":"		   {return symbol("dpuntos",Simbolo.dpuntos);}
"+"		   {return symbol("mas",Simbolo.mas);}
"-"		   {return symbol("menos",Simbolo.menos);}
"*"		   {return symbol("por",Simbolo.por);}
"/"		   {return symbol("div",Simbolo.div);}
{entero}	   {return symbol("numero",Simbolo.numero, yytext());}
{id}		   {return symbol("iden",Simbolo.iden, yytext());}
{espacio}          { /* Se ignoran */}

.                   { error(yytext()); }
}
