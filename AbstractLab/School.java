package AbstractLab;

import java.util.ArrayList;
import java.util.List;

public class School {
    
    private List<Object> students = new ArrayList<Object>();
    private List<Object> employees = new ArrayList<Object>();

    public List<Object> getStudents() {
        return students;
    }

    public void setStudents(List<Object> students) {
        this.students = students;
    }

    public List<Object> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Object> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "School [students=" + students + ", employees=" + employees + "]";
    }
}
