 *[SOLID]*

[S]: Каждый класс выполняет свои функции (class Store, Basket, Goods).

[О]: Есть class Admin, он закрыт для модификации, но открыт для расширения, так он может быть расширен до mainAdmin иметь свою реализацию, при этом не нарушая работу текущих операций.

[I]:  Есть родительский class User, так наследники class Customer, Admin имеют свою дополнительную реализацию, при этом не выполняют функции друг друга, которые им не нужны. 

[D]: Классы зависят от абстракции, а не от конкретной реализации (class Customer, Admin)


*[DRY]:*
Вместо того, чтобы повторять код из метода menu(), создаем метод с этим кодом и делаем цикл

*[Magics]*:
Делаем размер корзины константным и используем этот параметр в коде вместо числа
private static final int SIZE = 10;
List<Goods> basket = new ArrayList<>(SIZE);