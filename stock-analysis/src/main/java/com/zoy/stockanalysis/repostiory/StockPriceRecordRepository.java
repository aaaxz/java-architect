package com.zoy.stockanalysis.repostiory;

import com.zoy.stockanalysis.entity.StockPriceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/4/5
 */
public interface StockPriceRecordRepository extends JpaSpecificationExecutor<StockPriceRecord>,JpaRepository<StockPriceRecord,Long> {

}
