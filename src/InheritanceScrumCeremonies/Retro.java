package InheritanceScrumCeremonies;

public class Retro extends ScrumCeremonies{
    public Retro() {
        super("Retro Meeting", "SM");
    }

    @Override
    public String agenda() {
        return "Evaluation of Sprint"
                +"\nWhat went well"+
                "\nWhat went wrong"+
                "\nWhat needs to be improved";
    }

    @Override
    public String duration() {
        return "Around 2 hours";
    }

    @Override
    public String meetingTime() {
        return "After the end of each Stream, after Demo";
    }
}
