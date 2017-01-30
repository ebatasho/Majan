package com.example.sx1.magansupport.infra.repository;

import com.example.sx1.magansupport.domain.entity.PointCalcEntity;
import com.example.sx1.magansupport.domain.entity.PointEntity;
import com.example.sx1.magansupport.infra.DummyPoint;
import com.example.sx1.magansupport.infra.repository.contract.PointCalcRepositoryContract;
import com.example.sx1.magansupport.infra.PointTable;

/**
 * Created by sx1 on 2016/10/10.
 */

public class PointCalcRepository implements PointCalcRepositoryContract {

	PointTable pointTable;

	public PointCalcRepository() {
		pointTable = new DummyPoint();
	}

	@Override
	public PointEntity getResult(PointCalcEntity entity) {
		return pointTable.getCalcPoint(entity.getOyako(), entity.getTotalKiriageHu(), entity.getHan().getHanNum());
	}
}
