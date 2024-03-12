package Codigo;
import java_cup.runtime.Symbol;

/**
 *
 * @author Ramon Cheno y Jorge Cheno
 */
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L = [a-zA-Z]
D = [0-9]
numeroEntero = {D}+
numeroReal = {D}+(","{D}+)?(e("+"|"-")?{D}+)?
espacio = [ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline, yycolumn, value);
    }
    
    private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn);
    }
%}
%%

{espacio} {/*Ignore*/}

"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
"%" {return new Symbol(sym.Modulo, yychar, yyline, yytext());}
"^" {return new Symbol(sym.Potencia, yychar, yyline, yytext());}

"Y" | "O" | "!"  {return new Symbol(sym.Op_Logicos, yychar, yyline, yytext());}

"+=" | "-=" | "*=" | "/=" | "%=" {return new Symbol(sym.Op_Asignacion, yychar, yyline, yytext());}
"++" | "--" {return new Symbol(sym.Op_Incremento, yychar, yyline, yytext());}
 "=" {return new Symbol(sym.Asignacion, yychar, yyline, yytext());}

(">>" | "<<" | "==" | ">=" | "<=" | "!=") {return new Symbol(sym.Op_Relacional, yychar, yyline, yytext());}

"VRD" | "FLS" {return new Symbol(sym.Valor_Booleano, yychar, yyline, yytext());}

"(" {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
")" {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
"{" {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
"}" {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}
"[" {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}
"]" {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}
";" {return new Symbol(sym.Punto_coma, yychar, yyline, yytext());}
":" {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());}
"," {return new Symbol(sym.Coma, yychar, yyline, yytext());}
"." {return new Symbol(sym.Punto, yychar, yyline, yytext());}
"\"" {return new Symbol(sym.Doble_comillas, yychar, yyline, yytext());}
"\'" {return new Symbol(sym.Comilla_simple, yychar, yyline, yytext());}
//"_"  {return new Symbol(sym.Guion, yychar, yyline, yytext());}

//Palabras Reservadas
hacer {return new Symbol(sym.Hacer, yychar, yyline, yytext());} //do
mientras {return new Symbol(sym.Mientras, yychar, yyline, yytext());} //While
para {return new Symbol(sym.Para, yychar, yyline, yytext());} //for
si {return new Symbol(sym.Si, yychar, yyline, yytext());} //if
entc {return new Symbol(sym.Entc, yychar, yyline, yytext());} //else
selec {return new Symbol(sym.Selec, yychar, yyline, yytext());} //switch
caso {return new Symbol(sym.Caso, yychar, yyline, yytext());} //case 
predet {return new Symbol(sym.Predet, yychar, yyline, yytext());} //Default
romper {return new Symbol(sym.Romper, yychar, yyline, yytext());} //break
publico {return new Symbol(sym.Publico, yychar, yyline, yytext());} //public
clase {return new Symbol(sym.Clase, yychar, yyline, yytext());} //class
estatico {return new Symbol(sym.Estatico, yychar, yyline, yytext());} //static
vacio {return new Symbol(sym.Vacio, yychar, yyline, yytext());} //void
ejecutar {return new Symbol(sym.Ejecutar, yychar, yyline, yytext());} //main

dob {return new Symbol(sym.Dob, yychar, yyline, yytext());}

flt {return new Symbol(sym.Flt, yychar, yyline, yytext());}

car {return new Symbol(sym.Car, yychar, yyline, yytext());}

bol {return new Symbol(sym.Bol, yychar, yyline, yytext());}

ent {return new Symbol(sym.Ent, yychar, yyline, yytext());}

txt {return new Symbol(sym.Txt, yychar, yyline, yytext());}

"f" {return new Symbol(sym.Valor_Flotante, yychar, yyline, yytext());}
"d" {return new Symbol(sym.Valor_Decimal, yychar, yyline, yytext());}

{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

(("\'"{L}{1}"\'") | ("\'"{D}{1}"\'") | (\'\'\'\') |("\'"[^\']"\'") | ("#"{numeroEntero})) {return new Symbol(sym.Caracter, yychar, yyline, yytext());}

(\"[^\"]*\")|(\"[^\"]*\"(\"[^\"]*\")*) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

("(-"{numeroEntero}")")|{numeroEntero}+ {return new Symbol(sym.Numero_Entero, yychar, yyline, yytext());}

({numeroReal}) {return new Symbol(sym.Numero_Decimal, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}