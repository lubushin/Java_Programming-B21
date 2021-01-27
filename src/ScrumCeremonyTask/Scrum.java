package ScrumCeremonyTask;

public class Scrum { //scrum has a ceremonies

    public static void main(String[] args) {

        Demo demo = new Demo();
        System.out.println(demo);
        System.out.println(demo.agenda());
        System.out.println(demo.duration());
        System.out.println(demo.MeetingTime());

        SprintPlanning sprintPlanning = new SprintPlanning();
        System.out.println(sprintPlanning);
        System.out.println(sprintPlanning.agenda());

        GroomingMeeting groomingMeeting = new GroomingMeeting();
        System.out.println(groomingMeeting);
        System.out.println(groomingMeeting.duration());



    }
}
