package com.example.springcore;

import Contract.MyContract;
import Contract.MyContractImpl;
import define.MyBean;
import define.MySpec;
import define.MySpecImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SourceConfiguration {

    @Bean
    MyBean myBean() {
        MyBean  myBean = new MyBean();
        myBean.setMyLong(1234);
        myBean.setMyString("Godoro");
        myBean.setMyDouble(98.76);
        return myBean;
    }

    @Bean
    MySpec mySpec() {
        MySpec mySpec = new MySpecImpl();
        return mySpec;
    }

    @Bean
    MyContract myContract() {
        MyContract myContract = new MyContractImpl();
        myContract.setMyField("Godoro");
        return myContract;
    }

}
