package com.example.android.keepnotes.ui.delete

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.keepnotes.R

class DeleteFragment : Fragment() {

    private lateinit var deleteViewModel: DeleteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        deleteViewModel =
            ViewModelProvider(this).get(DeleteViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_delete, container, false)
        val textView: TextView = root.findViewById(R.id.delete)
        deleteViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}

