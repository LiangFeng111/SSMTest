package com.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Liuyan {
    private int id;
    private String name;
    private String text;
    public String email;
    public int is_zhangZhu;
    public int huifu_id;
}
