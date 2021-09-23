package quantityMeasurement;

import java.util.Objects;

public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double FEET_TO_YARD = 3.0;
    private static final double INCH_TO_CENTIMETER = 2.54 ;
    private static final double GALLON_TO_LITRES = 3.78;
    private static final double LITRES_TO_MILLILITRE = 1000;
    private static final double KILOGRAM_TO_GRAM = 1000;
    private static final double TONNE_TO_KILOGRAM = 1000;
    private static final double FAHRENHEIT_TO_CELSIUS = 32;

 //   enum Unit { FEET, INCH, YARD, CENTIMETER,GALLON, LITRES, MILLILITRE,GRAM, TONNE, KILOGRAM,FAHRENHEIT, CELSIUS};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }


public static boolean compare(Length l1, Length l2) {
    return Double.compare(l1.getValue() * l1.getUnit().baseUnitConversion, l2.getValue() * l2.getUnit().baseUnitConversion) == 0;
}

        public static double addLengthsToInches(Length l1, Length l2) {
        return l1.getValue() * l1.getUnit().baseUnitConversion + l2.getValue() * l2.getUnit().baseUnitConversion;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }


}
