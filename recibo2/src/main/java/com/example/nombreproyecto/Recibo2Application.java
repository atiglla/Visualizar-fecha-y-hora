package com.example.nombreproyecto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Recibo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Recibo2Application.class, args);
	}
	@RequestMapping("/")
    public String index(Model model) {
        return "index.jsp";
    }
	@RequestMapping("/date")
    public String date(Model model) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM, yyyy");
		Date dtf3=new Date(); 
		model.addAttribute("fecha",dateFormat.format(dtf3));
        return "date.jsp";
    }
	@RequestMapping("/time")
    public String time(Model model) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa");
		Date dtf3=new Date();
		
		model.addAttribute("hora",dateFormat.format(dtf3));
        return "time.jsp";
    }

}
