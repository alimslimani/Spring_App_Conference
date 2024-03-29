package com.alm.highfi.config;

import com.alm.highfi.repository.HibernateSpeakerRepositoryImpl;
import com.alm.highfi.repository.SpeakerRepository;
import com.alm.highfi.service.SpeakerService;
import com.alm.highfi.service.SpeakerServiceImpl;
import com.alm.highfi.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.alm.highfi"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }


// unused after adding @ComponentScan and other streotype @Service & @Repository
    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //      with constructor injection
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
        //      With setter injection
//      SpeakerServiceImpl service = new SpeakerServiceImpl();
//      service.setRepository(getSpeakerRepository());
//      return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
