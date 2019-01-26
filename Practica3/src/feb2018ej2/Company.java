package feb2018ej2;

import java.util.List;

public class Company extends NamedElement {
    private List<Contract> contractList;

    public Company(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public void addContract(Contract c) {
        contractList.add(c);
    }

    public void removeContract(Contract c) {
        contractList.remove(c);
    }
}
