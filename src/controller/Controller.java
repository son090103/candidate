/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Library.Validate;
import Menu.Menu;
import java.util.ArrayList;
import java.util.Calendar;
import candidate.Candidate;
import candidate.Experience;
import candidate.Fresher;
import candidate.Internship;

/**
 *
 * @author son
 */
public class Controller extends Menu{
    private ArrayList<Candidate> candidates;
    public Controller(String title, String []mc){
        super(title,mc);
        candidates = new ArrayList<>();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                createCandidate(candidates, 0);
                break;
            case 2: 
                createCandidate(candidates, 1);
                break;
            case 3:
                createCandidate(candidates, 2);
                break;
                
            case 4: 
            {
                searchCandidate(candidates);
                break;
            }
            case 5:
                return;
            default:
                System.out.println("chi nhap tu 1 -5");
        }
    }
     public static void createCandidate(ArrayList<Candidate> candidates,int type) {
        while (true) {
            System.out.print("Enter id: ");
            String id = Validate.checkInputString();
            System.out.print("Enter first name: ");
            String firstName = Validate.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = Validate.checkInputString();
            System.out.print("Enter birth date: ");
            int birthDate = Validate.checkInputIntLimit(1900,
            Calendar.getInstance().get(Calendar.YEAR));
            System.out.print("Enter address: ");
            String address = Validate.checkInputString();
            System.out.print("Enter phone: ");
            String phone = Validate.checkInputPhone();
            System.out.print("Enter email: ");
            String email = Validate.checkInputEmail();
//            Candidate candidate = new Candidate(id, firstName, lastName,
//                    birthDate, address, phone, email, type);
            Candidate candidate = new Candidate(id, firstName, lastName, birthDate, address, phone, email, type);
            //kiểm tra id có tồn tại hay không;
            if (Validate.checkIdExist(candidates, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                    default:
                            System.out.println("Invalid candidate type.");
                              break;
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            //check user want to create new candidate or not
            if (!Validate.checkInputYN()) {
                return;
            }
        }
    }
      public static void createExperience(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = Validate.checkInputExprience(candidate.getDate());
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validate.checkInputString();
        candidates.add(new Experience(yearExperience, professionalSkill,
                candidate.getID(), candidate.getFirstname(), candidate.getLastname(),
                candidate.getDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }
       public static void createFresher(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = Validate.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = Validate.checkrrank();
        candidates.add(new Fresher(graduationDate, graduationRank, candidate.getID(),
                candidate.getFirstname(), candidate.getLastname(),
                candidate.getDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }
    public static void createInternship(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter major: ");
        String major = Validate.checkInputString();
        System.out.print("Enter semester: ");
        String semester = Validate.checkInputString();
        System.out.print("Enter university: ");
        String university = Validate.checkInputString();
        candidates.add(new Internship(major, semester, university, candidate.getID(),
                candidate.getFirstname(), candidate.getLastname(),
                candidate.getDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }
      public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = Validate.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validate.checkInputIntLimit(0, 2);
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate() == typeCandidate
                    &&( candidate.getFirstname().contains(nameSearch)
                    || candidate.getLastname().contains(nameSearch))) {
                System.out.println(candidate.toString());
            }
        }
    }
  public static void printListNameCandidate(ArrayList<Candidate> candidates) {
       System.err.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstname() + " "
                        + candidate.getLastname());
            }
        }
        System.err.println("Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstname() + " "
                        + candidate.getLastname());
            }
        }
        System.err.println("Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Internship) {
                System.out.println(candidate.getFirstname() + " "
                        + candidate.getLastname());
            }
        }
    }
}

