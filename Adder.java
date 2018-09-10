import java.util.Scanner;

class Adder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.print("enter x = ");
        x = sc.nextInt();
        System.out.print("enter y = ");
        y = sc.nextInt();
        z = x-y;
        System.out.println("z = " + z);


    }
}