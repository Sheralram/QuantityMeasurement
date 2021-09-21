package quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test                                                                               //Reference Check //
    public void givenFeetWithSameReference_WhenCompared_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        boolean sameReference = feet == feet;
        Assertions.assertTrue(sameReference);
    }

    @Test
    public void givenFeetWithDiffrentReference_WhenCompared_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = new Feet(0.0);
        boolean differentReference = feet == feet1;
        Assertions.assertFalse(differentReference);
    }

    @Test                                                                                   //Null Check //
    public void givenNullFeet_WhenCompare_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Feet feet1 = null;
        Assertions.assertNotEquals(feet, feet1);
    }

    @Test                                                                                   //Type Check //
    public void givenFeetWithSameType_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetWithDifferentType_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

}
