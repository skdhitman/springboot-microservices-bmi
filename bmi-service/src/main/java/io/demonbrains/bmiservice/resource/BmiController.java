package io.demonbrains.bmiservice.resource;

import io.demonbrains.bmiservice.model.BmiItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/bmi")
public class BmiController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{personId}")
    public List<BmiItem> getBmiByPersonId(@PathVariable("personId") int personId) {

        BmiItem bmiItem = restTemplate.getForObject("http://localhost:8082/person-info/" + personId, BmiItem.class);

//        return Collections.singletonList(new BmiItem(1, 60, 1.8));
        return Arrays.asList(bmiItem);

    }

}
