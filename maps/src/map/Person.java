package map;


// Treemap isdifade edende impiment edilmelidi cunki kicikden boyuye muqayise ederek qaytarir shortet edir
public class Person implements Comparable<Teacher> {
    public String name;
    public String surname;
    public int age;
    public Person (String name, String  surname,int age){
this.age=age;
this.name=name;
this.surname=surname;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return this.age+" "+this.name+" "+this.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Teacher o) {

       if(this.getAge()>o.getAge()){
          return  1;
       }
    else   if(this.getAge()==o.getAge()) {
       return 0;
       }
       else{
          return -1;
       }
    }
}
