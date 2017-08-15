package com.test.my.repository;

import com.test.my.model.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by Andriy_Brezetskyy on 8/15/2017.
 */
@org.springframework.stereotype.Repository
public interface WordRepository extends CrudRepository<Word, String> {

    Word findByWordContaining(String phrase);
}
