package com.example.sx1.magansupport.common;

/**
 * Created by sx1 on 2016/10/10.
 */

public enum Han {
	HAN1("1翻", 1),
	HAN2("2翻", 2),
	HAN3("3翻", 3),
	HAN4("4翻", 4);

	private String hanText;
	private int hanNum;

	Han(String str, int num) {
		hanText = str;
		hanNum = num;
	}

	public String getHanText() {
		return hanText;
	}

	public int getHanNum() {
		return hanNum;
	}
}
