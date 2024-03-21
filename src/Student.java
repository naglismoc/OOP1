import java.util.Arrays;

public class Student {
    public String name;
    public String surname;
    public int birthYear;
    public boolean gender;
    public int[] grades;

    public Contact contacts;
    public void studentInfo(){
        System.out.println("Labas as " + this.name + " " + this.surname);
    }

    @Override
    public String toString(){
       return this.name + " " +
               this.surname + " " +
               this.gender + " " +
               this.birthYear + " " +
               Arrays.toString(this.grades) + " " +
               this.contacts;
    }

}
