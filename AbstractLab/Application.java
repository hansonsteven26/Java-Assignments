package AbstractLab;

public class Application {
    public static void main(String[] args) {
        
        Student student = new Student(); 
        Employee employee = new Employee(); 
        double stuTelPhoneBill = student.calculateTelePhoneBill(120.5); 
        double employTelPhoneBill = employee.calculateTelePhoneBill(120.5); 
        System.out.println(stuTelPhoneBill);
        System.out.println(employTelPhoneBill); // Steps 8-14
        // ------------------------------------------------------------------------------------------
        Person personStudent = new Student();
        Person personEmployee = new Employee();

        double personStudentPhoneBill = personStudent.calculateTelePhoneBill(120.5);
        double employeeStudentPhoneBill = personEmployee.calculateTelePhoneBill(120.5);

        System.out.println(personStudentPhoneBill);
        System.out.println(employeeStudentPhoneBill);

        student.setFullName("Bobby");
        employee.setFullName("Richard");
        personStudent.setFullName("Cornelius");
        personEmployee.setFullName("Maximillion");
        personStudent.toString();

        System.out.println(student.getFullName());
        System.out.println(employee.getFullName());
        System.out.println(personStudent.getFullName());
        System.out.println(personEmployee.getFullName()); 
        System.out.println(personStudent.taxes(120.5));
        System.out.println(personEmployee.taxes(120.5)); // Steps 15 - 21
        // ------------------------------------------------------------------------------------------
        School theSewerAcademy = new School();
        theSewerAcademy.getStudents().add(student);
        theSewerAcademy.getStudents().add(personStudent);
        theSewerAcademy.getEmployees().add(employee);
        theSewerAcademy.getEmployees().add(personEmployee);
        // ------------------------------------------------------------------------------------------
    }
}
