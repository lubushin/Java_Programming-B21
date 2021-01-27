package InheritanceScrumCeremonies;

public class GroomingMeeting extends ScrumCeremonies{
    public GroomingMeeting(){
        super("GroomingMeeting", "PO");//called constructor from super class


    }
    @Override
    public String agenda() {
        return "PO explains all user stories."+
                "\nPO prioritizing the user stories" +
                "\nTeam gives estimation points";
    }

    @Override
    public String duration() {
        return "Around 2 houes";
    }

    @Override
    public String meetingTime() {
        return "Before each sprint";
    }


}
