import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int var1=scanner.nextInt();
        System.out.println("Enter number 2:");
        int var2=scanner.nextInt();
        System.out.println("Enter the operation(a - add, s - subtract, m - multiply, d - divide)");
        char op=scanner.next().charAt(0);
        switch (op)
        {
            case 'a':
                System.out.println(var1+"+"+var2+"="+(var1+var2));
                break;
            case 's':
                System.out.println(var1+"-"+var2+"="+(var1-var2));
                break;
            case 'm':
                System.out.println(var1+"*"+var2+"="+(var1*var2));
                break;
            case 'd':
                if(var2==0)
                    System.out.println("Can not be divided by zero");
                else
                    System.out.println(var1+"/"+var2+"="+(var1/(double)var2));
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
