package com.example.fragments.fragmentebi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.fragments.R

class homeFragment:Fragment(R.layout.fragment_home) {
    private lateinit var navController: NavController
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        editText = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.button)
        navController = Navigation.findNavController(view)
        button.setOnClickListener {
            val amount = editText.text.toString().toInt()

            val action = homeFragmentDirections.actionNavigationHomeToNavigationNotification(amount)
            navController.navigate(action)
        }

    }

}