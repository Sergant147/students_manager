package programs;
import java.util.Scanner;
import java.util.ArrayList;
public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentsArray = new ArrayList<Student>();
        String command;
        String name;
        String information;
        StudentsCommandHandler studentsHandler = new StudentsCommandHandler();
        while (true){
            System.out.print("Command (add, edit, remove, get_all, get, stop, clear): ");
            command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            else if (command.equals("add")){
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Information: ");
                information = scanner.nextLine();
                studentsArray = studentsHandler.addStudent(studentsArray, name, information);
            }
            else if (command.equals("remove")){
                System.out.print("Name: ");
                name = scanner.nextLine();
                studentsArray = studentsHandler.removeStudent(studentsArray, name);
            }
            else if (command.equals("edit")){
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Information: ");
                information = scanner.nextLine();
                studentsArray = studentsHandler.editStudent(studentsArray, name, information);
            }
            else if (command.equals("get_all")){
               studentsHandler.showStudents(studentsArray);
            }
            else if (command.equals("clear")){
                studentsArray = new ArrayList<Student>();
            }
            else {
                System.out.print("Name: ");
                name = scanner.nextLine();
                for (Student student: studentsArray){
                    if (student.NameID.equals(name)){
                       studentsHandler.showStudent(student);
                    }
                }
            }
        }
        scanner.close();
    }
}
