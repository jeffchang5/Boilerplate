package io.jeffchang.challenge

import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerApplication
import io.jeffchang.challenge.common.Constants
import io.jeffchang.challenge.di.component.DaggerAppComponent
import io.jeffchang.challenge.di.module.NetworkModule
import timber.log.Timber

class ChallengeApplication: DaggerApplication(), HasActivityInjector {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        // Initializes Timber
        Timber.uprootAll()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        val appComponent = DaggerAppComponent.builder()
                .application(this)
                .networkModule(NetworkModule(Constants.GITHUB_API_URL))
                .build()
        appComponent.inject(this)
        return appComponent
    }

}