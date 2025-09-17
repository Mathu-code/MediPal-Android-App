package com.example.medipal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TrackVitalFragment : Fragment() {

    // This method is called to create and return the view hierarchy associated with the fragment.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment from fragment_track_vital.xml
        return inflater.inflate(R.layout.fragment_track_vital, container, false)
    }

    // This method is called after the view is created. You can use this to set up views,
    // listeners, and other functionality.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // You can add your logic here to handle UI elements within the fragment_track_vital.xml layout.
    }
}