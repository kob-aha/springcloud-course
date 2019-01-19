package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("NOUN")
public interface NounClient extends BaseSentencePart {

}
