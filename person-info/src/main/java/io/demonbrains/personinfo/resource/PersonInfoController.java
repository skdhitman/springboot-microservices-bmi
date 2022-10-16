package io.demonbrains.personinfo.resource;

import io.demonbrains.personinfo.model.PersonInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/person-info")
public class PersonInfoController {

    @GetMapping("/{personId}")
    public PersonInfo getPersonInfoById(@PathVariable("personId") int personId) {
        PersonInfo p1 = new PersonInfo(1, "Anek", 65.2, 1.82);
        PersonInfo p2 = new PersonInfo(2, "Seeta", 55.1, 1.7);
        PersonInfo p3 = new PersonInfo(3, "Kush", 75, 1.85);

        return Stream.of(p1, p2, p3)
                .filter(p -> p.getPersonId() == personId)
                .collect(Collectors.toList()).get(0);

    }

}
