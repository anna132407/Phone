public class Main {
    public static void main(String[] args) {
        Phone<String> phone1 = new Phone<>("+380995098015", "Xiaomi");
        Phone<String> phone2 = new Phone<>("+380993266571", "Samsung");
        Phone<String> phone3 = new Phone<>("+380667845612", "Poco");
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        phone1.setNumber("+380963451289");
        phone3.setModel("Nokia");
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        System.out.println(phone2.getModel());
    }
}
