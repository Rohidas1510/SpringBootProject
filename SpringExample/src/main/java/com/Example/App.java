package com.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Example.Entity.Agent;
import com.Example.Entity.Agentdao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// ApplicationContext represent the Spring IoC Containers
    	//also give path of config.xml file.
    	ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
    	
    	//create object of Agentdao class age call getBean method.
    	Agentdao dao=(Agentdao) ap.getBean("x");
    	
    	//Give value to Agent class variable
    	System.out.println(dao.saveAgent(new Agent(1,"Rohidas",50000)));
    	System.out.println(dao.saveAgent(new Agent(2,"Prasad",40000)));
    	System.out.println(dao.saveAgent(new Agent(3,"Dinesh",30000)));
    	System.out.println(dao.saveAgent(new Agent(4,"Ganesh",20000)));
    	
    	//update value of Agent class variable
    	System.out.println(dao.updateAgent(new Agent(1,"Shubham",50000)));
    	
    	//delete value from Agent class
    	System.out.println(dao.deleteAgent(new Agent(4)));
        System.out.println( "Hello World!" );
    }
}

/*OUTPUT*/

/* Enter password: **********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 8.0.31 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use dnyanu;
Database changed
mysql> create table agent1(id int, name varchar(30), commission varchar(30));
Query OK, 0 rows affected (4.11 sec)

1] Insertion operation:
+----+-----------+------------+
| id | name      | commission |
+----+-----------+------------+
|  1 | Rohidas   |      50000 |
|  2 | Prasad    |      40000 |
|  3 | Dinesh    |      30000 |
|  4 | Ganesh    |      20000 |
+----+-----------+------------+

2] updation operation
+----+-----------+------------+
| id | name      | commission |
+----+-----------+------------+
|  1 | Shubham   |      50000 |
|  2 | Prasad    |      40000 |
|  3 | Dinesh    |      30000 |
|  4 | Ganesh    |      20000 |
+----+-----------+------------+

3] Delete operation:
+----+-----------+------------+
| id | name      | commission |
+----+-----------+------------+
|  1 | Shubham   |      50000 |
|  2 | Prasad    |      40000 |
|  3 | Dinesh    |      30000 |
+----+-----------+------------+
mysql>

*/