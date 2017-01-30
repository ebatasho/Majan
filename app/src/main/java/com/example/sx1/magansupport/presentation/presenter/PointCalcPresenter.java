package com.example.sx1.magansupport.presentation.presenter;

import com.example.sx1.magansupport.common.Agari;
import com.example.sx1.magansupport.common.Han;
import com.example.sx1.magansupport.common.Hu;
import com.example.sx1.magansupport.common.Huro;
import com.example.sx1.magansupport.common.Machi;
import com.example.sx1.magansupport.common.OyaKo;
import com.example.sx1.magansupport.contract.PointCalcContract;
import com.example.sx1.magansupport.domain.entity.PointEntity;
import com.example.sx1.magansupport.domain.useCase.contract.PointCalcUseCaseContract;
import com.example.sx1.magansupport.domain.useCase.PointCalcUseCase;

/**
 * Created by sx1 on 2016/10/02.
 */
// TODO: string.xmlへの書き出し

public class PointCalcPresenter implements PointCalcContract.UserActions {

	private PointCalcContract.View pointCalcFragment;
	private PointCalcUseCaseContract pointCalcUseCase;

	public PointCalcPresenter(PointCalcContract.View pointCalcFragment) {
		this.pointCalcFragment = pointCalcFragment;
		pointCalcUseCase = new PointCalcUseCase();
	}

	// 親ボタン
	@Override
	public void pushOyaButton() {
		pointCalcUseCase.setOyaKo(OyaKo.OYA);
		pointCalcFragment.setOyaKoTextView(OyaKo.OYA.getOyakoText());

		updateResultTextView();
	}

	// 子ボタン
	@Override
	public void pushKoButton() {
		pointCalcUseCase.setOyaKo(OyaKo.KO);
		pointCalcFragment.setOyaKoTextView(OyaKo.KO.getOyakoText());

		updateResultTextView();
	}

	// 1翻ボタン
	@Override
	public void pushHan1Buttton() {
		pointCalcUseCase.setHan(Han.HAN1);
		pointCalcFragment.setHanTextView(Han.HAN1.getHanText());

		updateResultTextView();
	}

	// 2翻ボタン
	@Override
	public void pushHan2Buttton() {
		pointCalcUseCase.setHan(Han.HAN2);
		pointCalcFragment.setHanTextView(Han.HAN2.getHanText());

		updateResultTextView();
	}

	// 3翻ボタン
	@Override
	public void pushHan3Buttton() {
		pointCalcUseCase.setHan(Han.HAN3);
		pointCalcFragment.setHanTextView(Han.HAN3.getHanText());

		updateResultTextView();
	}

	// 4翻ボタン
	@Override
	public void pushHan4Buttton() {
		pointCalcUseCase.setHan(Han.HAN4);
		pointCalcFragment.setHanTextView(Han.HAN4.getHanText());

		updateResultTextView();
	}

	// 門前ボタン
	@Override
	public void pushMenzenButton() {
		// TODO: 門前と鳴き有り、ロンツモから計算

		pointCalcUseCase.setHuro(Huro.MENZEN);
		updateAgariHuTextView();

		updateResultTextView();
	}

	// 鳴き有りボタン
	@Override
	public void pushNakiariButton() {
		// TODO: 門前と鳴き有り、ロンツモから計算

		pointCalcUseCase.setHuro(Huro.NAKIARI);
		updateAgariHuTextView();

		updateResultTextView();
	}

	// ロンボタン
	@Override
	public void pushRonButton() {
		// TODO: 門前と鳴き有り、ロンツモから計算

		pointCalcUseCase.setAgari(Agari.RON);
		updateAgariHuTextView();

		updateResultTextView();
	}

	// ツモボタン
	@Override
	public void pushTsumoButton() {
		// TODO: 門前と鳴き有り、ロンツモから計算

		pointCalcUseCase.setAgari(Agari.TSUMO);
		updateAgariHuTextView();

		updateResultTextView();
	}

	// 両面ボタン
	@Override
	public void pushRyanmenButton() {
		pointCalcUseCase.setMachi(Machi.RYANMEN);
		pointCalcFragment.setMatiHuTextView("0符");

		updateResultTextView();
	}

	// シャボボタン
	@Override
	public void pushShaboButton() {
		pointCalcUseCase.setMachi(Machi.SHABO);
		pointCalcFragment.setMatiHuTextView("0符");

		updateResultTextView();
	}

	// 嵌張ボタン
	@Override
	public void pushKantyanButton() {
		pointCalcUseCase.setMachi(Machi.KANCHAN);
		pointCalcFragment.setMatiHuTextView("2符");

		updateResultTextView();
	}

	// 辺張ボタン
	@Override
	public void pushPentyanButton() {
		pointCalcUseCase.setMachi(Machi.PENCHAN);
		pointCalcFragment.setMatiHuTextView("2符");

		updateResultTextView();
	}

	// 単騎ボタン
	@Override
	public void pushTankiButton() {
		pointCalcUseCase.setMachi(Machi.TANKI);
		pointCalcFragment.setMatiHuTextView("2符");

		updateResultTextView();
	}

	// 平和ボタン
	@Override
	public void pushPinhuButton() {
		pointCalcFragment.setReigaiHuTextView("20符");

		updateResultTextView();
	}

	// 七対子ボタン
	@Override
	public void pushTitoiButton() {
		pointCalcFragment.setReigaiHuTextView("25符");

		updateResultTextView();
	}

	// 他ボタン
	@Override
	public void pushHokaButton() {
		pointCalcFragment.setReigaiHuTextView("-符");

		updateResultTextView();
	}

	// 雀頭spinner
	@Override
	public void selectHeadSpinner(int num) {
		Hu hu = Hu.valueOf(num);
		pointCalcUseCase.setHead(hu);

		setKumiawaseHuTextView(addHuText(pointCalcUseCase.getKumiawaseTotalHu()));
		updateResultTextView();
	}

	// 面子1spinner
	@Override
	public void selectMentsu1Spinner(int num) {
		Hu hu = Hu.valueOf(num);
		pointCalcUseCase.setMentsu1(hu);

		setKumiawaseHuTextView(addHuText(pointCalcUseCase.getKumiawaseTotalHu()));
		updateResultTextView();
	}

	// 面子2spinner
	@Override
	public void selectMentsu2Spinner(int num) {
		Hu hu = Hu.valueOf(num);
		pointCalcUseCase.setMentsu2(hu);

		setKumiawaseHuTextView(addHuText(pointCalcUseCase.getKumiawaseTotalHu()));
		updateResultTextView();
	}

	// 面子3spinner
	@Override
	public void selectMentsu3Spinner(int num) {
		Hu hu = Hu.valueOf(num);
		pointCalcUseCase.setMentsu3(hu);

		setKumiawaseHuTextView(addHuText(pointCalcUseCase.getKumiawaseTotalHu()));
		updateResultTextView();
	}

	// 面子4spinner
	@Override
	public void selectMentsu4Spinner(int num) {
		Hu hu = Hu.valueOf(num);
		pointCalcUseCase.setMentsu4(hu);

		setKumiawaseHuTextView(addHuText(pointCalcUseCase.getKumiawaseTotalHu()));
		updateResultTextView();
	}


	private void updateAgariHuTextView() {
		int hu = pointCalcUseCase.getTotalAgarikataHu();
		if(0 < hu) {
			setAgariHuTextView(addHuText(hu));
		}
	}
	private void setAgariHuTextView(String str) {
		pointCalcFragment.setAgariHuTextView(str);
	}

	private void setKumiawaseHuTextView(String str) {
		pointCalcFragment.setKumiawaseHuTextView(str);
	}

	private void updateResultTextView() {
		PointEntity pointEntity = pointCalcUseCase.getTotalPoint();
		if(pointEntity != null) {
			setResultTextView(makeResultText());
		}
	}
	private void setResultTextView(String str) {
		pointCalcFragment.setResultTextView(str);
	}

	private String addHuText(int num) {
		StringBuffer result = new StringBuffer();
		result.append(num);
		result.append("符");
		return result.toString();
	}

	private String addHanText(int num) {
		StringBuffer result = new StringBuffer();
		result.append(num);
		result.append("翻");
		return result.toString();
	}

	private String makeResultText(){
		PointEntity pointEntity = pointCalcUseCase.getTotalPoint();
		StringBuffer result = new StringBuffer();
		if(pointEntity != null) {
			result.append(pointEntity.getOyakoStatus().getOyakoText());
			result.append(" ");
			result.append(addHuText(pointEntity.getHu()));
			result.append(" ");
			result.append(addHanText(pointEntity.getHan()));

			if(Agari.RON == pointEntity.getAgariStatus()) {
				// ロン
				result.append(" ロン (");
				result.append(pointEntity.getRonPayPoint());
				result.append(")");
			} else {
				// ツモ
				result.append(" ツモ (");
				if(OyaKo.OYA == pointEntity.getOyakoStatus()) {
					result.append(pointEntity.getRonPayPoint());
					result.append(" ALL)");
				} else {
					result.append(pointEntity.getKoPayPoint());
					result.append(" / ");
					result.append(pointEntity.getOyaPayPoint());
					result.append(")");
				}
			}
		}
		return result.toString();
	}



}
