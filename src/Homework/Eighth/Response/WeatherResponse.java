
package Homework.Eighth.Response;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherResponse {
    @JsonIgnore
    private String LocalObservationDateTime;
    @JsonIgnore
    private float EpochTime;
    private String WeatherText;
    Temperature TemperatureObject;
    @JsonIgnore
    private String MobileLink;
    @JsonIgnore
    private String Link;

    @JsonCreator
    public WeatherResponse(@JsonProperty("LocalObservationDateTime") String LocalObservationDateTime, @JsonProperty("WeatherText") String WeatherText, @JsonProperty("Temperature") Temperature TemperatureObject) {
        this.WeatherText = WeatherText;
        this.TemperatureObject = TemperatureObject;
        this.LocalObservationDateTime = LocalObservationDateTime;
    }

    @Override
    public String toString() {
        return "Current WeatherText{" +
                "погода= " + WeatherText +
                ", температура= " + TemperatureObject + '\'' +
                '}';
    }

    // Getter Methods

    public String getLocalObservationDateTime() {
        return LocalObservationDateTime;
    }

//    public float getEpochTime() {
//        return EpochTime;
//    }

    public String getWeatherText() {
        return WeatherText;
    }
    public Temperature getTemperature() {
        return TemperatureObject;
    }

    // Setter Methods

    public void setLocalObservationDateTime(String LocalObservationDateTime) {
        this.LocalObservationDateTime = LocalObservationDateTime;
    }

    public void setWeatherText(String WeatherText) {
        this.WeatherText = WeatherText;
    }

    public void setTemperature(Temperature TemperatureObject) {
        this.TemperatureObject = TemperatureObject;
    }


}