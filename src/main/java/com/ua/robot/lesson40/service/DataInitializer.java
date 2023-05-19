package com.ua.robot.lesson40.service;

import com.ua.robot.lesson40.domain.City;
import com.ua.robot.lesson40.domain.Country;
import com.ua.robot.lesson40.repository.CityRepository;
import com.ua.robot.lesson40.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;


    @Override
    public void run(String... args) {

        Country country1 = new Country();
        country1.setName("Ukraine");
        countryRepository.save(country1);

        Country country2 = new Country();
        country2.setName("Poland");
        countryRepository.save(country2);

        City city1 = new City();
        city1.setName("Kyiv");
        city1.setCountry(country1);
        cityRepository.save(city1);

        City city2 = new City();
        city2.setName("Lviv");
        city2.setCountry(country1);
        cityRepository.save(city2);

        City city3 = new City();
        city3.setName("Warsaw");
        city3.setCountry(country2);
        cityRepository.save(city3);
    }
}
