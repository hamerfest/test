/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1test;

/**
 *
 * @author Djo
 */
public class Ex1test {
    static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        Lapin lap = new Lapin("Roger", 2);
        while (i<=10){
            lap.crier();
            i=i+1;
        }
        
        
    }
    
}
