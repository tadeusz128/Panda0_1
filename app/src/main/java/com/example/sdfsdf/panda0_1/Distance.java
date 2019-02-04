package com.example.sdfsdf.panda0_1;

import java.util.Optional;

public class Distance extends Variable {


    final String Unit = "m";
    private Optional<Double> value;

    public Optional<Double> getValue() {
        return value;
    }

    public void setValue(Optional<Double> value) {
        this.value = value;
    }

    public String getUnit() {
        return Unit;
    }



    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return name;
    }



}
