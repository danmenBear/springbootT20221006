package com.example.demo.strat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * com.example.demo.strat
 *
 * @author mingyuan
 * @date 2018/8/9 0009
 */
@Component
public class ContextSpringFactory {
    @Autowired
    private Map<String, Strategy> stgMap;

    public String doAction(String strType){
        Strategy strategy = this.stgMap.get(strType);
         return strategy.action();
    }
}
