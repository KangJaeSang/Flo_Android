package com.example.floandroid.play

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.floandroid.R
import com.example.floandroid.base.BaseFragment
import com.example.floandroid.databinding.FragmentPlayBinding
import com.example.floandroid.repository.network.NetworkRepositoryImpl
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Inject

@AndroidEntryPoint
class PlayFragment : BaseFragment<FragmentPlayBinding>(R.layout.fragment_play){

    private val viewModel : PlayViewModel by viewModels()

    init {
        viewModel.musicList()
    }
}