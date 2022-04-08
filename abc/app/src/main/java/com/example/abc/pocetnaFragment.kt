package com.example.abc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class pocetnaFragment : Fragment(), View.OnClickListener {

    var navc: NavController?= null
    var but: Button ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pocetna_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navc = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.infoButton)?.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        navc?.navigate(R.id.action_pocetnaFragment3_to_viseInfoFragment3)


    }


}
