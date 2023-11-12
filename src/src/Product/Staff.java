package Product;

public class Staff {
    private String name;
    private int wage;
    private String status;
    private String workTime;

    public Staff(String name, int wage, String status, String workTime) {
        this.name = name;
        this.wage = wage;
        this.status = status;
        this.workTime = workTime;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "NV { " +
                "Ten='" + name + '\'' +
                ", Tien luong=" + wage+"/h" +
                ", Trang thai='" + status + '\'' +
                ", Thoi gian lam viec='"+ workTime +'\'' +
                '}' + "\n";
    }
    public String getData(){
        return name + "," + wage + "," + status + "," + workTime + "\n";
    }
}
