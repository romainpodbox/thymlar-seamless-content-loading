package com.podbox.sandbox.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @since 16/04/15.
 */
@Controller
@RequestMapping("partials")
public class PartialController {

    @RequestMapping(method = RequestMethod.GET, value = "/testimonials/{id}")
    String testimonials(
            @PathVariable final String id,
            final Model model) {

        model.addAttribute("id", id);
        return "partials/testimonials";
    }
}
