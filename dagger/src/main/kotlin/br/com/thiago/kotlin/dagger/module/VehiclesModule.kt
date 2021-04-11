package br.com.thiago.kotlin.dagger.module

import br.com.thiago.kotlin.dagger.domain.Brand
import br.com.thiago.kotlin.dagger.domain.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class VehiclesModule {

    @Provides
    fun providesEngine(): Engine {
        return Engine()
    }

    @Provides
    @Singleton
    fun providesBrand(): Brand {
        return Brand()
    }
}