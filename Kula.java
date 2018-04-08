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
 public class Kula {
    public String a;
    public double r;
    public double b;
    public double c;
    
    public double pole(double r){
    return 4*Math.PI*r*r;
    }
    
    public double obj(double r){
    return 4/3*Math.PI*r*r*r;
    }
    
    public Kula(){
}
    
    public void PokazDane() {
        System.out.println("Nazwa figury: " + a + "\nPromien = " + r + "\nPole = " + b + "\nObjetosc = " + c);
    }
}

