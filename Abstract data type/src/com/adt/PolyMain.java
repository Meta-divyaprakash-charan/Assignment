package com.adt;

public class PolyMain {

	public static void main(String[] args) {
        Poly p1 = new Poly( 1, 3 );
        Poly p2 = new Poly( 2, 2 );
        Poly p3 = new Poly( 4, 0 );
        Poly p4 = new Poly( 0, 1 );
        Poly p = p1.addPoly(p2).addPoly(p3).addPoly(p4);
        
        Poly q1 = new Poly( 1, 3 );
        Poly q2 = new Poly( 2, 2 );
        Poly q3 = new Poly( 4, 0 );
        Poly q = q1.addPoly(q2).addPoly(q3);
        
        Poly sum = p.addPoly(q);
        Poly product = p.multiplyPoly(q);
        
        System.out.println(p.evaluate(4));
        
        p.show();
        sum.show();
        product.show();
	}
}
