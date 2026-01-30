// import java.util.Scanner;

// public class condition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your age here");
//         int x = sc.nextInt();
//                 if(x>=18){
//             System.out.println("ya you can vote");
//         }else{
//             System.out.println("you can not vote");
//         }
//         sc.close();;
//     }
// }


// 2 another code 
// import java.util.Scanner;
// public class condition {

//     public static void main(String[] args) {
//         System.out.println("enter your age");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//          String result = (age > 18) ? "you can vote" :"you can not vote";
//          System.out.println(result);
//          sc.close();
//     }
// }

//if else if condition statment

//========================================Problem======================================:
// Write a Java program that takes a student’s marks (0–100) and prints the grade using if – else if.
// Grading Rules:
// Marks ≥ 90 → Grade A
// Marks ≥ 75 → Grade B
// Marks ≥ 60 → Grade 
// Marks ≥ 40 → Grade D
// Marks < 40 → Fail
// 👉 Use if – else if – else only.

// import java.util.Scanner;

// public class condition {

//     public static void main(String[] args) {
//         System.out.println("enter your marks between 1 to 100");
//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();

//         if(marks>=90 && marks <=100){
//             System.out.println("Grade A");
//         }else if(marks>=75 && marks <=90){
//             System.out.println("Grade B");
//         }else if(marks>=60 && marks <=75){
//             System.out.println("Grade C");
//         }else if(marks>=40 && marks <=60){
//             System.out.println("Grade D");
//         }else if(marks<40){
//             System.out.println("fail");
//         }
//         sc.close();
//     }
// }


//switch statment

// import java.util.Scanner;

// public class condition {

//     public static void main(String[] args) {
//         System.out.println("enter the number here between 1 to 8");
//         Scanner sc = new Scanner(System.in);
//         int days = sc.nextInt();

//         switch (days) {
//             case 1:
//                 System.out.println("monday");
//                 break;
//             case 2:
//                 System.out.println("tuesday");
//                 break;
//             case 3:
//                 System.out.println("wednesday");
//                 break;
//             case 4:
//                 System.out.println("thrusday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             case 6:
//                 System.out.println("saturday");
//                 break;
//             default:
//                 System.out.println("sunday");
//                 break;
//         }
//         sc.close();

//     }
// }

import java.util.Scanner;

public class condition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int score = sc.nextInt();
        //   int score = 75;
        // char grade = 'B';
        
        if(score>=50){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        
        if(score>=90){
            System.out.println("Grade: " + "A");
        }else if(score>=75){
            System.out.println("Grade: " + "B");
        }else if(score>=60){
            System.out.println("Grade: " + "C");
        }else if(score<60){
            System.out.println("Grade: " + "D");
        }
    }
}