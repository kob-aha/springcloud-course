package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("VERB")
public interface VerbClient extends BaseSentencePart {

}
