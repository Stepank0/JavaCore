package Homework.Eighth;

import Homework.Eighth.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

}
