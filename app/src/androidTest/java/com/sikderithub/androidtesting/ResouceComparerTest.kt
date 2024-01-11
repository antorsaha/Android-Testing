package com.sikderithub.androidtesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResouceComparerTest{
    private lateinit var resouceComparer: ResouceComparer

    @Before
    fun setup(){
        resouceComparer = ResouceComparer()
    }

    @After
    fun destroy(){

    }

    @Test
    fun stringResourcesSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resouceComparer.isEqualString(context, R.string.app_name, "Android testing")

        assertThat(result).isTrue()
    }

    @Test
    fun stringResourcesDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resouceComparer.isEqualString(context, R.string.app_name, "testing")

        assertThat(result).isFalse()
    }
}