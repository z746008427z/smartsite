package com.hzy.smartsite.common.exception.auth;


import com.hzy.smartsite.common.constant.CommonConstants;
import com.hzy.smartsite.common.exception.BaseException;

/**
 * Created by hzy on 2017/9/8.
 */
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
