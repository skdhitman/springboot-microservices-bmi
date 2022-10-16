package io.demonbrains.bmiservice.resource;

import io.demonbrains.bmiservice.model.BmiItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/bmi")
public class BmiController {

    @GetMapping("/{personId}")
    public List<BmiItem> getBmiByPersonId(@PathVariable("personId") int personId) {

        return Collections.singletonList(new BmiItem(1, 60, 1.8));

    }

}
