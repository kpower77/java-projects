/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 * @date Feb 2016
 * @author Kenneth Power x14101556
 */
public class Person {

    public String name;
    public int age;
    
    Person(String inName, int inAge) {
        
        this.name = inName;
        this.age = inAge;
    }
    
    public String getName(){
    
        return name;
    }
    
    public void setName(String inName){
    
        name = inName;
    }
    
    public int getAge(){
    
        return age;
    }
    
    public void setAge(int inAge){
    
        age = inAge;
    }
    
    public void printPerson(){
    
        System.out.println("Name: " + name + " Age: " + age);
    }
}
    
    
