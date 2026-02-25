import java.util.*;

public class age_check {

    public static void checkAgeCategory(int age){
        if (age < 16) {
            System.out.println("minor");
        }else if (age >=16 && age < 18) {
            System.out.println("senior citizen");
        }else{
            System.out.println("adult and senior citizen");
        }
    }

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the age :\t");
         int age =  sc.nextInt();

           checkAgeCategory(age);   
           
          sc.close(); 
    }


}