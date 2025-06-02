package br.calc;

import java.lang.Math;

public class Graphic{
	public Double square(Double side){
		return Double.valueOf(Math.sqrt(side));
	}
	
	public Double cube(Double side){
		return Double.valueOf(Math.cbrt(side));
	}
}

