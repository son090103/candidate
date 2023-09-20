/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidate;

/**
 *
 * @author son
 */
public class Internship extends Candidate{
   
    private String Majoy; // chuyên nghành học 
    private String Semester;// học kỳ 
    private String UniversityName;// tên trường

    public Internship() {
    }

    public Internship(String Majoy, String Semester, String UniversityName, String ID, String Firstname, String Lastname, int Date, String Address, String phone, String Email, int typeCandidate) {
        super(ID, Firstname, Lastname, Date, Address, phone, Email, typeCandidate);
        this.Majoy = Majoy;
        this.Semester = Semester;
        this.UniversityName = UniversityName;
    }

   

    public String getMajoy() {
        return Majoy;
    }

    public void setMajoy(String Majoy) {
        this.Majoy = Majoy;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String UniversityName) {
        this.UniversityName = UniversityName;
    }

   
    
}
