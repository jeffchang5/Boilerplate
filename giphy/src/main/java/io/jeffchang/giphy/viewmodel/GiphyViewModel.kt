package io.jeffchang.giphy.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.jeffchang.base.data.model.TextData
import io.jeffchang.challenge.R
import io.jeffchang.giphy.data.model.SearchItem
import io.jeffchang.giphy.interactor.GiphyInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import retrofit2.HttpException
import timber.log.Timber
import javax.inject.Inject

class GiphyViewModel @Inject constructor(
        private val giphyInteractor: GiphyInteractor): ViewModel() {

    private val compositeDisposable by lazy {
        CompositeDisposable()
    }

    private val _textDataLiveData = MutableLiveData<TextData?>()

    val textDataLiveData: LiveData<TextData?> get() = _textDataLiveData

    private val _searchItems= MutableLiveData<List<SearchItem>>()

    val searchResult: LiveData<List<SearchItem>> get() = _searchItems

    fun getSearchItems(query: String) {
        _textDataLiveData.value = TextData(R.string.loading)
        giphyInteractor.getSearchItems(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Timber.d("There are %s search items.", it.size)
                    if (it.isEmpty()) {
                        _textDataLiveData.value = TextData(R.string.search_items_empty)
                    } else {
                        _textDataLiveData.value = null
                        _searchItems.value = it
                    }
                }, { throwable ->
                    Timber.e(throwable)
                    (throwable as? HttpException)?.let {
                    }
                    _textDataLiveData.value = TextData(R.string.network_error)
                })
                .addTo(compositeDisposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}