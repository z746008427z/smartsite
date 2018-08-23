package com.hzy.smartsite.auth.feign;

import com.hzy.smartsite.api.vo.user.UserInfo;
import com.hzy.smartsite.auth.configuration.FeignConfiguration;
import com.hzy.smartsite.auth.util.user.JwtAuthenticationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * ${DESCRIPTION}
 *
 * @author hzy
 * @create 2017-06-21 8:11
 */
@FeignClient(value = "smartsite-admin",configuration = FeignConfiguration.class)
public interface IUserService {
  @RequestMapping(value = "/api/user/validate", method = RequestMethod.POST)
  public UserInfo validate(@RequestBody JwtAuthenticationRequest authenticationRequest);
}
