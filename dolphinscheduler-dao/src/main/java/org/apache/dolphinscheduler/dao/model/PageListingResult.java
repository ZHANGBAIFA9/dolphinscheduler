package org.apache.dolphinscheduler.dao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Version 1.0
 * @Author ZHANGBAIFA
 * @Date 2023/12/27 17:05
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
public class PageListingResult<T> {

    private List<T> records;

    private long totalCount;

    private int currentPage;

    private int pageSize;

}
