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

    enum Unit { FEET, INCH, YARD, CENTIMETER,GALLON, LITRES, MILLILITRE,GRAM, TONNE, KILOGRAM,FAHRENHEIT, CELSIUS};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value ) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH, that.value ) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value*FEET_TO_YARD ) == 0;
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value*INCH_TO_CENTIMETER , that.value) == 0;
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITRES))
            return Double.compare(this.value * GALLON_TO_LITRES, that.value) == 0;
        if (this.unit.equals(Unit.LITRES) && that.unit.equals(Unit.MILLILITRE))
            return Double.compare(this.value * LITRES_TO_MILLILITRE, that.value) == 0;
        if (this.unit.equals(Unit.KILOGRAM) && that.unit.equals(Unit.GRAM))
            return Double.compare(this.value * KILOGRAM_TO_GRAM, that.value) == 0;
        if (this.unit.equals(Unit.TONNE) && that.unit.equals(Unit.KILOGRAM))
            return Double.compare(this.value * TONNE_TO_KILOGRAM, that.value) == 0;
        if (this.unit.equals(Unit.FAHRENHEIT) && that.unit.equals(Unit.CELSIUS))
            return Double.compare(((this.value - FAHRENHEIT_TO_CELSIUS) / 1.8), that.value) == 0;
        return false;
    }

    public double addLengthsToInches(Length value) {
        if (this.unit.equals(Unit.INCH)&&(value.unit.equals(Unit.INCH)))
            return this.value + value.value;
        if(this.unit.equals(Unit.FEET) && value.unit.equals(Unit.INCH))
            return (this.value * FEET_TO_INCH) + value.value;
        if(this.unit.equals(Unit.FEET) && value.unit.equals(Unit.FEET))
            return (this.value * FEET_TO_INCH) + (value.value * FEET_TO_INCH);
        if(this.unit.equals(Unit.INCH) && value.unit.equals(Unit.CENTIMETER))
            return (this.value) + (value.value / INCH_TO_CENTIMETER);
        return 0;
    }
    public double addVolumesToLitres(Length litres) {
        if(this.unit.equals(Unit.GALLON) && litres.unit.equals(Unit.LITRES))
            return (this.value * GALLON_TO_LITRES) + litres.value;
        if(this.unit.equals(Unit.LITRES) && litres.unit.equals(Unit.MILLILITRE))
            return (this.value * LITRES_TO_MILLILITRE) + litres.value;
        if(this.unit.equals(Unit.TONNE) && litres.unit.equals(Unit.GRAM))
            return (this.value * TONNE_TO_KILOGRAM) + (litres.value / KILOGRAM_TO_GRAM);
        return 0;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }


}
