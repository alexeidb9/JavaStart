package Tasks.Uni;

public class University {

    public static void main(String[] args) {

        System.out.println("Students number before sighning in: " + Student.getStudentsNumber());
        Student student1 = new Student("a", "b", 112412);
        Student student2 = new Student("a", "b", 21241);
        System.out.println("Students number after signing: " + Student.getStudentsNumber());


    }


}
