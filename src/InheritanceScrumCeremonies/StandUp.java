package InheritanceScrumCeremonies;

public class StandUp extends ScrumCeremonies{//StandUp is a ScrumCeremonies
    public StandUp() {
        super("Daily Stand up Meeting", "SM");
    }

    @Override
    public String agenda() {
        return "3 questions: "+
                "\n1.What did you yesterday?"+
                "\n2.What are you going to do today";
    }

    @Override
    public String duration() {
        return "15 min";
    }

    @Override
    public String meetingTime() {
        return "Every day";
    }
}
