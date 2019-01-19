package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

public interface BaseSentencePart {

    @GetMapping("/")
    Word getWord();
}
