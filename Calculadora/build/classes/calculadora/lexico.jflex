package calculadora;

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
    "+" { 
        return new Symbol(Simbolo.suma,yytext());
    }
    "-" { 
        return new Symbol(Simbolo.resta,yytext());
    }
    "*" { 
        return new Symbol(Simbolo.multiplicacion,yytext());
    }
    "/" { 
        return new Symbol(Simbolo.division,yytext());
    }
    "^" { 
        return new Symbol(Simbolo.potencia,yytext());
    }
    "(" { 
        return new Symbol(Simbolo.parAbre,yytext());
    }
    ")" { 
        return new Symbol(Simbolo.parCierra,yytext());
    }
    [0123456789]+ { 
        return new Symbol(Simbolo.numero,yytext());
    }
    
    . { 
        System.out.println(yytext());
    }
}

