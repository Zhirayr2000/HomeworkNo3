public class Exercise2 {
    public static void main(String[] args) {
        int number=Integer.parseInt(args[0]);
        String str="";
        switch(number)
        {
            case 5:
                str="Going to floor 5,";
            case 4:
                str="Going to floor 4,"+str;
            case 3:
                str="Going to floor 3,"+str;
            case 2:
                str="Going to floor 2,"+str;
            case 1:
                str="Going to floor 1."+str;
                System.out.println(str);
                break;
            default:
                System.out.println("There are only 5 floors(1-5)");
        }
    }
}
