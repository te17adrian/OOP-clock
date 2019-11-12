public class Clock{
    private NumberDisplay hour;
    private NumberDisplay minute;
    private String displayString;

    public Clock () {
        this.hour = new NumberDisplay(24);
        this.minute = new NumberDisplay(60);
        updateDisplay();
    }

    public Clock(int hour, int minute) {
        this();
        this.hour.setValue(0);
        this.minute.setValue(0);
    }
    public void timeTick () {
        minute.increment();
    }

    public void setTime(int hour, int minute) {
        this.hour.setValue(hour);
        this.minute.setValue(minute);
    }
    public String getTime() {
        return displayString;
    }
    private void updateDisplay() {
        displayString = hour.getDisplayValue() + ":" + minute.getDisplayValue();
    }
}