package com.example.sx1.magansupport.domain.entity;

import com.example.sx1.magansupport.common.Agari;
import com.example.sx1.magansupport.common.OyaKo;

/**
 * Created by sx1 on 2016/10/10.
 */

public class PointEntity {

	// 上がった人の「親・子」の状態
	private OyaKo oyakoStatus;
	private Agari agariStatus;

	// 符
	private int hu = 0;

	// 翻
	private int han = 0;

	// 支払い点
	private int ronPayPoint = 0;
	private int oyaPayPoint = 0;
	private int koPayPoint = 0;

	public PointEntity(OyaKo oyakoStatus,int hu, int han,  int ronPayPoint, int oyaPayPoint, int koPayPoint) {
		this.oyakoStatus = oyakoStatus;
		this.hu = hu;
		this.han = han;
		this.ronPayPoint = ronPayPoint;
		this.oyaPayPoint = oyaPayPoint;
		this.koPayPoint = koPayPoint;
	}

	public OyaKo getOyakoStatus() {
		return oyakoStatus;
	}

	public int getHu() {
		return hu;
	}

	public int getHan() {
		return han;
	}

	public int getRonPayPoint() {
		return ronPayPoint;
	}

	public int getOyaPayPoint() {
		return oyaPayPoint;
	}

	public int getKoPayPoint() {
		return koPayPoint;
	}

	public Agari getAgariStatus() {
		return agariStatus;
	}
}
