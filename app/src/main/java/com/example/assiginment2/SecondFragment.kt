package com.example.assiginment2
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import android.widget.*
class SecondFragment:DialogFragment(R.layout.first_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancelbtn);
        val submitbt : Button = view.findViewById(R.id.submitBtn);
        val radioGroup = view.findViewById<RadioGroup>(R.id.motorcycles)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)


            dismiss()
        }
    }
}