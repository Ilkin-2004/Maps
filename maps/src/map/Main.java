package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Ilkin","kerimov",10);
        Teacher teacher2=new Teacher("kenan","ekberov",20);
        Student s1=new Student("student1","student1ov",2);
        Student s2=new Student("student2","student2ov",3);
        Map<Teacher,Student> hashMap=new HashMap<>();
        hashMap.put(teacher1,s1);
        hashMap.put(teacher2,s2);
        System.out.println("Hashmap isdifade edende");
   System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
System.out.println();
        Teacher teacher3=new Teacher("Ilkin","kerimov",10);
        Teacher teacher4=new Teacher("kenan","ekberov",20);
        Student s3=new Student("student3","student3ov",2);
        Student s4=new Student("student4","student4ov",3);
        Map<Teacher,Student>treemap=new TreeMap<>();
        treemap.put(teacher3,s3);
        treemap.put(teacher4,s4);
        System.out.println("Treemap isdifade edende");
       System.out.println( treemap.keySet());
        System.out.println(treemap.values());
    }
}