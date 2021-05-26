package com.itheima.controller;

import com.itheima.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    /**
     * 添加用户
     * @param user 接受页面传递过来的参数，封装到user对象身上
     * @param errors 对这份数据进行校验，校验有错误（不满足校验规则），那么errors里面可以知道为什么不满足
     * @param model 可以用来保存我们想要给页面提示的内容信息|错误信息
     * @return
     */

    @RequestMapping("/add")
    public String add(@Valid User user, Errors errors , Model model){

        System.out.println("user=" + user);

        //得到所有的字段的错误
        List<FieldError> fieldErrors = errors.getFieldErrors();

        //得到每一个字段的错误信息
        for (FieldError fieldError : fieldErrors) {

            //得到字段
            String field = fieldError.getField();

            //得到校验失败的信息
            String message = fieldError.getDefaultMessage();

            //打印
            System.out.println(field + "=" + message);

        }
        return "success";
    }
}
