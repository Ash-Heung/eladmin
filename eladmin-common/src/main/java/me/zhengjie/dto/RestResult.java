package me.zhengjie.dto;

import lombok.ToString;

import java.io.Serializable;

/**
 * 返回结果
 * <p></p>
 *
 * @version 1.0.0
 * @description: RestResult
 * @author: 向鹏飞
 * @since: 2022/1/13
 */
@ToString
public class RestResult<T> implements Serializable {

    static long RESULT_CODE_SUCCESS = 200;
    static long SYSTEM_EXCEPTION_CODE = 5000;

    /**
     * 接口状态编码 200：成功
     */
    protected long code;
    /**
     * 接口响应信息
     */
    protected String message;
    /**
     * 时间戳，单位毫秒
     */
    protected Long timestamp;
    /**
     * 接口响应数据对象
     */
    protected T data;

    public static RestResult.Builder builder() {
        return new RestResult.Builder();
    }

    public RestResult() {
        this.code = RESULT_CODE_SUCCESS;
        this.timestamp = System.currentTimeMillis();
    }

    private RestResult(Builder<T> builder) {
        this.timestamp = System.currentTimeMillis();
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static RestResult success() {
        return new RestResult();
    }

    public static <E> RestResult<E> success(E data) {
        Builder<E> builder = new Builder<E>();
        builder.content(data);
        return builder.build();
    }

    public static <E> RestResult<E> success(E data, String message) {
        Builder<E> builder = new Builder<E>();
        builder.content(data);
        builder.message(message);
        return builder.build();
    }

    public static RestResult fail(String message) {
        Builder builder = new Builder();
        builder.message(message);
        builder.code(SYSTEM_EXCEPTION_CODE);
        return builder.build();
    }

    public static RestResult fail(long code, String message) {
        Builder builder = new Builder();
        builder.message(message);
        builder.code(code);
        return builder.build();
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



    public static class Builder<T> {
        /**
         * 编码
         */
        private long code = 200;
        /**
         * 消息
         */
        private String message;
        /**
         * 返回数据对象
         */
        private T data;

        public Builder code(long code) {
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder content(T content) {
            this.data = content;
            return this;
        }

        public RestResult<T> build() {
            RestResult<T> restResult = new RestResult(this);
            return restResult;
        }
    }


}
