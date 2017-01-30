package com.example.sx1.magansupport.infra.repository.contract;

import com.example.sx1.magansupport.domain.entity.PointCalcEntity;
import com.example.sx1.magansupport.domain.entity.PointEntity;

/**
 * Created by sx1 on 2016/10/10.
 */

public interface PointCalcRepositoryContract {

	PointEntity getResult(PointCalcEntity entity);
}
