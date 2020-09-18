package be.pxl.java.fileIO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Serializable {
    private String firstname;
    private String lastname;
    private LocalDate birthDay;
    private transient Timer heartbeat; //trancient zorgt er eigenlijk voor ook al is een eeigenschap niet serializable dat het object toch weggeschreven kan worden

    public Timer getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Timer heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Person(String firstname, String lastname, LocalDate birthDay) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new HeartBeat(), 0, 1000);
    }

    private class HeartBeat extends TimerTask{
        public void run(){
            System.out.println("*");
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
