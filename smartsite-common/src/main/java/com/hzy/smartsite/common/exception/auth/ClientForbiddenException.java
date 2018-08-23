package com.hzy.smartsite.common.exception.auth;


import com.hzy.smartsite.common.constant.CommonConstants;
import com.hzy.smartsite.common.exception.BaseException;

/**
 * Created by hzy on 2017/9/12.
 */
public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
