package Projects.Converter;

public class SizeConverter {

    double centimeters;
    double millimeters;
    double meters;

    double meterToCentimeters (double meters) {
        return meters * 1;
    }

    double meterToMillimeters (double meters) {
        return meters * 10;
    }

    double CentimetersToMeters (double centimeters) {
        return centimeters / 100;
    }

    double MillimetersToMeters (double millimeters) {
        return millimeters / 1000;
    }


}
