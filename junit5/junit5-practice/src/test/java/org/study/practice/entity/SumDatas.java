package org.study.practice.entity;

import java.util.ArrayList;
import java.util.List;

public class SumDatas {
    private List<SumData> datas = new ArrayList<>();

    public List<SumData> getDatas() {
        return datas;
    }

    public void setDatas(List<SumData> datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "SumDatas{" +
                "datas=" + datas +
                '}';
    }
}
