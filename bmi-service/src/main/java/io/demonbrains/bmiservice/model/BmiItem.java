package io.demonbrains.bmiservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BmiItem {

    private int personId;
    /**
     * @bodyWeight in kgs
     */
    private double bodyWeight;
    /**
     * @personHeight in mts
     */
    private double personHeight;

}
