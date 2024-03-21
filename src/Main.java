import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        vardas          String
        pavarde         String
        gimimo metai    int
        lytis           boolean
        pazymiai        int[]


         */
        String[] names = new String[10];
        String[] surnames = new String[10];
        int[] birthYears = new int[10];
        boolean[] genders = new boolean[10];
        int[][] grades = new int[10][10];
        System.out.println(names[0] + " " + surnames[0] + " " + birthYears[0] + " " + genders[0] + " " + Arrays.toString(grades[0]));

        // Dont do dat!
//        Object[] belekas = new Object[5];
//        belekas[0] = "Naglis";
//        belekas[1] = "Mockevicius";
//        belekas[2] = 1990;
//        belekas[3] = true;
//        belekas[4] = new int[]{5,8,6,4,7};

        Student studentas = new Student();

        studentas.name = "Naglis";
        studentas.surname = "Mockevicius";
        studentas.birthYear = 1990;
        studentas.gender = true;
        studentas.grades = new int[]{5,8,6,4,7};
        studentas.studentInfo();


        Contact ct = new Contact();
        ct.address = "Zukausko 47-6";
        ct.email = "kamtasreikalingas@gmail.com";
        ct.phoNo = "+37063589758";

        studentas.contacts = ct;

        Student st2 = new Student();
        st2.name = "Aivaras";
        st2.surname = "Aitvaras";
        st2.birthYear = 1995;
        st2.studentInfo();

        System.out.println(studentas);
        System.out.println(studentas.toString());

        Student[] students = {studentas,st2};
        System.out.println(st2);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student);
        }

        for (Student varliukas : students) {
            System.out.println(varliukas);
        }

        ArrayList<String> vardai = new ArrayList<>();
        vardai.add("Petras");
        vardai.add("Jonas");
        vardai.add("jokubas");
        System.out.println(vardai.get(0));
        System.out.println(vardai.get(1));
        System.out.println(vardai.get(2));
        System.out.println(vardai.size());
        vardai.set(2, "Jokūbas");
        vardai.remove(1);
        vardai.contains("Jonas");
       // vardai.clear();

        for (String vardas : vardai) {
            System.out.println(vardas);
        }

        /*
        paveldimumas
        konstruktoriai
        inkapsuliacija
        overloadinimas
        overridinimas
         */
    }

}