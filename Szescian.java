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
	public class Szescian {
	    public String a;
	    public double b;
	    public double c;
	    public double d;
	    
	    public double pole(double x){
	    return 6*x*x;
	    }
	    
	    public double obj(double x){
	    return x*x*x;
	    }
	    
	    public Szescian(){
	}
	

	    public void PokazDane() {
	        System.out.println("Nazwa figury: " + a + "\nBok = " + b + "\nPole = " + c + "\nObjetosc = " + d);
	    }
	}
