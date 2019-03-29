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
public class Address {
    private String Address1;
    private String Address2;
    private String City;
    private String State;
    private String ZIP;
    
    public Address(){
        Address1="UNKNOWN";
        Address2="UNKNOWN";
        City="UNKNOWN";
        State="UNKNOWN";
        ZIP="UNKNOWN";
    }
    public Address(String A1, String A2, String city, String state, String zip){
        Address1=A1;
        Address2=A2;
        City=city;
        State=state;
        ZIP=zip;
        
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }
}
