package cn.more.datasource.controller.model;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2018/6/18.
 */
@RestController
@RequestMapping("/model")
@Api(tags={"model相关"})
public class ModelController {

    @RequestMapping("getMethod")
    public void getMethod(){

    }
}
