package Validate;
import java.util.Scanner;
public class valiDateStaff {
    public static Scanner input = new Scanner(System.in);
    public static String inputCheck(){
        String regex = "^[a-z A-Z 0-9]{2,15}$";
        String name;
        do {
            System.out.println("2 - 15 alphabet : ");
            name = input.nextLine();
            if (name.matches(regex)){
                break;
            }else {
                System.out.println("!! Error....Nhap 2 - 15 alphabet :");
            }
        }while (true);
        return name;
    }
}
