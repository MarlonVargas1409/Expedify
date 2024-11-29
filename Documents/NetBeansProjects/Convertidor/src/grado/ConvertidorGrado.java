/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grado;

/**
 *
 * @author DELL 5490
 */
public class ConvertidorGrado {
     private int fahrenheit;
    private int celsius;
    
    public  ConvertidorGrado(){
        
    }
    
     public  ConvertidorGrado(int fahrenheit, int celsius){
       this.fahrenheit = fahrenheit;
       this.celsius = celsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int Celsius) {
        this.celsius = Celsius;
    }
     
     public int convertirACahrenheit(int celsius ){
        int  fahrenheit = (int) (1.8 * celsius + 32);
         return fahrenheit;
     }
     
     public int convertirACelsius(int fahrenheit){
         int celsius = (int) ((fahrenheit-32)/1.8);
         return celsius;
     }
    
    
}
