package balbookh;
import balbooh.Calculator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculateTest {
@Test
public void testWhenPassArgToAddItShouldReturnSumm() {
   final Calculator calc = new Calculator ();
    calc.addsum(3,3);
    final double result=calc.result;
    assertThat(result, is(6d));
}
}
