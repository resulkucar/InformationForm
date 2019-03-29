/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author resul
 */
public class Student extends Person {
    private int age;
    public Student(){
        super();
        this.age = 0;
    }
    
    public Student(int a)
    {
        super();
        this.age = a;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
