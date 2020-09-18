package com.bignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.criminalintent.database.CrimeRepository

//Lifecycle of this ViewModel is tied to the fragment not activity
class CrimeListViewModel : ViewModel() {

//    val crimes = mutableListOf<Crime>()
//
//    init {
//        for (i in 0 until 100){
//            val crime = Crime()
//            crime.title = "Crime #$i"
//            crime.isSolved = i % 2 == 0
//            crimes += crime
//        }
//    }
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}