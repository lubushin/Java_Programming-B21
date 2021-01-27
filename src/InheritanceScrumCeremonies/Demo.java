package InheritanceScrumCeremonies;

public class Demo extends ScrumCeremonies{
    public Demo() {
        super("Demo Meeting","SM");
    }

    @Override
    public String agenda() {
        return "Developers demonstrate what they did during the stream"+
                "\nPO accept or reject their work"+
                "\nDOD-> checklist(what is done, what not)";
    }

    @Override
    public String duration() {
        return "Around 3 hours";
    }

    @Override
    public String meetingTime() {
        return "At the end of the Sprint";
    }
}
