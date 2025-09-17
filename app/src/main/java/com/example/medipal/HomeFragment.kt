package com.example.medipal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the LinearLayout with the ID track_vitals_layout
        val trackVitalsLayout = view.findViewById<View>(R.id.track_vitals_layout)

        // Set an OnClickListener on the layout
        trackVitalsLayout.setOnClickListener {
            // Navigate to the TrackVitalFragment. This action must be defined in your nav_graph.xml
            findNavController().navigate(R.id.action_homeFragment_to_trackVitalFragment)
        }
    }
}
