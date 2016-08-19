package cn.jsonqiao.prj.wechat.controller;

import cn.jsonqiao.prj.wechat.domain.wechat.WechatDo;
import cn.jsonqiao.prj.wechat.model.Result;
import cn.jsonqiao.prj.wechat.service.wechat.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jsonqiao on 16/8/19.
 */
@Controller
@RequestMapping("/wechat/")
public class WechatController extends BaseController {

    @Autowired
    private WechatService wechatService;

    @RequestMapping("index")
    @ResponseBody
    public Result<WechatDo> index() {
        WechatDo wechatDo = wechatService.findByAppId("12345");
        return new Result<WechatDo>().data(wechatDo);
    }
}
