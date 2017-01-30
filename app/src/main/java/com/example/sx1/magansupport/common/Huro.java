package com.example.sx1.magansupport.common;

/**
 * Created by sx1 on 2016/10/10.
 */

public enum Huro {

	MENZEN("門前", 0),
	NAKIARI("鳴き有り", 1);

	private String huroText;
	private int huroNum;

	Huro(String str, int num) {
		huroText = str;
		huroNum = num;
	}

	public String getHuroText() {
		return huroText;
	}

	public int getHuroNum() {
		return huroNum;
	}
}
