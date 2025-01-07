import java.util.Arrays;
import java.util.Scanner;

public class JavaHomework {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            math(3,5);

            for(int i = 1; i<=20; i+= 2){
                System.out.print(i+" ");
            }

            SwapVariables(4,6);

            System.out.println("Enter three numbers separated by spaces.");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int max = num1;

            if(num2 > max){
                max = num2;
            }
            if(num3 > max){
                max = num3;
            }

            System.out.println("The max value is: "+max);


            PositiveOrNegative(5);



            ReplaceSymbols("Maama",'a','o');

            int[] a = {4,3,1,5,2};
            int sum = 0;
            for(int i = 0; i<a.length;i++){
                sum += a[i];
            }
            System.out.println(sum);

            Arrays.sort(a);
            System.out.println(a[a.length-2]);

        }

        static void math(double x, double y){
            if(x == 0 || y == 0){
                throw new ArithmeticException("U can't divide by zero.");
            } else{
                System.out.println("Multiplication: "+(x*y));
                System.out.println("Division: "+(x/y));
                System.out.println("Sum: "+(x+y));
                System.out.println("Subtraction: "+(x-y));
            }
        }

        static void SwapVariables(int x, int y){
            int z = x;
            x = y;
            y = z;
            System.out.println("x equals to: "+x);
            System.out.println("y equals to: "+y);
        }

        static void PositiveOrNegative(double a){
            if(a>0){
                System.out.println("The number is positive");
            }else{
                System.out.println("The number is negative");
            }
        }

        static void ReplaceSymbols(String str,char symbol,char replaced){
            System.out.println(str.replace(symbol,replaced));
        }


    }


