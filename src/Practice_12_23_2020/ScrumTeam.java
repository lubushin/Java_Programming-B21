package Practice_12_23_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner productOwner;
    private  ScrumMaster scrumMaster;
    private BusinessAnalyst businessAnalyst;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster,BusinessAnalyst businessAnalyst){
        setProductOwner(productOwner);
        setScrumMaster(scrumMaster);
        setBusinessAnalyst(businessAnalyst);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTester(Tester[] testers){
       this.testers.addAll(Arrays.asList(testers));
        //for(Tester each : testers) addTester(each);
    }

    public void addDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
       // for(Developer each: developers) addDeveloper(each);

    }

    public void removeTester(String ID){
        testers.removeIf(p-> p.ID.equals(ID));//empl-test ID equals this ID remove him
    }
    public void removeDeveloper(String ID){
        developers.removeIf(p-> p.ID.equals(ID));//empl-dev ID equals this ID remove him
    }

    public ProductOwner getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(ProductOwner productOwner) {
        this.productOwner = productOwner;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public BusinessAnalyst getBusinessAnalyst() {
        return businessAnalyst;
    }

    public void setBusinessAnalyst(BusinessAnalyst businessAnalyst) {
        this.businessAnalyst = businessAnalyst;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner = " + productOwner.name +
                ", scrumMaster = " + scrumMaster.name +
                ", businessAnalyst = " + businessAnalyst.name +
                ", testers = " + testers.size() +
                ", developers = " + developers .size()+
                '}';
    }
}
