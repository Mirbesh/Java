package function;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        
        Notebook laptop1 = new Notebook(1, "Acer Aspare 3", "Blue", "Windows", "1 Tb", 16);
        Notebook laptop2 = new Notebook(2, " Toshiba Satellite C660-16D", "Black", "Linux", "1 Tb", 32);
        Notebook laptop3 = new Notebook(3, "Lenovo Ideapad 3", "Blue", "DOS", "500 Gb", 8);
        Notebook laptop4 = new Notebook(4, "Asus Vivobook 15", "Silver", "Ubuntu", "500 Gb", 12);
        
        Integer choice = getChoice();
        
        while (0 > choice || choice > 4){
            System.out.println("Вы выбрали не правильную цифру. Выберите заново.\n");
            getChoice();
        }
        // if (choice == 1){
        //     choiceMemory();
        // }
        // if (choice == 2){
        //     choiceHardDisk();
        // }
        // if (choice == 3){
        //     choiceOS();
        // }
        // if (choice == 4){
        //     choiceColor();
        // }
        if (choice == 0){
            System.out.print("Спасибо за обращение!"); 
        }

        
        Set<Notebook> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));
        for (Notebook notebook : laptops) {
            System.out.println(notebook);
            
        }

        // public static choiceMemory() {
        //     System.out.print("Введите Размер ОЗУ: ");
        //     Scanner scan = new Scanner(System.in);
        //     Integer ozu = scan.nextInt();
        //     getChoice();
        // }
        // public static choiceHardDisk() {
        //     System.out.print("Введите Размер жесткого диска: ");
        //     Scanner scan = new Scanner(System.in);
        //     Integer harDisk = scan.nextInt();
        //     getChoice();
        // }
        // public static choiceOS() {
        //     System.out.print("Введите имя операционной системы: ");
        //     Scanner scan = new Scanner(System.in);
        //     Integer os = scan.nextInt();
        //     getChoice();
        // }
        // public static choiceColor() {
        //     System.out.print("Введите имя операционной системы: ");
        //     Scanner scan = new Scanner(System.in);
        //     Integer color = scan.nextInt();
        //     getChoice();
        // }

        // HashSet<Notebook> laptops2 = new HashSet<>();
        // long start = System.currentTimeMillis();
        // for (int i = 0; i < 10_000; i++) {
        //     laptops2.add(new Notebook(null, null, null, null, null, null));
        // }
        // long end = System.currentTimeMillis();
        // System.out.println("Время создания: " + (end - start));
        // start = System.currentTimeMillis();
        // for (int i = 0; i < 10_000; i++) {
        //     laptops.contains(laptop1);
        // }
        // end = System.currentTimeMillis();
        // System.out.println("Время проверки: " + (end - start));
    }

    private static Integer getChoice() {
        System.out.println("Выберите критерий для фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("0 - Выход из программы");
        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        return choice;
    }

}
