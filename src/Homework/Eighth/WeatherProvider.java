package Homework.Eighth;

import Homework.Eighth.enums.Periods;
import Homework.entity.WeatherData;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherProvider {
    //void getWeather1(Periods periods) throws IOException;

    WeatherData getWeather(Periods periods) throws IOException, SQLException;

    WeatherData getAllFromDb() throws IOException, SQLException;

}
