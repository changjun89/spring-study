package me.anpan.anpanspringstudy.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class ValidatorAppRunner implements ApplicationRunner {

    @Autowired
    Validator bookValidator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(bookValidator);
        Book book = new Book();
        book.setLimit(-1);
        book.setEmail("232nms.");

        //BookValidator bookValidator = new BookValidator();
        Errors errors = new BeanPropertyBindingResult(book, "book");

        bookValidator.validate(book, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            System.out.println("================== error code =========================");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });

    }
}
