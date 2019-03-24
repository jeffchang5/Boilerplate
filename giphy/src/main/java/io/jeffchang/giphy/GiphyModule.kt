package io.jeffchang.giphy

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import io.jeffchang.base.common.di.ViewModelKey
import io.jeffchang.giphy.data.service.GiphyService
import io.jeffchang.giphy.viewmodel.GiphyViewModel
import retrofit2.Retrofit

@Suppress("unused")
@Module
abstract class GiphyModule {

    @ContributesAndroidInjector
    abstract fun contributeReviewFragment(): GiphySearchFragment

    @Module
    companion object {

        @JvmStatic
        @Provides
        internal fun provideReviewService(retrofit: Retrofit) =
                retrofit.create(GiphyService::class.java)

    }

    @Binds
    @IntoMap
    @ViewModelKey(GiphyViewModel::class)
    abstract fun bindReviewViewModel(giphyViewModel: GiphyViewModel): ViewModel

}