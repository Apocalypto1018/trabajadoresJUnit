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
    
    private static int nTrabajadores;
    private static int nCaracteres;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //solicitud de la cantidad de trabajadores a procesar en la empresa
        System.out.print("*Ingrese la cantidad de trabajadores\n->");
        nTrabajadores=sc.nextInt();
        sc.nextLine(); //se limpia el buffer
        
        Trabajadores[] arrayEmpleados =new Trabajadores[nTrabajadores]; //array para nTrabajadores elegidos por el usuario
        
        //ciclo que itera 5 veces para llenar los datos de los 5 empleados para la simulacion
        for(i=1;i<=nTrabajadores;i++){ //llenar datos
            
            /*-------validaciones de las reglas de negocio------*/
            
            //rut: no puede estar vacío
            do{
                System.out.print("*Ingrese el rut del empleado "+i+"\n->");
                rut=sc.nextLine();
                
                if(rut.isEmpty()){ //mensaje de error si se rompe la regla de negocio rut vacio
                    System.out.println("ERROR!, el RUT no puede estar vacio");
                }
            }while(rut.isEmpty()); //ciclo que asegura que se introduzca un rut no vacio
            
            //nombre: debe tener al menos 5 caracteres
            do{
                System.out.print("*Ingrese el nombre del empleado "+i+"\n->");
                nombre=sc.nextLine();
                
                nCaracteres=nombre.length(); //se cuenta la cantidad de caracteres el nombre
                
                if(nCaracteres<5){ //mensaje de error si se rompe la regla de negocio nombre con menos de 5 caracteres
                    System.out.println("ERROR!, el nombre no puede contener menos de 5 caracteres");
                }
            }while(nCaracteres<5); //ciclo que asegura que se introduzca un nombre de al menos 5 caracteres
            
            //sexo: M: Masculino, F: Femenino
            do{
                System.out.print("*Ingrese la letra M para Masculino o F para Femenino. Genero del empleado "+i+"\n->");
                sexo=sc.next().charAt(0); //se lee el caracter   
                
                if(sexo!='F' && sexo!='M'){
                    System.out.println("ERROR!, debe introducir o el caracter M, o el caracter F para indicar un genero");
                }
            }while(sexo!='F' && sexo!='M'); //ciclo que asegura que se introduzca un genero valido
            
            //sueldoBase: debe ser mayor o igual a 300.000
            do{
                System.out.print("*Ingrese el sueldo base del empleado "+i+"\n->");
                sueldoBase=sc.nextInt();  
                
                if(sueldoBase<300.000){
                    System.out.println("ERROR!, El sueldo base debe ser superior a 300.000");
                }
            }while(sueldoBase<300.000); //ciclo que asegura que se introduzca un sueldo base minimo correcto
            
            //edad: debe ser mayor de 18
            do{
                System.out.print("*Ingrese la edad del empleado "+i+"\n->");
                edad=sc.nextInt();  
                
                if(edad<=18){
                    System.out.println("ERROR!, La edad debe ser mayor a 18");
                }    
            }while(edad<=18); //ciclo que asegura que se introduzca una edad mayor a 18
            
            //hijos: mayor o igual a cero (no puede ser negativo)
            do{
                System.out.print("*Ingrese la cantidad de hijos del empleado "+i+"\n->");
                nHijos=sc.nextInt();  
                
                if(nHijos<0){
                    System.out.println("ERROR!, la cantidad de hijos no puede ser negativa");
                } 
            }while(nHijos<0); //ciclo que asegura que se introduzca una edad mayor a 18
            
            sc.nextLine(); //se limpia el buffer para evitar errores en la lectura del siguiente trabajador
            
            //si llega hasta aca es porque todos los datos cumplen con las reglas del negocio y se pueden pasar los datos al objeto
            arrayEmpleados[i-1]= new Trabajadores(); //se instancia el objeto en la posicion del array
            //se asignan los valores con sus resectivos metodos setters
            arrayEmpleados[i-1].setRut(rut);
            arrayEmpleados[i-1].setNombre(nombre);
            arrayEmpleados[i-1].setSexo(sexo);
            arrayEmpleados[i-1].setSueldo(sueldoBase);
            arrayEmpleados[i-1].setEdad(edad);
            arrayEmpleados[i-1].setCantidadDeHijos(nHijos);

        }
        
        //mostrar datos de empleados
        for(i=1;i<=nTrabajadores;i++){
            
            System.out.print("\n\n\n*Datos del empleado "+i+"\n\n");
            
            System.out.println("RUT: "+arrayEmpleados[i-1].getRut());
            System.out.println("Nombre: "+arrayEmpleados[i-1].getNombre());
            System.out.println("Edad: "+arrayEmpleados[i-1].getEdad());
            System.out.println("Cantidad de Hijos: "+arrayEmpleados[i-1].getCantidadDeHijos());
            
            if(arrayEmpleados[i-1].getSexo()=='F'){ //validacion del sexo
                System.out.println("Genero: Femenino");
            }else{
                System.out.println("Genero: Masculino");
            }

            arrayEmpleados[i-1].calcularIncentivo(); //se calcula el incentivo del empleado
            
            arrayEmpleados[i-1].mostrarIncentivo(); //se llama la funcion que muestra el sueldo base y el incentivo previamente calculado
        }
     
    }
    
}


















