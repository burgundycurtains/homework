class Пиццерия {
    void приготовитьПиццу(String имяКлиента, String названиеПиццы) {
        System.out.println("Готовится " + названиеПиццы + " для " + имяКлиента);
        try {
            Thread.sleep(2000); // Имитация времени приготовления
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Заказ готов: " + названиеПиццы + " для " + имяКлиента);
    }
}
