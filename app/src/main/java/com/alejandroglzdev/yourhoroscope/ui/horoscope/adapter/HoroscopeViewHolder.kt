package com.alejandroglzdev.yourhoroscope.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.alejandroglzdev.yourhoroscope.databinding.ItemHoroscopeBinding
import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {
        binding.ivHoroscope.setImageResource(horoscopeInfo.image)
        binding.tvHoroscope.setText(horoscopeInfo.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope, callback = {onItemSelected(horoscopeInfo)})
        }
    }

    private fun startRotationAnimation(view: View, callback:() -> Unit) {
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction(callback)
            start()
        }
    }
}