/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaexcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author KAREN RAMIREZ
 */
public class PruebaExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        formatoNumero();
        desborde();
        aritmetico();
        division();
                
    }

/*
//excepción sin tratar
public static void formatoNumero(){
int numero;
String cadena=" 1";
numero = Integer.parseInt(cadena);
   */  

//excepción tratada
    public static void formatoNumero() {

        int numero;

        String cadena = " 1";

        try {

            numero = Integer.parseInt(cadena);

        } catch (NumberFormatException ex) {

            System.out.println("No es un numero, es una cadena de texto." + ex.getMessage());

        }

    }
    public static void desborde(){
      
        int v[] = new int[3];
        try{
        for (int i = 0; i < 5; i++) {

            v[i] = i;

        }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("El vector tiene una dimension de "+ ex.getMessage());
        }

    }

    public static void aritmetico() {

        int numero = 5, resultado;
        try {
            resultado = numero / 0;

        } catch (ArithmeticException ex) {
            System.out.println("El numero no se puede dividir en 0 "+ex.getMessage());
        }
    }
    public static void division() throws Exception {
        double num, divisor;
        double resul = 0;
        try{
        Scanner Input = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num= Input.nextInt();
        System.out.println("Ingrese el divisor");
        divisor= Input.nextInt();
        try{
        resul =num/divisor;
        } catch (ArithmeticException ex){
            System.out.println("No se puede dividir un numero entre 0 "+ex.getMessage());
        }
        if (resul<10){
            throw new Exception ("El resultado que se obtiene es menor a 10");
        }
        }catch (InputMismatchException em){
        System.out.println("\nDato ingresado erroneo: "+em.getMessage());
        }catch(Exception ep){
            System.out.println(resul + "<10"+ep.getMessage());
        }
    }

}
