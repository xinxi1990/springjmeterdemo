package org.spring.springboot.controller;


import io.swagger.annotations.Api;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Encoder;

/**
 */
@RequestMapping("foo")
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;


    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public City createCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public String modifyCity(@RequestBody City city) {
        System.out.printf(city.toString());
        BASE64Encoder encoder = new BASE64Encoder();

        return encoder.encode(cityService.updateCity(city).toString().getBytes());
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public Long modifyCity(@PathVariable("id") Long id) {
            cityService.deleteCity(id);
            return 1L;
    }
}
