package com.incava.toyrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.incava.toyrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val beatAdapter by lazy {
        BeatAdapter(
            mutableListOf(
                "aa",
                "bb",
                "cc",
                "dd",
                "aa",
                "bb",
                "cc",
                "dd",
                "aa",
                "bb",
                "cc",
                "dd",
                "aa",
                "bb",
                "cc",
                "dd",
                "aa",
                "bb",
                "cc",
                "dd"
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rcv.apply {
            adapter = beatAdapter
        }
    }
}