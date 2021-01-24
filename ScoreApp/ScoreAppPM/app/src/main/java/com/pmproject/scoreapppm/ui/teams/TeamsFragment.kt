package com.pmproject.scoreapppm.ui.teams

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.pmproject.scoreapppm.R
import java.sql.Time

class TeamsFragment : Fragment() {

    private lateinit var teamsViewModel: TeamsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        teamsViewModel =
                ViewModelProvider(this).get(TeamsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_teams, container, false)

        val et_team1 : EditText = root.findViewById(R.id.et_teamName1)
        val et_team2 : EditText = root.findViewById(R.id.et_teamName2)

        val et_timer_value : EditText =root.findViewById(R.id.et_time)

        val btn_start : Button =root.findViewById(R.id.btn_start)
        val tv_history : TextView =root.findViewById(R.id.tv_history)

        btn_start.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_teams_to_navigation_score_count)
        }

        tv_history.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_teams_to_fragment_winner_history)
        }

//        val textView: TextView = root.findViewById(R.id.text_home)

//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        return root
    }
}