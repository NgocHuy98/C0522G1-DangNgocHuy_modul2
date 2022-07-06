package ss4_class_and_subject.exercise.stop_watch;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}


