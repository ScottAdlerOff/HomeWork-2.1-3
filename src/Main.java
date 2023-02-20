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

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var boxersWeight = oneBoxer + twoBoxer;
        System.out.println("Общий вес бойцов " + boxersWeight+ " кг!");
        var diffrentWeight = twoBoxer - oneBoxer;
        System.out.println("Разница в весе бойцов " + diffrentWeight + " кг!");
        var weightBoxers = diffrentWeight % boxersWeight;
        System.out.println("Разница в весе бойцов " + weightBoxers + " кг!");

        var workTime = 640;
        var workerTime = 8;
        var workers = workTime / workerTime;
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers = workers + 94;
        workTime = workers * workerTime;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками.");
    }
}