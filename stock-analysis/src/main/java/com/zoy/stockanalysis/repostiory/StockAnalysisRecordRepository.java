package com.zoy.stockanalysis.repostiory;

import com.zoy.stockanalysis.entity.StockAnalysisRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/4/5
 */
public interface StockAnalysisRecordRepository extends JpaSpecificationExecutor<StockAnalysisRecord>,JpaRepository<StockAnalysisRecord,Long> {

}
