package com.nf511.flower_team.util.MyUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据封装
 */
public class Standard extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public Standard() {
        put("code", 1);
        put("msg", "success");
    }

    //错误时
    public static Standard error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Standard error(String msg) {
        return error(500, msg);
    }

    public static Standard error(int code, String msg) {
        Standard r = new Standard();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    //成功时
    public static Standard ok(String msg) {
        Standard r = new Standard();
        r.put("msg", msg);
        return r;
    }

    public static Standard ok(Map<String, Object> map) {
        Standard r = new Standard();
        r.putAll(map);
        return r;
    }

    public static Standard ok() {
        return new Standard();
    }

    public static Standard ok(Object data) {
        return new Standard().put("data",data);
    }

    @Override
    public Standard put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}