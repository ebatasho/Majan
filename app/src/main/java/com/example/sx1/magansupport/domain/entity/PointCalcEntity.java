package com.example.sx1.magansupport.domain.entity;

import com.example.sx1.magansupport.common.Agari;
import com.example.sx1.magansupport.common.Han;
import com.example.sx1.magansupport.common.Hu;
import com.example.sx1.magansupport.common.Huro;
import com.example.sx1.magansupport.common.Machi;
import com.example.sx1.magansupport.common.OyaKo;

import java.math.BigDecimal;

/**
 * Created by sx1 on 2016/10/10.
 */

public class PointCalcEntity {

	private OyaKo oyako; //必須
	private Han han; //必須
	private Huro huro; //必須
	private Agari agari; //必須
	private Machi machi;
	private int headHu = 0;
	private int mentsu1Hu = 0;
	private int mentsu2Hu = 0;
	private int mentsu3Hu = 0;
	private int mentsu4Hu = 0;

	public OyaKo getOyako() {
		return oyako;
	}

	public void setOyako(OyaKo oyako) {
		this.oyako = oyako;
	}

	public Han getHan() {
		return han;
	}

	public void setHan(Han han) {
		this.han = han;
	}

	public Huro getHuro() {
		return huro;
	}

	public void setHuro(Huro huro) {
		this.huro = huro;
	}

	public Agari getAgari() {
		return agari;
	}

	public void setAgari(Agari agari) {
		this.agari = agari;
	}

	public Machi getMachi() {
		return machi;
	}

	public void setMachi(Machi machi) {
		this.machi = machi;
	}

	public int getHeadHu() {
		return headHu;
	}

	public void setHeadHu(Hu headHu) {
		this.headHu = headHu.getHuInt();
	}

	public int getMentsu1Hu() {
		return mentsu1Hu;
	}

	public void setMentsu1Hu(Hu mentsu1Hu) {
		this.mentsu1Hu = mentsu1Hu.getHuInt();
	}

	public int getMentsu2Hu() {
		return mentsu2Hu;
	}

	public void setMentsu2Hu(Hu mentsu2Hu) {
		this.mentsu2Hu = mentsu2Hu.getHuInt();
	}

	public int getMentsu3Hu() {
		return mentsu3Hu;
	}

	public void setMentsu3Hu(Hu mentsu3Hu) {
		this.mentsu3Hu = mentsu3Hu.getHuInt();
	}

	public int getMentsu4Hu() {
		return mentsu4Hu;
	}

	public void setMentsu4Hu(Hu mentsu4Hu) {
		this.mentsu4Hu = mentsu4Hu.getHuInt();
	}



	public int getTotalKiriageHu() {
		return getKiriage(getTotalHu());

	}

	public int getTotalHu() {
		return getKumiawaseTotalHu()
				+ getMachi().getMachiNum()
				+ getTotalAgarikataHu();
	}

	public int getTotalAgarikataHu() {
		// 副底
		int hu = 20;

		if(Agari.TSUMO == agari) {
			hu += 2;
		} else if(Huro.MENZEN == huro) {
			hu += 10;
		}
		return hu;
	}

	public int getKumiawaseTotalHu() {
		return getHeadHu()
				+ getMentsu1Hu()
				+ getMentsu2Hu()
				+ getMentsu3Hu()
				+ getMentsu4Hu();
	}

	private int getKiriage(int hu) {
		double db = (double) hu;
		db = Math.ceil(db/10) * 10.0d;
		return new BigDecimal(db).intValue();
	}
}
