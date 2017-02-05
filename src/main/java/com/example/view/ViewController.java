/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.view;

import java.util.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author luciano
 */
@Controller
public class ViewController {
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("year", Calendar.getInstance().get(Calendar.YEAR));
        model.addAttribute("username", "Luciano");
        return "index";
    }
    
}
