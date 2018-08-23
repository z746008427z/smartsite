package com.hzy.smartsite.auth.controller;

import com.hzy.smartsite.auth.biz.ClientBiz;
import com.hzy.smartsite.auth.entity.Client;
import com.hzy.smartsite.auth.entity.ClientService;
import com.hzy.smartsite.common.msg.ObjectRestResponse;
import com.hzy.smartsite.common.rest.BaseController;
import org.springframework.web.bind.annotation.*;

/**
 * @author hzy
 * @create 2017/12/26.
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz,Client>{

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients){
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id){
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
