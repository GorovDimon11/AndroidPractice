package com.pmproject.scoreapppm.ui.winner_history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.pmproject.scoreapppm.R


class FragmentWinnerHistory : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_winner_history, container, false)

        val btn_toMain = root.findViewById<Button>(R.id.btn_mainPage)

        btn_toMain.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_winner_history_to_navigation_teams)
        }

        return root
    }

}