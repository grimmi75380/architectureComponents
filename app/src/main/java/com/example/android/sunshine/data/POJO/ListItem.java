package com.example.android.sunshine.data.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ListItem {

    @SerializedName("temp")
    private Temp temp;

    @SerializedName("deg")
    private int deg;

    @SerializedName("weather")
    private List<WeatherItem> weather;

    @SerializedName("humidity")
    private double humidity;

    @SerializedName("pressure")
    private double pressure;

    @SerializedName("speed")
    private double speed;

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public List<WeatherItem> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherItem> weather) {
        this.weather = weather;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}