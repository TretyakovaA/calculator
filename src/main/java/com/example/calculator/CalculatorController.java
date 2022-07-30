package com.example.calculator;
/*1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

        2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.

        3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.

        4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.

        5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.

 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1", required=false) Integer num1 , @RequestParam("num2", required=false) Integer num2) {
        if (num1 == null || num2 == null)
            return "Вы не ввели переменную";
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);

    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam("num1", required=false) Integer num1 , @RequestParam("num2", required=false) {
        if (num1 == null || num2 == null)
            return "Вы не ввели переменную";
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam("num1", required=false) Integer num1 , @RequestParam("num2", required=false) {
        if (num1 == null || num2 == null)
            return "Вы не ввели переменную";
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide (@RequestParam("num1", required=false) Integer num1 , @RequestParam("num2", required=false) {
        if (num1 == null || num2 == null)
            return "Вы не ввели переменную";
        if (num2 == 0 )
            return "На ноль делить нельзя";
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}

