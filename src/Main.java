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

        System.out.println(st2);
        /*
        paveldimumas
        konstruktoriai
        inkapsuliacija
        overloadinimas
        overridinimas
         */
    }

}