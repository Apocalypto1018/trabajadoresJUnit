/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3;

/**
 *
 * @author 
 */
public class Trabajadores {
    private String rut;
    private String nombre;
    private char sexo;
    private int edad;
    private int sueldoBase;
    private int cantidadDeHijos;
    
    private double incentivo;
    
    //constructor
    public Trabajadores(){
        
    }
    
    //constructor sobrecargado
    public Trabajadores(String rut, String nombre, 
            char sexo, int edad, int sueldo, int cantidadDeHijos){ 
    }
    
    //calcular incentivo
    public int calcularIncentivo(){
        
        //1. Si el trabajador es de sexo Masculino y su edad es mayor a 45 años y no tiene hijos, se le incrementará el sueldo en un 10
        if(Character.compare(this.sexo, 'H')==0 && this.edad>45 && this.cantidadDeHijos==0){
            incentivo=this.sueldoBase*0.10;
            
        //2. Si el trabajador es de sexo Masculino y su edad es mayor a 45 años y tiene hijos, se le incrementará el sueldo en un 18%
        }else if(Character.compare(this.sexo, 'H')==0 && this.edad>45 && this.cantidadDeHijos>0){
            incentivo=this.sueldoBase*0.18;
        
        //3. Si el trabajador es de sexo Femenino, su edad es mayor a 40 y no tiene hijos, se le incrementará el sueldo en un 10%
        }else if(Character.compare(this.sexo, 'F')==0 && this.edad>40 && this.cantidadDeHijos==0){
            incentivo=this.sueldoBase*0.10;
            
        //4. Si el trabajador es de sexo Femenino, su edad es mayor a 40 y tiene al menos 1 hijo, pero 3 o menos, se le incrementará el sueldo en un 20%
        }else if(Character.compare(this.sexo, 'F')==0 && this.edad>40 && this.cantidadDeHijos>=1 && this.cantidadDeHijos<=3){
            incentivo=this.sueldoBase*0.20;
            
        //5. Si el trabajador es de sexo Femenino y tiene mas de 3 hijos, se le incrementará el sueldo en un 25%
        }else if(Character.compare(this.sexo, 'F')==0 && this.cantidadDeHijos>3){
            incentivo=this.sueldoBase*0.25;

        }
 
        return 0;
    }
    
    //mostrar incentivo
    public void mostrarIncentivo(){
        System.out.println("*Nombre del trabajador: "+this.nombre);
        System.out.println("*Sueldo actual: "+this.sueldoBase);
        System.out.println("*Incentivo a recibir: "+this.incentivo);
    }
      
    //getters
    public String getRut(){
        return this.rut;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public int getSueldo(){
        return this.sueldoBase;
    }
    
    public int getCantidadDeHijos(){
        return this.cantidadDeHijos;
    }
    
    //setters
    public void setRut(String rut){
        this.rut=rut;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setSueldo(int sueldo){
        this.sueldoBase=sueldo;
    }
    
    public void setCantidadDeHijos(int cantidadDeHijos){
        this.cantidadDeHijos=cantidadDeHijos;
    }
}
