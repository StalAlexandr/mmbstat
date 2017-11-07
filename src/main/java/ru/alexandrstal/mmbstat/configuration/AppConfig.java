package ru.alexandrstal.mmbstat.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ru.alexandrstal.mmbstat.configuration","ru.alexandrstal.mmbstat.service","ru.alexandrstal.mmbstat.dao"})
public class AppConfig {
}
