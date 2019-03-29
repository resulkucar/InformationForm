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
public class Person implements BirthDateCalculate{
    private Name name;
    private Address address;
    public Person(){
        this.name = new Name();
        this.address = new Address();
    }
    public Person(String f, String m, String l,String A1, String A2, String city, String state, String zip){
        this.name = new Name(f,m,l);
        this.address = new Address (A1,A2,city,state,zip);
    }

    /**
     * @return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }
    
}
