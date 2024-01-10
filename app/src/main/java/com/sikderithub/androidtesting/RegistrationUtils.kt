package com.sikderithub.androidtesting

object RegistrationUtils {

    val users = listOf("RepeatUser1", "RepeatUser2")

    /**
     * UserName should not empty
     * userName should not repeat to existing users
     * the password must have at least 2 digits
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ):Boolean{
        if (userName.isEmpty() || password.isEmpty())
            return false
        if (userName in users)
            return false

        if (password != confirmedPassword)
            return false

        if (password.count{it.isDigit()} < 2)
            return false

        return true
    }

}