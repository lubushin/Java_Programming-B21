package ScrumCeremonyTask;

public class Demo extends ScrumCeremonies {

    public Demo() {
        super("Demonstartion meeting", "PO");
    }

    @Override
    public String agenda() {
        return "Team memebers/leaders demonstarte their done work"+
                "\nPO accepts or reject their work"+
                "CheckList";
    }

    @Override
    public String duration() {
        return "Around 3 hours";
    }

    @Override
    public String MeetingTime() {
        return "At the end of the sprint";
    }
}
