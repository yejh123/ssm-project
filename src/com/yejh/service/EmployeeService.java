package com.yejh.service;/**
 * @author yejh
 * @create 2019-12_15 10:08
 */

import com.yejh.bean.Employee;
import com.yejh.dao.EmployeeDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 **/

@Service
public class EmployeeService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    //private EmployeeDao employeeDao;

    public Employee getEmpById(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        return employeeDao.getEmpById(id);

    }
}
