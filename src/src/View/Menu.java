package View;
import Manager.Manager;
import Product.Staff;
import Validate.valiDateStaff;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Menu {
    Manager manager = new Manager();
    Scanner inputStr = new Scanner(System.in);
    Scanner inputNum = new Scanner(System.in);

    public void showMenu() {
        int choice;
        do {
            System.out.println("===Menu===");
            System.out.println("1: Add Staff\n2: Search Staff\n3: Check Status\n4: Edit Staff\n5: Edit Status\n6: Show All staff\n7:Remove staff\n0: OUT");
            choice = inputNumber();
            switch (choice) {
                case 1:
                    showAdd();
                    break;
                case 2:
                    showSearchStaff();
                    break;
                case 3:
                    showCheckStatus();
                    break;
                case 4:
                    showEditStaff();
                    break;
                case 5:
                    showEditStatus();
                    break;
                case 6:
                    showAll();
                    break;
                case 7 :
                    showFormRemove();
                    break;
            }
        } while (choice != 0);
    }

    public int inputNumber() {
        int number;
        do {
            try {
                number = Integer.parseInt(inputNum.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("----Yêu cầu chỉ nhập số----");
            }
        } while (true);
        return number;
    }

    public void showAdd() {
        System.out.println("Add Staff");
        System.out.println("Name");
        String name = valiDateStaff.inputCheck();
        System.out.println("Wage(USD)/Hour");
        int wage = inputNumber();
        System.out.println("Status 'online/offline'");
        String status = valiDateStaff.inputCheck();
        System.out.println("Word time 'fulltime/parttime'");
        String wordTime = valiDateStaff.inputCheck();
        Staff staff = new Staff(name, wage, status, wordTime);
        manager.add(staff);
        System.out.println("====> Added Successfully");
    }

    public void showSearchStaff() {
        System.out.println("Enter the name you want to find:");
        String checkName = inputStr.nextLine();
        System.out.println(manager.searchName(checkName));
    }

    public void showCheckStatus() {
        System.out.println("Check Staff Online, enter 'online' or 'offline'");
        String checkStatus = inputStr.nextLine();
        System.out.println("List staff " + checkStatus);
        manager.checkStatus(checkStatus);
    }

    public void showEditStaff() {
        System.out.println("Enter the name staff you want to edit");
        String editName = inputStr.nextLine();
        System.out.println("Name");
        String name = valiDateStaff.inputCheck();
        System.out.println("Wage(USD)/House");
        int wage = inputNumber();
        System.out.println("Status");
        String status = valiDateStaff.inputCheck();
        System.out.println("Word time 'fulltime or parttime'");
        String wordTime = valiDateStaff.inputCheck();
        Staff staff = new Staff(name, wage, status, wordTime);
        manager.editStaff(editName, staff);
        System.out.println("====> Edit Successfully");
    }

    public void showAll() {
        System.out.println(manager.findAll());
    }

    public void showEditStatus(){

        System.out.println("Enter the name staff you want to edit status ");
        String name = inputStr.nextLine();
        System.out.println("Edit status");
        String editStatus = inputStr.nextLine();
        manager.editStatus(name,editStatus);
        System.out.println("====> Edit Successfully");
    }
    public void showFormRemove(){
        System.out.println("Enter the name staff you want remove");
        String nameRemove = inputStr.nextLine();
        manager.removeStaff(nameRemove);
        System.out.println("Remove successfully");
    }
}
