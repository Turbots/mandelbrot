package be.ordina.function;

import org.junit.Test;
import reactor.core.publisher.Flux;

import static org.junit.Assert.assertEquals;

public class MandelbrotFunctionTest {

	@Test
	public void testRegularCase() {
		MandelbrotFunction f = new MandelbrotFunction();

		assertEquals(new ColoredPixel(0, 0, 0), calculate(f, 100.0, 100.0));
		assertEquals(new ColoredPixel(0, 0, 255), calculate(f, 0.0, 0.0));

		assertEquals(new ColoredPixel(0, 0, 0), calculate(f, -1.5, -1.5));
		assertEquals(new ColoredPixel(0, 0, 2), calculate(f, -1.125, -1.125));
		assertEquals(new ColoredPixel(0, 0, 2), calculate(f, -1.05, -1.05));

		assertEquals(new ColoredPixel(0, 0, 59), calculate(f, 0.2525812510000, 0.0000004051626));
		assertEquals(new ColoredPixel(0, 0, 60), calculate(f, 0.2524546884500, 0.0000004049095));
		assertEquals(new ColoredPixel(0, 0, 62), calculate(f, 0.2523281259000, 0.0000004046564));
		assertEquals(new ColoredPixel(0, 0, 64), calculate(f, 0.2522015633500, 0.0000004044033));
		assertEquals(new ColoredPixel(0, 0, 66), calculate(f, 0.2520750008000, 0.0000004041502));
		assertEquals(new ColoredPixel(0, 0, 68), calculate(f, 0.2519484382500, 0.0000004038971));
		assertEquals(new ColoredPixel(0, 0, 71), calculate(f, 0.2518218757000, 0.0000004036441));
		assertEquals(new ColoredPixel(0, 0, 73), calculate(f, 0.2516953131500, 0.0000004033910));
		assertEquals(new ColoredPixel(0, 0, 76), calculate(f, 0.2515687506000, 0.0000004031379));
		assertEquals(new ColoredPixel(0, 0, 80), calculate(f, 0.2514421880500, 0.0000004028848));
		assertEquals(new ColoredPixel(0, 0, 84), calculate(f, 0.2513156255000, 0.0000004026317));
		assertEquals(new ColoredPixel(0, 0, 88), calculate(f, 0.2511890629500, 0.0000004023786));
		assertEquals(new ColoredPixel(0, 0, 93), calculate(f, 0.2510625004000, 0.0000004021255));
		assertEquals(new ColoredPixel(0, 0, 100), calculate(f, 0.2509359378500, 0.0000004018724));
		assertEquals(new ColoredPixel(0, 0, 107), calculate(f, 0.2508093753000, 0.0000004016193));
		assertEquals(new ColoredPixel(0, 0, 117), calculate(f, 0.2506828127500, 0.0000004013662));
		assertEquals(new ColoredPixel(0, 0, 130), calculate(f, 0.2505562502000, 0.0000004011132));
		assertEquals(new ColoredPixel(0, 0, 149), calculate(f, 0.2504296876500, 0.0000004008601));
		assertEquals(new ColoredPixel(0, 0, 178), calculate(f, 0.2503031251000, 0.0000004006070));
		assertEquals(new ColoredPixel(0, 0, 234), calculate(f, 0.2501765625500, 0.0000004003539));
		assertEquals(new ColoredPixel(0, 0, 255), calculate(f, 0.2500500000000, 0.0000004001008));
	}

	private ColoredPixel calculate(MandelbrotFunction f, double real, double imaginary) {
		return f.apply(Flux.just(new Calculation(real, imaginary, 0, 0, 255))).blockFirst();
	}
}
