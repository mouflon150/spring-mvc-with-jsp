package it.kg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@EnableWebMvc
@ComponentScan("it.kg")
public class WebAppConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver getViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }
}
