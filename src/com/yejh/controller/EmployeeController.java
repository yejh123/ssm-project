package com.yejh.controller;/**
 * @author yejh
 * @create 2019-12_15 10:33
 */

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yejh.bean.Employee;
import com.yejh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: TODO
 **/

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public String getEmp(@PathVariable(value = "id" )Integer id, Model model){
        Employee emp = employeeService.getEmpById(id);
        model.addAttribute("emp", emp);
        return "success";
    }

}
