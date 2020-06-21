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

        Assert.assertEquals(new Double(20.00),calculator.calculateBi(Calculator.BiOperatorModes.add,number));
        Assert.assertEquals(new Double(18.00),calculator.calculateBi(Calculator.BiOperatorModes.add,number));
        Assert.assertEquals(new Double(0.00),calculator.calculateBi(Calculator.BiOperatorModes.minus,number));
        Assert.assertEquals(new Double(3.00),calculator.calculateBi(Calculator.BiOperatorModes.minus,number));
        Assert.assertEquals(new Double(10.00),calculator.calculateBi(Calculator.BiOperatorModes.multiply,number));
        Assert.assertEquals(new Double(81.00),calculator.calculateBi(Calculator.BiOperatorModes.multiply,number));
        Assert.assertEquals(new Double(2.00),calculator.calculateBi(Calculator.BiOperatorModes.divide,number));
        Assert.assertEquals(new Double(18.00),calculator.calculateBi(Calculator.BiOperatorModes.xpowerofy,number));
    }

    @Test
    public void calculateEqual() {
    Calculator calculator = new Calculator();
    Double number = 4.00;
        Assert.assertEquals(new Double(4.00),calculator.calculateEqual(number));
        Assert.assertEquals(new Double(5.00),calculator.calculateEqual(number));
    }

    @Test
    public void reset() {
        Double number = 4.00;
        Double number2 = 5.00;
        Calculator calculator = new Calculator();

        Assert.assertEquals(new Double(NaN),calculator.reset());
        Assert.assertEquals(new Double(5.00),calculator.reset());
    }

    @Test
    public void calculateMono() {
        Calculator calculator = new Calculator();
        Calculator.MonoOperatorModes mode;
        mode = Calculator.MonoOperatorModes.square;
        Double number = 9.00;
        Assert.assertEquals(new Double(81.00),calculator.calculateMono(Calculator.MonoOperatorModes.square,number));
        Assert.assertEquals(new Double(9.00),calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,number));
        Assert.assertEquals(new Double((9.00)),calculator.calculateMono(Calculator.MonoOperatorModes.cos,number));
        Assert.assertEquals(new Double(100.00),calculator.calculateMono(Calculator.MonoOperatorModes.square,number));
    }
}