package com.example.navigationcomponentkullanimi
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentkullanimi.databinding.FragmentAyarlarBinding

class AyarlarFragment : Fragment() {

private lateinit var binding:FragmentAyarlarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding=FragmentAyarlarBinding.inflate(inflater,container,false)
        return binding.root
    }

}