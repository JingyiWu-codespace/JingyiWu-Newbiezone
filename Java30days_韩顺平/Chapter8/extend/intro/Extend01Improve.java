package Java30days_韩顺平.Chapter8.extend.intro;

public class Extend01Improve {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小吴";
        pupil.age = 12;
        pupil.setScore(60.9);
        pupil.testing();
        pupil.info();

        Graduate graduate = new Graduate();
        graduate.name = "吴女士";
        graduate.age = 24;
        graduate.setScore(99.9);
        graduate.testing();
        graduate.info();


    }
}
