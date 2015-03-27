public class Pattern {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        // Print all students
        studentBusinessObject.getAllStudents().forEach(Pattern::printStudentInfo);

        // Update student
        StudentVO student = studentBusinessObject.getStudent(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        // Get the student
        printStudentInfo(studentBusinessObject.getAllStudents().get(0));
    }

    private static void printStudentInfo(StudentVO student) {
        System.out.printf("Student: [RollNo: %s, Name: %s]\n", student.getRollNo(), student.getName());
    }

}
