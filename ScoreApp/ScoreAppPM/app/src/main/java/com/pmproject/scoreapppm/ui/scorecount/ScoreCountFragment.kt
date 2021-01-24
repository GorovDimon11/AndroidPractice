package com.pmproject.scoreapppm.ui.scorecount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.pmproject.scoreapppm.R

class ScoreCountFragment : Fragment() {

    private lateinit var scoreCountViewModel: ScoreCountViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        scoreCountViewModel =
                ViewModelProvider(this).get(ScoreCountViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_score_count, container, false)

        val btn_cancel : Button = root.findViewById(R.id.btn_cancel)

        //todo delete
        val tv : TextView = root.findViewById(R.id.TEXT)
        tv.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_score_count_to_navigation_winner)
        }
        //todo ------------

        btn_cancel.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_score_count_to_navigation_teams)
        }

//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }
}