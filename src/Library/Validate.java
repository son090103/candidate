
package Library;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import candidate.Candidate;


public class Validate {
    // kiểm tra birth date với độ dài là 4 ký tự 
    // kiểm tra giới hạn nhập vào của người dùng 
    // người dùng cần nhập cho đến khi đúng giá trị thì thôi 
    // tạo ra hàm scanner 
    private static final String PHONE_VALID = "^\\d{10}\\d*$";
    private static final String EMAIL_VALID
            = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";

    public static Scanner sc = new Scanner(System.in);
    // check nam
    public static int checkInputIntLimit(int min, int max){
        // đầu tiên do năm truyền vào là một số có 4 chữ số 
        while(true){
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
            if(result<min  || result>max){
                System.out.println("nhap lai:");
              }
            else return result;
            } catch (Exception e) {
                System.out.println("Enter again: ");
            }
        }
        }
            // điều kiện để vòng while luôn chạy 
           // nhập phone tối thiếu 10 chữ character
   
    
    // viết một hàm kiểm tra chuỗi đầu vào 
    public static String checkInputString(){
        String result = sc.nextLine().trim();
        while(true){
            // vòng while chạy đến khi nào đúng thì thôi 
            if(result.isEmpty()){
                System.out.println("in put not emtry");
                System.out.println("Enter again");
            }
            else return result;
        }
    }
    // kiểm tra thứ hạng tốt nghiệp của người dùng 
    public static String checkrrank(){
        String rank = checkInputString();
        // chỉ nhập vào , giỏi , xuất sắc, trung bình , kém 
        // so sánh equals không phần biệt chữ hoa hay chữ thường 
        while(true){
            if(rank.equalsIgnoreCase("Excellence")||
               rank.equalsIgnoreCase("Good")||
               rank.equalsIgnoreCase("Fair")||
               rank.equalsIgnoreCase("Poor")){
                return rank;
            }
            else {
                System.out.println(" du lieu nhap vao khong đúng");
                System.out.println("Enter again: ");
            }
        }
    }
    // check phone 
    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(PHONE_VALID)) { // //kiểm tra điện thoại người dùng nhập có hợp lệ không
                return result;
            } else {
                System.err.println("Phone is number with minimum 10 characters");
                System.out.print("Enter again: ");
            }
        }
    }
    // kiểm tra email
     //kiểm tra email với định dạng <tên tài khoản>@<domain>. (ví dụ: annguyen@fpt.edu.vn)
    public static String checkInputEmail() {
        while (true) {
            String result = checkInputString();
            if (result.matches(EMAIL_VALID)) { // ktra email nhap vao
                return result;
            } else {
                System.err.println("Email with format <account name>@<domain>");
                System.out.print("Enter again: ");
            }
        }
    }

      public static Integer getInt(String promt, int min, int max)
    {
        Integer a = null;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print(promt + ": ");
            try
            {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= min && a <= max)
                {
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return a;
    }
      // kiểm tra người dùng có muốn tiếp tục hay không 
      //kiểm tra đầu vào của người dùng y/Y hoặc n/N
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    public static boolean checkIdExist(ArrayList<Candidate> candidates, String id) {
        for (Candidate candidate : candidates) {
            if (candidate.getID().equalsIgnoreCase(id)) {
                System.err.println("Id exist.");
                return false;
            }
        }
        return true;
    }
    // kieme tra nam kinh nghiêm
    public static int checkInputExprience(int birthDate) {
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int age = yearCurrent - birthDate;
        while (true) {
            int yearExperience = checkInputIntLimit(1, 100);
            if (yearExperience > age) {
                System.err.println("Experience must be smaller than age");
            } else {
                return yearExperience;
            }
        }

    }
}

 