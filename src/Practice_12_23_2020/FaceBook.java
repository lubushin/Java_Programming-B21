package Practice_12_23_2020;

public class FaceBook {

    public static void main(String[] args) {
    ProductOwner PO = new ProductOwner("Lyuba", "LU01", 'F',180000,true);
    BusinessAnalyst BA = new BusinessAnalyst("Ken","KT02",'M',140000,true);
    ScrumMaster SM = new ScrumMaster("Rena", "RT03", 'F',120000,true);
Tester tester = new Tester("Roman", "QA", "R234",'M',115000,false);
Tester[] testers = {new Tester("Lena", "QA", "LD12", 'F', 114500, false)
} ;               // new
Developer developer = new Developer("Lari", "Java Dev","LT45",'M', 120000,false);
 Developer[] developers = {
     new Developer("Erjon","Devel", "EJ67",'M',160000,false)
        };
ScrumTeam scrumTeam = new ScrumTeam(PO, SM, BA);
        System.out.println(scrumTeam);

        scrumTeam.addTester(tester);
        scrumTeam.addDeveloper(developer);
        System.out.println(scrumTeam);

        scrumTeam.addTester(testers);
        scrumTeam.addDeveloper(developers);
        System.out.println(scrumTeam);

        //scrumTeam.removeTester("");
        //scrumTeam.removeDeveloper("");
        //System.out.println(scrumTeam);
        System.out.println("=========================================");

        for(Tester each: scrumTeam.testers){
            System.out.println(each.name + " : "+each.salary);
        }

        for(Developer each: scrumTeam.developers){
            System.out.println(each.name + " : "+each.salary);
        }

        System.out.println("======================================");
        System.out.println(scrumTeam.getProductOwner());
        System.out.println(scrumTeam.getScrumMaster());

        System.out.println("================");

    }
}
