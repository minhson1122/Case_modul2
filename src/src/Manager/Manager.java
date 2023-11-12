package Manager;

import Product.Staff;
import readAndWrite.rwStaff;

import java.util.ArrayList;

public class Manager implements IManager<Staff>{
    ArrayList<Staff> list;
    private rwStaff rwStaff = new rwStaff();

    public Manager() {
        this.list = (ArrayList<Staff>) rwStaff.readFile();
    }

    @Override
    public void add(Staff staff) {
        list.add(staff);
        rwStaff.writeFile(list);
    }

    @Override
    public ArrayList<Staff> searchName(String name) {
        ArrayList<Staff> staff = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                staff.add(list.get(i));
            }
        }
        return staff;
    }


    @Override
    public ArrayList<Staff> checkStatus(String status) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStatus().toLowerCase().contains(status.toLowerCase())) {
                System.out.println(list.get(i));
            }
        }
        return null;
    }

    @Override
    public ArrayList<Staff> editStaff(String name, Staff staff) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.set(i, staff);
                rwStaff.writeFile(list);
            }
        }
        return null;
    }

    @Override
    public void editStatus(String name,String status) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.get(i).setStatus(status);
                rwStaff.writeFile(list);
            }
        }
    }

    @Override
    public ArrayList<Staff> findAll() {
        return list;
    }

    @Override
    public void removeStaff(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)){
                list.remove(i);
            }
        }
    }
}
