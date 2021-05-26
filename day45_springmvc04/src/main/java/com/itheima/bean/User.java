package com.itheima.bean;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class User {
    private int id;

    @NotBlank(message = "姓名不能为空！")
    private String name;

    @Min(value = 18, message = "网吧禁止未成年人进入！")
    private int age;
}
