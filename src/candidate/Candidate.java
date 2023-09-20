/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidate;

import java.util.Date;

/**
 *
 * @author son
 */
public class Candidate {
    private String ID;
    private String Firstname;
    private String Lastname;
    private int Date;// năm
    private String Address;
    private String phone;
    private String Email;
    private int typeCandidate;

    public Candidate(String ID, String Firstname, String Lastname, int Date, String Address, String phone, String Email, int typeCandidate) {
        this.ID = ID;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Date = Date;
        this.Address = Address;
        this.phone = phone;
        this.Email = Email;
        this.typeCandidate = typeCandidate;
    }


    public Candidate() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

   
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    @Override
    public String toString() {
        return  "ID=" + ID + ", Firstname: " + Firstname + ", Lastname: " + Lastname + ", Date: " + Date + ", Address: " + Address + ", phone: " + phone + ", Email: " + Email + "|" + typeCandidate ;
    }

   
    
}
