package com.test.my.service;

import com.test.my.model.Word;
import com.test.my.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andriy_Brezetskyy on 8/15/2017.
 */
@Component
public class PrepopulationService {
    @Autowired
    private WordRepository wordRepository;

    @PostConstruct
    public  void init(){
        List<Word> words = Arrays.asList(new Word("one"), new Word("two"));
        wordRepository.save(words);
    }


}
