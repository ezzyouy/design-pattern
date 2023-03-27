package prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("entre Employe Id : ");
        int eid= Integer.parseInt(br.readLine());
        System.out.println("\n");

        System.out.println("entre Employe Name : ");
        String ename= br.readLine();
        System.out.println("\n");

        System.out.println("entre Employe Designation : ");
        String edesignation= br.readLine();
        System.out.println("\n");

        System.out.println("entre Employe Salary : ");
        Double esalary= Double.parseDouble(br.readLine());
        System.out.println("\n");

        System.out.println("entre Employe Address : ");
        String eaddress= br.readLine();
        System.out.println("\n");

        EmployeeRecord emp= new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);

        emp.showRecord();
        System.out.println("\n");
        EmployeeRecord emp2= (EmployeeRecord) emp.getClone();
        emp2.showRecord();

        EmployeeRecord emp3= emp.clone();
        emp3.showRecord();

    }
}
