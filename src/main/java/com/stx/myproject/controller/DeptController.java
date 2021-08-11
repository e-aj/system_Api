package com.stx.myproject.controller;

import com.stx.myproject.entity.Dept;
import com.stx.myproject.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptRepository deptRepository;
//    *PageRepository 是 Spring Data JPA 封装的分页工具类。page是当前页 size是每页显示的条数
    @GetMapping("/findAll/{page}/{size}")
    public Page<Dept>findAll(@PathVariable("page") Integer page,
                             @PathVariable("size") Integer size) {
        PageRequest request = PageRequest.of(page, size);
        return deptRepository.findAll(request);
    }
    //增加
    @PostMapping("/save")
    public String save(@RequestBody Dept dept){
        Dept result = deptRepository.save(dept);
        if( result!=null){
            return "success";
        }else{
            return "error";
        }
    }
    //修改
    @GetMapping("/findById/{deptno}")
    public Dept findById(@PathVariable("deptno") Integer deptno) {
        return deptRepository.findById(deptno).get();
    }
    @PutMapping("/updata")
    public String update(@RequestBody Dept dept) {
        Dept result = deptRepository.save(dept);
        if(result!=null) {
            return "success";
        }else {
            return "error";
        }
    }

    //删除
    @DeleteMapping("/delete/{deptno}")
    public void delete (@PathVariable("deptno") Integer deptno){
        deptRepository.deleteById(deptno);
    }
    @DeleteMapping("/delete")
    public  String delete(@RequestBody Dept dept) {
        Dept result = deptRepository.save(dept);
        if (result!=null) {
            return "success";
        }else {
            return "error";
        }
    }

}
