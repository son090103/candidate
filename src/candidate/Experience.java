/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidate;

/**
 *
 * @author son
 */
public class Experience extends Candidate{
    
    private int ExpInYear;// năm kinh nghiệm 
    private String ProSkill;

    public Experience() {
    }

    public Experience(int ExpInYear, String ProSkill, String ID, String Firstname, String Lastname, int Date, String Address, String phone, String Email, int typeCandidate) {
        super(ID, Firstname, Lastname, Date, Address, phone, Email, typeCandidate);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

   

   

    

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }

   
}
