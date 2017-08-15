package com.test.my.controller;

import com.test.my.model.Word;
import com.test.my.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Andriy_Brezetskyy on 8/15/2017.
 */
@Controller("/worlds")
public class WorldController {

    @Autowired
    private WordRepository repo;

    @GetMapping("/")
    public Iterable<Word> getAll(){
        return repo.findAll();
    }
}
