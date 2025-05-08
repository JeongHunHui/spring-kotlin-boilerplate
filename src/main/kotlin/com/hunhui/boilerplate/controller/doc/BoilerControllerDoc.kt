package com.hunhui.boilerplate.controller.doc

import com.hunhui.boilerplate.dto.request.CreateUserRequest
import com.hunhui.boilerplate.dto.response.UserResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag

@Tag(name = "Boiler API", description = "Boiler 관련 API")
interface BoilerControllerDoc {
    @Operation(
        summary = "사용자 생성",
        description = "새로운 사용자를 생성합니다."
    )
    fun createUser(request: CreateUserRequest): UserResponse

    @Operation(
        summary = "사용자 조회",
        description = "ID로 사용자를 조회합니다."
    )
    fun getUserById(id: Long): UserResponse
} 