package id.utdi.asepsuherman.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.utdi.asepsuherman.beritaapi.repository.local.NewsLocalRepository
import id.utdi.asepsuherman.beritaapi.repository.remote.NewsRemoteRepository

class NewsViewModelProviderFactory(
    val app: Application,
    private val newsRemoteRepository: NewsRemoteRepository,
    private val newsLocalRepository: NewsLocalRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsRemoteRepository, newsLocalRepository) as T
    }
}