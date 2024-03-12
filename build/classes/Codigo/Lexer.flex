package Codigo;
import static Codigo.Tokens.*;
import java.io.Reader;
%%
%class Lexer
%type Tokens
/**
 *
 * @author Ramon Cheno y Jorge Cheno
 */
L = [a-zA-Z]
D = [0-9]
numeroEntero = {D}+
numeroReal = {D}+(","{D}+)?(e("+"|"-")?{D}+)?
caracter_Especial = [ ,\t,\r]+
valorDecimal = [f|d]
%{
    public String lexeme;
%}
%%

{caracter_Especial} {/*ignore*/}

"\n" {return Linea;}

"+" {lexeme = yytext(); return Suma;}
"-" {lexeme = yytext(); return Resta;}
"*" {lexeme = yytext(); return Multiplicacion;}
"/" {lexeme = yytext(); return Division;}
"%" {lexeme = yytext(); return Modulo;}
"^" {lexeme = yytext(); return Potencia;}


("Y" | "O" | "!") {lexeme = yytext(); return Op_Logicos;}

("+=" | "-=" | "*=" | "/=" | "%=") {lexeme = yytext(); return Op_Asignacion;}

("++" | "--") {lexeme = yytext(); return Op_Incremento;}

"=" {lexeme = yytext(); return Asignacion;}

(">>" | "<<" | "==" | ">=" | "<=" | "!=") {lexeme = yytext(); return Op_Relacional;}

("VRD" | "FLS") {lexeme = yytext();return Valor_Booleano;}

"(" {lexeme = yytext(); return Parentesis_a;}
")" {lexeme = yytext(); return Parentesis_c;}
"{" {lexeme = yytext(); return Llave_a;}
"}" {lexeme = yytext(); return Llave_c;}
"[" {lexeme = yytext(); return Corchete_a;}
"]" {lexeme = yytext(); return Corchete_c;}
";" {lexeme = yytext(); return Punto_coma;}
":" {lexeme = yytext(); return Dos_puntos;}
"," {lexeme = yytext(); return Coma;}
"." {lexeme = yytext(); return Punto;}
"\"" {lexeme = yytext(); return Doble_comillas;}
"\'" {lexeme = yytext(); return Comilla_simple;}
//"_"  {lexeme = yytext(); return Guion;}

hacer {lexeme = yytext(); return Hacer;} //do
mientras {lexeme = yytext(); return Mientras;} //While
para {lexeme = yytext(); return Para;} //for
si {lexeme = yytext(); return Si;} //if
entc {lexeme = yytext(); return Entc;} //else
selec {lexeme = yytext(); return Selec;} //switch
caso {lexeme = yytext(); return Caso;} //case 
predet {lexeme = yytext(); return Predet;} //Default
romper {lexeme = yytext(); return Romper;} //break
publico {lexeme = yytext(); return Publico;} //public
clase {lexeme = yytext(); return Clase;} //class
estatico {lexeme = yytext(); return Estatico;} //static
vacio {lexeme = yytext(); return Vacio;} //void
ejecutar {lexeme = yytext(); return Ejecutar;} //main

(ent | dob | flt | txt | car | bol ) {lexeme = yytext(); return tipo_Dato;}

{valorDecimal} {lexeme = yytext(); return Valor_Decimal;}

({L}({L}|{D})*) {lexeme = yytext(); return Identificador;}

(("\'"{L}{1}"\'") | ("\'"{D}{1}"\'") | (\'\'\'\') | ("\'"[^\']"\'") | ("#"{numeroEntero})) {lexeme = yytext(); return Caracter;}

(\"[^\"]*\")|(\"[^\"]*\"(\"[^\"]*\")*) {lexeme = yytext(); return Cadena;}

(("(-"{numeroEntero}")")|{numeroEntero}+) {lexeme=yytext(); return Numero_Entero;}
({numeroReal}) {lexeme = yytext(); return Numero_Real;}

 . {return ERROR;}