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
        mode = Calculator.BiOperatorModes.ADD;

        Assert.assertEquals(new Double(20.00),calculator.calculateBi(Calculator.BiOperatorModes.ADD,number));
        Assert.assertEquals(new Double(18.00),calculator.calculateBi(Calculator.BiOperatorModes.ADD,number));
        Assert.assertEquals(new Double(0.00),calculator.calculateBi(Calculator.BiOperatorModes.MINUS,number));
        Assert.assertEquals(new Double(3.00),calculator.calculateBi(Calculator.BiOperatorModes.MINUS,number));
        Assert.assertEquals(new Double(10.00),calculator.calculateBi(Calculator.BiOperatorModes.MULTIPLY,number));
        Assert.assertEquals(new Double(81.00),calculator.calculateBi(Calculator.BiOperatorModes.MULTIPLY,number));
        Assert.assertEquals(new Double(2.00),calculator.calculateBi(Calculator.BiOperatorModes.DIVIDE,number));
        Assert.assertEquals(new Double(1.00),calculator.calculateBi(Calculator.BiOperatorModes.DIVIDE,number));
        Assert.assertEquals(new Double(18.00),calculator.calculateBi(Calculator.BiOperatorModes.XPOWEROFY,number));
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
        mode = Calculator.MonoOperatorModes.SQUARE;
        Double number = 9.00;
        Double number2 = 45.00;

        Assert.assertEquals(new Double(81.00),calculator.calculateMono(Calculator.MonoOperatorModes.SQUARE,number));
        Assert.assertEquals(new Double(9.00),calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,number));
        Assert.assertEquals(new Double((9.00)),calculator.calculateMono(Calculator.MonoOperatorModes.COS,number));
        Assert.assertEquals(new Double(2.00),calculator.calculateMono(Calculator.MonoOperatorModes.TAN,number2));
        Assert.assertEquals(new Double(1.00),calculator.calculateMono(Calculator.MonoOperatorModes.TAN,number2));
        Assert.assertEquals(new Double(-9),calculator.calculateMono(Calculator.MonoOperatorModes.ABS,number));
        Assert.assertEquals(new Double(2.00),calculator.calculateMono(Calculator.MonoOperatorModes.LOG,number));
        Assert.assertEquals(new Double(1.00),calculator.calculateMono(Calculator.MonoOperatorModes.RATE,number));
        Assert.assertEquals(new Double(9.00),calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy,number));
    }
}