package com.mycompany.lab2_joselobo;

import java.util.Scanner;
/**
 *
 * @author joselobo
 */
public class Lab2_JoseLobo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        do{
        System.out.println("Menu");
        System.out.println("1--->MCD");
        System.out.println("2--->Sumatoria");
        System.out.println("3--->Supermercado");
        System.out.println("4--->Salir");
        System.out.println("Ingrese su opcion: ");
        opcion = leer.nextInt();
        
        if (opcion==1){
            System.out.println("Ingrese A: ");
            int A = leer.nextInt();
            while(A<=0){
                System.out.println("No se aceptan numeros negativo");
                System.out.println("Ingrese otro");
                A = leer.nextInt();
            }//while A opcion 1
            System.out.println("Ingrese B: ");
            int B = leer.nextInt();
            while(A<=0){
                System.out.println("No se aceptan numeros negativo");
                System.out.println("Ingrese otro");
                A = leer.nextInt();
            }//while A opcion 1
            
            do{
            if(A>B){
                A=A-B;
            }//If a>b
            if(B>A){
                B=B-A;
            }//if b>a
            }while(A!=B);//Proceso opcion 1
            System.out.println("El Minimo comun Multiple es: "+A);
        }//opcion 1
        else if (opcion==2){
            double n=1,base,resultado=0;
            System.out.println("Ingrese su valor de K: ");
            double K = leer.nextDouble();
            while(n<=K){
                base=n/(n+1);
                resultado=resultado+Math.pow(base, n);
                n++;
            }//proceso opcion 2
            System.out.println("Su resultado es: "+resultado);
        }//opcion 2
        else if(opcion==3){
            System.out.println("Ingrese el tipo de cliente: ");
            double tipo = leer.nextDouble();
            while(tipo<0||tipo>2){
                System.out.println("Tipo Invalido");
                System.out.println("Ingrese otro tipo: ");
                tipo = leer.nextInt();
            }
            System.out.println("Ingrese el precio de la unidad del producto: ");
            double precio = leer.nextDouble();
            while(precio<0){
                System.out.println("No se puede precios negativos");
                System.out.println("Ingrese otro precio: ");
                tipo = leer.nextInt();
            }
            System.out.println("Ingrese la cantidad del producto: ");
            double cantidad = leer.nextDouble();
            
            double reduccion=0,subtotal,total=0;
            //calculo
            subtotal=cantidad*precio;
            if (tipo==0){
                if(cantidad>=10&cantidad<=19){
                    reduccion=precio*2;
                }//reduccion 1
                else if(cantidad>20){
                    reduccion=precio*5;
                }//reduccion 2
                total=subtotal-reduccion;
            }//tipo 0
            else if (tipo==1){
                if(cantidad>=20&cantidad<=29){
                    reduccion=precio*2;
                }//reduccion 1
                else if(cantidad>30){
                    reduccion=precio*5;
                }//reduccion 2
                total=(subtotal-reduccion)*0.90;

            }//tipo 1
            else if (tipo==2){
                if(cantidad>=30&cantidad<=39){
                    reduccion=precio*2;
                }//reduccion 1
                else if(cantidad>40){
                    reduccion=precio*5;
                }//reduccion 2
                total=(subtotal-reduccion)*0.70;
            }//tipo 2
            System.out.println("Su total a pagar es: "+total);
        }//opcion 3
        }while(opcion!=4);//do todo
    }//public static void main
}//public class
