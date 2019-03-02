package io.jeffchang.challenge

import dagger.Module

import dagger.android.ContributesAndroidInjector
import io.jeffchang.challenge.di.module.FragmentBuilderModule

@Suppress("unused")
@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    abstract fun contributeMainActivity(): MainActivity

}