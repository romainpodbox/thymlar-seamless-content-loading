package com.podbox.sandbox.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @since 16/04/15.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/{id}")
    public String index(
            @PathVariable(value = "id") String id,
            Model model
    ) {
        model.addAttribute("id", id);
        return "index";
    }
}
