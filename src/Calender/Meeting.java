package Calender;

import java.util.ArrayList;

/**
 * Created by user on 4/22/2015.
 */
public class Meeting extends Event {
    private ArrayList<String> participant;
    private String subject;
    public Meeting(){
        subject = "";
        participant = new ArrayList<String>();
    }
    public Meeting(String Name, String Location,String Time,ArrayList<String> newparticipant, String newsubject){
        super(Name,Location,Time);
        participant = new ArrayList<String>(newparticipant);
        subject = newsubject;
    }
    public String getParticipant(int i) {
        return participant.get(i);
    }

    public void addParticipant(String newparticipant) {
        participant.add(newparticipant);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String newsubject) {
        subject = newsubject;
    }
}
