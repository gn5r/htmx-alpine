package com.github.gn5r.htmx.alpine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

  @GetMapping("/content-a")
  public String contentA() {
    return "modal/content-a";
  }

  @GetMapping("/content-b")
  public String contentB() {
    return "modal/content-b";
  }
}
