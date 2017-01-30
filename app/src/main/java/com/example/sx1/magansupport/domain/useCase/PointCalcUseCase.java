package com.example.sx1.magansupport.domain.useCase;

import com.example.sx1.magansupport.common.Agari;
import com.example.sx1.magansupport.common.Han;
import com.example.sx1.magansupport.common.Hu;
import com.example.sx1.magansupport.common.Huro;
import com.example.sx1.magansupport.common.Machi;
import com.example.sx1.magansupport.common.OyaKo;
import com.example.sx1.magansupport.domain.entity.PointEntity;
import com.example.sx1.magansupport.domain.useCase.contract.PointCalcUseCaseContract;
import com.example.sx1.magansupport.domain.entity.PointCalcEntity;
import com.example.sx1.magansupport.infra.repository.PointCalcRepository;
import com.example.sx1.magansupport.infra.repository.contract.PointCalcRepositoryContract;

/**
 * Created by sx1 on 2016/10/10.
 */

public class PointCalcUseCase implements PointCalcUseCaseContract {


	private PointCalcEntity entity;
	private PointCalcRepositoryContract pointCalcRepository;

	public PointCalcUseCase() {
		entity = new PointCalcEntity();
		pointCalcRepository = new PointCalcRepository();
	}

	@Override
	public void setOyaKo(OyaKo oyaKo) {
		entity.setOyako(oyaKo);
	}

	@Override
	public void setHan(Han han) {
		entity.setHan(han);
	}

	@Override
	public void setHuro(Huro huro) {
		entity.setHuro(huro);
	}

	@Override
	public void setAgari(Agari agari) {
		entity.setAgari(agari);
	}

	@Override
	public void setMachi(Machi machi) {
		entity.setMachi(machi);
	}

	@Override
	public void setHead(Hu hu) {
		entity.setHeadHu(hu);
	}

	@Override
	public void setMentsu1(Hu hu) {
		entity.setMentsu1Hu(hu);
	}

	@Override
	public void setMentsu2(Hu hu) {
		entity.setMentsu2Hu(hu);
	}

	@Override
	public void setMentsu3(Hu hu) {
		entity.setMentsu3Hu(hu);
	}

	@Override
	public void setMentsu4(Hu hu) {
		entity.setMentsu4Hu(hu);
	}


	@Override
	public int getKumiawaseTotalHu() {
		return entity.getKumiawaseTotalHu();
	}

	@Override
	public int getTotalAgarikataHu() {
		if(entity.getHuro() != null &&  entity.getHuro() != null) {
			return entity.getTotalAgarikataHu();
		}
		return 0;
	}

	@Override
	public PointEntity getTotalPoint() {
		if(isCalculable()) {
			return pointCalcRepository.getResult(entity);
		}
		return null;
	}

	/**
	 * 計算可能check
	 * @return
     */
	private boolean isCalculable() {
		if(entity.getOyako() == null) {
			return false;
		}
		if(entity.getHan() == null) {
			return false;
		}
		if(entity.getHuro() == null) {
			return false;
		}
		if(entity.getAgari() == null) {
			return false;
		}
		if(entity.getMachi() == null) {
			return false;
		}
		return true;
	}


}
