package com.lucky.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: lucky_x
 * @Date: 2021/8/17 - 08 - 17 - 22:02
 * @Description: com.lucky.pojo
 * @VERSION: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    private String[] hobbies;
}
