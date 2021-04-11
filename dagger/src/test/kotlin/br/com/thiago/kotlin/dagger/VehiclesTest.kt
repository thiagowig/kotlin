package br.com.thiago.kotlin.dagger

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull

class VehiclesTest {

    @Test
    fun shouldInject() {
        val vehiclesComponent = DaggerVehiclesComponent.create()

        val carOne = vehiclesComponent.buildCar()
        val carTwo = vehiclesComponent.buildCar()

        assertNotNull(carOne);
        assertNotNull(carTwo);
        assertNotNull(carOne.getEngine());
        assertNotNull(carTwo.getEngine());
        assertNotNull(carOne.getBrand());
        assertNotNull(carTwo.getBrand());
        assertNotEquals(carOne.getEngine(), carTwo.getEngine());
        assertEquals(carOne.getBrand(), carTwo.getBrand());
    }
}