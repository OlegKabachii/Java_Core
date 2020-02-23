package homework_8;

public enum Months {
	DECEMBER(Seasons.WINTER, 31), JUNUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31),
	APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31),
	AUGUST(Seasons.SUMMER, 31), SEPTEMBER(Seasons.AUTUMN, 30), OKTOBER(Seasons.AUTUMN, 31),
	NOVEMBER(Seasons.AUTUMN, 30);

	int days;
	Seasons seasons;

	Months(Seasons seasons, int days) {
		this.seasons = seasons;
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public Seasons getSeason() {
		return seasons;
	}

}
