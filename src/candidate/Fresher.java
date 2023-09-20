/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidate;

/**
 *
 * @author son
 */
public class Fresher extends Candidate{
   
    private String Graduation_rank;// thơi gian tốt nghiệp
    private String Education; // trường đại hc nơi sinh viên tốt nghiệp

    public Fresher() {
    }

    public Fresher(String Graduation_rank, String Education, String ID, String Firstname, String Lastname, int Date, String Address, String phone, String Email, int typeCandidate) {
        super(ID, Firstname, Lastname, Date, Address, phone, Email, typeCandidate);
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

   

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

   
    
}
