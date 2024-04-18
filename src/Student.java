import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Student extends Hooman implements IAnimal {
    private String name;
    private String surname;
    private int birthYear;
    private boolean gender;
 //   public int[] grades;

  //  public Contact contacts;

public static void classInfo(){
    System.out.println("sita klase yra skirta kurti studentu objektams");
}
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public Student(){

    }
    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Student(String name, String surname, int birthYear, boolean gender){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.gender = gender;
    }
    public void studentInfo(){
        System.out.println("Labas as " + this.name + " " + this.surname);
    }

    @Override
    public String toString(){
       return this.name + " " +
               this.surname + " " +
               this.gender + " " +
               this.birthYear //+ " " +
          //     Arrays.toString(this.grades) + " " +
           //    this.contacts
            ;
    }

    @Override
    public void breathIn() {
        System.out.println("ikvepiau");
    }

    @Override
    public void repoduce() {
        System.out.println("5 min yra ilgai");
    }

    @Override
    public String eat() {
        return "~~~~";
    }

}
