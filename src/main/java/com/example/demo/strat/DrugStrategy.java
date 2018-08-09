package com.example.demo.strat;

import org.springframework.stereotype.Component;

/**
 * com.example.demo.strat
 *
 * @author mingyuan
 * @date 2018/8/9 0009
 */
@Component("drug")
public class DrugStrategy implements Strategy{
    @Override
    public String action() {
        return "走食药领域";
    }
}
