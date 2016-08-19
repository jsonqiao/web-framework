package cn.jsonqiao.prj.wechat.mapper.wechat;

import cn.jsonqiao.prj.wechat.domain.wechat.WechatDo;
import cn.jsonqiao.prj.wechat.mapper.BaseMapper;

/**
 * Created by jsonqiao on 16/8/19.
 */
public interface WechatMapper extends BaseMapper<WechatDo> {

    WechatDo findByAppId(String appId);
}
