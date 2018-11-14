package be.ordina.function;

import java.util.Objects;

public class ColoredPixel {

	private int x, y;
	private int color;

	public ColoredPixel() {
	}

	public ColoredPixel(int x, int y, int color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ColoredPixel that = (ColoredPixel) o;
		return x == that.x &&
			y == that.y &&
			color == that.color;
	}

	@Override public int hashCode() {

		return Objects.hash(x, y, color);
	}
}
