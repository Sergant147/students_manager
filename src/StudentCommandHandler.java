public class StudentCommandHanndler {
    public StudentCommandHanndler() {
        ArrayList<Student> studentsArray = new ArrayList<Student>();
    }

    public void showStudent(Student student) {
        System.out.println("Student " + student.getName());
        System.out.println(student.getInf());
        System.out.println();
    }

    public void showStudents() {
        for (Student student : this.studentsArray) {
            showStudent(student);
        }
    }

    public ArrayList<Student> removeStudent(String name) {
        this.studentsArray.removeIf(student -> student.NameID.equals(name));
        return students;
    }

    public ArrayList<Student> addStudent(String name, String inf) {
        Student newOne = new Student(name, inf);
        this.studentsArray.add(newOne);
        return students;
    }

    public ArrayList<Student> editStudent(String name, String inf) {
        for (Student student : this.studentsArray) {
            if (student.NameID.equals(name)) {
                student.setInformation(information);
            }
        }
        return students;
    }
}