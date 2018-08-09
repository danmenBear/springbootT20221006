package com.example.demo.strat;

import org.springframework.stereotype.Component;

/**
 * com.example.demo.strat
 *
 * @author mingyuan
 * @date 2018/8/9 0009
 */
@Component("environmentEP")//TODO 这里要注意下,不能写成environment,不然会和springboot的environment重复
public class EnvironmentStrategy implements Strategy{
    @Override
    public String action() {
        return "走环保领域";
    }
}
