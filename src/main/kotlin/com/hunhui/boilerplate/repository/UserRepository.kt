package com.hunhui.boilerplate.repository

import com.hunhui.boilerplate.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>