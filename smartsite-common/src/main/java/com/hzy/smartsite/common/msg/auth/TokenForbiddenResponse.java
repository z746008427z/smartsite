package com.hzy.smartsite.common.msg.auth;

import com.hzy.smartsite.common.constant.RestCodeConstants;
import com.hzy.smartsite.common.msg.BaseResponse;

/**
 * Created by hzy on 2017/8/25.
 */
public class TokenForbiddenResponse  extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
