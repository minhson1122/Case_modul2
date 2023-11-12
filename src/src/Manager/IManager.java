package Manager;

import java.util.ArrayList;

public interface IManager<E> {
    void add(E e);
    ArrayList<E> searchName(String name);
    ArrayList<E> checkStatus(String status);
    ArrayList<E> editStaff(String name, E e);
    void editStatus(String name,String status);
    ArrayList<E> findAll();
    void removeStaff(String name);
}
