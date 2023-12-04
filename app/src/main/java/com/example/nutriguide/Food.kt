package com.example.nutriguide

import java.io.Serializable

data class Food(
    val name: String,
    val type: String,
    val image: String):Serializable

object Foods {
    val FOODS = listOf(
        Food(
            name = "Steak",
            type = "Dinner",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            name = "Tuna Sandwich",
            type = "Lunch",
            image = "https://www.thespruceeats.com/thmb/LjrJ16T7CjPRrcpWWb6u-pzOc64=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/tuna-sald-sandwich-153064942-0eac25cff6ba42f48a4873a2739a971b.jpg"
        )
        )}