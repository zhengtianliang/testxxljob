package com.zheng.handler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @author: ZhengTianLiang
 * @date: 2022/05/29 22:04
 * @desc: 测试
 */

@Component
public class BusinessJobHandler {

    @XxlJob("businessJobHandler")
    public void businessJobHandler() {
        // 调度日志-操作-执行日志
        XxlJobHelper.log("businessJobHandler XxlJobHelper start ... ");
        // 控制台
        System.out.println("businessJobHandler log start ..");
    }
}
