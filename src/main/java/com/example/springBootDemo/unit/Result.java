package com.example.springBootDemo.unit;

public class Result {
    private Long total;
    private Boolean success;
    private Object data;

    private Result(Long total, Boolean success, Object data){
        this.total = total;
        this.success = success;
        this.data = data;
    }

    public Long getTotal(){
        return total;
    }

    public Boolean getSuccess(){
        return success;
    }

    public Object getData(){
        return data;
    }

    public void setTotal(Long total){
        this.total = total;
    }

    public void setSuccess(Boolean success){
        this.success = success;
    }

    public void setData(Object data){
        this.data = data;
    }

    private Result(){
    }

    private Result(Boolean success){
        this.success = success;
    }

    public static Result OK(Long total, Object data){
        return new Result(total, true, data);
    }

    public static Result OK(){
        return new Result(true);
    }

    public static Result ERROR(){
        return new Result(false);
    }
}
