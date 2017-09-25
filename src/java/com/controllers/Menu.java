package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jctl
 */
@Controller
@RequestMapping("/")
public class Menu {

    @RequestMapping(method = RequestMethod.POST)
    public String show(ModelMap model) {
        model.addAttribute("mensage", "Pagina para el administrador");
        return "menu";
    }

}
