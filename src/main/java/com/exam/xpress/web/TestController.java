package com.exam.xpress.web;

import com.exam.xpress.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by shubhamc on 2/1/17.
 */
@Controller
public class TestController {

    @Autowired
    TestService testService;

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody String test() {
        logger.debug("Calling test Controller");
        return testService.test();
    }

}
