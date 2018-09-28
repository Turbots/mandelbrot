package be.ordina.function;

import java.util.function.Function;

@SuppressWarnings("unused")
public class MandelbrotFunction implements Function<Calculation, Integer> {

	public Integer apply(Calculation calculation) {
		Complex complex = new Complex(calculation.getReal(), calculation.getImaginary());
		Integer max = calculation.getMax();

		Complex z = new Complex(complex);

		for (int t = 0; t < max; t++) {
			if (z.abs() > 2.0)
				return t;
			z = z.times(z).plus(complex);
		}

		return max;
	}
}
