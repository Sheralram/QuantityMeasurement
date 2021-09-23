package quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test                                                                               //Reference Check //
    public void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    public void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test                                                                                   //Null Check //
    public void givenNullFeet_WhenCompare_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Length feet1 = null;
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test                                                                                   //Type Check //
    public void givenFeetWithSameType_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetWithDifferentType_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test                                                                               //Equality Check //
    public void givenFeetWithEqualityCheck_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        boolean equality = feet1.equals(feet2);
        Assertions.assertTrue(equality);
    }

    @Test
    public void givenFeet_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
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
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchWithSameReference_WhenCompared_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean samerefernece = inch1 == inch1;
        Assertions.assertTrue(samerefernece);
    }

    @Test
    public void givenInchWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean differentReference = inch == inch1;
        Assertions.assertFalse(differentReference);
    }

    @Test
    public void givenNullInch_WhenCompare_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Length inch1 = null;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    public void givenInchWithSameType_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void givenInchWithDifferentType_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenInchWithEqualityCheck_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean equality = inch1.equals(inch2);
        Assertions.assertTrue(equality);
    }

    @Test
    public void givenInch_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean notequality = inch1.equals(inch2);
        Assertions.assertFalse(notequality);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,3.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
  public void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,36.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnNotEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD,1.0);
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assertions.assertFalse(compareCheck);
    }
    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnNotEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD,1.0);
        Length feet1 = new Length(Length.Unit.FEET, 36.0);
        boolean compareCheck = yard1.compare(feet1);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH,2.0);
        Length cm1 = new Length(Length.Unit.CENTIMETER, 5.08);
        boolean compareCheck = inch1.compare(cm1);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    void given2InchAnd2Inch_WhenAdd_ShouldReturnFourInches() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        double add = inch.addLengthsToInches(inch1);
        Assertions.assertEquals(add,4);
    }
    @Test
    void given1FeetAnd2Inch_WhenAdd_ShouldReturnFourTeenInches() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        double add = feet.addLengthsToInches(inch);
        Assertions.assertEquals(add,14);
    }
    @Test
    void given1FeetAnd1Feet_WhenAdd_ShouldReturnTwentyFourInches() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        double add = feet.addLengthsToInches(feet1);
        Assertions.assertEquals(add,24);
    }

    @Test
    void given2InchAnd2AndHalfCentimeter_WhenAdd_ShouldReturn3Inches() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length centimeter = new Length(Length.Unit.CENTIMETER, 2.54);
        double add = inch.addLengthsToInches(centimeter);
        Assertions.assertEquals(add,3);
    }
    @Test
    void given1GallonAnd3And78Litres_ShouldReturnTrue() {
        Length gallon = new Length(Length.Unit.GALLON, 1.0);
        Length litre = new Length(Length.Unit.LITRES, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LitreAnd3And1000Ml_ShouldReturnTrue() {
        Length litre = new Length(Length.Unit.LITRES, 1);
        Length milliMeter = new Length(Length.Unit.MILLILITRE, 1000.0);
        boolean compareCheck = litre.compare(milliMeter);
        Assertions.assertTrue(compareCheck);
    }
    @Test
    void given2GallonAnd3And78Litres_WhenAdd_ShouldReturn7And57Litres() {
        Length gallon = new Length(Length.Unit.GALLON, 1.0);
        Length litres = new Length(Length.Unit.LITRES, 3.78);
        double add = gallon.addVolumesToLitres(litres);
        Assertions.assertEquals(add,7.56);
    }

    @Test
    void given1MilliLitreAnd1Litres_WhenAdd_ShouldReturn1000Litres() {
        Length litre = new Length(Length.Unit.LITRES, 1);
        Length millilitre = new Length(Length.Unit.MILLILITRE, 1000.0);
        double add = litre.addVolumesToLitres(millilitre);
        Assertions.assertEquals(add,2000);
    }



}


