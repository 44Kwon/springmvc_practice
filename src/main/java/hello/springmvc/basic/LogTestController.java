package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //return할때 문자로 반환하면 그대로 (String이 반환), @controller와 다르다(뷰반환)
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String LogTest() {
        String name = "Spring";
        log.trace("trace log={}", name);
        log.debug("debug log={}",name); //debug할때 개발서버 같은데서 보는거
        log.info(" info log = {}", name); //운영시스템에서도 봐야할 중요한 정보
        log.warn("warn log={}",name);   //경고(위험한거)
        log.error("error log={}",name); //에러(확인해야함)
        return "ok";
    }
}
