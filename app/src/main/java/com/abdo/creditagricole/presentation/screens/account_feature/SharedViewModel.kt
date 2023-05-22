package com.abdo.creditagricole.presentation.screens.account_feature

import androidx.lifecycle.ViewModel
import com.abdo.creditagricole.data.repository.BanksRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: BanksRepository
) : ViewModel() {

}