package io.demonbrains.personinfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonInfo {

    private int personId;
    private String name;
    private double bodyWeight;  // in kgs
    private double personHeight;    // in mts

}
