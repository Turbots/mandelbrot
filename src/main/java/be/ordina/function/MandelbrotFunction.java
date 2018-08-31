package be.ordina.function;

import java.util.function.Function;

@SuppressWarnings("unused")
public class MandelbrotFunction implements Function<MandelbrotInput, Integer> {

	public Integer apply(MandelbrotInput input) {
		Complex z = Complex.builder()
			.imaginary(input.getComplex().getImaginary())
			.real(input.getComplex().getReal())
			.build();

		for (int t = 0; t < input.getMax(); t++) {
			if (z.abs() > 2.0)
				return t;
			z = z.times(z).plus(input.getComplex());
		}

		return input.getMax();
	}
}
