package me.anpan.anpanspringstudy.converter_formatter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class MemberControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getMember() throws Exception {
        mockMvc.perform(get("/member/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }



}