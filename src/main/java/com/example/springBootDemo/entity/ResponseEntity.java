package com.example.springBootDemo.entity;

import com.example.springBootDemo.enums.CodeMessageEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回响应实体类
 */
public class ResponseEntity {
    private Integer status;
    private Object data;
    private String msg;
    private String url;
    private Integer pages;
    private Long total;

    private ResponseEntity(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ResponseEntity(Integer status, Object data, String msg) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ResponseEntity(Integer status, Object data, String msg, Integer pages, Long total) {
        this.status = status;
        this.msg = msg;
        this.pages = pages;
        this.data = data;
        this.total = total;
    }

    public static ResponseEntity buildOk() {
        return new ResponseEntity(CodeMessageEnum.OK.code(), CodeMessageEnum.OK.msg());
    }

    public static ResponseEntity buildOk(Object data) {
        Map<String, Object> map = new HashMap<>(1);
        map.put("list", data);
        return new ResponseEntity(CodeMessageEnum.OK.code(), map, CodeMessageEnum.OK.msg());
    }

    public static ResponseEntity buildOk(Object data, Integer pages, Long total) {
        Map<String, Object> map = new HashMap<>(1);
        map.put("list", data);
        return new ResponseEntity(CodeMessageEnum.OK.code(), map, CodeMessageEnum.OK.msg(), pages, total);
    }

    public static ResponseEntity buildOk(Object data, String msg, Integer pages, Long total) {
        Map<String, Object> map = new HashMap<>(1);
        map.put("list", data);
        return new ResponseEntity(CodeMessageEnum.OK.code(), map, msg, pages, total);
    }

    public static ResponseEntity buildError() {
        return new ResponseEntity(CodeMessageEnum.ERROR.code(), CodeMessageEnum.ERROR.msg());
    }

    public static ResponseEntity buildError(Integer status, String msg) {
        return new ResponseEntity(status, msg);
    }

    public static ResponseEntity buildError(String msg) {
        return new ResponseEntity(CodeMessageEnum.ERROR.code(), msg);
    }

    public ResponseEntity reload() {
        this.url = "reload";
        return this;
    }

    public ResponseEntity url(String url) {
        this.url = url;
        return this;
    }
}
