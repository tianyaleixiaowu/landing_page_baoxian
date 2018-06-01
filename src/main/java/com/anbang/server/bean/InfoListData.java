package com.anbang.server.bean;


import com.anbang.server.model.Info;

/**
 * @author wuweifeng wrote on 2018/4/12.
 */
public class InfoListData extends BaseData {
    private SimplePage<Info> simplePage;

    public SimplePage<Info> getSimplePage() {
        return simplePage;
    }

    public void setSimplePage(SimplePage<Info> simplePage) {
        this.simplePage = simplePage;
    }
}
