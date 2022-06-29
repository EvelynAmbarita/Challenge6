package com.Evelyndamayantiambarita.challengchapter6.data.api.auth

import com.google.gson.annotations.SerializedName

/**
 * com.Evelyndamayantiambarita.challengchapter6.common
 *
 * Created by Evelyn Ambarita on 29/06/2022.
 * https://github.com/EvelynAmbarita
 *
 */

data class SignInRequest(
    @SerializedName("email") var email: String? = null,
    @SerializedName("password") var password: String? = null
)