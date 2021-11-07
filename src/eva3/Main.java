/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Main {
    //scanner
    private static Scanner sc=new Scanner(System.in);
    
    //contador
    private static int i;
    
    //auxiliares
    private static String rut;
    private static String nombre;
    private static char sexo;
    private static int sueldoBase;
    private static int edad;
    private static int nHijos;
    
    private static int nCaracteres;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trabajadores[] arrayEmpleados =new Trabajadores[5]; //array para 5 trabajadores
        
        //ciclo que itera 5 veces para llenar los datos de los 5 empleados para la simulacion
        for(i=1;i<=5;i++){ //llenar datos
            
            /*-------validaciones de las reglas de negocio------*/
            
            //rut: no puede estar vacío
            do{
                System.out.print("*Ingrese el rut del empleado "+i+"\n->");
                rut=sc.nextLine();
            }while(rut.isEmpty()); //ciclo que asegura que se introduzca un rut no vacio
            
            //nombre: debe tener al menos 5 caracteres
            do{
                System.out.print("*Ingrese el nombre del empleado "+i+"\n->");
                nombre=sc.nextLine();
                
                nCaracteres=nombre.length(); //se cuenta la cantidad de caracteres el nombre
            }while(nCaracteres<5); //ciclo que asegura que se introduzca un nombre de al menos 5 caracteres
            
            //sexo: M: Masculino, F: Femenino
            do{
                System.out.print("*Ingrese la letra M para Masculino o F para Femenino. Genero del empleado "+i+"\n->");
                sexo=sc.next().charAt(0); //se lee el caracter    
            }while(sexo!='F' || sexo!='M'); //ciclo que asegura que se introduzca un genero valido
            
            //sueldoBase: debe ser mayor o igual a 300.000
            do{
                System.out.print("*Ingrese el sueldo base del empleado "+i+"\n->");
                sueldoBase=sc.nextInt();  
                
            }while(sueldoBase<300.000); //ciclo que asegura que se introduzca un sueldo base minimo correcto
            
            //edad: debe ser mayor de 18
            do{
                System.out.print("*Ingrese la edad del empleado "+i+"\n->");
                edad=sc.nextInt();  
                
            }while(edad<=18); //ciclo que asegura que se introduzca una edad mayor a 18
            
            //hijos: mayor o igual a cero (no puede ser negativo)
            do{
                System.out.print("*Ingrese la cantidad de hijos del empleado "+i+"\n->");
                nHijos=sc.nextInt();  
                
            }while(nHijos<0); //ciclo que asegura que se introduzca una edad mayor a 18
            
            //si llega hasta aca es porque todos los datos cumplen con las reglas del negocio y se pueden pasar los datos al objeto
            arrayEmpleados[i-1].setRut(rut);
            arrayEmpleados[i-1].setNombre(nombre);
            arrayEmpleados[i-1].setSexo(sexo);
            arrayEmpleados[i-1].setSueldo(sueldoBase);
            arrayEmpleados[i-1].setEdad(edad);
            arrayEmpleados[i-1].setCantidadDeHijos(nHijos);

        }
     
    }
    
}


















