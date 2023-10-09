package com.alejandroglzdev.yourhoroscope.ui.detail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.alejandroglzdev.yourhoroscope.R
import com.alejandroglzdev.yourhoroscope.databinding.ActivityHoroscopeDetailBinding
import com.alejandroglzdev.yourhoroscope.domain.model.HoroscopeModel
import com.alejandroglzdev.yourhoroscope.ui.detail.HoroscopeDetailState.Error
import com.alejandroglzdev.yourhoroscope.ui.detail.HoroscopeDetailState.Loading
import com.alejandroglzdev.yourhoroscope.ui.detail.HoroscopeDetailState.Success
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding

    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()

    private val args: HoroscopeDetailActivityArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        horoscopeDetailViewModel.getHoroscope(args.type)
    }

    private fun initUI() {
        initListeners()
        initUIState()
    }

    private fun initListeners() {
        binding.ivBack.setOnClickListener { onBackPressed() }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeDetailViewModel.state.collect {
                    when (it) {
                        Loading -> loadingState()
                        is Error -> errorState()
                        is Success -> successState(it)
                    }
                }
            }
        }
    }

    private fun successState(state: Success) {
        binding.progressBar.isVisible = false
        binding.tvTitle.text = state.title
        binding.tvBody.text = state.prediction

        val image = when(state.horoscopeModel) {
            HoroscopeModel.Aquarius -> R.drawable.detail_aquarius
            HoroscopeModel.Aries -> R.drawable.detail_aries
            HoroscopeModel.Cancer -> R.drawable.detail_cancer
            HoroscopeModel.Capricorn -> R.drawable.detail_capricorn
            HoroscopeModel.Gemini -> R.drawable.detail_gemini
            HoroscopeModel.Leo -> R.drawable.detail_leo
            HoroscopeModel.Libra -> R.drawable.detail_libra
            HoroscopeModel.Pisces -> R.drawable.detail_pisces
            HoroscopeModel.Sagittarius -> R.drawable.detail_sagittarius
            HoroscopeModel.Scorpio -> R.drawable.detail_scorpio
            HoroscopeModel.Taurus -> R.drawable.detail_taurus
            HoroscopeModel.Virgo -> R.drawable.detail_virgo
        }

        binding.ivDetail.setImageResource(image)
    }

    private fun errorState() {
        binding.progressBar.isVisible = false
    }

    private fun loadingState() {
        binding.progressBar.isVisible = true
    }
}