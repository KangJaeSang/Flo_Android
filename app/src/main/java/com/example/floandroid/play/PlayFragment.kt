package com.example.floandroid.play

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.floandroid.databinding.FragmentPlayBinding
import com.example.floandroid.repository.network.NetworkRepositoryImpl
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Inject

@AndroidEntryPoint
class PlayFragment : Fragment(){

    lateinit var binding : FragmentPlayBinding

    val viewModel : PlayViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPlayBinding.inflate(layoutInflater,container,false)

     /*   Log.d("kjs-activity",requireActivity().localClassName)

        playviewModel = ViewModelProvider(this,PlayViewModel.Factory(requireActivity().application))[PlayViewModel::class.java]

        playviewModel.musicApi("2020-flo/song.json")*/

        //viewModel.repository.musicList("kjs")


        Log.d("kjs-networkRepo", viewModel.networkRepo.getMusicList() .toString())

        //Log.d("kjs-roomRepo", viewModel.roomRepo.getMusicList() .toString())

        //viewModel.repository.roomDataBase().getMusicList()

        return binding.root
    }

    fun setLayout(){

    }

   /* @ActivityContext lateinit var binding : FragmentPlayBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //binding = FragmentPlayBinding.inflate(layoutInflater,container,false)

        Log.d("kjs-activity",requireActivity().localClassName)

   *//*     playviewModel = ViewModelProvider(this,PlayViewModel.Factory(requireActivity().application))[PlayViewModel::class.java]

        playviewModel.musicApi("2020-flo/song.json")*//*

        return binding.root
    }

    *//*fun setLayout(){
        playviewModel.playLiveData.observe(viewLifecycleOwner,{
            Log.d("kjs-it",it.toString())
        })
    }*/
}