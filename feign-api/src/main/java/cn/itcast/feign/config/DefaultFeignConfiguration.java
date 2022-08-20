package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @描述：
 * @author: LYF
 * @date: 2022/8/20
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel() {
        return Logger.Level.BASIC;
    }
}
