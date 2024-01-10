package com.sikderithub.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilsTest{

    @Test
    fun emptyUserNameReturnFalse(){
        val result = RegistrationUtils.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun validUserAndCorrectlyRepeatedPasswordReturnsTrue(){
        val result = RegistrationUtils.validateRegistrationInput(
            "Antor Saha",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun alreadyExistsUserReturnFalse(){
        val result = RegistrationUtils.validateRegistrationInput(
            "RepeatUser1",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun emptyPasswordReturnFalse(){
        val result = RegistrationUtils.validateRegistrationInput(
            "Antor Saha",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun passwordRepeatedIncorrectlyReturnsFalse(){
        val result = RegistrationUtils.validateRegistrationInput(
            "Antor Saha",
            "123",
            "1234"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun passwordContainsLessThanTwoDigitsReturnFalse(){
        val result = RegistrationUtils.validateRegistrationInput(
            "Antor Saha",
            "abcd1",
            "abcd1"
        )

        assertThat(result).isFalse()
    }
}