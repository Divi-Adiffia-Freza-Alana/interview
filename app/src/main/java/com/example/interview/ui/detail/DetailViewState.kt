package com.example.interview.ui.detail

import com.gnova.domain.models.Trailer


sealed class DetailViewState {

    data class Presenting( val results: List<Trailer>) : DetailViewState()

    object Error : DetailViewState()

    object Loading : DetailViewState()
}