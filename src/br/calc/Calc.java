package br.calc;

public class Calc{
	public static Double sum(Double... nums){
		Double res = Double.valueOf(0);

		for(Double num : nums){
			res += num;
		}

		return res;
	}
}
