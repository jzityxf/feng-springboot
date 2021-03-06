package com.feng.formvalid.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.feng.formvalid.entity.PersonForm;

/**
 */
@Controller
public class WebController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("/formvalid/results");
    }

    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "/formvalid/form";
    }

    @PostMapping("/")
    public String showResult(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/formvalid/form";
        }

        return "redirect:/results";
    }
}
