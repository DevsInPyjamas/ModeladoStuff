package feb2018ej2;

import java.util.List;

public abstract class Employee extends NamedElement{
    public int totalSalary;
    private List<Contract> contractList;
    private Manager manager;

    public void addContract(Contract c) {
        contractList.add(c);
    }

    public void removeContract(Contract c) {
        contractList.remove(c);
    }

    public abstract void doTask(Task t);

    public void addManager(Manager m) {
        this.manager = m;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
