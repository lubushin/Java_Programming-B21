package ScrumCeremonyTask;

public class Retro extends ScrumCeremonies{
    public Retro() {
        super("Retrospective meeting", "SM");
    }

    @Override
    public String agenda() {
        return "In order to evaluate last sprint"+
                "\n3 questions:"+
                "\n1 - What went well"+
                "\n2 - What went well"+
                "\n3 - What could be improved";
    }

    @Override
    public String duration() {
        return "Around 2 hours";
    }

    @Override
    public String MeetingTime() {
        return "At the end of each Sprint, after Demo";
    }
}
