package cn.edu.hit.lab3.util;

public class Result {
    private int code;
    private String msg;
    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Result ok(String msg) {
        return new Result(200, "success");
    }
    public static Result fail(String msg) {
        return new Result(400, "fail");
    }
}
