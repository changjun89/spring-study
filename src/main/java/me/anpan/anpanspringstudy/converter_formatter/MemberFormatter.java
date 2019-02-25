package me.anpan.anpanspringstudy.converter_formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;


public class MemberFormatter implements Formatter<Member> {
    @Override
    public Member parse(String s, Locale locale) throws ParseException {
        return new Member(Integer.parseInt(s));
    }

    @Override
    public String print(Member member, Locale locale) {
        return member.getId().toString();
    }
}
