package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {



    @PostMapping("/output")
    public String postOutput(@RequestParam("previous") String previous, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("previous", previous);
        // output.htmlに画面遷移
        return "output";
    }

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model model) {
        // getInputメソッドで入力画面への遷移を行う
        model.addAttribute("previous", previous);
        // input/{previous}.htmlに画面遷移
        return "input";
    }

}
