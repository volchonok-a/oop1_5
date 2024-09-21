package ru.vsu.cs.volkova;

public class Whether {
    private double pressure;
    private String text;

    public Whether(double pressure, String text) {
        this.pressure = pressure;
        this.text = text;
    }

    public double getPressure() {
        return pressure;
    }
    public String getText() {
        return text;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setText(String text) {
        this.text = text;
    }
}
