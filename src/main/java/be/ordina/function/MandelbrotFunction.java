package be.ordina.function;

import java.util.function.Function;

@SuppressWarnings("unused")
public class MandelbrotFunction implements Function<String, Integer> {

	public Integer apply(String input) {
		Complex complex;
		Integer max;

		try {
			complex = new Complex(
				Double.parseDouble(input.substring(0, input.indexOf(','))),
				Double.parseDouble(input.substring(input.indexOf(','), input.lastIndexOf(','))));

			max = Integer.parseInt(input.substring(input.lastIndexOf(',')));
		} catch (Exception e) {
			throw new IllegalArgumentException("Wrong format: use `<real>,<imaginary>,<max>`");
		}

		Complex z = new Complex(complex);

		for (int t = 0; t < max; t++) {
			if (z.abs() > 2.0)
				return t;
			z = z.times(z).plus(complex);
		}

		return max;
	}
}
