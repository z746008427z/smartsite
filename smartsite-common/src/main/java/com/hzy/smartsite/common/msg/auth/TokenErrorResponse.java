package com.hzy.smartsite.common.msg.auth;

import com.hzy.smartsite.common.constant.RestCodeConstants;
import com.hzy.smartsite.common.msg.BaseResponse;

/**
 * Created by hzy on 2017/8/23.
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
