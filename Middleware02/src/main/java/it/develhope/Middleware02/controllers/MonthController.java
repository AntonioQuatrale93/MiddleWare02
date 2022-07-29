package it.develhope.Middleware02.controllers;

import it.develhope.Middleware02.entities.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping
    public Month getMonthByNumber(HttpServletRequest request) {
        Month month = (Month) request.getAttribute("month");
        return month;
    }
}
