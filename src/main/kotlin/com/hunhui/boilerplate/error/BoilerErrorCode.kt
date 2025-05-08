package com.hunhui.boilerplate.error

enum class BoilerErrorCode(
    override val code: String,
    override val message: String,
) : ErrorCode {
    USER_NOT_FOUND("BO001", "유저를 찾을 수 없습니다."),
}