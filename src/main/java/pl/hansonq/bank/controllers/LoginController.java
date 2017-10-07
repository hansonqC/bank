package pl.hansonq.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lukasz on 2017-10-07.
 */
@Controller
public class LoginController {
    @PostMapping("/")
    public String index(@RequestParam("login") String login,
                                    @RequestParam("password") String password,
                                    @RequestParam("nickname") String nick,
                                    Model model){
        if(login.equals("oskar") && password.equals("admin") && !nick.isEmpty()){
            model.addAttribute("nickname",nick);
            return "redirect:/dashboardTemplate";
        }

            model.addAttribute("error","Podałes niepoprawne dane !");
        return "index";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }


}
