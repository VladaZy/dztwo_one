public class Main {
    public static void main(String[] args) {
        // Объявляем переменную для хранения стоимости билета
        int Price = 15_676;

        // Объявляем переменную для хранения количества рублей для одной бонусной мили
        int Mile = 20;

        // Рассчитываем количество бонусных миль
        int bonusMiles = Price / Mile;

        // Выводим результат на экран
        System.out.println("За билет начисляется " + bonusMiles + " миль.");
    }
}