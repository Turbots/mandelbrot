package be.ordina.function;

import java.util.function.Function;

@SuppressWarnings("unused")
public class MandelbrotFunction implements Function<Input, Integer> {

	public Integer apply(Input input) {
		Complex complex;
		Integer max;

		/**try {
			complex = new Complex(
				Double.parseDouble(input.substring(0, input.indexOf(','))),
				Double.parseDouble(input.substring(input.indexOf(',') + 1, input.lastIndexOf(','))));

			max = Integer.parseInt(input.substring(input.lastIndexOf(',') + 1));
		} catch (Exception e) {
			throw new IllegalArgumentException("Wrong format: use `<real>,<imaginary>,<max>`");
		}**/

		complex = new Complex(input.getReal(), input.getImaginary());
		max = input.getMax();

		Complex z = new Complex(complex);

		for (int t = 0; t < max; t++) {
			if (z.abs() > 2.0)
				return t;
			z = z.times(z).plus(complex);
		}

		return max;
	}
}
