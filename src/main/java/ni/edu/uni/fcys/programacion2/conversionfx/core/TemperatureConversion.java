/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.core;

/**
 *
 * @author Sistemas-12
 */
public class TemperatureConversion {
    
    public static float fomCelsiusToFharenheint(float temp){
        return temp *((float)9/5)+32;
    }
    
    public static float fromFharenheitToCelsius(float temp){
        return ((float)5/9)*(temp-32);
    }
    
}
