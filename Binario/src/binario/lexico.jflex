package binario;

import java_cup.runtime.Symbol;

%%
%cupsym Simbolo
%cup
%class AnalisisLexico
%public
%unicode
%line
%char
%ignorecase

%{
    //codigo
%}

%%

<YYINITIAL>{
    "0" { 
        return new Symbol(Simbolo.cero,yytext());
    }
    "1" { 
        return new Symbol(Simbolo.uno,yytext());
    }
    
    . { 
        System.out.println(yytext());
    }
}

