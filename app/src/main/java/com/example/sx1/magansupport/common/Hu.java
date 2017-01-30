package com.example.sx1.magansupport.common;

/**
 * Created by sx1 on 2016/10/10.
 */

public enum Hu {
	HU_0("0符", 0, 0),
	HU_2("2符", 2, 1),
	HU_4("4符", 4, 2),
	HU_8("8符", 8, 3),
	HU_16("16符", 16, 4),
	HU_32("32符", 32, 5);

	private String huText;
	private int huInt;
	private int huNum;

	Hu(String str, int huInt, int num) {
		this.huText = str;
		this.huInt = huInt;
		this.huNum = num;
	}

	public String getHuText() {
		return huText;
	}

	public int getHuInt() {
		return huInt;
	}

	public int getHuNum() {
		return huNum;
	}

	public boolean isMatch(int num) {
		return getHuNum() == num;
	}


	public static Hu valueOf(int num) {
		for(Hu hu : Hu.values()) {
			if(hu.getHuNum() == num) {
				return hu;
			}
		}
		return Hu.HU_0;
	}
}
