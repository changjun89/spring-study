package me.anpan.anpanspringstudy.converter_formatter;

import org.springframework.core.convert.converter.Converter;

public class MemberConverter {

    public static class StringToMemberConverter implements Converter<String, Member> {
        @Override
        public Member convert(String s) {
            return new Member(Integer.parseInt(s));
        }
    }

    public static class MemberToStringConverter implements Converter<Member, String> {
        @Override
        public String convert(Member member) {
            return member.getId().toString();
        }
    }

}
