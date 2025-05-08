package com.hunhui.boilerplate.error

enum class GlobalErrorCode(
    override val code: String,
    override val message: String,
) : ErrorCode {
    INTERNAL_SERVER_ERROR("GL001", "서버 오류가 발생했습니다."),
}