import org.junit.Assert;
import org.junit.Test;

import static java.lang.Float.NaN;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calculateBi() {
        Double number = 9.00;
        Double number2 = 9.00;
        Calculator calculator = new Calculator();
        Calculator.BiOperatorModes mode;
        mode = Calculator.BiOperatorModes.add;

        Assert.assertEquals(20.00,calculator.calculateBi(Calculator.BiOperatorModes.add,number));
        Assert.assertEquals(18.00,calculator.calculateBi(Calculator.BiOperatorModes.add,number));
        Assert.assertEquals(0.00,calculator.calculateBi(Calculator.BiOperatorModes.minus,number));
        Assert.assertEquals(3.00,calculator.calculateBi(Calculator.BiOperatorModes.minus,number));
        Assert.assertEquals(10.00,calculator.calculateBi(Calculator.BiOperatorModes.multiply,number));
        Assert.assertEquals(12.00,calculator.calculateBi(Calculator.BiOperatorModes.multiply,number));
        Assert.assertEquals(2.00,calculator.calculateBi(Calculator.BiOperatorModes.divide,number));
        Assert.assertEquals(3.00,calculator.calculateBi(Calculator.BiOperatorModes.divide,number));
        Assert.assertEquals(18.00,calculator.calculateBi(Calculator.BiOperatorModes.xpowerofy,number));
    }

    @Test
    public void calculateEqual() {
    Calculator calculator = new Calculator();
    Double number = 4.00;
        Assert.assertEquals(4.00,calculator.calculateEqual(number));
        Assert.assertEquals(5.00,calculator.calculateEqual(number));
    }

    @Test
    public void reset() {
        Double number = 4.00;
        Double number2 = 5.00;
        Calculator calculator = new Calculator();

        Assert.assertEquals(NaN,calculator.reset(number));
        Assert.assertEquals(5.00,calculator.reset(number));
    }

    @Test
    public void calculateMono() {
        Calculator calculator = new Calculator();
        Calculator.MonoOperatorModes mode;
        mode = Calculator.MonoOperatorModes.square;
        Double number = 9.00;
        Assert.assertEquals(81.00,calculator.calculateMono(Calculator.MonoOperatorModes.square,number));
        Assert.assertEquals(9.00,calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,number));
        Assert.assertEquals(new Double(cos(9.00)),calculator.calculateMono(Calculator.MonoOperatorModes.cos,number));
        Assert.assertEquals(100.00,calculator.calculateMono(Calculator.MonoOperatorModes.square,number));
    }
}