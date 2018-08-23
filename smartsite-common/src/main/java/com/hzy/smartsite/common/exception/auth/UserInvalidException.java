package com.hzy.smartsite.common.exception.auth;


import com.hzy.smartsite.common.constant.CommonConstants;
import com.hzy.smartsite.common.exception.BaseException;

/**
 * Created by hzy on 2017/9/8.
 */
public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
