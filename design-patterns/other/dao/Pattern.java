public class Pattern {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        // print all students
        studentDao.getAllStudents().forEach(Pattern::printStudentData);

        // Update student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        // Get the student
        studentDao.getStudent(0);
        printStudentData(student);
    }

    private static void printStudentData(Student student) {
        System.out.printf("Student: [RollNo: %s, Name: %s]\n", student.getRollNo(), student.getName());
    }

}
