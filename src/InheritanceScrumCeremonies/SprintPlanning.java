package InheritanceScrumCeremonies;

public class SprintPlanning extends ScrumCeremonies{
    public SprintPlanning() {
        super("Sprint Planning Meeting", "PO");
    }

    @Override
    public String agenda() {
        return "User stories move from product backlog to sprint backlog"+
                "\nDOR->checklist";}


    @Override
    public String duration() {
        return "Around 2 hours";
    }

    @Override
    public String meetingTime() {
        return "At the begining of Sprint";
    }
}
