package br.com.thiago.kotlin.dagger.component

import br.com.thiago.kotlin.dagger.domain.Car
import br.com.thiago.kotlin.dagger.module.VehiclesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [VehiclesModule::class])
interface VehiclesComponent {

    fun buildCar(): Car

}