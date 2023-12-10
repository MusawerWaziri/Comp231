package com.example.nutriguide

import java.io.Serializable

data class Food(
    val foodId: Int,
    val name: String,
    val type: String,
    val description: String,
    val recipe: String,
    val nutrition: String,
    val image: String):Serializable


object Foods {
    val FOODS = listOf(
        Food(
            foodId = 1,
            name = "Steak",
            type = "Dinner",
            description = "Description\n\n Steak is a culinary delight, revered for its rich, savory flavor and tender, succulent texture. Typically cut from the muscle fibers of beef, it offers a hearty and robust taste experience. When cooked, it transforms into a mouth-watering dish with a beautifully browned exterior and a juicy interior, ranging from rare to well-done based on preference. Its versatility allows it to be grilled, broiled, pan-fried, or seared, each method enhancing its unique flavor and texture. Often seasoned simply with salt and pepper or marinated for additional depth, steak is a centerpiece in many cuisines, celebrated for its simplicity yet profound gastronomic appeal.",
            recipe = "Recipe\n\nCooking a basic steak is straightforward and requires minimal ingredients. Here's a simple recipe to prepare a delicious steak:\n" +
                    "\n" +
                    "Ingredients\n" +
                    "1 steak (ribeye, sirloin, filet mignon, etc.), about 1-inch thick\n" +
                    "Salt, to taste\n" +
                    "Freshly ground black pepper, to taste\n" +
                    "1-2 tablespoons of oil (with a high smoke point like canola, vegetable, or grapeseed oil)\n" +
                    "2 tablespoons of butter (optional)\n" +
                    "Garlic cloves (optional)\n" +
                    "Fresh herbs like thyme or rosemary (optional)\n" +
                    "Instructions\n" +
                    "Prepare the Steak:\n" +
                    "\n" +
                    "Take the steak out of the refrigerator and let it sit at room temperature for about 30-40 minutes before cooking. This helps it cook more evenly.\n" +
                    "Season the Steak:\n" +
                    "\n" +
                    "Pat the steak dry with paper towels to remove excess moisture. This helps with browning.\n" +
                    "Season generously with salt and pepper on both sides.\n" +
                    "Preheat the Skillet:\n" +
                    "\n" +
                    "Heat a skillet (preferably cast iron for even heat distribution) over high heat.\n" +
                    "Add the oil and swirl to coat the pan.\n" +
                    "Cook the Steak:\n" +
                    "\n" +
                    "Place the steak in the hot skillet. Sear for about 3-4 minutes on one side until it develops a crusty brown sear.\n" +
                    "Flip the steak and cook for an additional 3-4 minutes for medium-rare. Adjust the cooking time depending on the thickness of the steak and your desired level of doneness. Use a meat thermometer to check for doneness: 135°F for medium-rare, 140°F for medium, 150°F for medium-well.\n" +
                    "Add Flavor (Optional):\n" +
                    "\n" +
                    "In the last minute of cooking, add butter, garlic, and fresh herbs to the pan (if using).\n" +
                    "Tilt the pan slightly and spoon the melted butter and juices over the steak repeatedly for added flavor.\n" +
                    "Rest the Steak:\n" +
                    "\n" +
                    "Remove the steak from the pan and let it rest on a cutting board or plate for about 5-10 minutes before cutting. This allows the juices to redistribute throughout the meat, ensuring a juicier steak.\n" +
                    "Serve:\n" +
                    "\n" +
                    "Slice against the grain for tenderness and serve immediately.\n" +
                    "Tips\n" +
                    "Doneness: The finger test or a meat thermometer can help you gauge when the steak is cooked to your preference.\n" +
                    "Pan Choice: A cast-iron skillet is ideal for cooking steak because of its heat retention and even heating.\n" +
                    "Resting: Resting the steak before slicing is crucial for a juicy steak.\n" +
                    "Enjoy your perfectly cooked steak with your choice of sides, like roasted vegetables, mashed potatoes, or a fresh salad!\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            nutrition ="Nutritional Information\n\nBasic Nutritional Values (for 3 oz of cooked steak, such as sirloin)\n" +
                    "Calories: Approximately 200-220 kcal\n" +
                    "Protein: About 25-30 grams\n" +
                    "Total Fat: 8-12 grams\n" +
                    "Saturated Fat: 3-5 grams\n" +
                    "Unsaturated Fat: Varies depending on the cut\n" +
                    "Cholesterol: Approximately 70-90 mg\n" +
                    "Carbohydrates: Generally 0 grams (steak doesn't contain carbs)\n" +
                    "Fiber: 0 grams\n" +
                    "Sugars: 0 grams\n" +
                    "Sodium: Varies, but usually minimal unless seasoned heavily with salt\n" +
                    "Vitamins and Minerals:\n" +
                    "Rich in B Vitamins, particularly Vitamin B12 and Niacin\n" +
                    "Good source of Iron, especially heme iron, which is easily absorbed by the body\n" +
                    "Contains Zinc, which is important for the immune system\n" +
                    "Provides Phosphorus and Selenium\n" +
                    "Points to Consider:\n" +
                    "Lean vs. Fatty Cuts: Leaner cuts of steak like sirloin or tenderloin have less fat compared to fattier cuts like ribeye or T-bone.\n" +
                    "Grass-Fed vs. Grain-Fed: Grass-fed beef is often leaner and might have a different fatty acid profile, including higher levels of omega-3 fatty acids.\n" +
                    "Cooking Method: Grilling, broiling, or pan-searing without adding excessive oil can help keep the calorie and fat content lower. Methods like deep-frying or cooking with butter can increase the calorie and fat content.\n" +
                    "Portion Size: Steak servings can vary greatly in size. The above nutritional information is for a relatively small, 3-ounce serving. Larger portions will have proportionately higher calories and nutrients.\n" +
                    "As with any food, moderation is key, and steak can be a part of a balanced diet, especially when paired with vegetables and whole grains. For personalized dietary advice, it's always best to consult with a nutritionist or healthcare provider.",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.JYkgWknO0z5Z6cRjJ1Kh0AHaFj%26pid%3DApi&f=1&ipt=6934030f982e4f328e0d6f6ad9cddce8114396f9feafc4331da89f4851da5c13&ipo=images"
        ),
        Food(
            foodId = 2,
            name = "Scramble Egg",
            type = "Breakfast",
            description = "Description\n\n" +
                    "\"In the soft light of early morning, there’s a simple yet profound joy in preparing scrambled eggs. It's a dish that whispers of shared moments and tender care. Each stir of the spatula is like a gentle caress, transforming the eggs into a soft, golden blanket of comfort and love. The eggs, once separate entities, blend together in a harmonious dance, creating a texture as smooth as silk and as warm as a loving embrace. The delicate aroma wafts through the air, a prelude to the intimate meal shared between two souls. Scrambled eggs, in their unpretentious simplicity, become a symbol of life's most cherished moments - a quiet morning filled with soft whispers, gentle laughter, and the joy of being together. It's a dish that doesn’t just nourish the body but feeds the heart with its understated elegance and the promise of a new day spent in loving company.\"",
            recipe = "Ingredients\n\n" +
                    "2 to 3 large eggs\n" +
                    "Salt, to taste\n" +
                    "Pepper, to taste (optional)\n" +
                    "1 tablespoon of butter or oil\n" +
                    "Optional additions: cheese, herbs, diced ham, or vegetables\n" +
                    "Instructions\n" +
                    "Beat the Eggs:\n" +
                    "\n" +
                    "Crack the eggs into a bowl.\n" +
                    "Add a pinch of salt (and pepper, if desired).\n" +
                    "Beat the eggs with a fork or a whisk until the yolk and whites are fully combined. The mixture should have a uniform color.\n" +
                    "Preheat the Pan:\n" +
                    "\n" +
                    "Place a non-stick skillet or frying pan on the stove over medium heat.\n" +
                    "Add the butter or oil. Wait until the butter is melted and starts to bubble, or the oil is heated.\n" +
                    "Cook the Eggs:\n" +
                    "\n" +
                    "Pour the beaten eggs into the pan.\n" +
                    "Allow the eggs to sit undisturbed for a few seconds until they start to set at the bottom.\n" +
                    "With a spatula, gently stir the eggs from the edges to the center. Let them sit again for a few seconds, then stir again.\n" +
                    "Continue this process, stirring gently and pausing between, until the eggs are softly set and slightly runny in places. The entire process should take about 2 to 3 minutes.\n" +
                    "Remember, scrambled eggs will continue to cook a little after you remove them from the heat, so it's okay to stop when they're slightly underdone.\n" +
                    "Finishing Touches:\n" +
                    "\n" +
                    "If you're adding cheese, herbs, or any pre-cooked additions (like diced ham or sautéed vegetables), fold them in when the eggs are almost done but still slightly runny.\n" +
                    "Remove the eggs from the heat when they are set but still moist. Overcooking will dry them out.\n" +
                    "Serve Immediately:\n" +
                    "\n" +
                    "Serve the scrambled eggs while they're warm and fluffy.\n" +
                    "They pair beautifully with toast, cooked vegetables, or a fresh salad.\n" +
                    "Tips\n" +
                    "For creamier eggs, some people add a splash of milk or cream to the eggs before beating them.\n" +
                    "Cooking on medium-low heat and stirring gently is key to achieving soft, fluffy scrambled eggs.\n" +
                    "Experiment with herbs like chives, parsley, or dill for added flavor.\n" +
                    "Enjoy your delicious, homemade scrambled eggs!\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            nutrition ="Nutritional Information\n\nBasic Scrambled Eggs (using 2 large eggs, 1 tablespoon of butter, and a pinch of salt)\n" +
                    "Calories: Approximately 220-250 kcal\n" +
                    "Protein: About 13-15 grams\n" +
                    "Total Fat: Around 18-20 grams\n" +
                    "Saturated Fat: 7-9 grams\n" +
                    "Unsaturated Fat: 8-10 grams\n" +
                    "Cholesterol: Approximately 370-400 mg\n" +
                    "Carbohydrates: About 1-2 grams\n" +
                    "Fiber: Negligible\n" +
                    "Sugars: Negligible\n" +
                    "Sodium: Roughly 300-400 mg (depends on the amount of salt used)\n" +
                    "Vitamins and Minerals:\n" +
                    "Eggs are a good source of Vitamin B12, Riboflavin (B2), and Phosphorus.\n" +
                    "They also contain Vitamin A, Vitamin D, Iron, and Zinc, among other nutrients.\n" +
                    "Points to Consider:\n" +
                    "Protein Quality: Eggs are an excellent source of high-quality protein, containing all essential amino acids.\n" +
                    "Cholesterol Content: While eggs are high in cholesterol, recent studies suggest that for most people, dietary cholesterol has a minimal impact on blood cholesterol levels. However, individuals with certain health conditions might need to monitor their egg consumption.\n" +
                    "Healthy Fats: Eggs contain healthy unsaturated fats, but also saturated fats. Balance is key in a healthy diet.\n" +
                    "Low Carbohydrate: Eggs are low in carbs, which makes them a good choice for low-carbohydrate diets.\n" +
                    "Calories: The caloric content mainly comes from the eggs and butter. Using less butter or substituting with cooking spray can reduce the calorie count.\n" +
                    "Remember, these values are approximate and can vary based on the size of the eggs and the exact ingredients used. For personalized nutritional advice, it's best to consult with a dietitian or a healthcare provider.",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 3,
            name = "Tuna Sandwich",
            type = "Lunch",
            description = "Description\n\nA tuna sandwich is a classic and versatile dish that combines the rich, savory flavors of tuna with various fresh and tangy ingredients. Typically, it includes:\n" +
                    "\n" +
                    "Tuna: The star ingredient is usually canned tuna, either in oil or water, which is flaked apart. Tuna offers a mildly fishy taste and a meaty texture. It's a good source of protein and omega-3 fatty acids.\n" +
                    "\n" +
                    "Bread: Often served on whole grain, multigrain, or white bread, the choice of bread can range from soft and fluffy to hearty and crusty. The bread may be lightly toasted to add a crunchy texture and a nutty flavor.\n" +
                    "\n" +
                    "Mayonnaise and Seasonings: Mayonnaise is commonly mixed with the tuna to create a creamy texture. Seasonings like salt, pepper, and sometimes a dash of lemon juice or mustard are added for extra flavor.\n" +
                    "\n" +
                    "Additional Ingredients: Many variations include finely chopped celery for a crisp texture, along with diced onions or pickles for a tangy kick. Lettuce leaves, slices of tomato, and cucumber are also popular additions, providing freshness and a juicy crunch.\n" +
                    "\n" +
                    "Serving Style: The sandwich can be served either open-faced or as a traditional sandwich with two slices of bread. It's often cut in half for easier eating.\n" +
                    "\n" +
                    "A tuna sandwich is appreciated for its simplicity and satisfying taste. It's a popular choice for a quick lunch or a picnic, offering a good balance of flavors and textures. The sandwich can be customized with various ingredients like avocado, hard-boiled eggs, or different types of cheese to suit different tastes and dietary preferences.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            recipe = "Ingredients\n\n" +
                    "2 cans of tuna in water or oil (about 5 ounces each), drained\n" +
                    "2-3 tablespoons of mayonnaise\n" +
                    "1 tablespoon of lemon juice\n" +
                    "1/4 cup of finely chopped celery\n" +
                    "2 tablespoons of finely chopped red onion\n" +
                    "Salt and pepper to taste\n" +
                    "4 slices of bread (whole grain, white, or your choice)\n" +
                    "Lettuce leaves\n" +
                    "Tomato slices (optional)\n" +
                    "Cucumber slices (optional)\n" +
                    "Additional options: Pickles, hard-boiled eggs, capers, mustard\n" +
                    "Instructions\n" +
                    "Prepare the Tuna Mixture:\n" +
                    "\n" +
                    "In a medium bowl, combine the drained tuna, mayonnaise, and lemon juice. Mix well with a fork to break up the chunks of tuna.\n" +
                    "Add the chopped celery and red onion to the tuna. Mix well.\n" +
                    "Season the mixture with salt and pepper to taste. You can also add a small amount of mustard or capers for extra flavor, if desired.\n" +
                    "Toast the Bread (optional):\n" +
                    "\n" +
                    "Toast the bread slices to your liking. This step is optional but adds a nice texture and flavor to the sandwich.\n" +
                    "Assemble the Sandwich:\n" +
                    "\n" +
                    "Lay out the toasted bread slices. On two slices, arrange lettuce leaves. You can also add tomato and cucumber slices if you like.\n" +
                    "Spread the tuna mixture evenly over the lettuce.\n" +
                    "Top with the remaining bread slices to make two sandwiches.\n" +
                    "Serve:\n" +
                    "\n" +
                    "Cut the sandwiches in half, if desired, and serve immediately.\n" +
                    "You can serve the sandwich with a side of chips, a salad, or fresh fruit for a complete meal.\n" +
                    "Tips\n" +
                    "Adjust Mayonnaise: Depending on your preference for creaminess, adjust the amount of mayonnaise.\n" +
                    "Additions and Variations: Feel free to add other ingredients like chopped pickles, hard-boiled eggs, or a sprinkle of paprika for a different flavor profile.\n" +
                    "Bread Choice: While whole grain bread is a healthier option, you can use any bread you like. Croissants, bagels, or wraps also work well.\n" +
                    "Serving Cold: Tuna sandwiches are typically served cold, making them a great option for packed lunches or picnics.\n" +
                    "This recipe is easy to customize based on what you have on hand and your taste preferences. Enjoy your delicious and nutritious tuna sandwich!\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            nutrition ="Nutritional information\n\nThe nutritional content of a tuna sandwich can vary depending on the ingredients used and their quantities. However, I can provide a general overview of the nutritional value for a typical tuna sandwich made with canned tuna, mayonnaise, celery, and whole grain bread.\n" +
                    "\n" +
                    "Estimated Nutritional Values (per sandwich):\n" +
                    "Ingredients:\n" +
                    "2 slices of whole grain bread\n" +
                    "1 can of tuna in water (drained, approximately 5 ounces or 142 grams)\n" +
                    "2 tablespoons of mayonnaise\n" +
                    "1/4 cup of chopped celery\n" +
                    "Lettuce and tomato (optional)\n" +
                    "Nutritional Breakdown:\n" +
                    "Calories: Approximately 300-450 kcal\n" +
                    "The calories mainly come from the bread and mayonnaise. Tuna is relatively low in calories.\n" +
                    "Protein: About 25-30 grams\n" +
                    "Tuna is an excellent source of lean protein.\n" +
                    "Carbohydrates: Approximately 30-40 grams\n" +
                    "Mostly from the bread. Whole grain bread also contributes dietary fiber.\n" +
                    "Total Fat: 10-20 grams\n" +
                    "The fat content largely depends on the amount of mayonnaise used. Tuna itself is low in fat, especially if it's canned in water.\n" +
                    "Saturated Fat: Depends on the type of mayonnaise used.\n" +
                    "Fiber: About 4-6 grams\n" +
                    "Provided by the whole grain bread and vegetables.\n" +
                    "Sodium: Can be high due to the canned tuna and mayonnaise.\n" +
                    "Vitamins and Minerals:\n" +
                    "Tuna is a good source of B vitamins, especially B12 and niacin, and minerals like selenium.\n" +
                    "Whole grain bread adds B vitamins and minerals like iron and magnesium.\n" +
                    "Vegetables contribute vitamins like A and C (if tomato is included) and other micronutrients.\n" +
                    "Notes:\n" +
                    "Mayonnaise: It's a significant source of calories and fats. Using low-fat or reduced-calorie mayonnaise can lower the calorie and fat content.\n" +
                    "Bread: Whole grain bread is recommended for additional fiber and nutrients. However, the type of bread used will affect the carbohydrate content.\n" +
                    "Tuna: Canned tuna in water is lower in calories and fat compared to tuna in oil.\n" +
                    "Add-ons: Adding vegetables like lettuce, tomatoes, or cucumbers increases the vitamin, mineral, and fiber content without adding many calories.\n" +
                    "This nutritional overview provides a general idea but can vary. For more accurate nutritional information, it's best to calculate based on the specific brands and quantities of ingredients you use.",
            image = "https://images.saymedia-content.com/.image/t_share/MTc0NjE4Nzc2NzYyMTMyNDI1/tuna-sandwich-recipe.jpg"
        ),
        Food(
            foodId = 4,
            name = "Strawberry Gelato",
            type = "Dessert",
            description = "Description\n\nGelato is a traditional Italian frozen dessert that has delighted palates around the world with its rich flavor and silky, smooth texture. Originating from Italy, gelato is similar to ice cream but with some distinct differences that set it apart:\n" +
                    "\n" +
                    "Texture and Density: Gelato is churned at a slower speed than ice cream, which introduces less air into the mixture. This results in a denser, creamier texture that's more intense in flavor. The smoothness of gelato is one of its signature characteristics.\n" +
                    "\n" +
                    "Fat Content: Traditionally, gelato has a lower fat content compared to regular ice cream. This is because it is usually made with a higher proportion of whole milk to cream, or sometimes with milk only, which enhances the flavors of the primary ingredients.\n" +
                    "\n" +
                    "Serving Temperature: Gelato is typically served at a slightly warmer temperature than ice cream. This softer, more pliable consistency makes it particularly indulgent and allows the flavors to be more pronounced.\n" +
                    "\n" +
                    "Flavors: The flavors of gelato are often bold and natural, reflecting the ingredients used. Classic flavors include vanilla, chocolate, hazelnut, pistachio, and various fruits like strawberry, lemon, and raspberry. Artisan gelato makers frequently experiment with new and unique flavor combinations.\n" +
                    "\n" +
                    "Ingredients: Gelato is made with milk, cream, various sugars, and flavoring such as fresh fruit and nut purees. It generally does not contain egg yolks, which are a common ingredient in many ice cream recipes.\n" +
                    "\n" +
                    "Culinary Art: Making gelato is considered an art form in Italy, with gelatieri (gelato makers) training extensively to perfect their craft. The balance of ingredients, the churning process, and the creativity in flavors all contribute to the uniqueness of each batch.\n" +
                    "\n" +
                    "Gelato offers a delightful eating experience, characterized by its intense flavors and creamy, luxurious texture. Its emphasis on freshness and quality ingredients makes it a favorite among dessert enthusiasts. Whether enjoyed in a cone, a cup, or as part of a more elaborate dessert, gelato is a treat that encapsulates the essence of Italian culinary tradition.",
            recipe = "Ingredients\n\n" +
                    "1 pound (450 grams) fresh strawberries, hulled\n" +
                    "2/3 cup (130 grams) granulated sugar, adjust based on the sweetness of the strawberries\n" +
                    "2/3 cup (160 ml) whole milk\n" +
                    "1/3 cup (80 ml) heavy cream\n" +
                    "1 tablespoon lemon juice\n" +
                    "1 teaspoon pure vanilla extract (optional)\n" +
                    "Instructions\n" +
                    "Prepare the Strawberries:\n" +
                    "\n" +
                    "Puree the strawberries in a blender or food processor.\n" +
                    "Strain the puree through a fine-mesh sieve to remove seeds for a smoother texture (optional).\n" +
                    "Combine Strawberry Puree and Sugar:\n" +
                    "\n" +
                    "Mix the strawberry puree with granulated sugar in a bowl.\n" +
                    "Stir until the sugar is fully dissolved.\n" +
                    "Let the mixture sit for about 15-20 minutes to enhance the flavor.\n" +
                    "Add Milk and Cream:\n" +
                    "\n" +
                    "Add the whole milk and heavy cream to the strawberry and sugar mixture.\n" +
                    "Stir in the lemon juice and vanilla extract.\n" +
                    "Mix everything until well combined.\n" +
                    "Chill the Mixture:\n" +
                    "\n" +
                    "Refrigerate the mixture for at least 2 hours, or until it's completely cold. This step is crucial for a smooth texture.\n" +
                    "Churn the Gelato:\n" +
                    "\n" +
                    "Pour the chilled mixture into an ice cream maker.\n" +
                    "Churn according to the manufacturer’s instructions, usually about 20-30 minutes.\n" +
                    "Freeze to Firm Up:\n" +
                    "\n" +
                    "Transfer the churned gelato to a freezer-safe container.\n" +
                    "Cover it and freeze until it reaches your desired consistency, typically 2-4 hours.\n" +
                    "Serve:\n" +
                    "\n" +
                    "Let the gelato sit at room temperature for a few minutes before serving to soften slightly.\n" +
                    "Serve in bowls or cones, and enjoy!\n" +
                    "Tips\n" +
                    "Quality of Strawberries: The flavor of your gelato heavily depends on the quality of the strawberries. Use ripe, in-season strawberries for the best flavor.\n" +
                    "Sugar Adjustment: Adjust the amount of sugar based on the sweetness of your strawberries and your taste preference.\n" +
                    "No Ice Cream Maker?: If you don’t have an ice cream maker, you can freeze the mixture and whisk or stir it vigorously every 30 minutes until it's frozen to break up ice crystals.\n" +
                    "Serving Suggestions: Garnish with fresh strawberries or mint leaves for an extra touch.\n" +
                    "Enjoy your homemade strawberry gelato, a refreshing and delightful treat perfect for warm days or whenever you crave a sweet, fruity dessert!\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            nutrition ="Nutritional Information\n\nThe nutritional content of homemade strawberry gelato can vary depending on the exact ingredients and their quantities. However, I can provide an estimated nutritional breakdown for a typical serving based on the recipe provided:\n" +
                    "\n" +
                    "Estimated Nutritional Values (per serving, assuming 8 servings):\n" +
                    "Ingredients Used:\n" +
                    "1 pound fresh strawberries\n" +
                    "2/3 cup granulated sugar\n" +
                    "2/3 cup whole milk\n" +
                    "1/3 cup heavy cream\n" +
                    "1 tablespoon lemon juice\n" +
                    "1 teaspoon vanilla extract (optional)\n" +
                    "Nutritional Breakdown (per serving):\n" +
                    "Calories: Approximately 150-200 kcal\n" +
                    "The major sources of calories are sugar and cream.\n" +
                    "Protein: About 1-2 grams\n" +
                    "Mainly from the milk and cream.\n" +
                    "Total Fat: 3-5 grams\n" +
                    "Primarily from the heavy cream. Contains some saturated fat.\n" +
                    "Carbohydrates: 25-30 grams\n" +
                    "Mostly from sugar and natural sugars in strawberries.\n" +
                    "Sugars: 20-25 grams\n" +
                    "Includes both added sugar and natural sugars from strawberries.\n" +
                    "Fiber: 1-2 grams\n" +
                    "Provided by the strawberries.\n" +
                    "Vitamin C: A good amount, contributed by the strawberries.\n" +
                    "Calcium: Small amounts from the milk and cream.\n" +
                    "Notes:\n" +
                    "Serving Size Matters: The nutritional content can vary significantly based on the serving size. Gelato is typically served in smaller portions than ice cream.\n" +
                    "\n" +
                    "Natural vs. Added Sugars: The strawberries contribute natural sugars, while the recipe also includes added granulated sugar. Reducing the added sugar will lower the calorie and sugar content.\n" +
                    "\n" +
                    "Dairy Fat Content: Using lower-fat milk or reducing the amount of heavy cream can decrease the fat content.\n" +
                    "\n" +
                    "Strawberries: They are a good source of antioxidants and vitamins, particularly vitamin C.\n" +
                    "\n" +
                    "No Preservatives or Artificial Flavors: Unlike many store-bought versions, this homemade gelato does not contain preservatives or artificial flavors.\n" +
                    "\n" +
                    "Remember, these values are approximate and can vary. For more accurate nutritional information, it's best to calculate based on the specific brands and quantities of ingredients you use. Homemade gelato can be a healthier option as you can control the ingredients and the amount of sugar and fat.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.pinimg.com%2Foriginals%2F19%2F80%2F67%2F198067196ab289943a1bc569e79ebd99.jpg&f=1&nofb=1&ipt=15595f52a6327196e5d08fb148f608c53b302bb3e0da34d375bef6b14cbbbc83&ipo=images"
        ),
        Food(
            foodId = 5,
            name = "Chickpeas Meatballs (Vegetarian)",
            type = "Lunch",
            description = "Description\n\nChickpea Meatballs are freezer-friendly, kid-approved, and come together in just 20 minutes. Enjoy these vegetarian meatballs with pasta, in a pita, or simply with your favorite dipping sauce.\n" +
                    "Vegetarian Meatless \"Meatballs\" with Spaghetti\n" +
                    "\n" +
                    "WHY YOU'LL LOVE THESE CHICKPEA MEATBALLS\n" +
                    "At first, the thought of meatballs without meat may seem a bit off-putting. However, I can assure you these bean-based balls are every bit as savory, versatile, and satisfying as their beef-based counterparts. And while the main component (chickpeas) may be uncommon, the binders and spices stay true to most classic meatball recipes.\n" +
                    "\n" +
                    "If you're looking to incorporate more plant-based meals into your diet, this recipe is for you. Or, if you're simply looking to expand your cooking repertoire and try something new, you're also in the right place!\n" +
                    "\n" +
                    "These vegetarian meatballs are kid-friendly, omnivore-approved, and come together in just 20 minutes. Enjoy them with pasta, in a sandwich, or simply with your favorite dipping sauce. (My personal favorites are BBQ and honey mustard.)",
            recipe = "Ingredients\n\n" +
                    "While vegetarian meatballs run the gamut in terms of ingredients, these call for many pantry staples:\n" +
                    "\n" +
                    "Canned Chickpeas: The star of this recipe is the humble, yet oh-so-versatile, chickpea. It's important to drain, rinse, and thoroughly dry the chickpeas prior to mixing with the other ingredients. You can either pat them with a towel or leave them out to dry for 20 minutes ahead of time.\n" +
                    "Breadcrumbs: A classic binding and bulking agent in most meatball recipes, breadcrumbs are a necessity here. However if you're allergic or sensitive to gluten, feel free to use almond meal instead.\n" +
                    "Eggs: Another classic binder in most meatball/meatloaf recipes. However if you're making these vegan, you can sub for two flax eggs.\n" +
                    "Nutritional Yeast: All the \"cheesy\", savory flavor without the dairy, nutritional yeast is a major flavor agent here. If you don't have any on hand (or don't need to make the recipe dairy-free), you can use grated Parmesan cheese instead.\n" +
                    "Fresh Parsley: At least in most Italian meatballs, fresh parsley is a must!\n" +
                    "Spices: It's no secret that chickpeas are quite bland on their own. For this reason, this recipe leans HEAVILY on spices to deliver big, bold flavor. For these meatballs, you'll need smoked paprika, Italian seasoning, garlic powder, black pepper, and salt.\n" +
                    "Chickpeas, eggs, parsley, breadcrumbs, and spices in a food processor\n" +
                    "STEP-BY-STEP INSTRUCTIONS\n" +
                    "These chickpea meatballs come together in right around 20 minutes. And as far as equipment, all you need is a food processor and a large skillet. From there, let the meatless magic begin!\n" +
                    "\n" +
                    "STEP 1: COMBINE ALL INGREDIENTS IN A FOOD PROCESSOR.\n" +
                    "This includes the chickpeas, breadcrumbs, eggs, parsley, nutritional yeast (or Parmesan), and spices.\n" +
                    "\n" +
                    "STEP 2: BLEND UNTIL MOSTLY SMOOTH.\n" +
                    "The mixture will be a little coarse, which is perfectly fine. You just want the mixture to be cohesive so you can roll it into balls.Recipe ingredients about to be blended in a food processorStep-by-step collage showing how to blend and roll vegetarian meatballs\n" +
                    "STEP 3: ROLL INTO MEATBALLS.\n" +
                    "Using 1 heaping Tablespoon or a mini cookie dough scoop, roll the mixture into 14 to 16 meatballs.\n" +
                    "\n" +
                    "STEP 4: COOK CHICKPEA MEATBALLS IN A SKILLET.\n" +
                    "Heat 2 Tbsp. of olive oil in a large skillet over medium heat. Once hot, add the chickpea meatballs and cook for 6 to 8 minutes, turning to brown all sides, until golden.\n" +
                    "\n" +
                    "STEP 5: EAT!\n" +
                    "These chickpea meatballs can be enjoyed in so many delicious ways. Read on for a few of my favorites.meatless meatballs being fried in a cast iron skillet\n" +
                    "WHAT TO SERVE WITH CHICKPEA MEATBALLS\n" +
                    "I've included some of my favorite ways to serve these chickpea meatballs below, however they are just as (if not more) versatile than any classic meatball. For example:\n" +
                    "\n" +
                    "Serve with spaghetti and red sauce. You can't get more classic than spaghetti and meatballs, and the Italian flavor of these chickpeas meatballs make for the best alternative.\n" +
                    "Place in a hoagie roll. True story: My all-time favorite sandwich growing up was a meatball sub. I mean, does a heartier, more satisfying sandwich exist?!\n" +
                    "Stuff in a pita: With a smear of hummus and some fresh veggies, these chickpea meatballs are a mighty fine sub for falafel.\n" +
                    "Enjoy as is! Keep it simple and serve these chickpea meatballs with your sides of choice and/or favorite dipping sauce. They're also delicious over a salad to amp up the protein. And since they make a great finger food, toddlers will inevitably love them too.\n" +
                    "HOW TO FREEZE THESE MEATBALLS:\n" +
                    "In case you were wondering, YES, you can absolutely freeze and reheat these vegetarian meatballs.\n" +
                    "\n" +
                    "For best results, let them cool to room temperature before placing in a zip-top freezer bag.\n" +
                    "Before sealing, press down to release as much air from the bag as possible. Next, label and date the bag, if desired, and freeze up to 3 months!\n" +
                    "To reheat, I prefer to place them in the oven (or toaster oven) and bake at 325°F for about 20 minutes, or until heated through. This method is much preferred over microwaving because it helps salvage their crispy exterior.\n" +
                    "Chickpea meatballs on a plate of spaghetti with a fork",
            nutrition ="Nutritional Information\n\n" +
                    "The nutritional content of vegetarian chickpea meatballs can vary based on the specific ingredients and recipe used, but I can provide a general overview based on common ingredients included in such a recipe.\n" +
                    "\n" +
                    "Typical Ingredients for Vegetarian Chickpea Meatballs:\n" +
                    "Chickpeas (cooked or canned)\n" +
                    "Breadcrumbs or oat flour\n" +
                    "Olive oil\n" +
                    "Onion\n" +
                    "Garlic\n" +
                    "Herbs and spices (such as parsley, basil, cumin, salt, and pepper)\n" +
                    "Egg or a vegan binding alternative (like flaxseed meal)\n" +
                    "Estimated Nutritional Values (Per Serving, Assuming 4 Servings in Total):\n" +
                    "Nutritional Breakdown:\n" +
                    "Calories: Approximately 200-300 kcal per serving\n" +
                    "The primary source of calories is chickpeas and breadcrumbs or oat flour.\n" +
                    "Protein: About 8-12 grams\n" +
                    "Chickpeas are a good source of plant-based protein.\n" +
                    "Total Fat: 5-10 grams\n" +
                    "Mostly from olive oil; the amount may vary based on the recipe.\n" +
                    "Carbohydrates: 30-40 grams\n" +
                    "Primarily from chickpeas and breadcrumbs or oat flour.\n" +
                    "Fiber: 6-10 grams\n" +
                    "Chickpeas are high in dietary fiber.\n" +
                    "Sodium: Varies based on added salt and seasonings.\n" +
                    "Vitamins and Minerals:\n" +
                    "Chickpeas are a good source of folate, iron, magnesium, and B vitamins.\n" +
                    "Herbs, onions, and garlic provide additional nutrients and antioxidants.\n" +
                    "Notes:\n" +
                    "Binding Agents: The use of egg versus a vegan alternative can slightly alter the protein and fat content.\n" +
                    "Breadcrumbs vs. Oat Flour: Using whole grain breadcrumbs or oat flour can increase fiber content and provide more nutrients compared to refined breadcrumbs.\n" +
                    "Cooking Method: If you fry the meatballs in oil, it will increase the fat content; baking them is a healthier option with less added fat.\n" +
                    "Serving Size: Nutritional content will depend on the size and number of meatballs you make from the mixture.\n" +
                    "Sauces and Accompaniments: The nutritional profile can change based on what you serve with the meatballs, such as pasta, sauce, or vegetables.\n" +
                    "These vegetarian chickpea meatballs are a nutritious and satisfying option, offering a good balance of protein, fiber, and healthy fats. They are a great alternative to traditional meat-based meatballs, especially for those following a vegetarian or plant-based diet.",
            image = "https://dishingouthealth.com/wp-content/uploads/2020/03/ChickpeaMeatballs6.jpg"
        ),
        Food(
            foodId = 6,
            name = "Halal Chicken Biryani",
            type = "Dinner",
            description = "Description\n\nHalal Chicken Biryani is a rich, aromatic, and flavorful dish that holds a special place in South Asian cuisine. This dish is particularly noted for its adherence to halal dietary standards, which means that the chicken used in the biryani is prepared according to Islamic law. Here’s a more detailed description:\n" +
                    "\n" +
                    "Ingredients and Flavors: Halal Chicken Biryani is made with a variety of spices and ingredients that contribute to its unique flavor profile. Key spices typically include cumin, coriander, turmeric, garam masala, and sometimes saffron, giving the dish its characteristic warmth and depth. Fresh ingredients like onions, garlic, and ginger add another layer of flavor. The chicken, marinated in a mixture of yogurt and spices, becomes tender and infused with the spices.\n" +
                    "\n" +
                    "Rice: The dish uses long-grain basmati rice known for its fragrance and ability to stay fluffy and separate when cooked. The rice is often parboiled and then layered with the marinated chicken.\n" +
                    "\n" +
                    "Cooking Technique: Biryani is usually cooked using a method called 'Dum', where the dish is slowly cooked in a sealed pot (often sealed with dough) to allow the steam and flavors to infuse the rice and chicken.\n" +
                    "\n" +
                    "Presentation and Texture: The dish is often garnished with fried onions, chopped cilantro, mint, and sometimes nuts and raisins. The rice in biryani is fluffy, non-greasy, and each grain should stand out. The chicken pieces are tender and richly flavored.\n" +
                    "\n" +
                    "Aromatic Experience: One of the most remarkable aspects of Chicken Biryani is its aroma, which comes from the blend of spices, the fragrance of basmati rice, and the use of ingredients like rose water or kewra water in some recipes.\n" +
                    "\n" +
                    "Cultural Significance: Chicken Biryani is not just a meal; it’s a celebration of culture and tradition, often served during special occasions, festivals, and gatherings.\n" +
                    "\n" +
                    "Variations: There are many regional variations of biryani across South Asia, each with its unique twist, depending on the local flavors and ingredients available.\n" +
                    "\n" +
                    "Halal Chicken Biryani is appreciated not only for its delicious taste but also for its inviting appearance and aroma. It’s a dish that brings people together and represents a fusion of culinary art, tradition, and cultural heritage.",
            recipe = "Making Halal Chicken Biryani involves a blend of aromatic spices, tender chicken, and fragrant basmati rice, resulting in a rich and flavorful dish. Here's a recipe to guide you:\n" +
                    "\n" +
                    "Ingredients\n\n" +
                    "For the Chicken Marinade:\n" +
                    "\n" +
                    "2 pounds (about 1 kg) chicken, cut into pieces (ensure it's halal-certified)\n" +
                    "1 cup yogurt\n" +
                    "2 tablespoons ginger-garlic paste\n" +
                    "2 teaspoons red chili powder\n" +
                    "1 teaspoon turmeric powder\n" +
                    "2 teaspoons garam masala powder\n" +
                    "Salt to taste\n" +
                    "Juice of one lemon\n" +
                    "A handful of chopped cilantro (coriander) and mint leaves\n" +
                    "For the Rice:\n" +
                    "\n" +
                    "2 cups basmati rice\n" +
                    "4 cups water\n" +
                    "2-3 bay leaves\n" +
                    "4-5 cloves\n" +
                    "2-3 green cardamom pods\n" +
                    "1 cinnamon stick\n" +
                    "Salt to taste\n" +
                    "For the Biryani:\n" +
                    "\n" +
                    "2 large onions, thinly sliced\n" +
                    "2 tomatoes, chopped\n" +
                    "1/4 cup cooking oil or ghee\n" +
                    "1 teaspoon cumin seeds\n" +
                    "1 star anise\n" +
                    "4-5 green cardamom pods\n" +
                    "2-3 bay leaves\n" +
                    "4-5 cloves\n" +
                    "1 cinnamon stick\n" +
                    "1/2 cup warm milk\n" +
                    "A few strands of saffron (optional)\n" +
                    "Additional chopped cilantro and mint leaves\n" +
                    "Fried onions for garnishing (optional)\n" +
                    "Instructions\n" +
                    "Marinate the Chicken:\n" +
                    "\n" +
                    "Combine the yogurt, ginger-garlic paste, red chili powder, turmeric, garam masala, salt, lemon juice, cilantro, and mint in a bowl.\n" +
                    "Add the chicken pieces and mix well to coat. Marinate for at least 2 hours, preferably overnight, in the refrigerator.\n" +
                    "Cook the Rice:\n" +
                    "\n" +
                    "Rinse the basmati rice until the water runs clear. Soak it in water for 30 minutes, then drain.\n" +
                    "Boil water with bay leaves, cloves, cardamom, cinnamon, and salt.\n" +
                    "Add the rice and cook until it's 70% done (partially cooked). Drain and set aside.\n" +
                    "Prepare the Biryani:\n" +
                    "\n" +
                    "In a large pot, heat the oil or ghee. Add cumin seeds, star anise, cardamom, bay leaves, cloves, and cinnamon.\n" +
                    "Add sliced onions and fry until golden brown. Set aside some fried onions for garnishing.\n" +
                    "Add the marinated chicken to the pot. Cook until the chicken is tender and the oil begins to separate.\n" +
                    "Add chopped tomatoes and cook until they are soft.\n" +
                    "Layer the Biryani:\n" +
                    "\n" +
                    "On the chicken, spread an even layer of the partially cooked rice.\n" +
                    "Sprinkle the top with saffron-infused milk, fried onions, and additional chopped cilantro and mint.\n" +
                    "Cook on Dum (Steam):\n" +
                    "\n" +
                    "Seal the pot with a tight lid or aluminum foil. Cook on a very low heat for about 25-30 minutes. This allows the flavors to infuse.\n" +
                    "Serve:\n" +
                    "\n" +
                    "Gently mix the biryani before serving.\n" +
                    "Serve hot with raita (yogurt sauce) or salad.\n" +
                    "Tips\n" +
                    "Quality of Ingredients: Use fresh, high-quality spices for the best flavor.\n" +
                    "Marination Time: Longer marination results in more flavorful and tender chicken.\n" +
                    "Rice Texture: Be careful not to overcook the rice in the initial boiling. It should be only 70% cooked as it will continue to cook with the chicken.\n" +
                    "Enjoy your homemade Halal Chicken Biryani, a dish rich in flavors and tradition!\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            nutrition ="Nutritional Information\n\n" +
                    "The nutritional content of Halal Chicken Biryani can vary depending on the specific recipe used, the cooking method, and portion sizes. However, I can provide a general overview of the nutritional value for a typical serving:\n" +
                    "\n" +
                    "Typical Ingredients for Halal Chicken Biryani:\n" +
                    "Chicken (halal-certified)\n" +
                    "Basmati rice\n" +
                    "Cooking oil or ghee\n" +
                    "Yogurt\n" +
                    "Onions, tomatoes, and various spices (such as ginger, garlic, turmeric, chili, garam masala)\n" +
                    "Optional additions like saffron, fried onions, cilantro, and mint\n" +
                    "Estimated Nutritional Values (Per Serving):\n" +
                    "Calories: Approximately 400-600 kcal per serving\n" +
                    "The major sources of calories are chicken, rice, and cooking oil or ghee.\n" +
                    "Protein: About 25-35 grams\n" +
                    "Provided by the chicken and yogurt.\n" +
                    "Total Fat: 10-20 grams\n" +
                    "Depending on the amount of oil or ghee used. Chicken, especially if it includes skin, also contributes fat.\n" +
                    "Carbohydrates: 50-70 grams\n" +
                    "Primarily from the rice. The amount can vary based on the rice-to-chicken ratio.\n" +
                    "Fiber: 2-5 grams\n" +
                    "From the vegetables and spices used.\n" +
                    "Sodium: Can be high due to added salt and the sodium content of certain spices and seasonings.\n" +
                    "Vitamins and Minerals:\n" +
                    "Chicken is a good source of B vitamins, especially niacin and B6.\n" +
                    "Spices and herbs contribute various micronutrients and antioxidants.\n" +
                    "Yogurt adds calcium and probiotics.\n" +
                    "Notes:\n" +
                    "Portion Size: Nutritional content will depend on the serving size. Biryani can be high in calories, so portion control is key.\n" +
                    "Preparation Variations: The use of oil or ghee and the method of cooking (like frying onions) can significantly affect the fat content.\n" +
                    "Healthier Alternatives: Using less oil or ghee and skinless chicken can reduce the fat content. Increasing the proportion of vegetables can add fiber and nutrients.\n" +
                    "This nutritional overview provides a basic idea but can vary based on your recipe and cooking method. Halal Chicken Biryani is a flavorful and satisfying dish, and by adjusting ingredients and portion sizes, it can fit into a balanced diet.",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.4zSFQ2szaggy9aOuksyDjwHaE1%26pid%3DApi&f=1&ipt=f625fdb64812d5f5c4148edfb3b2a5f192e4adfe46852e2f8aab6fd459ef9e56&ipo=images"
        ),
        Food(
            foodId = 7,
            name = "Chicken with Sweet Potatoes and Kale",
            type = "Dinner",
            description = "Description\n\nPan-fried chicken with sweet potatoes and kale is a wholesome, balanced meal that brings together the juicy, tender flavors of chicken with the earthy sweetness of sweet potatoes and the nutrient-rich profile of kale. This dish is a symphony of textures and flavors - the chicken is typically seasoned and pan-fried to a golden-brown perfection, offering a slightly crispy exterior with a moist, flavorful interior. Sweet potatoes, with their natural sweetness, provide a delightful contrast, especially when they're caramelized to enhance their flavor. Kale, known for its slightly bitter and peppery taste, rounds out the dish with its leafy texture, especially when it's sautéed until just wilted, maintaining a bit of its crunch. This meal is not only satisfying to the palate but also visually appealing with its vibrant colors.",
            recipe = "Ingredients\n\n" +
                    "For the Chicken:\n" +
                    "\n" +
                    "4 boneless, skinless chicken breasts\n" +
                    "Salt and pepper, to taste\n" +
                    "2 tablespoons olive oil\n" +
                    "1 teaspoon garlic powder\n" +
                    "1 teaspoon paprika (optional)\n" +
                    "For the Sweet Potatoes:\n" +
                    "\n" +
                    "2 large sweet potatoes, peeled and cubed\n" +
                    "2 tablespoons olive oil\n" +
                    "Salt and pepper, to taste\n" +
                    "1/2 teaspoon ground cinnamon (optional)\n" +
                    "For the Kale:\n" +
                    "\n" +
                    "1 bunch of kale, washed and chopped\n" +
                    "2 cloves garlic, minced\n" +
                    "2 tablespoons olive oil\n" +
                    "Salt and pepper, to taste\n" +
                    "Lemon juice or balsamic vinegar (optional, for dressing)\n" +
                    "Instructions\n" +
                    "Chicken:\n" +
                    "\n" +
                    "Season the chicken breasts with salt, pepper, garlic powder, and paprika.\n" +
                    "Heat olive oil in a large skillet over medium-high heat.\n" +
                    "Add the chicken breasts and cook for about 5-7 minutes on each side, or until golden brown and cooked through (internal temperature of 165°F or 75°C).\n" +
                    "Remove from the skillet and set aside to rest.\n" +
                    "Sweet Potatoes:\n" +
                    "\n" +
                    "In a separate pan, heat olive oil over medium heat.\n" +
                    "Add the cubed sweet potatoes. Season with salt, pepper, and cinnamon.\n" +
                    "Cook, occasionally stirring, until the sweet potatoes are tender and slightly caramelized, about 15-20 minutes.\n" +
                    "Kale:\n" +
                    "\n" +
                    "In the same skillet used for chicken (for added flavor), heat olive oil over medium heat.\n" +
                    "Add minced garlic and sauté for about 1 minute.\n" +
                    "Add the chopped kale, season with salt and pepper, and cook until the kale is wilted and tender, about 5-10 minutes. If desired, add a splash of lemon juice or balsamic vinegar for extra flavor.\n" +
                    "To Serve:\n" +
                    "Slice the chicken breasts and serve them alongside the sweet potatoes and sautéed kale.\n" +
                    "You can garnish with fresh herbs like parsley or thyme if desired.\n" +
                    "This meal is not only flavorful but also provides a good balance of protein, healthy fats, and vital nutrients from the vegetables. You can adjust the seasoning according to your taste preferences or add additional herbs and spices as desired.",
            nutrition ="Nutritional Information\n\nA dish of pan-fried chicken with sweet potatoes and kale offers a nutritionally rich and balanced meal. The exact nutritional content can vary based on the specific ingredients used and the cooking methods, but here's a general overview of the nutritional value for a typical serving:\n" +
                    "\n" +
                    "Nutritional Breakdown (per serving)\n" +
                    "Chicken Breast (pan-fried, 4 oz or 113 grams):\n" +
                    "Calories: Approximately 185 kcal\n" +
                    "Protein: About 35 grams\n" +
                    "Total Fat: 4 grams\n" +
                    "Saturated Fat: 1 gram\n" +
                    "Carbohydrates: 0 grams\n" +
                    "Fiber: 0 grams\n" +
                    "Cholesterol: 85 mg\n" +
                    "Sodium: Varies based on seasoning\n" +
                    "Sweet Potato (1 medium, approximately 150 grams, cooked):\n" +
                    "Calories: Approximately 100 kcal\n" +
                    "Protein: 2 grams\n" +
                    "Total Fat: 0.2 grams\n" +
                    "Carbohydrates: 23 grams\n" +
                    "Sugars: 7 grams\n" +
                    "Fiber: 4 grams\n" +
                    "Vitamins: High in Vitamin A, Vitamin C, and several B vitamins\n" +
                    "Minerals: Good source of Potassium and Manganese\n" +
                    "Kale (1 cup, cooked, approximately 67 grams):\n" +
                    "Calories: Approximately 36 kcal\n" +
                    "Protein: 2.5 grams\n" +
                    "Total Fat: 0.5 grams\n" +
                    "Carbohydrates: 7 grams\n" +
                    "Sugars: 0 grams\n" +
                    "Fiber: 3 grams\n" +
                    "Vitamins: Very high in Vitamins K, A, and C\n" +
                    "Minerals: Good source of Calcium, Potassium, and Manganese\n" +
                    "Combined Nutritional Estimate (for the entire meal):\n" +
                    "Calories: Approximately 320-330 kcal\n" +
                    "Protein: Around 40 grams\n" +
                    "Total Fat: 4.7 grams\n" +
                    "Carbohydrates: About 30 grams\n" +
                    "Fiber: Around 7 grams\n" +
                    "Vitamins and Minerals: Rich in Vitamins A, C, K, B vitamins, Potassium, Manganese, and Calcium\n" +
                    "Nutritional Highlights:\n" +
                    "High Protein: Beneficial for muscle repair, growth, and satiety.\n" +
                    "Rich in Vitamins and Minerals: Particularly vitamins A, C, K, and minerals like potassium.\n" +
                    "Good Source of Fiber: Essential for digestive health.\n" +
                    "Low in Saturated Fat and Cholesterol: Heart-healthy choice.\n" +
                    "Balanced Meal: Offers a good mix of protein, healthy carbs, and fiber.\n" +
                    "This meal is ideal for those looking for a balanced diet, offering a great combination of macronutrients and essential micronutrients. The sweet potatoes add healthy carbs and fiber, while the kale contributes additional fiber and a wide array of vitamins and minerals. It's a wholesome choice for an everyday meal that supports overall health and well-being.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            image = "https://www.primaverakitchen.com/wp-content/uploads/2017/01/Sweet-Potato-Chicken-Kale-Skillet-Primavera-Kitchen-1.jpg"
        ),
        Food(
            foodId = 8,
            name = "Oatmeal with Blueberries and Banana",
            type = "Breakfast",
            description = "Description\n\nOatmeal with blueberries and bananas is a nutritious and delicious breakfast option that combines the wholesome goodness of oats with the natural sweetness and health benefits of fruits. Here’s a detailed description:\n" +
                    "\n" +
                    "Base Ingredient - Oatmeal: Oatmeal serves as the hearty and filling base. Made from rolled or steel-cut oats, it has a soft, creamy texture when cooked. Oats are well-regarded for their health benefits, including high dietary fiber content, which aids in digestion and helps maintain steady blood sugar levels. They are also a good source of protein and contain various vitamins and minerals.\n" +
                    "\n" +
                    "Blueberries: Blueberries add a burst of sweet and tangy flavor to the dish, along with a lovely pop of color. These small but mighty fruits are packed with antioxidants, particularly flavonoids, which are known for their anti-inflammatory and heart health benefits. Blueberries also provide additional fiber, vitamins (like Vitamin C and K), and minerals.\n" +
                    "\n" +
                    "Bananas: Slices of banana in the oatmeal offer a creamy, naturally sweet element. Bananas are an excellent source of potassium, an essential mineral for heart health and blood pressure regulation. They also contain Vitamin B6 and additional dietary fiber.\n" +
                    "\n" +
                    "Flavor and Texture: The combination of oatmeal's earthiness, the tartness of blueberries, and the creamy sweetness of bananas creates a well-rounded flavor profile. The varying textures from the chewy oats, juicy blueberries, and soft bananas make each bite interesting and satisfying.\n" +
                    "\n" +
                    "Customization and Additions: This oatmeal dish can be easily customized with various toppings and sweeteners. Common additions include a drizzle of honey or maple syrup, a sprinkle of cinnamon, nuts for crunch, or a dollop of yogurt for extra creaminess.\n" +
                    "\n" +
                    "Health-Conscious Choice: This dish is often chosen for its health benefits. It's rich in nutrients, high in fiber, can be made with little to no added sugar, and is filling without being overly calorie-dense. It's also versatile enough to fit into many diet plans, including vegetarian and whole foods diets.\n" +
                    "\n" +
                    "Oatmeal with blueberries and bananas is not just a healthy breakfast option; it’s also comfort food for many. It’s easy to prepare, can be made in various ways (from stovetop cooking to overnight oats), and is a wonderful start to the day, providing sustained energy and essential nutrients.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            recipe = "Oatmeal with blueberries and banana is a nourishing and delightful breakfast that's both easy to make and delicious. Here's a simple recipe to get you started:\n" +
                    "\n" +
                    "Ingredients\n\n" +
                    "1 cup rolled oats (use gluten-free oats if necessary)\n" +
                    "2 cups water or milk (dairy or plant-based)\n" +
                    "1 ripe banana, sliced\n" +
                    "1/2 cup fresh or frozen blueberries\n" +
                    "Honey or maple syrup, to taste (optional)\n" +
                    "A pinch of salt\n" +
                    "1/2 teaspoon ground cinnamon (optional)\n" +
                    "Toppings: Additional blueberries, banana slices, nuts, seeds, yogurt, or nut butter\n" +
                    "Instructions\n" +
                    "Cook the Oatmeal:\n" +
                    "\n" +
                    "In a medium saucepan, bring the water or milk to a boil.\n" +
                    "Add the oats and a pinch of salt, then reduce the heat to a simmer.\n" +
                    "Cook the oats, stirring occasionally, for about 5-10 minutes (depending on whether you're using quick oats or old-fashioned oats). For a creamier texture, cook for a few more minutes.\n" +
                    "Mash the Banana:\n" +
                    "\n" +
                    "While the oats are cooking, take half of the sliced banana and mash it with a fork.\n" +
                    "Combine Banana and Oatmeal:\n" +
                    "\n" +
                    "Stir the mashed banana and ground cinnamon (if using) into the cooking oatmeal. This will give your oatmeal a natural sweetness and creamy texture.\n" +
                    "Add Blueberries:\n" +
                    "\n" +
                    "A couple of minutes before the oatmeal is done, add the blueberries. If using frozen blueberries, adding them earlier will help them warm through and turn the oatmeal a lovely purple color.\n" +
                    "Sweeten (Optional):\n" +
                    "\n" +
                    "If desired, sweeten your oatmeal with a drizzle of honey or maple syrup.\n" +
                    "Serve:\n" +
                    "\n" +
                    "Once the oatmeal is cooked to your liking, remove it from the heat.\n" +
                    "Serve the oatmeal in bowls, and top it with the remaining banana slices, additional blueberries, and any other toppings you like such as nuts, seeds, a dollop of yogurt, or a spoonful of nut butter.\n" +
                    "Enjoy:\n" +
                    "\n" +
                    "Enjoy your warm, comforting bowl of oatmeal, perfect for a nutritious and satisfying start to the day.\n" +
                    "Tips\n" +
                    "Consistency Adjustments: Adjust the amount of liquid depending on how thick or thin you prefer your oatmeal.\n" +
                    "Overnight Oats Variation: For a no-cook version, combine the oats, milk, mashed banana, and blueberries in a jar and let them sit in the refrigerator overnight. In the morning, add your toppings and enjoy.\n" +
                    "Nutritional Boost: Add a scoop of protein powder or ground flaxseeds for extra protein and omega-3 fatty acids.\n" +
                    "This recipe is simple, versatile, and can be adapted to suit different dietary needs and preferences. It's a wholesome, heart-healthy breakfast option that provides energy and essential nutrients.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            nutrition ="Nutritional Information\n\nThe nutritional content of oatmeal with blueberries and banana can vary depending on the specific ingredients and quantities used. However, I can provide an estimated nutritional breakdown for a typical serving based on the standard recipe:\n" +
                    "\n" +
                    "Ingredients for the Estimation:\n" +
                    "1 cup of cooked rolled oats (made with water)\n" +
                    "1 medium banana\n" +
                    "1/2 cup of blueberries\n" +
                    "Optional ingredients like honey, nuts, or milk will change the nutritional profile\n" +
                    "Estimated Nutritional Values (Per Serving):\n" +
                    "Calories: Approximately 300-400 kcal\n" +
                    "Oats are a primary source of calories, along with the natural sugars in the banana and blueberries.\n" +
                    "Protein: 6-10 grams\n" +
                    "Oats provide a decent amount of protein, and this can be increased with milk or nuts.\n" +
                    "Total Fat: 2-5 grams\n" +
                    "Oats contain a small amount of fat, and additional toppings like nuts or nut butter can increase this.\n" +
                    "Carbohydrates: 60-80 grams\n" +
                    "Primarily from oats, banana, and blueberries. This includes dietary fiber and natural sugars.\n" +
                    "Fiber: 7-10 grams\n" +
                    "Both oats and fruits (especially the banana) are good sources of dietary fiber.\n" +
                    "Sugars: 15-25 grams\n" +
                    "Natural sugars from the banana and blueberries.\n" +
                    "Vitamins and Minerals:\n" +
                    "Bananas are a good source of potassium and Vitamin B6.\n" +
                    "Blueberries are rich in Vitamin C and antioxidants.\n" +
                    "Oats provide iron, magnesium, and B vitamins.\n" +
                    "Notes:\n" +
                    "Customization: If you add ingredients like honey, the sugar and calorie content will increase. Using milk instead of water will add protein and calcium but also increase calories and fat, especially if using whole milk.\n" +
                    "\n" +
                    "Health Benefits: This meal is beneficial for its high fiber content, which aids in digestion and sustained energy release. The fruits add vitamins and antioxidants, supporting overall health.\n" +
                    "\n" +
                    "Serving Size: The nutritional content can vary significantly based on the serving size and the specific type of ingredients used (such as type of oats, additional sweeteners, etc.).\n" +
                    "\n" +
                    "This breakfast option is not only nutritious but also provides a good balance of macronutrients and essential micronutrients, making it a wholesome choice for starting the day.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.7DNAjJdGvX5ZAv1OO6UF7wHaHa%26pid%3DApi&f=1&ipt=fd9930a9a93f25ab8783baecd9416f18dd3dbd597f74b10bca130c4e0a076853&ipo=images"
        ),
        Food(
            foodId = 9,
            name = "Croissant with Egg and Cheese",
            type = "Breakfast",
            description = "Description\n\nCroissant with egg and cheese is a luxurious and satisfying breakfast or brunch option that combines the flakiness of a buttery croissant with the richness of eggs and the meltiness of cheese. This dish features:\n" +
                    "\n" +
                    "Croissant: A light, flaky, buttery pastry known for its layered texture and golden-brown crust. The croissant's airy and tender interior contrasts beautifully with its crisp exterior.\n" +
                    "Eggs: Typically scrambled or fried, eggs add a creamy, savory component to the sandwich. They are a good source of high-quality protein and can be cooked to individual preference.\n" +
                    "Cheese: Cheese adds a gooey, creamy texture and a depth of flavor. Common choices include cheddar, Swiss, or Gruyère, each contributing its unique taste.\n" +
                    "Additional Fillings: Optional additions might include ham, bacon, spinach, or tomatoes, allowing for customization based on personal taste preferences.\n" +
                    "This combination makes for a rich and indulgent sandwich that's both comforting and satiating, perfect for a leisurely morning or a quick on-the-go breakfast.\n" +
                    "\n" +
                    "",
            recipe = "Recipe for Croissant with Egg and Cheese\n" +
                    "Ingredients\n\n" +
                    "2 croissants, sliced in half\n" +
                    "4 large eggs\n" +
                    "2 slices of cheese (cheddar, Swiss, or your choice)\n" +
                    "Salt and pepper, to taste\n" +
                    "Butter or oil, for cooking\n" +
                    "Optional: Ham, bacon, spinach, or tomato slices\n" +
                    "Instructions\n" +
                    "Cook the Eggs:\n" +
                    "\n" +
                    "Heat a non-stick skillet over medium heat and add a small amount of butter or oil.\n" +
                    "Beat the eggs in a bowl and season with salt and pepper. Pour into the skillet.\n" +
                    "Cook the eggs, stirring frequently, until they are scrambled and just set. Remove from heat.\n" +
                    "Assemble the Sandwiches:\n" +
                    "\n" +
                    "Place a slice of cheese on the bottom half of each croissant.\n" +
                    "If using additional fillings like ham or bacon, add them on top of the cheese.\n" +
                    "Divide the cooked eggs between the two croissants, placing them on top of the cheese.\n" +
                    "Finish and Serve:\n" +
                    "\n" +
                    "Top with the other half of the croissant.\n" +
                    "Serve immediately while warm and enjoy!",
            nutrition ="Nutritional Information\n" +
                    "Per Sandwich (basic version with egg and cheese):\n" +
                    "\n" +
                    "Calories: Approximately 400-500 kcal\n" +
                    "Protein: 15-20 grams\n" +
                    "Total Fat: 25-35 grams\n" +
                    "High in saturated fat due to the buttery croissant and cheese.\n" +
                    "Carbohydrates: 30-40 grams\n" +
                    "Mostly from the croissant.\n" +
                    "Fiber: 1-2 grams\n" +
                    "Cholesterol and Sodium: Can be high due to the eggs, cheese, and croissant.\n" +
                    "Note: Adding ingredients like bacon or ham will increase the protein, fat, and sodium content. The nutritional values can vary based on the size of the croissant and the types of cheese and eggs used.\n" +
                    "\n" +
                    "This meal is indulgent and should be enjoyed in moderation as part of a balanced diet, especially if you are mindful of fat and cholesterol intake.",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftornadoughalli.com%2Fwp-content%2Fuploads%2F2019%2F03%2FBREAKFAST-SANDWICHES4.jpg&f=1&nofb=1&ipt=d376d7a20cf798bb3f7f9a691d1798ceb5cf51f797eb8ffb465890f6df7c549c&ipo=images"
        ),
        Food(
            foodId = 10,
            name = "BLT (Bacon, Lettuce, and Tomato)",
            type = "Lunch",
            description = "Description\n\n" +
                    "A BLT is a classic sandwich that features the simple yet delightful combination of bacon, lettuce, and tomato. It's a popular choice for its satisfying texture and balance of flavors:\n" +
                    "\n" +
                    "Bacon: Crispy and savory, bacon adds a rich, smoky flavor and a satisfying crunch. It's typically pan-fried until golden and crispy.\n" +
                    "Lettuce: Fresh lettuce, often iceberg or romaine, adds a cool and crunchy contrast to the warm bacon. It contributes a light, fresh taste.\n" +
                    "Tomato: Juicy and slightly acidic, tomato slices add moisture and a sweet-tangy flavor that complements the bacon.\n" +
                    "Bread: The sandwich is usually made with toasted bread, which provides a sturdy base and a toasty flavor. White, whole wheat, or sourdough are common choices.\n" +
                    "Mayonnaise: A spread of mayonnaise on the bread adds a creamy texture and slightly tangy flavor, balancing the richness of the bacon.\n" +
                    "The BLT is appreciated for its straightforward yet satisfying combination of textures and flavors, making it a perennial favorite for a quick lunch or casual meal.",
            recipe = "Ingredients\n\n" +
                    "4 slices of bacon\n" +
                    "2 slices of bread (white, whole wheat, or sourdough)\n" +
                    "2-3 lettuce leaves (iceberg or romaine)\n" +
                    "2-3 slices of tomato\n" +
                    "1-2 tablespoons mayonnaise\n" +
                    "Salt and pepper, to taste\n" +
                    "Instructions\n" +
                    "Cook the Bacon:\n" +
                    "\n" +
                    "In a skillet over medium heat, cook the bacon until crispy, about 3-4 minutes per side. Drain on paper towels.\n" +
                    "Toast the Bread:\n" +
                    "\n" +
                    "Toast the bread slices to your desired level of crispiness.\n" +
                    "Assemble the Sandwich:\n" +
                    "\n" +
                    "Spread mayonnaise on one side of each toast slice.\n" +
                    "Place lettuce leaves on one slice of bread.\n" +
                    "Add tomato slices on top of the lettuce. Season tomatoes with a pinch of salt and pepper.\n" +
                    "Place the cooked bacon on top of the tomato slices.\n" +
                    "Top with the second slice of bread, mayonnaise side down.\n" +
                    "Serve:\n" +
                    "\n" +
                    "Cut the sandwich in half and serve immediately.",
            nutrition = "Nutritional Information (Per Sandwich)\n\n" +
                    "Calories: Approximately 350-450 kcal\n" +
                    "Protein: 15-20 grams (from bacon and bread)\n" +
                    "Total Fat: 20-30 grams\n" +
                    "Saturated Fat: High, mainly from bacon\n" +
                    "Carbohydrates: 25-35 grams\n" +
                    "Fiber: 2-4 grams (from whole wheat bread and vegetables)\n" +
                    "Sodium: High, primarily from bacon and bread\n" +
                    "Cholesterol: Moderate to high, from bacon and mayonnaise\n" +
                    "Note: Nutritional content can vary based on the type of bread used, the amount of mayonnaise, and the thickness of the bacon. Opting for whole grain bread, light mayonnaise, and reducing the bacon can make it a healthier option.\n" +
                    "\n" +
                    "The BLT sandwich offers a good mix of protein, carbohydrates, and fat, making it a filling meal. However, it's relatively high in sodium and saturated fat, so it's best enjoyed as an occasional treat rather than a daily diet staple.",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.zu6vozF3IWo2LqrL__elnQHaE8%26pid%3DApi&f=1&ipt=f0e3ecd625dc1fc469495660e8bf26b8dfa408b02454e64cfe1849be0c177da3&ipo=images"
        ),
        Food(
            foodId = 11,
            name = "Chewy Fruit and Nut Bars",
            type = "Dessert",
            description = "Description\n\nThese homemade bars make great snacks, and they can be made with whatever nuts and dried fruits you have on hand. You can assemble them in minutes and walk away while they set in the refrigerator—no baking required!",
            recipe = "Ingredients:\n\n" +
                    "1 tsp. plus 2 Tbs. unsalted butter\n" +
                    "1 1/2 cups (6 oz./185 g) puffed brown rice cereal\n" +
                    "1 cup (4 oz./125 g) whole almonds\n" +
                    "1/2 cup (3 oz./90 g) whole cashews\n" +
                    "1 cup (4 oz./125 g) dried cranberries\n" +
                    "1/2 cup (3 oz./90 g) chopped dried apricots\n" +
                    "1/2 cup (5 oz./155 g) brown rice syrup\n" +
                    "1/4 cup (2 1/2 oz./75 g) unsalted creamy almond butter\n" +
                    "2 Tbs. firmly packed light brown sugar\n" +
                    "1/4 tsp. salt\n" +
                    "Directions:\n\n" +
                    "Line an 8-inch (20-cm) square baking pan with aluminum foil, leaving about 1 inch (2.5 cm) of overhang on 2 opposite edges to use later as a handle. Grease the foil with the 1 tsp. butter.\n" +
                    "\n" +
                    "In a large bowl, stir together the brown rice cereal, almonds, cashews, cranberries and apricots. Set aside.\n" +
                    "\n" +
                    "In a saucepan over medium heat, stir or whisk together the brown rice syrup, almond butter, brown sugar, the 2 Tbs. butter and the salt until the mixture is smooth. Bring to a simmer and cook for 1 minute, stirring constantly to prevent scorching.\n" +
                    "\n" +
                    "Immediately pour the hot almond-butter mixture over the cereal mixture in the bowl. Using a wooden spoon, stir until the cereal, fruit and nuts are evenly coated and distributed.\n" +
                    "\n" +
                    "With lightly buttered hands, press the mixture firmly and evenly into the prepared pan. Refrigerate until set, about 1 hour. Lift out of the pan and transfer to a cutting board. Use a sharp buttered knife to cut into 20 small bars, then remove from the foil. Store the bars in the refrigerator in an airtight container, with sheets of waxed paper between the layers, for up to 1 week. Makes 20 bars.\n" +
                    "\n" +
                    "Adapted from Williams-Sonoma Healthy in a Hurry, by Karen Ansel, MS, RD and Charity Ferreira (Weldon Owen, 2011).",
            nutrition ="Nutritional information\n\nEstimated Nutritional Values (Per Bar):\n\n" +

                    "Per Bar (1/20th of Total Recipe):\n\n" +
                    "Calories: Approximately 150-200 kcal\n" +
                    "The main sources are nuts, dried fruit, and brown rice syrup.\n" +
                    "Protein: 3-5 grams\n" +
                    "Mostly from almonds and cashews.\n" +
                    "Total Fat: 7-10 grams\n" +
                    "Primarily from almonds, cashews, and almond butter. These are mostly healthy unsaturated fats.\n" +
                    "Carbohydrates: 20-25 grams\n" +
                    "From brown rice cereal, dried fruits, and brown rice syrup.\n" +
                    "Fiber: 2-3 grams\n" +
                    "Provided by the nuts, dried fruits, and whole-grain rice cereal.\n" +
                    "Sugars: 10-15 grams\n" +
                    "Natural sugars from dried fruits and added sugars from brown rice syrup and brown sugar.\n" +
                    "Sodium: Minimal, from the added salt.\n" +
                    "Notes:\n" +
                    "Natural vs. Added Sugars: While the recipe contains natural sugars from dried fruits, it also includes added sugars from brown rice syrup and brown sugar.\n" +
                    "Healthy Fats: The fats in this recipe are primarily from nuts, which are rich in heart-healthy unsaturated fats.\n" +
                    "No Refined Grains: Using puffed brown rice cereal instead of a refined grain cereal adds a whole grain component.\n" +
                    "Rich in Micronutrients: Nuts and dried fruits provide vitamins, minerals, and antioxidants.\n" +
                    "Portion Control: Each bar is a compact source of energy, so being mindful of portion sizes is important, especially if watching calorie intake.\n" +
                    "These cereal bars are a good option for a quick snack, offering a balance of carbohydrates, proteins, and fats, along with the nutritional benefits of nuts and dried fruits. They're particularly convenient for on-the-go moments and can serve as an energy-boosting snack.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fblog.williams-sonoma.com%2Fwp-content%2Fuploads%2F2014%2F02%2Fimg1l.jpg&f=1&nofb=1&ipt=e0d9ceeead27772ca2464b183847e4f17b92cfdaf10e2cdff81fbd70410fccab&ipo=images"
        ),
        Food(
            foodId = 12,
            name = "Marinated Blood Oranges",
            type = "Dessert",
            description = "Description\n\nPrep Time: 20 minutesCook Time: 0 minutesServings: 6\n" +
                    "When you see blood oranges in the produce aisle or at your local farmers’ market, buy a big bag and take the opportunity to turn them into eye-catching dishes like this super-simple dessert. Segmenting the fruit takes a little practice, but it makes a nice presentation. This dish proves that dessert doesn’t have to be a decadent, complicated affair; sometimes showcasing a single seasonal fruit is the best finale to a meal.",
            recipe = "Ingredients:\n\n" +
                    "3 lb. (1.5 kg) blood or navel oranges\n" +
                    "1 Tbs. fresh lemon juice\n" +
                    "2 Tbs. sugar\n" +
                    "1/3 cup (3 fl. oz./80 ml) orange liqueur, such as Tuaca or Grand\n" +
                    "  Marnier\n" +
                    "Directions:\n" +
                    "Using a sharp knife, cut a thin slice off both ends of each orange, then cut away the peel and bitter white pith, following the fruit’s curve. Holding the fruit over a bowl, cut on either side of each segment to free it from the membrane, letting the segments and juices fall into the bowl.\n" +
                    "\n" +
                    "In a small bowl, stir together the lemon juice, sugar and orange liqueur. Pour the mixture over the orange segments and toss gently to combine. Cover and refrigerate until well chilled, at least 3 hours or up to 24 hours.\n" +
                    "\n" +
                    "Spoon the fruit and syrup into small bowls or glasses and serve immediately. Serves 6.\n" +
                    "\n" +
                    "Adapted from Williams-Sonoma Healthy in a Hurry, by Karen Ansel, MS, RD and Charity Ferreira (Weldon Owen, 2011).",
            nutrition ="Nutritional Information\n\nEstimated Nutritional Values (Per Serving):\n" +
                    "Per Serving (1/6th of Total Recipe):\n" +
                    "Calories: Approximately 150-200 kcal\n" +
                    "Most of the calories come from the oranges and the orange liqueur.\n" +
                    "Protein: About 1-2 grams\n" +
                    "Oranges contain a small amount of protein.\n" +
                    "Total Fat: Negligible\n" +
                    "Oranges and the other ingredients are virtually fat-free.\n" +
                    "Carbohydrates: 30-40 grams\n" +
                    "Oranges are a natural source of sugars, and the recipe also includes added sugar and sugars from the orange liqueur.\n" +
                    "Fiber: 3-5 grams\n" +
                    "Oranges are a good source of dietary fiber.\n" +
                    "Sugars: 20-30 grams\n" +
                    "Includes natural sugars from the oranges and added sugars from the granulated sugar and orange liqueur.\n" +
                    "Vitamin C: High\n" +
                    "Oranges are an excellent source of Vitamin C.\n" +
                    "Alcohol Content: From the orange liqueur. The exact amount of alcohol per serving would be relatively small but should be considered if alcohol consumption is a concern.\n" +
                    "Notes:\n" +
                    "Natural Sugars vs. Added Sugars: The majority of the sugars in this dish come from the natural sugars in the oranges, with additional sugars from the granulated sugar and orange liqueur.\n" +
                    "Healthy Aspects: This dessert is rich in Vitamin C and provides some dietary fiber. It's a healthier option compared to desserts heavy in fats and refined sugars.\n" +
                    "Alcohol Content: If serving to children or those who avoid alcohol, you can omit the orange liqueur or replace it with orange juice or a non-alcoholic orange syrup.\n" +
                    "Serving Size: Portion size can impact the nutritional values, especially the sugar and calorie content.\n" +
                    "This citrus dessert is a refreshing and relatively light option, offering the nutritional benefits of fresh fruit with a touch of indulgence from the orange liqueur. It's a delightful way to enjoy the natural sweetness of oranges enhanced with a hint of added flavor.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n",
            image = "https://assets.wsimgs.com/wsimgs/ab/images/dp/recipe/202327/0003/img24l.jpg"
        ),
        Food(
            foodId = 13,
            name = "NutriGrain Bagel",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.pinimg.com%2Foriginals%2F5d%2F4f%2F9d%2F5d4f9dc7b5a6bfb8e265e09db4e1438d.jpg&f=1&nofb=1&ipt=b9b76d0955361c4c45b9ab0ff5e7712e22c8d7cbb4c6ac3adefa6a3d162f51e9&ipo=images"
        ),
        Food(
            foodId = 14,
            name = "Triple Layer Berry Sorbet",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://i.pinimg.com/originals/f0/ac/6f/f0ac6faa1a4854c3951beff1f27a5453.jpg"
        ),
        Food(
            foodId = 15,
            name = "Squash and Zucchini Casserole",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Feasyweeknightrecipes.com%2Fwp-content%2Fuploads%2F2020%2F11%2FYellow-Squash-and-Zucchini-Noodles-Casserole-7.jpg&f=1&nofb=1&ipt=324ed454782fa84615f2b2bacbcb5cce5f944d637586182ca4f3ee428e352336&ipo=images"
        ),
        Food(
            foodId = 16,
            name = "Irish Breakfast",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.xT5MMwXdAxAfxyr5j4sghgHaE8%26pid%3DApi&f=1&ipt=ff47207638d4fb81b59ef82ac963a7dc1e9c2f63190aaadb0b421f9b1296965f&ipo=images"
        ),
        Food(
            foodId = 17,
            name = "Pancake",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.explicit.bing.net%2Fth%3Fid%3DOIP._hLtCdJqPVmq1fwrRADH3QHaE7%26pid%3DApi&f=1&ipt=46bc295fa7e4fc6741898c40bb381e8fed1125b0311c0d51494f2d0bb83b2ea1&ipo=images"
        ),
        Food(
            foodId = 18,
            name = "Aussie Breakfast",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.WMjyCF-vu9qaVT28rOyGFwHaE8%26pid%3DApi&f=1&ipt=104fca4239c4f53ee7768c6e46d724744dc590f4eff65a149d9335085ac48410&ipo=images"
        ),
        Food(
            foodId = 19,
            name = "Food 19",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 20,
            name = "Tomato Soup",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi2.wp.com%2Fwonkywonderful.com%2Fwp-content%2Fuploads%2F2019%2F01%2Fvegetable-soup-recipe-2.jpg%3Fresize%3D980%252C1462%26ssl%3D1&f=1&nofb=1&ipt=80218976a138ebc673f98da8a937934cda1c8da95d6e2de042e0da5e94d68769&ipo=images"
        ),
        Food(
            foodId = 21,
            name = "Food 21",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 22,
            name = "food 22",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 23,
            name = "Food 23",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 24,
            name = "Food 24",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 25,
            name = "Food 25",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 26,
            name = "Food 26",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 27,
            name = "Food 27",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 28,
            name = "Food 28",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.5Oale2qPuMUyFHjPkbGyogHaFj%26pid%3DApi&f=1&ipt=b68f1f523736259e3646846beba3d9276e026ef854134be2a0bd1df0d64b0c3f&ipo=images"
        ),
        Food(
            foodId = 29,
            name = "Food 29",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 30,
            name = "Food 30",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thespruceeats.com%2Fthmb%2FmbYzpYUAbxotK30YqpSVmDEnnZ8%3D%2F4494x3000%2Ffilters%3Afill(auto%2C1)%2Fscrambled-eggs-recipe-1001086_13-5c56061946e0fb00013fb6ad.jpg&f=1&nofb=1&ipt=47f3584c7bb67b452aea27a4d902c81586e7b1b9656364a8913485d1fdf49ff6&ipo=images"
        ),
        Food(
            foodId = 31,
            name = "Eggs, Sausage, and Spinach",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.4ssjycnuRK7XHKNpwX0NkQHaE8%26pid%3DApi&f=1&ipt=bbae927d2e85e871fad0e392595dbe6f89ff192bfd9180d87dc14221830266c3&ipo=images"
        ),
        Food(
            foodId = 32,
            name = "Waffles with fruits",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.-wBqHFZPUMq7jwWYiAGLqwHaHa%26pid%3DApi&f=1&ipt=c0e60f902c0829b8c0d9f605b899e25460f7b37f65a8a0507795342d9dc76214&ipo=images"
        ),
        Food(
            foodId = 33,
            name = "Belgian Waffle",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.yMLua2IGw4WfuWKu_PPQnwHaDl%26pid%3DApi&f=1&ipt=f5f04b201e34407fc5992d65707865a0f2c44c841cdde70b03c8b42d1296d314&ipo=images"
        ),
        Food(
            foodId = 34,
            name = "Croissant",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.PomVBis7jMJ5ZRzajiXDcwHaHA%26pid%3DApi&f=1&ipt=31c6ca57a3beae8a2ae25c7247975fe87ace0d28787dc120700875daa99b7a8f&ipo=images"
        ),
        Food(
            foodId = 35,
            name = "Fruit salad",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.C1F4zHg_OwC3_8z4L2-wdAHaE8%26pid%3DApi&f=1&ipt=866b8e1a71d8bac9734ad28c19f3b67596fab31302dd866577a13f7f73384ae2&ipo=images"
        ),
        Food(
            foodId = 36,
            name = "Breakfast Wrap",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.x0v5E1jk28Kdr-Wh404_JgHaFj%26pid%3DApi&f=1&ipt=1adb57cfcf109dfebeece0b64215684a0c8126da1954d46be151f014555b8131&ipo=images"
        ),
        Food(
            foodId = 37,
            name = "Eggs and Bacon",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.VkQL9HxwzFPTo5eSQpd7NAHaE8%26pid%3DApi&f=1&ipt=7041db39e775de73b70a097b91a7567e654d4b66937b23ce7ceea8b18cea50fe&ipo=images"
        ),
        Food(
            foodId = 38,
            name = "English breakfast",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.HpbScuL-gqc7y0VfzcKwjwHaE8%26pid%3DApi&f=1&ipt=ef13de52f9a2fc0ebb939f083c551b86042740c9ca5ab0ee789d7a06432c3dee&ipo=images"
        ),
        Food(
            foodId = 39,
            name = "Cinnamon Raisin Bagels",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse3.mm.bing.net%2Fth%3Fid%3DOIP.WGOBiLkcG1Z5eHk8W7tCCwAAAA%26pid%3DApi&f=1&ipt=ec630dca8b0cc035f115d22bdf042d935da332f257b77e7dd8cac7e4b92ee1a5&ipo=images"
        ),
        Food(
            foodId = 40,
            name = "Cereals with Fruits",
            type = "Breakfast",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.2cvfMTZTVYjEX-0_Tiqj2gHaE8%26pid%3DApi&f=1&ipt=887545dad750ef91cc2c0c1fab9a6ec5aeb0be6010db603cf1b3ce796c0b8afd&ipo=images"
        ),
        Food(
            foodId = 41,
            name = "Grilled Chicken Sandwich",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 42,
            name = "Food 42",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 43,
            name = "Food 43",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 44,
            name = "Food 44",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 45,
            name = "Food 45",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 46,
            name = "Food 46",
            type = "Dinner",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 47,
            name = "Food 47",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 48,
            name = "Food 48",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 49,
            name = "Food 49",
            type = "Dessert",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        ),
        Food(
            foodId = 50,
            name = "Food 50",
            type = "Lunch",
            description = "",
            recipe = "",
            nutrition ="",
            image = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.atablefullofjoy.com%2Fwp-content%2Fuploads%2F2020%2F05%2FGrilled-Chicken-Sandwich-Recipe-FEATURED.jpg&f=1&nofb=1&ipt=1df17b69b7f0beae3732136c1ee4b9b861f47e677748ca662f42eee35e737bf5&ipo=images"
        )
    )
}