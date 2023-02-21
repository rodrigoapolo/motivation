package com.rodrigoapolo.motivation.infra

class MotivationConstants private constructor(){
    object Key {
        const val USER_NAME = "USER_NAME"
    }

    object PHRASEFILTER{
        const val ALL = 1
        const val HAPPY = 2
        const val SUNNY = 3
    }

    object LANGUAGE{
        const val PORTUGUESE = "pt"
        const val ENGLISH = "en"
        const val FRENCH = "fr"
    }
}