package cn.jsonqiao.prj.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jsonqiao on 16/8/18.
 */
@Controller
public class IndexController extends BaseController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        logger.debug("日志启动。。。");
        return "Hello, Wechat";
    }
}
