package com.example.triviaapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.national_flag_fragment_layout.*

class NationalFlagFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.national_flag_fragment_layout, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        next_button.setOnClickListener {
            activity!!.supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_layout, SummaryFragment())
                .commit()
        }
    }
}