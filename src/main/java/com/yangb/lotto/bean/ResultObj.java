package com.yangb.lotto.bean;

/**
 * lotto
 *
 * @author create by yangb in 2019/1/28
 */
public class ResultObj {
    private boolean success;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultObj makeSuccess(){
        this.success = true;
        return this;
    }

    public ResultObj makeSuccess(Object t){
        this.data = t;
        return makeSuccess();
    }

    public ResultObj makeFail(){
        this.success = false;
        return this;
    }
}
