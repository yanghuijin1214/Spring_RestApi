package com.rest.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//해당 class가 controller임을 알려주기 위해 class 명 상단에 annotation 붙이기
@Controller
public class HelloController {

    //화면에 helloworld가 출력된다.
    @GetMapping(value="/helloworld/string")
    @ResponseBody
    public String hellowordString(){
        return "helloworld";
    }

    //화면에 {message: "helloworld"} 라고 출력된다.
    @GetMapping(value="/helloworld/json")
    @ResponseBody
    public Hello helloworldJson(){
        Hello hello = new Hello();
        hello.message="helloworld";
        return hello;
    }

    //화면에 helloworld.ftl의 내용이 출력된다.
    @GetMapping(value="/helloworld/page")
    public String helloworld(){
        return "helloworld";
    }

    @Setter
    @Getter
    public static class Hello{
        private String message; //원래 다른 package로 분리해줘야함
    }
}
