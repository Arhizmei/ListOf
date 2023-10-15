fun main() {
    val fruitsList = listOf("Orange", "Apple", "Lime", "Apple", "Banana")
    val fruitsList3 = mutableListOf("Orange", "Apple", "Lime", "Apple", "Banana")//изменяемый список
    var a = fruitsList[0]
    var b = fruitsList.get(2)

//    println(fruitsList.last()) // получаем последний элемент
//    println(fruitsList.indexOf("Apple")) //получаем индекс элемента
//    println(fruitsList.lastIndexOf("Apple")) //получаем индекс последнего элемента
//    println(fruitsList.subList(1, 3))//список с первой позиции до второй, последний не берется
//    println(fruitsList.subList(1, 3))//список с первой позиции до второй, последний не берется
//    fruitsList3[2]= "Peach" // изменение нужного элемента
//    println(fruitsList3)
//    fruitsList3.remove("Orange")//удаление элемента по содержанию
//    println(fruitsList3)
//    fruitsList3.removeAt(0)//удаление элемента по индексу
//    println(fruitsList3)
//    fruitsList3.removeAll(listOf("Orange", "Apple"))//удаляет все элементы которые указаны
//    println(fruitsList3)
//    fruitsList3.clear()//удаляет все элементы
//    println(fruitsList3)
//    fruitsList3.add("Melon")//добавление новых элементов
//    println(fruitsList3)
//    fruitsList3.add(3, "Ananas")//добавление элемента в нужном месте
//    println(fruitsList3)
//    fruitsList3.addAll(listOf("WaterMelon", "Melon"))//добавление целого нового списка
//    println(fruitsList3)
}