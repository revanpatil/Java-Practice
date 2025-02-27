//with for loop & if-else statement:
import java.util.Scanner;
public class HCF {

    public static void main(String args[]) {
        int number1, number2,hcf = 1;
        System.out.println("Enter 2 numbers to find HCF.");
        Scanner input = new Scanner(System.in);
        System.out.print("1st: ");
        number1 = input.nextInt();
        System.out.print("2nd: ");
        number2 = input.nextInt();
        
        for (int i =1; i<=number1 && i<=number2; i++){
            if(number1 % i ==0 && number2 % i ==0){
                hcf =i;
            }
        }
        System.out.println("HCF/GCD of numbers " + number1 + " & " + number2 + " : " + hcf);
    }
}


/*
Output:
1. 
Enter 2 numbers to find HCF.
1st: 155
2nd: 75
HCF/GCD of numbers 155 & 75 : 5
2.
Enter 2 numbers to find HCF.
1st: 257
2nd: 83
HCF/GCD of numbers 257 & 83 : 1
*/
  


//Using while loop & if-else:
import java.util.Scanner;
public class HCF2 {

    public static void main(String args[]) {
        int number1, number2;
        System.out.println("Enter 2 numbers to find HCF.");
        Scanner input = new Scanner(System.in);
        System.out.print("1st: ");
        number1 = input.nextInt();
        System.out.print("2nd: ");
        number2 = input.nextInt();
        
        while(number1 != number2){   //81 72; 9 72; 9 63; 9 54; 9 45; 9 36; 9 27; 9 18; 9 9
            if(number1 > number2){
                number1 -= number2;
            } else{
                number2-=number1;
            }
        }
        System.out.println("HCF/GCD of given positive numbers is: " + number1);
    }
}


/*
Output:
Enter 2 numbers to find HCF.
1st: 81
2nd: 153
HCF/GCD of given positive numbers is: 9
*/


//Using while loop & if-else statent for positive/non-positive numbers:
import java.util.Scanner;
public class HCF3 {

    public static void main(String args[]) {
        int number1, number2;
        System.out.println("Enter 2 numbers to find HCF.");
        Scanner input = new Scanner(System.in);
        System.out.print("1st: ");
        number1 = input.nextInt();
        System.out.print("2nd: ");
        number2 = input.nextInt();
        
        number1 = (number1>0) ? number1 : -number1;
        number2 = (number2>0) ? number2 : -number2;
        
        while(number1 != number2){
            if(number1 > number2){
                number1 -= number2;
            } else{
                number2-=number1;
            }
        }
        System.out.println("HCF/GCD of given numbers is: " + number1);
    }
}

/*
Output:
Enter 2 numbers to find HCF.
1st: 81
2nd: -153
HCF/GCD of given numbers is: 9
*/




//Using recursion:
import java.util.Scanner;

public class HCF4 {
    public static void main(String args[]) {
        int num1, num2, gcd; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number to find HCF/GCD: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number to find HCF/GCD: ");
        num2 = input.nextInt();
        
        gcd = hcf(num1,num2);
        System.out.println("HCF of numbers " + num1 + " & " + num2 + " = " + gcd);
    }
    
    static int hcf(int num1, int num2){
        if (num2 != 0){
            return hcf(num2, num1%num2); // 81 72; 72 9; 9 0; 
        } else {
            return num1;
        }
    }
}



/*
Output:
Enter 1st number to find HCF/GCD: 81
Enter 2nd number to find HCF/GCD: 153
HCF of numbers 81 & 153 = 9
*/
