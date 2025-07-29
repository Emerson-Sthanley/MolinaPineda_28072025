/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MOLINAPINEDA28072025;

/**
 *
 * @author UFG
 */
public class Main {
/*Declaración de variables globales */
    public static String nombres = "Emerson Sthanley";
    public static String apellidos = "Molina Pineda";
    public static int anio_nacimiento = 2005;
    public static int mes_nacimiento =  10;
    public static float estatura = 1.70f; //Estatura en metros
    public static float peso = 176.8f; //Peso en Libras
    public static char genero = 'M';
    public static String  estado_familiar= "Soltero";
    public static double salario_mensual = 1600.75;
    
    
    

    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double imc = 0.0d;
        float tasa_kilogramos = 0.453592f; // 1 LIBRA EQUIVALE A 0.453592
        int dias_laborales = 22;//22 Días laborales
        int horas_laborales = 8;//8HORAS LABORALES 
        
        //CONVERTIMOS EL PESO DE LIBRAS A KILOGRAMOS
        float peso_kilogramos = Main.peso * tasa_kilogramos;
        
        //Elevando la estatura al cuadrado
        float estatura_al_cuadrado = Main.estatura*Main.estatura;
        
        imc = peso_kilogramos / estatura_al_cuadrado;
        
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        double salario_hora = salario_diario/horas_laborales;
        
        /**********************************/
        /**********SALIDA DE DATOS********/
        /*********************************/
        System.out.println("Saludos "+ Main.nombres+ " "+ Main.apellidos );
        System.out.println("Su peso en libras es "+ Main.peso+", pero en kilogramos es: "+peso_kilogramos );
        System.out.println("Su salario mensual es "+Main.salario_mensual);
        System.out.println("Su Indice de Masa Corporal es : "+imc);
        System.out.println("Su salrio diario es: "+salario_diario );
        System.out.println("Su salrio por hora es: " +salario_hora);
        
    }
    
}
