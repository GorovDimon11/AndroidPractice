package com.pmproject.scoreapppm.ui.winner

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.pmproject.scoreapppm.R
import nl.dionsegijn.konfetti.KonfettiView
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size

class WinnerFragment : Fragment() {

    private lateinit var winnerViewModel: WinnerViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        winnerViewModel =
                ViewModelProvider(this).get(WinnerViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_winner, container, false)

        val btn_toMain : Button = root.findViewById(R.id.btn_toMainPage)
        val btn_toWinHistory : Button = root.findViewById(R.id.btn_openHistory)

        val viewKonfetti : KonfettiView = root.findViewById(R.id.viewKonfetti)

        konfetti(viewKonfetti)

        btn_toMain.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_winner_to_navigation_teams)
        }

        btn_toWinHistory.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_winner_to_fragment_winner_history)
        }


//        val textView: TextView = root.findViewById(R.id.text_notifications)
//        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    private fun konfetti(view: KonfettiView) {
        view.build()
            .addColors(R.color.primaryColor, R.color.secondaryColor,  Color.YELLOW)
            .setDirection(0.0, 359.0)
            .setSpeed(1f, 5f)
            .setFadeOutEnabled(true)
            .setTimeToLive(3000L)
            .addShapes(Shape.Square, Shape.Circle)
            .addSizes(Size(12))
            .setPosition(-50f, view.width + 10000f, -50f, -50f)
            .streamFor(300, 3000L)
    }
}