package com.example.sx1.magansupport.infra;

import com.example.sx1.magansupport.common.OyaKo;
import com.example.sx1.magansupport.domain.entity.PointEntity;

/**
 * Created by sx1 on 2016/10/10.
 */

public interface PointTable {

	PointEntity getCalcPoint(OyaKo oyaKoStatus, int hu, int han);
}
