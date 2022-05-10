package mainchild.Emphloyee;

public class FullTimeOnlineEmployee {
    private double luong;
    private double songaylam;
    public FullTimeOnlineEmployee() {}

    public FullTimeOnlineEmployee(String name, int age, String address, double luong, double songaylam) {
      this.luong = luong;
      this.songaylam = songaylam;
   }
    public double totalSalary() {
    return luong * songaylam;
}
}
