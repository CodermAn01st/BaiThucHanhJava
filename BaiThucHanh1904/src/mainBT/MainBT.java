package mainBT;

import mainchild.Person;
import mainchild.Student;
import mainchild.Customer;
import mainchild.Employee;
import mainchild.VIPCustomer;
import mainchild.student.OnlineStudent;
import mainchild.student.OfflineStudent;
import mainchild.Emphloyee.FullTimeOnlineEmployee;
import mainchild.Emphloyee.PartTimeOnlineEmployee;

public class MainBT {
    public static void main(String[] args) {
        Person per = new Person();
        per.hienThiThongTin();

        Employee em = new Employee();
        em.hienThiThongTin();

        Student stu = new Student();
        stu.display();

        OnlineStudent onl = new OnlineStudent();
        onl.trangthaiStudent();
        OfflineStudent off = new OfflineStudent();
        off.loaiStudent();

        Customer cus = new Customer();
        cus.nhapEmail();
        cus.nhapName();
        cus.nhapAddress();
        VIPCustomer vip = new VIPCustomer();
        vip.hienThiThongTin();

        PartTimeOnlineEmployee parttime = new PartTimeOnlineEmployee();
        parttime.totalSalary();
        FullTimeOnlineEmployee fulltime = new FullTimeOnlineEmployee();
        fulltime.totalSalary();
}
}