package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ADJECTIVE")
public interface AdjectiveClient extends BaseSentencePart {
}