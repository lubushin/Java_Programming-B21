package ScrumCeremonyTask;

public class ScrumCeremonies {

    public String nameOfCeremonies, host;

    public ScrumCeremonies(String nameOfCeremonies, String host) {
        this.nameOfCeremonies = nameOfCeremonies;
        this.host = host;
    }

    public String agenda(){//we can not override:static,private,final,constructor methods
        return "";
    }

    public String duration(){
        return "";
    }

    public String MeetingTime(){
        return "";
    }

    @Override
    public String toString() {
        return "ScrumCeremony:"  +
                "\n nameOfCeremony='" + nameOfCeremonies + '\'' +
                "\n host='" + host + '\'' +"";

    }
}
