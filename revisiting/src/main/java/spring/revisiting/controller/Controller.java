package spring.revisiting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Hello")
public class Controller {
@RequestMapping("/H")
public String hello() {
	return "Hello";
}
}
