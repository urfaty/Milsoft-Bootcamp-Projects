package com.example.springcore;

import Contract.MyContract;
import Contract.MyContractImpl;


import define.MyBean;
import define.MySpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/source")
public class SourceController {

    //private MyBean myBean = new MyBean();
    //@Autowired
    private MyBean myBean;
    private MySpec mySpec;
    private MyContract myContract;





    @Value("${parameters.parameter-one}")
    private String parameterOne;
    @Value("${parameters.parameter-two}")
    private String parameterTwo;

    @Value("${my-contract.myfield}")
    private String myField;



    //constructor injection
    public SourceController(MyBean myBean, MySpec mySpec, MyContract myContract) {
        this.myBean = myBean;
        this.mySpec = mySpec;
        this.myContract = myContract;
    }
    @GetMapping("/bean")
    @ResponseBody
    public String getBean() {
        return "Çekirdek" + myBean.getMyLong() + " " + myBean.getMyString() + " " + myBean.getMyDouble();
    }

    @GetMapping("/spec")
    @ResponseBody
    public String getSpec() {
        System.out.printf("Özgüleme");
        return "Özgüleme "+ mySpec.myMethod("Godoro");
    }


    @GetMapping("/params")
    @ResponseBody
    public String getParams() {
        System.out.printf("Özgüleme");
        return "Değiştirgenler "+ parameterOne + " " + parameterTwo;
    }



    @PostMapping("/bean2")
    public String getBeanDenemeDelete() {
        return "Çekirdekk" + myBean.getMyLong() + " " + myBean.getMyString() + " " + myBean.getMyDouble();
    }

    @GetMapping("/contract")
    @ResponseBody
    public String processContract() {
        return myContract.processSomething(myField);
    }


}
