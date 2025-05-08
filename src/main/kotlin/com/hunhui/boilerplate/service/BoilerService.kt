package com.hunhui.boilerplate.service

import com.hunhui.boilerplate.dto.response.UserResponse
import com.hunhui.boilerplate.repository.UserRepository
import com.hunhui.boilerplate.entity.User
import com.hunhui.boilerplate.error.BoilerErrorCode
import com.hunhui.boilerplate.error.BusinessException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class BoilerService(
    private val userRepository: UserRepository,
) {
    fun createUser(name: String): UserResponse {
        val user = User(name = name)
        userRepository.save(user)
        return UserResponse(
            id = user.id,
            name = user.name,
        )
    }

    fun getUserById(id: Long): UserResponse {
        val user: User = userRepository.findByIdOrNull(id) ?: throw BusinessException(BoilerErrorCode.USER_NOT_FOUND)
        return UserResponse(
            id = user.id,
            name = user.name,
        )
    }
}