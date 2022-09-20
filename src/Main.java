import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // задача 6
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");
        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг.");
        // задача 7
        System.out.println("Разница между весами бойцов " + weightDifference + " кг. (1 способ)");
        var weightDifference1 = boxerTwo % boxerOne;
        System.out.println("Разница между весами бойцов " + weightDifference1 + " кг. (2 способ)");
        // задача 8
        var totalTime = 640;
        var everyEmployee = 8;
        var totalEmployees = totalTime / everyEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        var totalEmployees1 = totalEmployees + 94;
        var everyEmployee1 = totalTime / totalEmployees1;
        System.out.println("Если в компании работает " + totalEmployees1 + " человек, то всего " + everyEmployee1 + " часов работы может быть поделено между сотрудниками.");






    }
}