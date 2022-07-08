package com.adt;

public final class Poly {
	private int degree;
	private int[] coeff;

	/**
	 * -Parameterized construction to initialize object
	 * 
	 * @param val
	 * @param power
	 */
	public Poly(int val, int power) {
		coeff = new int[power + 1];
		coeff[power] = val;
		degree = degree();
	}

	public Poly(Poly p) {
		coeff = new int[p.coeff.length];
		for (int i = 0; i < p.coeff.length; i++) {
			coeff[i] = p.coeff[i];
		}
		degree = p.degree();
	}

	/* Find degree of a polynomial */
	private int degree() {
		int degree = 0;
		for (int i = 0; i < coeff.length; i++)
			if (coeff[i] != 0)
				degree = i;
		return degree;
	}

	/**
	 * -Add two polynomials and return resultant polynomial
	 * 
	 * @param p2
	 * @return sum
	 */
	public Poly addPoly(Poly p2) {
		Poly sum = new Poly(0, Math.max(this.degree, p2.degree));
		for (int i = 0; i <= this.degree; i++)
			sum.coeff[i] += this.coeff[i];
		for (int i = 0; i <= p2.degree; i++)
			sum.coeff[i] += p2.coeff[i];
		sum.degree = sum.degree();
		return sum;
	}

	/**
	 * -Multiply two objects of Poly
	 * 
	 * @param p2
	 * @return product
	 */
	public Poly multiplyPoly(Poly p2) {
		Poly product = new Poly(0, this.degree + p2.degree);
		for (int i = 0; i <= this.degree; i++)
			for (int j = 0; j <= p2.degree; j++)
				product.coeff[i + j] += (this.coeff[i] * p2.coeff[j]);
		product.degree = product.degree();
		return product;
	}

	/**
	 * -Evaluate a polynomial
	 * 
	 * @param x
	 * @return result float value after evaluation
	 */
	public float evaluate(int x) {
		float result = 0;
		for (int i = degree; i >= 0; i--)
			result = coeff[i] + (x * result);
		return result;
	}

	/**
	 * This method can print a polynomial as string
	 */
	public void show() {
		String s = "";
		for (int i = 0; i < this.coeff.length; i++) {
			if (coeff[i] == 0)
				continue;
			if (i == 0)
				s = " + " + coeff[i] + s;
			else if (i == 1)
				s = " + " + coeff[i] + "x" + s;
			else
				s = " + " + coeff[i] + "x^" + i + s;
		}
		System.out.println(s.substring(2));
	}

}
