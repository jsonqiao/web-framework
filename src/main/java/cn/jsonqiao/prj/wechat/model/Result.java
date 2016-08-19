package cn.jsonqiao.prj.wechat.model;

import java.io.Serializable;

/**
 * Created by jsonqiao on 16/8/19.
 */
public class Result<T> implements Serializable {

    private int errCode;

    private String errMsg;

    private T data;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T t) {
        this.data = t;
    }

    public Result<T> data(T t) {
        this.data = t;
        return this;
    }

    public Result() {
        this.errCode = 0;
        this.errMsg = "处理成功";
    }
}
