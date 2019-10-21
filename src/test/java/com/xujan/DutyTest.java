package com.xujan;

import com.xujan.pattern.duty.DepartmentManager;
import com.xujan.pattern.duty.GeneralManager;
import com.xujan.pattern.duty.Handler;
import com.xujan.pattern.duty.ProjectManager;
import org.junit.Test;

public class DutyTest {

    @Test
    public void test() {
        Handler projectManager = new ProjectManager();
        Handler departmentManager = new DepartmentManager();
        Handler generalManager = new GeneralManager();
        projectManager.setNextHandler(departmentManager);
        departmentManager.setNextHandler(generalManager);

        for (int i = 0; i < 5; i++) {
            Integer outlay = (int)(Math.random() * 2000);
            String message = projectManager.processHandler("张三" + i, outlay);
            System.out.println(message);
        }

    }
}
