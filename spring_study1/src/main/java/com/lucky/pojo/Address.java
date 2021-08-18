package com.lucky.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: lucky_x
 * @Date: 2021/8/18 - 08 - 18 - 13:32
 * @Description: com.lucky.pojo
 * @VERSION: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String province;
    private String city;
    private String town;
}
