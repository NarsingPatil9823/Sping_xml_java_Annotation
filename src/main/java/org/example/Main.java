package org.example;

import SpringConfiAnno.SpringConfigAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    private static void xmlConfig() {
        System.out.println("\n=== XML Based Configuration Started ===");
        String configLocation = "spring-config.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        Student student1 = context.getBean("bean1", Student.class);
        Student student2 = context.getBean("bean2", Student.class);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println("=== XML Based Configuration Completed ===\n");
    }

    private static void javaConfig() {
        System.out.println("\n=== Java @Configuration Based Configuration Started ===");

        ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student student3 = context1.getBean("bean1", Student.class);
        student3.display();
        System.out.println(student3);

        Student student4 = context1.getBean("bean2", Student.class);
        student4.display();
        System.out.println(student4);

        Student student5 = context1.getBean("bean3", Student.class);
        student5.display();
        System.out.println(student5);

        System.out.println("=== Java Based Configuration Completed ===\n");
    }

    private static void xmlAnnotationConfig() {
        System.out.println("\n=== XML Based Annotation Configuration Started ===");

        ApplicationContext context2 = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student student6 = context2.getBean("bean8", Student.class);
        student6.display();
        System.out.println(student6);

        System.out.println("=== XML Annotation Configuration Completed ===\n");
    }

    private static void javaAnnotationConfig() {
        System.out.println("\n=== Java Annotation Based Configuration Started ===");

        ApplicationContext context3 = new AnnotationConfigApplicationContext(SpringConfigAnnotation.class);

        Employee emp = context3.getBean("bean9", Employee.class);
        emp.display();
        System.out.println(emp);

        System.out.println("=== Java Annotation Configuration Completed ===\n");
    }
    public static void main(String[] args) {

        /*
        //spring only xml configuration file method using xml configuration-------------------------------------------------
        String configLocation = "spring-config.xml";
        ApplicationContext context = null;
        context=new ClassPathXmlApplicationContext(configLocation);
        Student student1 = context.getBean("bean1", Student.class);
        Student student2 = context.getBean("bean2", Student.class);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("xml based configuration method executed successfully---------------------------");


        //only java based configuration method using @Configuration class---------------------------------------------------
        ApplicationContext context1 = null;
        context1 = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student student3 = context1.getBean("bean1", Student.class);
        System.out.println("calling display method for student1:");
        student3.display();
        System.out.println("calling toString method for student1:");
        System.out.println(student3);
        System.out.println("-------------------");

        Student student4 = context1.getBean("bean2", Student.class);
        System.out.println("calling display method for student2:");
        student4.display();
        System.out.println("calling toString method for student2:");
        System.out.println(student4);
        System.out.println("--------------------");

        Student student5=context1.getBean("bean3",Student.class);
        System.out.println("calling display method for student3:");
        student5.display();
        System.out.println("calling toString method for student3:");
        System.out.println(student5);
        System.out.println("java based configuration method executed successfully------------------------------");


        //method-1 xml Annotation based configuration method using @Component class--method-1-using-the-xml-configuration-----------------------------------------
        System.out.println("xml based annotation configuration for component scan started------------------------------");
        ApplicationContext context2 = null;
        String packageName = "ApplicationContext.xml";
        context2 = new ClassPathXmlApplicationContext(packageName);
        Student student6 = context2.getBean("bean8", Student.class);
        System.out.println("calling display method for student4:");
        student6.display();
        System.out.println("calling toString method for student4:");
        System.out.println(student6);
        System.out.println("annotation based xml configuration based executed successfully------------------------------");


        System.out.println("without xml, annotation based java configuration for component scan started------------------------------");
        //method-2 without xml Annotation based configuration method using @Component class--method-2-using-the-java-configuration---------------------------
        ApplicationContext context3 = null;
        context3 = new AnnotationConfigApplicationContext(SpringConfigAnnotation.class);
        Employee emp = context3.getBean("bean9", Employee.class);
        System.out.println("calling display method for student5:");
        emp.display();
        System.out.println("calling toString method for student5:");
        System.out.println(emp);
        System.out.println("annotation based java configuration based executed successfully------------------------------");
*/

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=========== Spring Configuration Menu ===========");
            System.out.println("1. XML Based Configuration");
            System.out.println("2. Java @Configuration Class (No XML)");
            System.out.println("3. XML Based Annotation Configuration (@Component Scan)");
            System.out.println("4. Java Annotation Based Configuration (@Component Scan)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> xmlConfig();
                case 2 -> javaConfig();
                case 3 -> xmlAnnotationConfig();
                case 4 -> javaAnnotationConfig();
                case 5 -> {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }





    }
}