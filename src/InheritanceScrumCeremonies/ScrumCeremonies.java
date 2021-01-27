package InheritanceScrumCeremonies;

public class ScrumCeremonies {
    public String nameOfCeremonies, host;

    public ScrumCeremonies(String nameOfCeremonies, String host) {
        this.nameOfCeremonies = nameOfCeremonies;
        this.host = host;
    }
    public String agenda(){//override, we can not override static, final, private, constructor
        return "";
    }

    public String duration(){
        return "";
    }

    public String meetingTime(){
        return "";
    }

    @Override
    public String toString(){
        return "\nScrumCeremonies" +
                "\nnameOfCeremonies ='" + nameOfCeremonies + '\'' +
                ",\nhost='" + host + '\'';


    }
}
