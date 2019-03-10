package cn.kgc.crud.controller;

import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by HP on 2019/3/10.
 */
@Controller
public class employeeServlet {
    @Autowired
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String all(Map<String,Object> map){
        map.put("",);

    }
}
