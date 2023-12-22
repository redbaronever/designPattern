package com.example.demo;

import com.example.demo.observerStrategy.ObserverA;
import com.example.demo.observerStrategy.ObserverB;
import com.example.demo.observerStrategy.ObserverPattern;
import com.example.demo.observerStrategy.SubData;
import com.example.demo.strategyPattern.ManualCheckout;
import com.example.demo.strategyPattern.OnlineCheckout;
import com.example.demo.strategyPattern.StrategyPattern;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {

    @GetMapping("/strategyPattern")
    public String strategyPattern(@RequestParam("param") String param) {
        StrategyPattern pattern = new StrategyPattern();
        pattern.applyingStrategy(new OnlineCheckout());
        pattern.checkout();

        pattern.applyingStrategy(new ManualCheckout());
        pattern.checkout();
        return pattern.checkout();
    }

    @GetMapping("/observerPattern")
    public String observerPattern(@RequestParam("param") String param) {
        ObserverPattern observerPattern = new ObserverPattern(new SubData());
        observerPattern.attach(new ObserverA());
        observerPattern.attach(new ObserverB());
        observerPattern.aSpecialAction(param);
        return "ok";
    }
}
