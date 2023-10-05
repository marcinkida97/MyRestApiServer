package com.example.myrestapiserver.myrestapiserver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {

    @NonNull
    private String mark;

    private String model;

}
