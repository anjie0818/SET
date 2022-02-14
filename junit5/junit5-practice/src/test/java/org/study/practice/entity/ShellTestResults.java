package org.study.practice.entity;

import java.util.ArrayList;
import java.util.List;

public class ShellTestResults {

    private List<ShellResult> resultList = new ArrayList();

    public List<ShellResult> getResultList() {
        return resultList;
    }

    public void setResultList(List<ShellResult> resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return "ShellTestResults{" +
                "resultList=" + resultList +
                '}';
    }
}
