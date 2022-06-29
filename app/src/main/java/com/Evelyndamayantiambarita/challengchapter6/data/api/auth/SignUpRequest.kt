package com.Evelyndamayantiambarita.challengchapter6.data.api.auth

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Part

/**
 * com.Evelyndamayantiambarita.challengchapter6.common
 *
 * Created by Evelyn Ambarita on 29/06/2022.
 * https://github.com/EvelynAmbarita
 *
 */

data class SignUpRequest(
    @Part("name") var name: RequestBody? = null,
    @Part("email") var email: RequestBody? = null,
    @Part("job") var job: RequestBody? = null,
    @Part("password") var password: RequestBody? = null,
    @Part var data: MultipartBody.Part? = null
)