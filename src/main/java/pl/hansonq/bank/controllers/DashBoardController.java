package pl.hansonq.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.hansonq.bank.models.forms.RequestForm;

/**
 * Created by lukasz on 2017-10-07.
 */
@Controller
public class DashBoardController {
    @GetMapping("dashboard")
    public String dashboard(Model model){
        model.addAttribute("formRequest",new RequestForm());
        return "dashboardTemplate";
    }
    @PostMapping("dashboard")
    public String dashboard(@ModelAttribute("formRequest")RequestForm form, Model model){
        model.addAttribute("infoCredit",cangetCredit(form));

        return "dashboardTemplate";
    }
    private boolean cangetCredit(RequestForm form){
        return (form.getMonthCash() - form.getMinusCash()) * 0.7   >form.getCreditCash()/form.getCreditTime();
    }
}
