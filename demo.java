// // // public class demo {

// // //     public static void main(String[] args) {
// // //         int m = 12;
// // //         float f = 2.3f;
// // //         double d = 34.3d;
// // //         byte b = 5;
// // //         char c =  'd';
// // //         String s = "arun";
// // //         boolean isPass = true;
// // //         short ss = 45;
// // //         long n = 23443l;
// // //         System.out.println(n);
// // //         System.out.println(ss);
// // //         System.out.println(isPass);
// // //         System.out.println("name : "  + s);
// // //         System.out.println(c);
// // //         System.out.println(b);
// // //         System.out.println(d);
// // //         System.out.println(f);
// // //         System.out.println(m);
// // //     }

// // // }

// // public class demo {

// //     public static void main(String[] args) {
// //         char c = 'e';
// //         int v = c + 1;
// //         System.out.println(v);
// //     }
// // }


// // public class demo {

// //     public static void main(String[] args) {
// //         int a = 40;
// //         int b = 30;

// //         if(a >= b  || a==b){
// //             System.out.println("satisfy");
// //         }else{
// //             System.out.println("not satisfy");
// //         }
// //     }
// // }

// public class demo {

//     public static void main(String[] args) {
//         int a = 126;
//         byte b = (byte)a;   //type casting 

//         byte c = 12;
//         a=c;    //type conversion because byte varry only 127 to -128
//                 //also if int value is 12 then not working becasue data type is differnt and use type casting here
         
//       byte r = 10;
//       byte r2 = 30;
//     //   int result = r * r2;
//     //   System.out.println(result);
        
//     //     System.out.println(b);

// //arithmatic operator
//         int m = 7;
//         int m2 = 5;
//         float result2 = m + m2;
//         // System.out.println(result2);
//         System.out.println(m++);  //post increment
//         System.out.println(m);

//         System.out.println(--m2);  //pre decrement
//         System.out.println(m2);

//     }
// }

// public class demo {

//     public static void main(String[] args) {
//         int x = 100;
//         int x2 = 200;
//         if(x <= x2 && x != x2){
//             System.out.println("this is fine");
//         }else{
//             System.out.println("this is not fine");
//         }
//     }

    
// }

// public class demo {

//     public static void main(String[] args) {
//         int a = 23;
// int b = 22;
// int c = 56;
// int d = 55;

// boolean result = (a>b) && (c>=d);
//  System.out.println(!result);

//     }
// }

public class demo {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);

        // boolean result = (a>b);
        boolean result = a>b && a>0;
        boolean result2 = a>b;
        System.out.println(result2);
        System.out.println(result);
        System.out.println(a>b);
    
    }
}