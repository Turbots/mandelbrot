package be.ordina.function;

import lombok.Getter;

@Getter class Complex {

	private final double real;
	private final double imaginary;

	Complex(final double real, final double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	Complex(final Complex complex) {
		this(complex.getReal(), complex.getImaginary());
	}

	double abs() {
		return Math.hypot(real, imaginary);
	}

	Complex plus(Complex b) {
		Complex a = this;
		double real = a.real + b.real;
		double imaginary = a.imaginary + b.imaginary;
		return new Complex(real, imaginary);
	}

	Complex times(Complex b) {
		Complex a = this;
		double real = a.real * b.real - a.imaginary * b.imaginary;
		double imag = a.real * b.imaginary + a.imaginary * b.real;
		return new Complex(real, imag);
	}
}
