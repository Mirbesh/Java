package function;

import java.util.*;

public class ex1 {

    public static void main(String[] args) {

        Notebook laptop1 = new Notebook(1, "Acer Aspare 3", "Blue", "Windows", 1, "Tb", 16);
        Notebook laptop2 = new Notebook(2, " Toshiba Satellite C660-16D", "Black", "Linux", 1, "Tb", 32);
        Notebook laptop3 = new Notebook(3, "Lenovo Ideapad 3", "Blue", "DOS", 500, "Gb", 8);
        Notebook laptop4 = new Notebook(4, "Asus Vivobook 15", "Silver", "Ubuntu", 500, "Gb", 12);
        Set<Notebook> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));
        getChoice(laptops);

    }

    private static void choiceMemory(Set<Notebook> laptops) {
        System.out.println("Введите размер ОЗУ: ");
        Scanner scan = new Scanner(System.in);
        Integer ozu = scan.nextInt();
        for (Notebook notebook : laptops) {
            if (notebook.findIsMemory(ozu)) {
                System.out.println(notebook);
            }
        }
        getChoice(laptops);
    }

    private static void choiceHardDisk(Set<Notebook> laptops) {
        System.out.println("Введите размер жесткого диска: ");
        Scanner scan = new Scanner(System.in);
        Integer hardDisk = scan.nextInt();
        for (Notebook notebook : laptops) {
            if (notebook.findIsHardDisk(hardDisk)) {
                System.out.println(notebook);
            }
        }
        getChoice(laptops);
    }

    private static void choiceOS(Set<Notebook> laptops) {
        System.out.println("Введите имя операционной системы: ");
        Scanner scan = new Scanner(System.in);
        String os = scan.nextLine();
        for (Notebook notebook : laptops) {
            if (notebook.findIsOs(os)) {
                System.out.println(notebook);
            }
        }
        getChoice(laptops);    
    }
    private static void choiceColor(Set<Notebook> laptops) {
        System.out.println("Введите цвет ноутбука: ");
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
        for (Notebook notebook : laptops) {
            if (notebook.findIsColor(color)) {
                System.out.println(notebook);
            }
        }
        getChoice(laptops);    
    }  
    
    private static Integer getChoice(Set<Notebook> laptops) {
        System.out.println("Выберите критерий для фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("0 - Выход из программы");
        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        while (0 > choice || choice > 4) {
            System.out.println("Вы выбрали не правильную цифру. Выберите заново.\n");
            getChoice(laptops);
        }
        if (choice == 1) {
            choiceMemory(laptops);
        }
        if (choice == 2) {
            choiceHardDisk(laptops);
        }
        if (choice == 3){
            choiceOS(laptops);
        }
        if (choice == 4){
            choiceColor(laptops);
        }
        if (choice == 0) {
            System.out.print("Спасибо за обращение!");
        }
        return choice;
     
    } 

}
