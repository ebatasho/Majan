package com.example.sx1.magansupport.common;

/**
 * Created by sx1 on 2016/10/10.
 */

public enum Agari {

	RON("ロン", 0),
	TSUMO("ツモ", 1);

	private String agariText;
	private int agariNum;

	Agari(String str, int num) {
		agariText = str;
		agariNum = num;
	}

	public String getAgariText() {
		return agariText;
	}

	public int getAgariNum() {
		return agariNum;
	}
}
