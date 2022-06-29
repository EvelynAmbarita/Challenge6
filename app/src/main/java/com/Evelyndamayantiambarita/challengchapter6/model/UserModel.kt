package com.Evelyndamayantiambarita.challengchapter6.model

/**
 * com.Evelyndamayantiambarita.challengchapter6.common
 *
 * Created by Evelyn Ambarita on 29/06/2022.
 * https://github.com/EvelynAmbarita
 *
 */

data class UserModel (
    val id: String,
    val name: String,
    val job: String,
    val email: String,
    val image: String? = null,
)