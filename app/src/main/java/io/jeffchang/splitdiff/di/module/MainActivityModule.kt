package io.jeffchang.splitdiff.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.jeffchang.giphy.GiphyModule
import io.jeffchang.splitdiff.MainActivity

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = [
        GiphyModule::class
    ])
    abstract fun contributeMainActivity(): MainActivity

}