import java.util.Arrays;

public class Student extends Object{
    private String name;
    private String surname;
    private int birthYear;
    private boolean gender;
 //   public int[] grades;

  //  public Contact contacts;


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

}
