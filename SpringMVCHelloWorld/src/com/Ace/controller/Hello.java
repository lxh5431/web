package com.Ace.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Hello {
	  //hello world

    @RequestMapping(value="/hello")

    public String hello(){

        System.out.println("spring mvc hello world!");

        return "hello";

    }

   

    //hello world

    @RequestMapping(value="/ok")

    @ResponseBody

    public Object ok(){

        System.out.println("ok");

        List<String> list=new ArrayList<String>(); 

        list.add("���ӻ�"); 

        list.add("����"); 

        list.add("ɽ��ʡ"); 

        list.add("�෢��"); 

        list.add("D���"); 

        list.add("�淶"); 

        list.add("������"); 

        list.add("������"); 

        list.add("���߶�"); 

        return list; 

    }

     



}


