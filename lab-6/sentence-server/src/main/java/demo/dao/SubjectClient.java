package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("SUBJECT")
public interface SubjectClient extends BaseSentencePart {

}
