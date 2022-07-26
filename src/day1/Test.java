/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static List<Course> courses = new LinkedList<>();
    
    private static void courseListInitializatiob(){
        courses.add(new Course("int101",3.0,"compro"));
        courses.add(new Course("int201",3.0,"frontend"));
        courses.add(new Course("int202",2.5,"backend"));
        courses.add(new Course("int102",2.5,"aa"));
    }
    public static void simpleSort(){
        for(Course course : courses){
            System.out.println(course);
        }
        courses.sort(Comparator.naturalOrder()); //compare all List
        System.out.println("---------------");
        // courses.forEach(course -> System.out.println(course));
        //courses.forEach(System.out::println);

         courses.parallelStream() //each core of cpu but sequential will do in 1 core
//                 .filter(c->c.getCredit()<3) //check credit < 3
                 .filter(Course::lessThanThree)
                 .forEachOrdered(System.out::println);
    }
    
    public static void main(String[] args) {
              courseListInitializatiob();
              simpleSort();
    }
}
