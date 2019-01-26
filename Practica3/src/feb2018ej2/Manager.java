package feb2018ej2;

import java.util.List;

public class Manager extends Employee {
    private List<Employee> managedEmployees;

    public void addManagedEmployee(Employee e) {
        this.managedEmployees.add(e);
    }

    public void removedEmployee(Employee e) {
        this.managedEmployees.remove(e);
    }
    @Override
    public void doTask(Task t) {

    }
}
