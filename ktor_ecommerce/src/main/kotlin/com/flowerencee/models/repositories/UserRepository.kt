package com.flowerencee.models.repositories

import com.flowerencee.models.data.body.Login
import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest

interface UserRepository {
    fun loginUser(request: LoginRequest): Login?
    fun getUserById(accountId: String): UserAccount?
}