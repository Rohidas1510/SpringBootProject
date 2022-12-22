package com.Example;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App  
{
	
	
    public static void main( String[] args )
    {
         
    	Configuration cfg =  new Configuration().configure().addAnnotatedClass(Teacher.class);
     	Configuration cfg1=new Configuration().configure().addAnnotatedClass(Course.class);
     	SessionFactory sf = cfg.buildSessionFactory(); // build Session factory
     	// session
     	Session ss = sf.openSession();
     	Transaction tx = ss.beginTransaction(); // transaction start

    	
    	//create Teacher
    	Teacher t = new Teacher();
    	t.setT_ID(1);
    	t.setName("Mrunali");
    	
    	//create Teacher
    	Teacher t1 = new Teacher();
    	t1.setT_ID(2);
    	t1.setName("Deshmukh");
    	
    	// create course
    	Course c = new Course();
    	c.setC_Id(101);
    	c.setCourse_name("Java");
    	c.setTeacher(t);
    	
    	
    	// create course
    	Course c1 = new Course();
    	c1.setC_Id(102);
    	c1.setCourse_name("Python");
    	c1.setTeacher(t);
    	
    	// create  course
    	Course c2 = new Course();
    	c2.setC_Id(103);
    	c2.setCourse_name("Angular");
    	c2.setTeacher(t);
    	
    	// create course
    	Course sc = new Course();
    	sc.setC_Id(104);
    	sc.setCourse_name("Core Java");
    	sc.setTeacher(t1);
    	
    	// create course
    	Course sc1 =new Course();
    	sc1.setC_Id(105);
    	sc1.setCourse_name("C++");
    	sc1.setTeacher(t1);
    	
    	// course add in list
    	List<Course>course=new ArrayList<Course>();
    	// add course in list
    	course.add(c);
    	course.add(c1);
    	course.add(c2);
    	 // course add in list
    	List<Course>course1=new ArrayList<Course>();
    	course1.add(sc);
    	course1.add(sc1);
    	
    	
    	
		t.setCourse(course); 
		t1.setCourse(course1);
		
		//save
		ss.save(t);
		ss.save(t1);
		ss.save(c);
		ss.save(c1);
		ss.save(c2);
		ss.save(sc);
		ss.save(sc1);
		
		tx.commit();
	
    }
   
}

/*OUTPUT*/

/* Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 47
Server version: 8.0.31 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use comp;
Database changed
mysql> show tables;
+--------------------------------+
| Tables_in_comp                 |
+--------------------------------+
| course_details                 |
| emp                            |
| emp_lern                       |
| project                        |
| student                        |
| teacher_details                |
| teacher_details_course_details |
+--------------------------------+
7 rows in set (0.28 sec)

mysql> select * from Course_details;
+------+-------------+--------------+
| C_Id | Course_name | teacher_T_ID |
+------+-------------+--------------+
|  101 | Java        |            1 |
|  102 | Python      |            1 |
|  103 | Angular     |            1 |
|  104 | Core Java   |            2 |
|  105 | C++         |            2 |
+------+-------------+--------------+
5 rows in set (0.05 sec)

mysql> select * from teacher_details;
+------+----------+
| T_ID | Name     |
+------+----------+
|    1 | Mrunali  |
|    2 | Deshmukh |
+------+----------+
2 rows in set (0.00 sec)

mysql> select * from teacher_details_course_details;
+--------------+-------------+
| Teacher_T_ID | course_C_Id |
+--------------+-------------+
|            1 |         101 |
|            1 |         102 |
|            1 |         103 |
|            2 |         104 |
|            2 |         105 |
+--------------+-------------+
5 rows in set (0.02 sec)

mysql>
*/