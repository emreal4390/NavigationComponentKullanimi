package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)

        binding.buttonDetay.setOnClickListener {
           // Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text="Nasılsın"

            val urun=Urunler(100,"TV")
            val gecis=AnasayfaFragmentDirections.detayGecis(urun=urun,"Emre",22,1.76f,false )
            Navigation.findNavController(it ).navigate(gecis)




        }
        return binding.root


    }

    }
