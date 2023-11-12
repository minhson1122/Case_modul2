package View;
import readAndWrite.rwStaff;
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
        rwStaff rw = new rwStaff();
        rw.readFile();
    }
}
