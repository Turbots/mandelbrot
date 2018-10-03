package be.ordina.function;

import reactor.core.publisher.Flux;

import java.util.function.Function;

@SuppressWarnings("unused")
public class MandelbrotFunction implements Function<Flux<Calculation>, Flux<Integer>> {

	public Flux<Integer> apply(Flux<Calculation> calculation) {
		return calculation.map(c -> {
			Complex complex = new Complex(c.getReal(), c.getImaginary());
			Integer max = c.getMax();

			Complex z = new Complex(complex);

			for (int t = 0; t < max; t++) {
				if (z.abs() > 2.0)
					return t;
				z = z.times(z).plus(complex);
			}

			return max;
		});
	}
}
