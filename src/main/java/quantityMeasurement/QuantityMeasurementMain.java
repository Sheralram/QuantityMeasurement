package quantityMeasurement;

public class QuantityMeasurementMain {

    public boolean inchConversion(double feet, int inch) {
        double result = feet * 12;
        if (result == inch) {
            return true;
        } else {
            return false;
        }
    }
}
