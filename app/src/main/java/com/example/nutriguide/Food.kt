package com.example.nutriguide

import java.io.Serializable

data class Food(
    val foodId: Int,
    val name: String,
    val type: String,
    val image: String):Serializable

object Foods {
    val FOODS = listOf(
        Food(
            foodId = 1,
            name = "Steak",
            type = "Dinner",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            foodId = 2,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 3,
            name = "Tuna Sandwich",
            type = "Lunch",
            image = "https://www.thespruceeats.com/thmb/LjrJ16T7CjPRrcpWWb6u-pzOc64=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/tuna-sald-sandwich-153064942-0eac25cff6ba42f48a4873a2739a971b.jpg"
        ),
        Food(
            foodId = 4,
            name = "Tuna Sandwich",
            type = "Lunch",
            image = "https://www.thespruceeats.com/thmb/LjrJ16T7CjPRrcpWWb6u-pzOc64=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/tuna-sald-sandwich-153064942-0eac25cff6ba42f48a4873a2739a971b.jpg"
        ),
        Food(
            foodId = 5,
            name = "Tuna Sandwich",
            type = "Lunch",
            image = "https://www.thespruceeats.com/thmb/LjrJ16T7CjPRrcpWWb6u-pzOc64=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/tuna-sald-sandwich-153064942-0eac25cff6ba42f48a4873a2739a971b.jpg"
        ),
        Food(
            foodId = 6,
            name = "Tuna Sandwich",
            type = "Lunch",
            image = "https://www.thespruceeats.com/thmb/LjrJ16T7CjPRrcpWWb6u-pzOc64=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/tuna-sald-sandwich-153064942-0eac25cff6ba42f48a4873a2739a971b.jpg"
        ),
        Food(
            foodId = 7,
            name = "Steak",
            type = "Dinner",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            foodId = 8,
            name = "Steak",
            type = "Dinner",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            foodId = 9,
            name = "Steak",
            type = "Dinner",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            foodId = 10,
            name = "Steak",
            type = "Dinner",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            foodId = 11,
            name = "Steak",
            type = "Dessert",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            foodId = 12,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 13,
            name = "Nutrigrain bagel",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 14,
            name = "Scramble egg",
            type = "Snack",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 15,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 16,
            name = "Irish Breakfast",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.xT5MMwXdAxAfxyr5j4sghgHaE8%26pid%3DApi&f=1&ipt=ff47207638d4fb81b59ef82ac963a7dc1e9c2f63190aaadb0b421f9b1296965f&ipo=images"
        ),
        Food(
            foodId = 17,
            name = "Pancake",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.explicit.bing.net%2Fth%3Fid%3DOIP._hLtCdJqPVmq1fwrRADH3QHaE7%26pid%3DApi&f=1&ipt=46bc295fa7e4fc6741898c40bb381e8fed1125b0311c0d51494f2d0bb83b2ea1&ipo=images"
        ),
        Food(
            foodId = 18,
            name = "Aussie Breakfast",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.WMjyCF-vu9qaVT28rOyGFwHaE8%26pid%3DApi&f=1&ipt=104fca4239c4f53ee7768c6e46d724744dc590f4eff65a149d9335085ac48410&ipo=images"
        ),
        Food(
            foodId = 18,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 19,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 20,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 21,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 22,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 23,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 24,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 25,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 26,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 27,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.5Oale2qPuMUyFHjPkbGyogHaFj%26pid%3DApi&f=1&ipt=b68f1f523736259e3646846beba3d9276e026ef854134be2a0bd1df0d64b0c3f&ipo=images"
        ),
        Food(
            foodId = 28,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 29,
            name = "Scramble egg",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 30,
            name = "Eggs, sausage, and spinach",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.4ssjycnuRK7XHKNpwX0NkQHaE8%26pid%3DApi&f=1&ipt=bbae927d2e85e871fad0e392595dbe6f89ff192bfd9180d87dc14221830266c3&ipo=images"
        ),
        Food(
            foodId = 31,
            name = "Waffles with fruits",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.-wBqHFZPUMq7jwWYiAGLqwHaHa%26pid%3DApi&f=1&ipt=c0e60f902c0829b8c0d9f605b899e25460f7b37f65a8a0507795342d9dc76214&ipo=images"
        ),
        Food(
            foodId = 32,
            name = "Belgian Waffle",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.yMLua2IGw4WfuWKu_PPQnwHaDl%26pid%3DApi&f=1&ipt=f5f04b201e34407fc5992d65707865a0f2c44c841cdde70b03c8b42d1296d314&ipo=images"
        ),
        Food(
            foodId = 33,
            name = "Croissant",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.PomVBis7jMJ5ZRzajiXDcwHaHA%26pid%3DApi&f=1&ipt=31c6ca57a3beae8a2ae25c7247975fe87ace0d28787dc120700875daa99b7a8f&ipo=images"
        ),
        Food(
            foodId = 34,
            name = "Fruit salad",
            type = "Dessert",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.C1F4zHg_OwC3_8z4L2-wdAHaE8%26pid%3DApi&f=1&ipt=866b8e1a71d8bac9734ad28c19f3b67596fab31302dd866577a13f7f73384ae2&ipo=images"
        ),
        Food(
            foodId = 35,
            name = "Breakfast Wrap",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.x0v5E1jk28Kdr-Wh404_JgHaFj%26pid%3DApi&f=1&ipt=1adb57cfcf109dfebeece0b64215684a0c8126da1954d46be151f014555b8131&ipo=images"
        ),
        Food(
            foodId = 36,
            name = "Eggs and Bacon",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.VkQL9HxwzFPTo5eSQpd7NAHaE8%26pid%3DApi&f=1&ipt=7041db39e775de73b70a097b91a7567e654d4b66937b23ce7ceea8b18cea50fe&ipo=images"
        ),
        Food(
            foodId = 37,
            name = "English breakfast",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.HpbScuL-gqc7y0VfzcKwjwHaE8%26pid%3DApi&f=1&ipt=ef13de52f9a2fc0ebb939f083c551b86042740c9ca5ab0ee789d7a06432c3dee&ipo=images"
        ),
        Food(
            foodId = 38,
            name = "Bagels",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.WGOBiLkcG1Z5eHk8W7tCCwAAAA%26pid%3DApi&f=1&ipt=ec630dca8b0cc035f115d22bdf042d935da332f257b77e7dd8cac7e4b92ee1a5&ipo=images"
        ),
        Food(
            foodId = 39,
            name = "Cereals with fruits",
            type = "Breakfast",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.2cvfMTZTVYjEX-0_Tiqj2gHaE8%26pid%3DApi&f=1&ipt=887545dad750ef91cc2c0c1fab9a6ec5aeb0be6010db603cf1b3ce796c0b8afd&ipo=images"
        ),
        Food(
            foodId = 40,
            name = "Tuna Sandwich",
            type = "Lunch",
            image = "https://www.thespruceeats.com/thmb/LjrJ16T7CjPRrcpWWb6u-pzOc64=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/tuna-sald-sandwich-153064942-0eac25cff6ba42f48a4873a2739a971b.jpg"
        )
    )
}