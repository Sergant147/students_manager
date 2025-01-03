public class StudentCommandHanndler {
    public StudentCommandHanndler() {
        ArrayList<Student> studentsArray = new ArrayList<Student>();
    }

    public void showStudent(Student student) {
        System.out.println("Student " + student.getName());
        System.out.println(student.getInf());
        System.out.println();
    }

    public void showStudents(ArrayList<Student> students) {
        for (Student student : students) {
            showStudent(student);
        }
    }

    public ArrayList<Student> removeStudent(ArrayList<Student> students, String name) {
        students.removeIf(student -> student.NameID.equals(name));
        return students;
    }

    public ArrayList<Student> addStudent(ArrayList<Student> students, String name, String inf) {
        Student newOne = new Student(name, inf);
        students.add(newOne);
        return students;
    }

    public ArrayList<Student> editStudent(ArrayList<Student> students, String name, String inf) {
        for (Student student : students) {
            if (student.NameID.equals(name)) {
                student.setInformation(information);
            }
        }
        return students;
    }
}