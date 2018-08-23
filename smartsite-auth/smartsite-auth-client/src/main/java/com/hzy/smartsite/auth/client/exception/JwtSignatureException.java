package com.hzy.smartsite.auth.client.exception;

/**
 *
 * @author hzy
 * @date 2017/9/15
 */
public class JwtSignatureException extends Exception {
    public JwtSignatureException(String s) {
        super(s);
    }
}
