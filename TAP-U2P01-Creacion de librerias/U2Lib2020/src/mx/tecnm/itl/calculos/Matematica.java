/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                         Métodos de calculo para la aplicación principal
:*        
:*  Archivo     : Matematica.java
:*  Autor       : Jesús Rafael Medina Dimas     19130547
:*  Fecha       : 19/09/2020
:*  Compilador  : Netbeans IDE 8.2
:*  Descripci�n : En esta clase se encuentran los métodos usados en la aplicación
:*                  visual.       
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  19/09/2020 Rafael       Agregar el prólogo del código
:*  28/09/2020 Rafael       Se modificó el tipo de los métodos, de integer a long. 
:*  29/09/2020 Rafael       Se agregó el método para obtener la formula general
:*  01/10/2020 Rafael       Se modificaron los métodos de la formula general para poder
                            interpretar resultados reales e imaginarios.
:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.calculos;

import java.text.DecimalFormat;

public class Matematica {
//------------------------------------------------------------------------------
//Código para obtener un factorial a partir de un número n.
    public static long factorial( int n ) {
        
        long fact;
        
        if ( n == 0 ) {
            return 1;
        }
        
        fact = 1;
        for ( int i = 1; i <= n; i++ ) {
            fact *= i;
        }
        
        return fact;
    }
//------------------------------------------------------------------------------
//Código de prueba para obtener una permutación a partir de un número n y un número x.
    public static long permutaciones( int n, int x ) {
        
        long p;
        
        p = ( factorial( n ) / factorial( n - x ));
        
        return p;
        
    }
//------------------------------------------------------------------------------
//Código para obtener una combinación a partir de un número n y un número x.
    public static long combinaciones( int n, int x ) {
        
        long c;

        c = ( permutaciones ( n, x ) / factorial ( x ) );
        
        return c;
        
    }

//------------------------------------------------------------------------------
//Método que permite calcular el valor de x en caso de que el discriminante sea positivo
    public static String[]  FGReal( int a, int b, int c, double disc ) {
        
        DecimalFormat df = new DecimalFormat( "#.###");
        String[] res = new String[2] ;
        
        res[0] = df.format((( -b ) + Math.abs ( Math.sqrt ( disc ) )) / ( 2 * a ));
        res[1] = df.format((( -b ) - Math.abs ( Math.sqrt ( disc ) ) ) / ( 2 * a ));
        
        return res;
    }
//------------------------------------------------------------------------------
//Método que permite calcular el valor de x en caso de que el discriminante sea negativo
    public static String[] FGImaginario( int a, int b, int c, double disc ){
        
        DecimalFormat df = new DecimalFormat( "#.###");
        String[] res = new String[2];
 
        res[0] = "( -" + b + " + " + df.format(Math.sqrt ( Math.abs ( disc ) )) + " i ) / " + ( 2 * a )  ;
        res[1] = "( -" + b + " - " + df.format(Math.sqrt ( Math.abs ( disc ) )) + " i ) / " + ( 2 * a )  ;
        
        return res;

    }

}
