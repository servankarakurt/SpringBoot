package com.example.hamza;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//hangi adreste yayinlansin;
@RequestMapping("/mesaj")
public class demoApi {

    //mesaj adresine get yapildiginda merhaba metodu calissin
    @GetMapping
    //restful controller olarak acacak

    public String merhaba() {
        return "Ilk Medium yazımı yaptım :) ";
    }
}
