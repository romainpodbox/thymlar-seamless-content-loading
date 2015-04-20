package com.podbox.sandbox.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller providing partial views through fragments.
 * 
 * @since 16/04/15.
 */
@Controller
@RequestMapping("partials")
public class PartialController {

    @RequestMapping(method = RequestMethod.GET, value = "/testimonial/{id}")
    String testimonials(
            @PathVariable final String id,
            final Model model) {

        model.addAttribute("id", id);
        return "partials/testimonials::testimonials";
    }

    @RequestMapping(method = RequestMethod.GET, value = "feature/{id}")
    String feature(@PathVariable final String id, final Model model) {
        model.addAttribute("id", id);
        return "partials/features::features";
    }

    @RequestMapping(method = RequestMethod.GET, value="metadesc/{id}")
    String metadesc(@PathVariable final String id, final Model model) {
        model.addAttribute("id", id);
        return "partials/meta::description";
    }
}
