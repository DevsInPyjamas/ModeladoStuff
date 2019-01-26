package feb2018ej2;

import java.util.Date;

public class Contract {
    private Employee employee;
    private Company company;
    public int salary;
    public Date startingDate;

    public Contract(Employee employee, Company company, int salary, Date startingDate) {
        this.employee = employee;
        this.company = company;
        this.salary = salary;
        this.startingDate = startingDate;
    }

    public void removeContract() {

    }

}
