package com.techacademy;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

public class OutputController {

    @PostMapping("/output")
    public String postOutput(@RequestParam("previous") String previous, Model model) {
        // フォームから送信されてきた値をModelに登録 ・・3
        model.addAttribute("previous", previous);
        // output.htmlに画面遷移 ・・4
        return "output";
    }

}
