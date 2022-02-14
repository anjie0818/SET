package org.study.practice.entity;

import java.util.stream.Stream;

public class ShellResult {
    private String caseName;
    private Boolean result;

    @Override
    public String toString() {
        return "ShellResult{" +
                "caseName='" + caseName + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
