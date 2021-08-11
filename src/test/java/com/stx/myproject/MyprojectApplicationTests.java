package com.stx.myproject;

import com.stx.myproject.entity.Dept;
import com.stx.myproject.repository.DeptRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
class MyprojectApplicationTests {
    @Autowired
    private DeptRepository deptRepository;
    @Test
    void contextLoads() {
        //limit (当前页-1)*每页显示条数，每页显示条数   page是第几页
        PageRequest pageRequest = PageRequest.of(0, 6);
        Page<Dept> page = deptRepository.findAll(pageRequest);
        int age=0;
    }
    @Test
    void save(){
        Dept dept=new Dept();
        dept.setDname("人事部");
        dept.setLoc("北京");
        Dept dept1 = deptRepository.save(dept);
        System.out.println(dept1);
    }
    @Test
    void findById(){
        Dept dept = deptRepository.findById(10).get();
        System.out.println(dept);
    }
}
