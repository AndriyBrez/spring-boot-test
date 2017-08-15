package com.test.my.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

/**
 * Created by Andriy_Brezetskyy on 8/15/2017.
 */
@Getter
@Setter
public class Word {
    @Id
    private String id;
    private String word;
    private LocalDateTime created = LocalDateTime.now();

    public Word(){}
    public Word(String word){
        this.word = word;
    }
}
