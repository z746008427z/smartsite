package com.hzy.smartsite.sidecarclient.rest;

import com.hzy.smartsite.sidecarclient.entity.Message;
import com.hzy.smartsite.sidecarclient.client.PythonFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("test")
public class PythonController {
    @Autowired
    private PythonFeignClient pythonFeignClient;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest() {
        return pythonFeignClient.getTest();
    }

    @RequestMapping(value = "/message/{id}", method = RequestMethod.GET)
    public List<Message> getMsg(@PathVariable Long id) {
        return pythonFeignClient.getMsg(id);
    }
}