package me.anpan.anpanspringstudy.converter_formatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/member/{member}")
    public String getEvent(@PathVariable Member member) {
        return member.getId().toString();
    }
}
