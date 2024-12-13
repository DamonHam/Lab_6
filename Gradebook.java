public class Gradebook {
    private Student[] students;
    private int count;

    public Gradebook(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        } else {
            System.out.println("Gradebook is full!");
        }
    }

    public Student[] getStudents() {
        return students;
    }
}
