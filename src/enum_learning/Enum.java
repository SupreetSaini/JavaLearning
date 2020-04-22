package enum_learning;

enum Seasons { summer,winter,autum,spring}

public class Enum {

	public static void main(String[] args) {
		Seasons season = Seasons.winter;
		System.out.println(season);
		Seasons season1 = Seasons.valueOf("summer");
		System.out.println(season1);

	}

}
