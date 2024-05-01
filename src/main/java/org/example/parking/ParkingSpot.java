package org.example.parking;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ParkingSpot {
    private final ParkingSpotType parkingSpotType;
    private Vehicle vehicle;
    private Boolean free;
}
