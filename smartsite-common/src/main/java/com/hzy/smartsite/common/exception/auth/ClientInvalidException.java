package com.hzy.smartsite.common.exception.auth;


import com.hzy.smartsite.common.constant.CommonConstants;
import com.hzy.smartsite.common.exception.BaseException;

/**
 * Created by hzy on 2017/9/10.
 */
public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
