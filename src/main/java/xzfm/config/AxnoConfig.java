package xzfm.config;

import org.axonframework.spring.commandhandling.gateway.CommandGatewayFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangxizhong on 17/5/28.
 */
@Configuration
public class AxnoConfig {

    @Bean
    public CommandGatewayFactoryBean createCommandGatewayFactoryBean() {
        return new CommandGatewayFactoryBean();
    }
}
