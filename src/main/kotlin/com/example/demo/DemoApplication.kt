package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// 声明该类是一个SpringBoot引导类
@SpringBootApplication
class DemoApplication

// 入口函数
fun main(args: Array<String>) {
    // 启动SpringBoot引导类
    runApplication<DemoApplication>(*args)
}
