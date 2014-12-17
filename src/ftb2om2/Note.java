package ftb2om2;

public class Note {
    private Double ms;
    private Double duration;
    private short lane;

    public Note() {
    }

    public Note(Double ms, Double duration, short lane) {
        this.ms = ms;
        this.duration = duration;
        this.lane = lane;
    }

    public Double getMs() {
        return ms;
    }

    public void setMs(Double ms) {
        this.ms = ms;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public short getLane() {
        return lane;
    }

    public void setLane(short lane) {
        this.lane = lane;
    }    
}
