package org.wasif.quizapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/questions")
public class QuestionController {

    @GetMapping(value = "/allquestions")
    public String questions(){
        return "All questions are here";

    }


}
