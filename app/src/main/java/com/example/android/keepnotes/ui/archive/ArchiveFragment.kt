package com.example.android.keepnotes.ui.archive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.keepnotes.R

class ArchiveFragment : Fragment() {

    private lateinit var archiveViewModel: ArchiveViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        archiveViewModel =
            ViewModelProvider(this).get(ArchiveViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_archive, container, false)
        val textView: TextView = root.findViewById(R.id.archive)
        archiveViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}

