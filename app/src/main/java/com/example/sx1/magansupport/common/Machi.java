package com.example.sx1.magansupport.common;

/**
 * Created by sx1 on 2016/10/10.
 */

public enum Machi {
	RYANMEN("両面", 0),
	SHABO("シャボ", 0),
	KANCHAN("嵌張", 2),
	PENCHAN("辺張", 2),
	TANKI("単騎", 2);

	private String machiText;
	private int machiNum;

	Machi(String str, int num) {
		machiText = str;
		machiNum = num;
	}

	public String getMachiText() {
		return machiText;
	}

	public int getMachiNum() {
		return machiNum;
	}
}
