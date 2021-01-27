package InheritanceScrumCeremonies;

public class Scrum {
    public static void main(String[] args) {
        Demo demo = new Demo();
        SprintPlanning sprintPlanning = new SprintPlanning();

        System.out.println(demo);
        System.out.println(sprintPlanning);
        System.out.println(demo.duration());
        System.out.println(sprintPlanning.agenda());

    }
}
