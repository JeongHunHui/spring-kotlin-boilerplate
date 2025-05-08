package com.hunhui.boilerplate.controller

import com.hunhui.boilerplate.controller.doc.BoilerControllerDoc
import com.hunhui.boilerplate.dto.request.CreateUserRequest
import com.hunhui.boilerplate.dto.response.UserResponse
import com.hunhui.boilerplate.service.BoilerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/boiler")
class BoilerController(
    private val boilerService: BoilerService,
) : BoilerControllerDoc {
    
    @PostMapping("/users")
    override fun createUser(@RequestBody request: CreateUserRequest): UserResponse {
        return boilerService.createUser(request.name)
    }

    @GetMapping("/users/{id}")
    override fun getUserById(@PathVariable id: Long): UserResponse {
        return boilerService.getUserById(id)
    }
}