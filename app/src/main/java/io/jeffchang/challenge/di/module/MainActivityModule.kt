package io.jeffchang.challenge.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.jeffchang.challenge.MainActivity

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = [
        FragmentBuilderModule::class
    ])
    abstract fun contributeMainActivity(): MainActivity

}