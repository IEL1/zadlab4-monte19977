/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figury;

    
public class Kolo {
    public String a;
    public double b;
    public double c;
    public double d;
    
    public double pole(double r){
    double wynik = Math.PI*r*r;
    return wynik;
    }
    
    public double obw(double r){
    return 2*Math.PI*r;
    }
    
    public Kolo(){
}


    public void PokazDane() {
        System.out.println("Nazwa figury: " + a + "\nPromien = " + b + "\nPole = " + c + "\nObwod = " + d) ;
    }
}

