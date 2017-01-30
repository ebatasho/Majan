package com.example.sx1.magansupport.common;

/**
 * Created by sx1 on 2016/10/10.
 */

public enum OyaKo {

	OYA("親", 1),
	KO("子", 0);

	private String oyaKoText;
	private int oyaKoNum;

	OyaKo(String str, int num) {
		oyaKoText = str;
		oyaKoNum = num;
	}

	public String getOyakoText() {
		return oyaKoText;
	}

	public int getOyaKoNum() {
		return oyaKoNum;
	}

	public boolean matchByNum(int num) {
		return oyaKoNum == num;
	}
}
