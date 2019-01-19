package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ARTICLE")
public interface ArticleClient extends BaseSentencePart {
}