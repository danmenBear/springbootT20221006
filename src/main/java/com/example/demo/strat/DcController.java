package com.example.demo.strat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.demo.strat
 *
 * @author mingyuan
 * @date 2018/8/9 0009
 */
@RestController
public class DcController {
    @Autowired
    private ContextSpringFactory factory;

    /*@GetMapping("/doAction")
    public String strategy(){
        String result = factory.doAction("drug");
        return result;
    }*/
}
