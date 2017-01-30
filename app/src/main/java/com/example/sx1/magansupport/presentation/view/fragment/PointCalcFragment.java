package com.example.sx1.magansupport.presentation.view.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.sx1.magansupport.R;
import com.example.sx1.magansupport.contract.PointCalcContract;
import com.example.sx1.magansupport.presentation.presenter.PointCalcPresenter;
import com.example.sx1.magansupport.presentation.view.fragment.holder.PointCalcHolder;


/**
 * A placeholder fragment containing a simple view.
 */
public class PointCalcFragment extends Fragment implements PointCalcContract.View {

	private PointCalcHolder holder;

	private PointCalcContract.UserActions pointCalcPresenter;

	public PointCalcFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		holder = new PointCalcHolder(view);

		pointCalcPresenter = new PointCalcPresenter(this);
		initEvent();
		return view;
	}

	private void initEvent() {
		// 親ボタン
		holder.oyaButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushOyaButton();
			}
		});

		// 子ボタン
		holder.koButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushKoButton();
			}
		});

		// 1翻ボタン
		holder.han1Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushHan1Buttton();
			}
		});

		// 2翻ボタン
		holder.han2Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushHan2Buttton();
			}
		});

		// 3翻ボタン
		holder.han3Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushHan3Buttton();
			}
		});

		// 4翻ボタン
		holder.han4Button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushHan4Buttton();
			}
		});

		// 門前ボタン
		holder.menzenButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushMenzenButton();
			}
		});

		// 鳴き有りボタン
		holder.nakiariButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushNakiariButton();
			}
		});

		// ロンボタン
		holder.ronButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushRonButton();
			}
		});

		// ツモボタン
		holder.tsumoButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushTsumoButton();
			}
		});

		// 両面ボタン
		holder.ryanmenButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushRyanmenButton();
			}
		});

		// シャボボタン
		holder.shaboButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushShaboButton();
			}
		});

		// 嵌張ボタン
		holder.kantyanButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushKantyanButton();
			}
		});

		// 辺張ボタン
		holder.pentyanButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushPentyanButton();
			}
		});

		// 単騎ボタン
		holder.tankiButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushTankiButton();
			}
		});

		// 平和ボタン
		holder.pinhuButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushPinhuButton();
			}
		});

		// 七対子ボタン
		holder.titoiButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushTitoiButton();
			}
		});

		// 他ボタン
		holder.hokaButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				pointCalcPresenter.pushHokaButton();
			}
		});


		// 雀頭spinner
		holder.headSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				pointCalcPresenter.selectHeadSpinner(position);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});

		// 面子1spinner
		holder.mentsu1Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				pointCalcPresenter.selectMentsu1Spinner(position);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});

		// 面子2spinner
		holder.mentsu2Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				pointCalcPresenter.selectMentsu2Spinner(position);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});

		// 面子3spinner
		holder.mentsu3Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				pointCalcPresenter.selectMentsu3Spinner(position);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});

		// 面子4spinner
		holder.mentsu4Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				pointCalcPresenter.selectMentsu4Spinner(position);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

			}
		});


	}


	@Override
	public void setOyaKoTextView(String str) {
		holder.oyaKoTextView.setText(str);
	}

	@Override
	public void setHanTextView(String str) {
		holder.hanTextView.setText(str);
	}

	@Override
	public void setAgariHuTextView(String str) {
		holder.agariHuTextView.setText(str);
	}

	@Override
	public void setMatiHuTextView(String str) {
		holder.matiHuTextView.setText(str);
	}

	@Override
	public void setReigaiHuTextView(String str) {
		holder.reigaiHuTextView.setText(str);
	}

	@Override
	public void setKumiawaseHuTextView(String str) {
		holder.kumiawaseHuTextView.setText(str);
	}

	@Override
	public void setResultTextView(String str) {
		holder.resultTextView.setText(str);
	}
}
