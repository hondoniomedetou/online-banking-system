package com.zjuse.bankingsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id; 
    private String username; 
    private String password;
    private String id_number;
    private String email; 
}