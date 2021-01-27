package ScrumCeremonyTask;

public class GroomingMeeting extends ScrumCeremonies{

    public GroomingMeeting() {
        super("Grooming meeting", "PO");
    }

    @Override
    public String agenda() {
        return "PO explains all user stories."+
                "\nPO prioritize the user stories."+
                "\nTeam give the estimation.";
    }

    @Override
    public String duration() {
        return "Around 2 hours";
    }

    @Override
    public String MeetingTime() {
        return "Before each sprint";
    }
}
