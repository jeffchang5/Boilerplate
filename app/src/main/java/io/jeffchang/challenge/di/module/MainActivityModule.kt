package io.jeffchang.challenge.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.jeffchang.giphy.GiphyModule
import io.jeffchang.giphy.GiphySearchActivity

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = [
        GiphyModule::class
    ])
    abstract fun contributeMainActivity(): GiphySearchActivity

}