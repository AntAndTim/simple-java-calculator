package tech.antandtim.calculation.operation;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class Division implements Operation {

    @Override
    public BiFunction<BigDecimal, BigDecimal, BigDecimal> getCalculation() {
        return BigDecimal::divide;
    }
}
