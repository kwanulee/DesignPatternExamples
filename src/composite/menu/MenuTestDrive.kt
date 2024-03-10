package composite.menu

fun main(args: Array<String>) {
    val pancakeHouseMenu: MenuComponent =
        Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu: MenuComponent =
        Menu("DINER MENU", "Lunch")
    val cafeMenu: MenuComponent =
        Menu("CAFE MENU", "Dinner")
    val dessertMenu: MenuComponent =
        Menu("DESSERT MENU", "Dessert of course!")
    val coffeeMenu: MenuComponent = Menu("COFFEE MENU", "Stuff to go with your afternoon coffee")

    val allMenus: MenuComponent = Menu("ALL MENUS", "All menus combined")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    pancakeHouseMenu.add(
        MenuItem(
            "K&B's Pancake Breakfast",
            "Pancakes with scrambled eggs, and toast",
            true,
            2.99
        )
    )
    pancakeHouseMenu.add(
        MenuItem(
            "Regular Pancake Breakfast",
            "Pancakes with fried eggs, sausage",
            false,
            2.99
        )
    )
    pancakeHouseMenu.add(
        MenuItem(
            "Blueberry Pancakes",
            "Pancakes made with fresh blueberries, and blueberry syrup",
            true,
            3.49
        )
    )
    pancakeHouseMenu.add(
        MenuItem(
            "Waffles",
            "Waffles, with your choice of blueberries or strawberries",
            true,
            3.59
        )
    )

    dinerMenu.add(
        MenuItem(
            "Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat",
            true,
            2.99
        )
    )
    dinerMenu.add(
        MenuItem(
            "BLT",
            "Bacon with lettuce & tomato on whole wheat",
            false,
            2.99
        )
    )
    dinerMenu.add(
        MenuItem(
            "Soup of the day",
            "A bowl of the soup of the day, with a side of potato salad",
            false,
            3.29
        )
    )
    dinerMenu.add(
        MenuItem(
            "Hotdog",
            "A hot dog, with saurkraut, relish, onions, topped with cheese",
            false,
            3.05
        )
    )
    dinerMenu.add(
        MenuItem(
            "Steamed Veggies and Brown Rice",
            "Steamed vegetables over brown rice",
            true,
            3.99
        )
    )

    dinerMenu.add(
        MenuItem(
            "Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true,
            3.89
        )
    )

    dinerMenu.add(dessertMenu)

    dessertMenu.add(
        MenuItem(
            "Apple Pie",
            "Apple pie with a flakey crust, topped with vanilla icecream",
            true,
            1.59
        )
    )

    dessertMenu.add(
        MenuItem(
            "Cheesecake",
            "Creamy New York cheesecake, with a chocolate graham crust",
            true,
            1.99
        )
    )
    dessertMenu.add(
        MenuItem(
            "Sorbet",
            "A scoop of raspberry and a scoop of lime",
            true,
            1.89
        )
    )

    cafeMenu.add(
        MenuItem(
            "Veggie Burger and Air Fries",
            "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
            true,
            3.99
        )
    )
    cafeMenu.add(
        MenuItem(
            "Soup of the day",
            "A cup of the soup of the day, with a side salad",
            false,
            3.69
        )
    )
    cafeMenu.add(
        MenuItem(
            "Burrito",
            "A large burrito, with whole pinto beans, salsa, guacamole",
            true,
            4.29
        )
    )

    cafeMenu.add(coffeeMenu)

    coffeeMenu.add(
        MenuItem(
            "Coffee Cake",
            "Crumbly cake topped with cinnamon and walnuts",
            true,
            1.59
        )
    )
    coffeeMenu.add(
        MenuItem(
            "Bagel",
            "Flavors include sesame, poppyseed, cinnamon raisin, pumpkin",
            false,
            0.69
        )
    )

    val coffee3 = MenuItem(
        "Biscotti",
        "Three almond or hazelnut biscotti cookies",
        true,
        0.89
    )

    coffeeMenu.add(coffee3)


    //coffee3.add(coffee3);
    val waitress = Waitress(allMenus)

    waitress.printMenu()
}