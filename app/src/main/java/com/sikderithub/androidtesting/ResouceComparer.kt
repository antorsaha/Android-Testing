package com.sikderithub.androidtesting

import android.content.Context

class ResouceComparer {
    fun isEqualString(context: Context, stringId: Int, string: String): Boolean{
        return context.getString(stringId) == string
    }
}