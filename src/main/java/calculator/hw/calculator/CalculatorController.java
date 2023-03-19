package calculator.hw.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(value = "/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " + " + b + " = " + calculatorService.plus(a, b);
    }
    @GetMapping(value = "/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " - " + b + " = " + calculatorService.minus(a, b);
    }
    @GetMapping(value = "/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " * " + b + " = " + calculatorService.multiply(a, b);
    }
    @GetMapping(value = "/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " / " + b + " = " + calculatorService.divide(a, b);
    }
}
