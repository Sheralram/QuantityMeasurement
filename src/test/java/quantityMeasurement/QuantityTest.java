package quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test                                                                               //Reference Check //
    public void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET,0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    public void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET,0.0);
        Length feet1 = new Length(Unit.FEET,0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test                                                                                   //Null Check //
    public void givenNullFeet_WhenCompare_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET,0.0);
        Length feet1 = null;
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test                                                                                   //Type Check //
    public void givenFeetWithSameType_ShouldReturnTrue() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetWithDifferentType_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test                                                                               //Equality Check //
    public void givenFeetWithEqualityCheck_ShouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        boolean equality = feet1.equals(feet2);
        Assertions.assertTrue(equality);
    }

    @Test
    public void givenFeet_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean notequality = feet1.equals(feet2);
        Assertions.assertFalse(notequality);
    }

    @Test                                                                               //UC1 1ft = 12Inch //
    public void given1FeetAnd12Inch_ShouldReturnTrue() {
        QuantityMeasurementMain quantityMeasurementMain = new QuantityMeasurementMain();
        boolean result = quantityMeasurementMain.inchConversion(1.0, 12);
        Assertions.assertTrue(result);
    }


    @Test
    public void given0Inchand0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH,0.0);
        boolean samerefernece = inch1 == inch1;
        Assertions.assertTrue(samerefernece);
    }

    @Test
    public void givenInchWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH,0.0);
        Length inch1 = new Length(Unit.INCH,0.0);
        boolean differentReference = inch == inch1;
        Assertions.assertFalse(differentReference);
    }

    @Test
    public void givenNullInch_WhenCompare_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH,0.0);
        Length inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    public void givenInchWithSameType_ShouldReturnTrue() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchWithDifferentType_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenInchWithEqualityCheck_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        boolean equality = inch1.equals(inch2);
        Assertions.assertTrue(equality);
    }

    @Test
    public void givenInch_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        boolean notequality = inch1.equals(inch2);
        Assertions.assertFalse(notequality);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length inch1 = new Length(Unit.INCH,0.0);
        boolean compareCheck = Length.compare(feet1, inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Unit.FEET_TO_INCH,1.0);
        Length inch1 = new Length(Unit.INCH,1.0);
        boolean compareCheck = Length.compare(feet1,inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean compareCheck = Length.compare(feet1, feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET_TO_INCH,3.0);
        Length yard1 = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = Length.compare(feet1, yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
  public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length yard1 = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = Length.compare(feet1, yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Unit.INCH,1.0);
        Length yard1 = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = Length.compare(inch1, yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Unit.INCH,36.0);
        Length yard1 = new Length(Unit.YARD_TO_INCH, 1.0);
        boolean compareCheck = Length.compare(inch1, yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualLength() {
        Length yard1 = new Length(Unit.YARD_TO_INCH,1.0);
        Length inch1 = new Length(Unit.INCH, 36.0);
        boolean compareCheck = Length.compare(yard1, inch1);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnNotEqualLength() {
        Length yard1 = new Length(Unit.YARD_TO_INCH,1.0);
        Length feet1 = new Length(Unit.FEET, 36.0);
        boolean compareCheck = Length.compare(yard1, feet1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Unit.INCH,2.0);
        Length cm1 = new Length(Unit.CENTIMETER_TO_INCH, 5.08);
        boolean compareCheck = Length.compare(inch1, cm1);
        Assertions.assertTrue(compareCheck);
    }
    @Test
   public void given2InchAnd2Inch_WhenAdd_ShouldReturnFourInches() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length inch1 = new Length(Unit.INCH, 2.0);
        double add = inch.addLengthsToInches(inch,inch1);
        Assertions.assertEquals(add,4);
    }
    @Test
    public void given1FeetAnd2Inch_WhenAdd_ShouldReturnFourTeenInches() {
        Length feet = new Length(Unit.FEET_TO_INCH, 1.0);
        Length inch = new Length(Unit.INCH, 2.0);
        double add = feet.addLengthsToInches(feet,inch);
        Assertions.assertEquals(add,14);
    }
    @Test
    public void given1FeetAnd1Feet_WhenAdd_ShouldReturnTwentyFourInches() {
        Length feet = new Length(Unit.FEET_TO_INCH, 1.0);
        Length feet1 = new Length(Unit.FEET_TO_INCH, 1.0);
        double add = Length.addLengthsToInches(feet, feet1);
        Assertions.assertEquals(add,24);
    }

    @Test
    public void given2InchAnd2AndHalfCentimeter_WhenAdd_ShouldReturn3Inches() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length centimeter = new Length(Unit.CENTIMETER_TO_INCH, 2.54);
        double add = Length.addLengthsToInches(inch, centimeter);
        Assertions.assertEquals(Math.round(add), 3);
    }
    @Test
    public void given1GallonAnd3And78Litres_ShouldReturnTrue() {
        Length gallon = new Length(Unit.GALLON_TO_LITRE, 1.0);
        Length litre = new Length(Unit.LITRE, 3.78);
        boolean compareCheck = Length.compare(gallon, litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd3And1000Ml_ShouldReturnTrue() {
        Length litre = new Length(Unit.LITRE, 1);
        Length milliMeter = new Length(Unit.MILLILITER_TO_LITRE, 1000.0);
        boolean compareCheck = Length.compare(litre, milliMeter);
        Assertions.assertTrue(compareCheck);
    }
    @Test
   public  void given2GallonAnd3And78Litres_WhenAdd_ShouldReturn7And57Litres() {
        Length gallon = new Length(Unit.GALLON_TO_LITRE, 1.0);
        Length litres = new Length(Unit.LITRE, 3.78);
        double add = Length.addLengthsToInches(gallon, litres);
        Assertions.assertEquals(add,7.56);
    }

    @Test
    public void given1MilliLitreAnd1Litres_WhenAdd_ShouldReturn1000Litres() {
        Length litre = new Length(Unit.LITRE, 1);
        Length millilitre = new Length(Unit.MILLILITER_TO_LITRE, 1000.0);
        double add = Length.addLengthsToInches(litre, millilitre);
        Assertions.assertEquals(add,2);
    }
    @Test
    public void given1KgAnd100Grams_ShouldReturnTrue() {
        Length kilogram = new Length(Unit.KILOGRAM, 1);
        Length gram = new Length(Unit.GRAMS_TO_KILOGRAM, 1000.0);
        boolean compareCheck = Length.compare(kilogram, gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kg_ShouldReturnTrue() {
        Length tonne = new Length(Unit.TONNE_TO_KILOGRAM, 1.0);
        Length kilogram = new Length(Unit.KILOGRAM, 1000.0);
        boolean compareCheck = Length.compare(tonne, kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001Kg() {
        Length tonne = new Length(Unit.TONNE_TO_KILOGRAM, 1.0);
        Length gram = new Length(Unit.GRAMS_TO_KILOGRAM, 1000.0);
        double add = Length.addLengthsToInches(tonne, gram);
        Assertions.assertEquals(add,1001);
    }
    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnTrue() {
        Length fah = new Length(Unit.FAHRENHEIT_TO_CELSIUS, 212.0);
        Length cel = new Length(Unit.CELSIUS, 100.0);
        boolean compareCheck = Length.compare(fah, cel);
        Assertions.assertTrue(compareCheck);
    }


}


