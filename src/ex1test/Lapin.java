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
public class Lapin {
    private String name;
    private Integer age;

    public Lapin(String name, Integer age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public void crier(){
        System.out.println("HAAAAA");
    }
    
    
    
}
