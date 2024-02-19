package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar


class DetayFragment : Fragment() {

private lateinit var binding:FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding= FragmentDetayBinding.inflate(inflater,container,false  )

        val bundle:DetayFragmentArgs by navArgs()
        val gelenAd=bundle.ad
        val gelenBoy=bundle.boy
        val gelenYas=bundle.yas
        val gelenBekar=bundle.bekar

        val urunId=bundle.urun.id
        val urunAd=bundle.urun.ad

        binding.textViewBilgi.text="$gelenAd-$gelenBoy-$gelenYas-$gelenBekar-$urunId-$urunAd"

       val geriTusu= object : OnBackPressedCallback(true) {
           override fun handleOnBackPressed() {
               Snackbar.make(binding.textViewBilgi,"geri dönmek istiyor musunuz",Snackbar.LENGTH_SHORT)
                   .setAction("EVET"){
                       isEnabled=false
                       requireActivity().onBackPressedDispatcher.onBackPressed()
                   }
                   .show()
           }
       }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)
        return binding.root
    }

}