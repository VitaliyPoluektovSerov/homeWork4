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

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }


        int ageFrom2To6 = 2;
        if (ageFrom2To6 >= 2 && ageFrom2To6 < 6) {
            System.out.println("Если возраст человека равен " + ageFrom2To6 + ", то ему нужно ходить  в детский сад");
        }

        int ageFrom7To18 = 7;
        if (ageFrom7To18 >= 7 && ageFrom7To18 < 18) {
            System.out.println("Если возраст человека равен " + ageFrom7To18 + ", то ему нужно ходить  в школу");
        }

        int ageFrom18To24 = 18;
        if (ageFrom18To24 >= 18 && ageFrom18To24 < 24) {
            System.out.println("Если возраст человека равен " + ageFrom18To24 + ", то ему нужно ходить в университет");
        }

        int ageFromMoreThan24 = 25;
        if (ageFromMoreThan24 > 24) {
            System.out.println("Если возраст человека равен " + ageFromMoreThan24 + ", то ему нужно ходить на работу");
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