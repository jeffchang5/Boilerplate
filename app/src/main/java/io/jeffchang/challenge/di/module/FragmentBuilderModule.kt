package io.jeffchang.challenge.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.jeffchang.challenge.ui.review.ReviewFragment

@Suppress("unused")
@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeReviewFragment(): ReviewFragment

}