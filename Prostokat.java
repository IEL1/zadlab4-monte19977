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
public class Prostokat {
    public String a;
    public double b;
    public double c;
    public double d;
    public double e;
    
    public double pole(double x, double y){
        return x*y;
    }
    
    public double obw(double x, double y){
    return 2*x+2*y;
    }
    
    public Prostokat(){
}


    public void PokazDane() {
        System.out.println("Nazwa figury: " + a + "\nBok1 = " + b + "\nBok2 = " + c + "\nPole = " + d + "\nObwod = " + e);
    }
}
