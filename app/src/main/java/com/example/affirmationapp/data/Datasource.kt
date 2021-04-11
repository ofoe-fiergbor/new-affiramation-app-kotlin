package com.example.affirmationapp.data

import com.example.affirmationapp.R.drawable
import com.example.affirmationapp.R.string
import com.example.affirmationapp.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(string.affirmation1, drawable.image1),
            Affirmation(string.affirmation2, drawable.image2),
            Affirmation(string.affirmation3, drawable.image3),
            Affirmation(string.affirmation4, drawable.image4),
            Affirmation(string.affirmation5, drawable.image5),
            Affirmation(string.affirmation6, drawable.image6),
            Affirmation(string.affirmation7, drawable.image7),
            Affirmation(string.affirmation8, drawable.image8),
            Affirmation(string.affirmation9, drawable.image9),
            Affirmation(string.affirmation10, drawable.image10),
        )
    }
}