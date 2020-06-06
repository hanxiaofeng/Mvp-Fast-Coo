package com.coo.coonet.model;

public class CooApiResult<T> extends ApiResult<T> {

    private int errorCode;

    private String errorMsg;

    @Override
    public int getCode() {
        return errorCode;
    }

    @Override
    public void setCode(int code) {
        errorCode = code;
    }

    @Override
    public String getMsg() {
        return errorMsg;
    }

    @Override
    public void setMsg(String msg) {
        errorMsg = msg;
    }

    @Override
    public boolean isOk() {
        return errorCode == 0;
    }
}
