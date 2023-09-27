package Projects.Converter;

public class TimeConverter {

    int seconds;
    int minutes;
    int hours;


    int hoursToMinutes (int hours) {
        return hours * 60;
    }

    int minutesToSeconds (int minutes) {
        return minutes * 60;
    }

    int secondsToMilliseconds (int seconds) {
        return seconds * 1000;
    }

}
