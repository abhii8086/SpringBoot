package com.abhi.thirdApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {

//    @Autowired  // if we do it on top then this called field injection
      private  Laptop laptop;  // note this line is also req for all type of injection
// if you don't want to use it then try constructor injection

//    public Developer(Laptop laptop){
//        this.laptop = laptop;
//    }

// using setter injection
    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop= laptop;
    }

    public void build(){
        laptop.compile();
        System.out.println("buliding");
    }
}
