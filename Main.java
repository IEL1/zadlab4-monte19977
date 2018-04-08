/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figury;
import java.util.Scanner;

/**
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Wybierz figure:\n"
                
                + "1. Kolo \n"
                + "2. Kwadrat \n"
                + "3. Prostokat \n"
                + "4. Szescian \n"
                + "5. Prostopadloscian \n"
                + "6. Stozek \n"
                + "7. Kula \n"
                );
        Scanner scanner = new Scanner(System.in);
        int figura = scanner.nextInt();
        switch (figura){
            case 1:
                Kolo kolo = new Kolo();
                kolo.a = "Kolo";
                System.out.println("Podaj promien kola: ");
                kolo.b = scanner.nextDouble();
                kolo.c = kolo.pole(kolo.b);
                kolo.d = kolo.obw(kolo.b);
                System.out.println();
                kolo.PokazDane();
                break;
            case 2:
                Kwadrat kwadrat = new Kwadrat();
                kwadrat.a = "Kwadrat";
                System.out.println("Podaj dlugosc boku: ");
                kwadrat.b = scanner.nextDouble();
                kwadrat.c = kwadrat.pole(kwadrat.b);
                kwadrat.d = kwadrat.obw(kwadrat.b);
                System.out.println();
                kwadrat.PokazDane();
                break;
            case 3:
                Prostokat prostokat = new Prostokat();
                prostokat.a = "Prostokat";
                System.out.println("Podaj dlugosc boku a: ");
                prostokat.b = scanner.nextDouble();
                System.out.println("Podaj dlugosc boku b: ");
                prostokat.c = scanner.nextDouble();
                prostokat.d = prostokat.pole(prostokat.b, prostokat.c);
                prostokat.e = prostokat.obw(prostokat.b, prostokat.c);
                System.out.println();
                prostokat.PokazDane();
                break;
            case 4:
                Szescian szescian = new Szescian();
                szescian.a = "Szescian";
                System.out.println("Podaj dlugosc boku: ");
                szescian.b = scanner.nextDouble();
                szescian.c = szescian.pole(szescian.b);
                szescian.d = szescian.obj(szescian.b);
                System.out.println();
                szescian.PokazDane();
                break;
            case 5:
                Prostopadloscian prostopadloscian = new Prostopadloscian();
                prostopadloscian.q = "Prostopadloscian";
                System.out.println("Podaj dlugosc boku a: ");
                prostopadloscian.a = scanner.nextDouble();
                System.out.println("Podaj dlugosc boku b: ");
                prostopadloscian.b = scanner.nextDouble();
                System.out.println("Podaj wysokosc: ");
                prostopadloscian.c = scanner.nextDouble();
                prostopadloscian.x = prostopadloscian.pole(prostopadloscian.a, prostopadloscian.b, prostopadloscian.c);
                prostopadloscian.y = prostopadloscian.obj(prostopadloscian.a, prostopadloscian.b, prostopadloscian.c);
                System.out.println();
                prostopadloscian.PokazDane();
                break;
            case 6:
                Stozek stozek = new Stozek();
                stozek.x = "Stozek";
                System.out.println("Podaj promien stozka: ");
                stozek.r = scanner.nextDouble();
                System.out.println("Podaj dlugosc tworzacej stozka: ");
                stozek.l = scanner.nextDouble();
                System.out.println("Podaj wysokosc stozka: ");
                stozek.h = scanner.nextDouble();
                stozek.y = stozek.pole(stozek.l, stozek.h);
                stozek.z = stozek.obj(stozek.r, stozek.h);
                System.out.println();
                stozek.PokazDane();
                break;
            case 7:
                Kula kula = new Kula();
                kula.a = "Kula";
                System.out.println("Podaj promien kuli: ");
                kula.r = scanner.nextDouble();
                kula.b = kula.pole(kula.r);
                kula.c = kula.obj(kula.r);
                System.out.println();
                kula.PokazDane();
                break;
            default:
                System.out.println("Nie ma takiej figury");
                break;    
        }
        
    }
}
