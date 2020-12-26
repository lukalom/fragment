package com.example.fragments.fragmentebi

import android.app.Notification
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class notificationFragment:Fragment(R.layout.fragment_notification) {
    private lateinit var textView:TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        textView=view.findViewById(R.id.textView2)
        textView.text = notificationFragmentArgs.fromBundle(requireArguments()).amounts.toString()

    }
}