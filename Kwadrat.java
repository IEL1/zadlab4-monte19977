/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figury;

/**
 *
 * 
 */
public class Kwadrat {
    public String a;
    public double b;
    public double c;
    public double d;


    public double pole(double x){
    return x*x;
    }
    
    public double obw(double x){
    return 4*x;
    }
    
    public Kwadrat(){
}


    public void PokazDane() {
        System.out.println("Nazwa figury: " + a + "\nBok = " + b + "\nPole = " + c + "\nObwod = " + d);
    }
}

