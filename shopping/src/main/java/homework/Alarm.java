package homework;

public class Alarm {
    public String alarmTime;
    public String alarmMode;


    public Alarm(String alarmTime, String alarmMode) {
        this.alarmTime = alarmTime;
        this.alarmMode = alarmMode;

    }

    public void setAlarmTime(String alarmTime) {
        System.out.println("Alarm is set");

    }

    public void getAlarmTime(String alarmTime) {
        System.out.println("Alarm is set to...");
    }

    public void isAlarmSet(Boolean alarmMode) {
        System.out.println(false);

    }

    public void Snooze(String alarmMode) {
        System.out.println("Snooze activated");
    }

}