package com.rocky.springbootdemo.controller;

import com.rocky.springbootdemo.ConfigBean;
import com.rocky.springbootdemo.service.impl.LearnServiceImpl;
import org.apache.tomcat.jni.Thread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/learn")
public class LearnController extends AbstractController{

    @Autowired
    private LearnServiceImpl learnService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value="/loginPage" , method = RequestMethod.GET)
    public ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {


        ConfigBean configBean = new ConfigBean();
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");

        configBean.setAge(20);
        configBean.setName("wangwu");

        modelAndView.addObject("configBean", configBean);

        return modelAndView;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request, HttpServletResponse response){

        model.addAttribute("test","test");
        return "index";
    }


}
