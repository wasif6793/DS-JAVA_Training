package org.springboot.crudrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintController {

    //create api using endpoint
    @GetMapping(value = "/print")
    public String print() {
//        StringBuilder html = new StringBuilder();
//        html.append("<html>");
//        html.append("<head><title>Example</title></head>");
//        html.append("<body>");
//        html.append("<h1>SpringBoot</h1><br>");
//        html.append("<p>Worker</p>");
//        html.append("</body>");
//        html.append("</html>");
//        return html.toString();
        return "Hello World, PrintController hai ye";
    }

    // create blog api using endpoint
    @GetMapping(value="/blog")
    public String blog() {
        int id = 1;
        String blogTitle = "Spring Boot";
        String blogDesc = "Spring Boot";
        String Authorname = "Wasif";
        String date = " 22 aug 2024";

        return String.valueOf(id) + "<br>" + blogTitle + "<br>" + blogDesc + "<br>"
                + Authorname + "<br>" + date + "<br>";

    }

}
