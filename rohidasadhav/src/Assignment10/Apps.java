package Assignment10;
package com.hiberstudent;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Apps 
{
	//declare addemp method
	public static String addemp(Session ss,Transaction t)
	{
		//object creation
		student emp=new student();
		//scanner class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id :");
		int eid=sc.nextInt();
		emp.setEid(eid);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Employee Name :");
		String ename=sc1.nextLine();
		emp.setEname(ename);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Employee Deparment :");
		String edept=sc2.nextLine();
		emp.setEdept(edept);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Employee Salary :");
		int esalary=sc3.nextInt();
		emp.setEsalary(esalary);
		
		Address ad=new Address();
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter the Employee Home Name :");
		String hname=sc2.nextLine();
		ad.setHname(hname);
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter the Employee Area :");
		String area=sc2.nextLine();
		ad.setArea(area);
		
		Scanner sc6=new Scanner(System.in);
		System.out.println("Enter the Employee City :");
		String city=sc6.nextLine();
		ad.setCity(city);
		
		Scanner sc7=new Scanner(System.in);
		System.out.println("Enter the Employee Pincode :");
		int pincode=sc7.nextInt();
		ad.setPincode(pincode);
		//ss.save(ad);
		emp.setAddress(ad);//set address in emp
		ss.save(emp);//save emp
		t.commit();
        
		return "Employee is Added";
		
	}
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        Configuration cfg=new Configuration().configure().addAnnotatedClass(student.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss=sf.openSession();
     //   Session s1=sf.getCurrentSession();
        Transaction t=ss.beginTransaction();
      //  Employee emp=new Employee();
        System.out.println(addemp(ss,t));//calling method
        
        
        
    }
}

Output 

mysql> select * from employee_details;
+-----+------------+------+----------------+---------+----------+--------+---------+
| eid | area       | city | hname          | pincode | edept    | ename  | esalary |
+-----+------------+------+----------------+---------+----------+--------+---------+
|   4 | hadapasar  | pune | bhekarai       |  410112 | cs       | rohit  |   50000 |
|   1 | dhayari    | pune | skyline        |   44110 | bcs      | ganesh |   15000 |
|   2 | kale padal | pune | shivatej       |  333333 | bca      | prasad |   20000 |
|   3 | konadhwa   | pune | gokuldham      |   43454 | engineer | suraj  |   20000 |
|   5 | magarpatta | pune | ganesh society |   22343 | science  | kisan  |   50000 |
+-----+------------+------+----------------+---------+----------+--------+---------+
5 rows in set (0.00 sec)

mysql>
