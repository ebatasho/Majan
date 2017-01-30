package com.example.sx1.magansupport.domain.useCase.contract;

import com.example.sx1.magansupport.common.Agari;
import com.example.sx1.magansupport.common.Han;
import com.example.sx1.magansupport.common.Hu;
import com.example.sx1.magansupport.common.Huro;
import com.example.sx1.magansupport.common.Machi;
import com.example.sx1.magansupport.common.OyaKo;
import com.example.sx1.magansupport.domain.entity.PointEntity;

/**
 * Created by sx1 on 2016/10/10.
 */

public interface PointCalcUseCaseContract {
	void setOyaKo(OyaKo oyaKo);
	void setHan(Han han);
	void setHuro(Huro huro);
	void setAgari(Agari agari);
	void setMachi(Machi machi);
	void setHead(Hu hu);
	void setMentsu1(Hu hu);
	void setMentsu2(Hu hu);
	void setMentsu3(Hu hu);
	void setMentsu4(Hu hu);

	int getKumiawaseTotalHu();
	int getTotalAgarikataHu();
	PointEntity getTotalPoint();

}
