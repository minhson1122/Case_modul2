package readAndWrite;
import Product.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class rwStaff {
    private File file = new File("file.csv");
    public void writeFile(List<Staff> staffs){
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Staff staff:staffs) {
                line += staff.getData();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Staff> readFile() {
        List<Staff> staffs = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                Staff staff = new Staff(data[0],Integer.parseInt(data[1]),data[2],data[3]);
                staffs.add(staff);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return staffs;
    }
}
