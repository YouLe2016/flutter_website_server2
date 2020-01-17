package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class QuickController {
    @GetMapping("/hello")
    fun quick() = "hello Mr.gao"

    @GetMapping("/hello2")
    fun quick2() = mapOf(
        "id" to 10086,
        "name" to "Le"
    )

    @GetMapping("/movie/{type}")
    fun getMovieListByType(@PathVariable("type") type: String): Map<String, Any> {
        println("movie: type = $type")
        val size = 20
        return mapOf(
            "total" to size,
            "subjects" to List(size) {
                mapOf(
                    "title" to "无名之辈$it",
                    "date" to "2018",
                    "type" to type,
                    "url" to if (it % 2 == 0) {
                        "http://ww1.sinaimg.cn/large/0065oQSqly1g2pquqlp0nj30n00yiq8u.jpg"
                    } else {
                        "http://ww1.sinaimg.cn/large/0065oQSqly1ft3fna1ef9j30s210skgd.jpg"
                    }
                )
            }
        );
    }

    @GetMapping("/response/{requestData}")
    fun responseRequest(@PathVariable("requestData") data: String): String {
        println("response:  requestData = $data")
        return data;
    }

}