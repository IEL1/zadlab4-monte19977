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
public class Prostopadloscian {
    public String q;
    public double a;
    public double b;
    public double c;
    public double x;
    public double y;
    
    public double pole(double a, double b, double c){
    return 2*(a*b+a*c+b*c);
    }
    
    public double obj(double a, double b, double c){
    return a*b*c;
    }
    
    public Prostopadloscian(){
}


    public void PokazDane() {
        System.out.println("Nazwa figury: " + q + "\nBok1 = " + a + "\nBok2 = " + b + "\nWysokosc = " + c + "\nPole = " + x + "\nObjetosc = " + y);
    }
}
