package cn.jsonqiao.prj.wechat.domain.wechat;

import cn.jsonqiao.prj.wechat.domain.BaseDo;

/**
 * 微信公众号基础信息
 * <p>
 * Created by jsonqiao on 16/8/19.
 */
public class WechatDo extends BaseDo {

    private String name;

    private String appId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
