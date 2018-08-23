package com.hzy.smartsite.auth.client.exception;

/**
 * Created by hzy on 2017/9/15.
 */
public class JwtTokenExpiredException extends Exception {
    public JwtTokenExpiredException(String s) {
        super(s);
    }
}
