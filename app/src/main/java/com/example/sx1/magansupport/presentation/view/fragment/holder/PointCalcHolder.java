package com.example.sx1.magansupport.presentation.view.fragment.holder;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sx1.magansupport.R;

/**
 * Created by sx1 on 2016/10/02.
 */

public class PointCalcHolder {

	// 親・子
	public Button oyaButton;
	public Button koButton;
	public TextView oyaKoTextView;

	// 翻数
	public Button han1Button;
	public Button han2Button;
	public Button han3Button;
	public Button han4Button;
	public TextView hanTextView;

	// アガリ方
	public Button menzenButton;
	public Button nakiariButton;
	public Button ronButton;
	public Button tsumoButton;
	public TextView agariHuTextView;

	// 待ち
	public Button ryanmenButton;
	public Button shaboButton;
	public Button kantyanButton;
	public Button pentyanButton;
	public Button tankiButton;
	public TextView matiHuTextView;

	// 組み合わせ
	public Spinner headSpinner;
	public Spinner mentsu1Spinner;
	public Spinner mentsu2Spinner;
	public Spinner mentsu3Spinner;
	public Spinner mentsu4Spinner;
	public TextView kumiawaseHuTextView;

	// 例外
	public Button pinhuButton;
	public Button titoiButton;
	public Button hokaButton;
	public TextView reigaiHuTextView;

	// 結果
	public TextView resultTextView;

	public PointCalcHolder(View v) {
		// 親・子
		oyaButton = (Button) v.findViewById(R.id.oya_btn);
		koButton = (Button) v.findViewById(R.id.ko_btn);
		oyaKoTextView = (TextView) v.findViewById(R.id.oya_ko_textView);

		// 翻数
		han1Button = (Button) v.findViewById(R.id.han_1_btn);
		han2Button = (Button) v.findViewById(R.id.han_2_btn);
		han3Button = (Button) v.findViewById(R.id.han_3_btn);
		han4Button = (Button) v.findViewById(R.id.han_4_btn);
		hanTextView = (TextView) v.findViewById(R.id.han_text_view);

		// アガリ方
		menzenButton = (Button) v.findViewById(R.id.menzen_btn);
		nakiariButton = (Button) v.findViewById(R.id.nakiari_btn);
		ronButton = (Button) v.findViewById(R.id.ron_btn);
		tsumoButton = (Button) v.findViewById(R.id.tsumo_btn);
		agariHuTextView = (TextView) v.findViewById(R.id.agari_hu_text_view);

		// 待ち
		ryanmenButton = (Button) v.findViewById(R.id.ryanmen_btn);
		shaboButton = (Button) v.findViewById(R.id.shabo_btn);
		kantyanButton = (Button) v.findViewById(R.id.kantyan_btn);
		pentyanButton = (Button) v.findViewById(R.id.pentyan_btn);
		tankiButton = (Button) v.findViewById(R.id.tanki_btn);
		matiHuTextView = (TextView) v.findViewById(R.id.mati_hu_text_view);

		// 組み合わせ
		headSpinner = (Spinner) v.findViewById(R.id.head_spinner);
		mentsu1Spinner = (Spinner) v.findViewById(R.id.mentsu_1_spinner);
		mentsu2Spinner = (Spinner) v.findViewById(R.id.mentsu_2_spinner);
		mentsu3Spinner = (Spinner) v.findViewById(R.id.mentsu_3_spinner);
		mentsu4Spinner = (Spinner) v.findViewById(R.id.mentsu_4_spinner);
		kumiawaseHuTextView = (TextView) v.findViewById(R.id.kumiawase_hu_text_view);

		// 例外
		pinhuButton = (Button) v.findViewById(R.id.pinhu_btn);
		titoiButton = (Button) v.findViewById(R.id.titoi_btn);
		hokaButton = (Button) v.findViewById(R.id.hoka_btn);
		reigaiHuTextView=(TextView) v.findViewById(R.id.reigai_hu_text_view);

		// 結果
		resultTextView = (TextView) v.findViewById(R.id.result_test_view);
	}
}
