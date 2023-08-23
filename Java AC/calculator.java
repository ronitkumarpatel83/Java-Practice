package conditional_statement;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========= Calculator ===========");
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int button = sc.nextInt();
        switch(button) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default :
                System.out.println("Invalid");
        }


    }
    
}
