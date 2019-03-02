package io.jeffchang.challenge.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.jeffchang.challenge.common.di.ViewModelKey
import io.jeffchang.challenge.common.kt.ViewModelFactory
import io.jeffchang.challenge.ui.review.viewmodel.ReviewViewModel

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ReviewViewModel::class)
    abstract fun bindWordSearchViewModel(reviewViewModel: ReviewViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}