/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                       INSTITUTO TECNOLOGICO DE LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2020    HORA: 17-18 HRS
:*
:*                     Clase para los métodos de cada tipo de conversión
:*        
:*  Archivo     : Conversiones.java
:*  Autor       : Jesús Rafael Medina Dimas     19130547
:*  Fecha       : 06/10/2020
:*  Compilador  : Netbeans IDE 8.2
:*  Descripci�n : En esta clase se encuentran las clases encargadas de hacer los 
                  cálculos y conversiones de la aplicación. 
:*  Ultima modif:
:*  Fecha       Modific�             Motivo
:*========================================================================================== 
:*  06/10/2020 Rafael       Se creó la clase y todos los métodos correspondientes
:*  08/10/2020 Rafael       Se modificaron algunas formulas erroneas. 

:*------------------------------------------------------------------------------------------*/
package mx.tecnm.itl.calculos;


/**
 *
 * @author Jesus
 */
public class Conversiones {
    private static double yardasaMetros = 0.9144;
    private static double metrosaYardas = 1.09 ;
    private static double librasaKilogramos = 0.453592;
    private static double kilogramosaLibras = 2.2046 ;
    
//---------------------------------------------------------------------------------------
//Método de conversión donde se reciben grados Celsius para convertirlos a grados Fahrenheit
    public static double CaF ( double cent ) {
        
       double Far =   ( ( 9 * cent / 5 ) + 32 )  ;
       
       return Far;
        
    }
    
//---------------------------------------------------------------------------------------
//Método de conversión donde se reciben grados Fahrenheit para convertirlos a grados Celsius
    public static double FaC ( double far ) {
        
        double cels =  ( ( 5 * ( far - 32 ) ) / 9)  ;
        
        return cels;
    }
    
//---------------------------------------------------------------------------------------
//Método donde se reciben libras para convertirlas a kilogramos al multiplicarlos
// por la constante de conversión
    public static double lbakg ( double lb ) {
        
        double kg =  lb * librasaKilogramos  ; 
        return kg;
        
    }
    
//---------------------------------------------------------------------------------------
//Método donde se reciben kilogramos para convertirlas a libras al multiplicarlos
// por la constante de conversión
    public static double kgalb ( double kg ) {
        
        double lb = kg * kilogramosaLibras  ; 
        
        return lb;
        
    }
    
//---------------------------------------------------------------------------------------
//Método donde se convierten yardas a metros al multiplicarlas por una constante predefinida
    public static double ydam ( double yd ) {
        
        double met =  yd * yardasaMetros  ;
        
        return met;
    }
    
//---------------------------------------------------------------------------------------
//Método donde se convierten metros a yardas al multiplicarlos por una constante predefinida
    public static double mayd ( double met ) {
        
        double yd =  met * metrosaYardas  ;
        
        return yd;
    }
    
//---------------------------------------------------------------------------------------    
//Método para convertir números decimales a números binarios 
    
    public static String decaBin ( int dec ){
        
        String bin = Integer.toBinaryString ( dec );
        return bin;
    }
    
//---------------------------------------------------------------------------------------
//Método para convertir números binarios a números decimales 
    
    public static String binaDec ( String bin ) {
        
        String dec = Integer.parseInt ( bin , 2 ) + "";
        return dec;
    }
}
