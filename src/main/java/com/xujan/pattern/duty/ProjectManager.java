package com.xujan.pattern.duty;

import com.xujan.util.ResultUtils;

public class ProjectManager extends Handler {

    @Override
    public String processHandler(String userName, Integer outlay) {
        String message = null;
        if (outlay < 500) {
            String result = ResultUtils.result();
            message = String.format("项目经理%s了%s的申请经费，金额为：%s元", result, userName, outlay);
        } else {
            if (super.getNextHandler() != null) {
                message = getNextHandler().processHandler(userName, outlay);
            }
        }
        return message;
    }
}
