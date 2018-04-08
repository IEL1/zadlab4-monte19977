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
public class Stozek {
    public String x;
    public double r;
    public double l;
    public double h;
    public double y;
    public double z;
    
    public double pole(double r, double l){
    return Math.PI*r*(r+l);
    }
    
    public double obj(double r, double h){
    return (Math.PI*r*r*h)/3;
    }
    
    public Stozek(){
}
    
    public void PokazDane() {
        System.out.println("Nazwa figury: " + x + "\nPromien = " + r + "\nTworzaca stozka = " + l + "\nWysokosc = " + h + "\nPole = " + y + "\nObjetosc = " + z);
    }
}
