package com.stx.myproject.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jzj(贝西)
 * 博客：https://blog.csdn.net/beixishuo
 * B站：'贝西贝西'
 * @create 2020-04-07 2:03
 */
@SpringBootTest
class DeptRepositoryTest {
    @Autowired
    private DeptRepository deptRepository;
    @Test
    void findAll(){
        System.out.println(deptRepository.findAll());
    }
}