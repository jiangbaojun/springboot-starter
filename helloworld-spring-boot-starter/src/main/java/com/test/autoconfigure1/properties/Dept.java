package com.test.autoconfigure1.properties;

/**
 * @Author: jiangbaojun
 * @Date: 2020/3/16 09:26
 */
public class Dept {
    private String deptName;
    private String deptNo;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                ", deptNo='" + deptNo + '\'' +
                '}';
    }
}
