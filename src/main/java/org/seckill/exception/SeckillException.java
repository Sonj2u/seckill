package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * Created by sj on 9/2/17.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
