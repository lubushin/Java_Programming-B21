package ScrumCeremonyTask;

public class StandUp extends ScrumCeremonies{//standUp is a ScrumCeremonies
    public StandUp() {
        super("Daily Stand up Meeting", "SM");
    }

    @Override
    public String agenda() {
        return "Three questions: "+
                "\n1- Waht we did yesterday"+
                "\n2 - What are you gonna do today"+
                "\n3 - Is there any blocks";
    }

    @Override
    public String duration() {
        return "Around 15 min";
    }

    @Override
    public String MeetingTime() {
        return "Every day";
    }
}
