package com.example.sx1.magansupport.infra;

import com.example.sx1.magansupport.common.OyaKo;
import com.example.sx1.magansupport.domain.entity.PointEntity;

import java.util.HashMap;
import java.util.Map;

public class DummyPoint implements PointTable {

	private Map<Integer, Map<Integer, Map<Integer, Map<Integer, PointEntity>>>> pointMap;

	public DummyPoint() {
		pointMap = new HashMap<>();

	}

	@Override
	public PointEntity getCalcPoint(OyaKo oyaKoStatus, int hu, int han) {
		PointEntity pointEntity = null;
		if(OyaKo.OYA == oyaKoStatus) {
			pointEntity = new PointEntity(oyaKoStatus, hu, han, 3900, 2000, 1000);
		} else {
			pointEntity = new PointEntity(oyaKoStatus, hu, han, 5800, 0, 2000);
		}
		return pointEntity;
	}
}
