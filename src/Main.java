//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 71;
        if (age >= 18) {
            System.out.println("Тебе 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        int tempVoz = 8;
        if (tempVoz < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        int  speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }

        age = 6;
        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >=7 && age <=17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >=18 && age <=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттрекционе");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттрекционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттрекционе без сопровождения взрослого");
        }

        int vmest = 102;
        int sid = 60;
        int kol = 102; //кол-во человек на данный момент в вагоне

        if (kol < sid) {
            System.out.println("есть сидячее место");
        } else {
            if (kol >= vmest) {
                System.out.println("вагон полностью забит");
            } else {
                System.out.println("есть стоячее место");
            }
        }

        int one = 100;
        int two = 50;
        int three = 11;
        if (one > two && two > three) {
            System.out.println("больше первое число = " + one);
        } else {
            if (two > three) {
                System.out.println("больше второе число = " + two);
            } else {
                System.out.println("больше третье число = " + three);
            }
        }

    }
}