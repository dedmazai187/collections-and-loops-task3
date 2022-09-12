/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/
//data class Car(val brand: String, val model: String, val cost: Double) создать отдельно
//data class User(val name: String, val age: Int, val experience: Int) создать отдельно
fun main() {
    val user = User("Oleg", 26, 8)
    val car1 = Car("BMW", "X4", 23.6)
    val car2 = Car("KIA", "Rio", 10.1)
    val car3 = Car("Renault", "Capture", 14.2)

    val cars = listOf(car1, car2, car3)

    val availableCar = availableCarsForUser(cars, user)

    println(availableCar)
}

fun availableCarsForUser(allCars: List<Car>,user: User):List<Car> {
    val result = mutableListOf<Car>()
    for (car in allCars) {

            val condition1 = user.age >= 26 && user.experience >= 6
            val condition2 = user.age >= 21 && user.experience >= 2 && car.brand != "Audi" && car.brand != "BMW"
            if (condition1 == true || condition2 == true)
                result.add(car)
        }
        return result
    }


