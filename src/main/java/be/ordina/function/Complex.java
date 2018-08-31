package be.ordina.function;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public class Complex {

	private final double real;
	private final double imaginary;

	public double abs() {
		return Math.hypot(real, imaginary);
	}

	public Complex plus(Complex b) {
		Complex a = this;
		double real = a.real + b.real;
		double imaginary = a.imaginary + b.imaginary;
		return new Complex(real, imaginary);
	}

	public Complex times(Complex b) {
		Complex a = this;
		double real = a.real * b.real - a.imaginary * b.imaginary;
		double imag = a.real * b.imaginary + a.imaginary * b.real;
		return new Complex(real, imag);
	}
}
