package cn.jsonqiao.prj.wechat.service.wechat;

import cn.jsonqiao.prj.wechat.domain.wechat.WechatDo;
import cn.jsonqiao.prj.wechat.service.BaseService;

/**
 * Created by jsonqiao on 16/8/19.
 */
public interface WechatService extends BaseService<WechatDo> {

    WechatDo findByAppId(String appId);
}
