package br.com.thiago.kotlin.dagger.domain

import javax.inject.Inject

class Car @Inject constructor (val engine: Engine, brand: Brand) {


}