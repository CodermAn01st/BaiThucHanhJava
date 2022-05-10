package mainchild.Emphloyee;

import mainchild.Employee;

public class PartTimeOnlineEmployee extends Employee {
    private double luong;
    private double sogiolam;
    public PartTimeOnlineEmployee() {}

    public PartTimeOnlineEmployee(String name, int age, String address, double luong, double sogiolam) {
      this.luong = luong;
      this.sogiolam = sogiolam;
   }
    public double totalSalary() {
    return luong * sogiolam;
   }
}