package min2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public enum Months {
	JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
	MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
	SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
	DECEMBER(Seasons.WINTER, 31);

	
	private Seasons seasons;
	private int day;

	Months(Seasons seasons, int day) {
		this.seasons = seasons;
		this.day = day;
	}

	public Seasons getSeason() {
		return seasons;
	}

	public int getDays() {
		return day;
	}

	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� � ����� �����!");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����!");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���!");
		System.out.println("�������� 4, ��� ������� �� ����� �� �����, �� ����� ����� ������� ���!");
		System.out.println("�������� 5, ��� ������� �� ����� �� �����, �� ����� ����� ������� ���!");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����!");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����!");
		System.out.println("�������� 8, ��� ������� �� ����� �� �����, �� ����� ����� ������� ���!");
		System.out.println("�������� 9, ��� ������� �� ����� �� �����, �� ����� ������� ������� ���!");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���!");
	}
	
	
	static boolean isMonth(List<Months>months, String s) {
		boolean isMonth = false;
		for (Months month : Months.values()) {
			if (s != null && s.equalsIgnoreCase(month.name())) {
				isMonth = true;
				break;
			}
		}
		return isMonth;

	}

	
	static boolean isSeason(List<Seasons>seasons, String s) {
		boolean isSeason = false;
		for (Seasons season : Seasons.values()) {
			if (s != null && s.equalsIgnoreCase(season.name())) {
				isSeason = true;
				break;
			}
		}
		return isSeason;

	}

	
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		
		List<Months> months = Arrays.asList(Months.values());
		List<Seasons> season = Arrays.asList(Seasons.values());

		Scanner sc = new Scanner(System.in);
		String s;

	
		boolean work = true;
		while (work) {
			menu();
			s = sc.nextLine();
			switch (s) {
			case "1": {
				System.out.println("������ �����: ");
				s = sc.nextLine();

				if (isMonth(months, s)) {
					System.out.println("� ����� �����");
				} else {
					String message = "���� ������ �����";
					throw new WrongInputConsoleParametersException(message);
				}
				System.out.println();
				break;
			}
			case "2": {
				System.out.println("������ ���� ����: ");
				s = sc.nextLine();

				if (isSeason(season, s)) {
					for (Months month : Months.values()) {
						if (month.getSeason().name().equalsIgnoreCase(s))
							System.out.println(month);
					}
				} else
					System.out.println("���� ���� ����");
				System.out.println();
				break;
			}
			case "3": {
				System.out.println("������ �����: ");
				s = sc.nextLine();

				if (isMonth(months, s)) {
					System.out.println("̳���� � ����� � ������� ���: ");
					Months month = Months.valueOf(s.toUpperCase());
					for (Months m : Months.values()) {
						if (m.getDays() == month.getDays())
							System.out.println(m);
					}
				} else
					System.out.println("���� ������ �����");
				System.out.println();
				break;
			}
			case "4": {
				System.out.println("������ �����: ");
				s = sc.nextLine();

				if (isMonth(months, s)) {
					System.out.println("̳����, � ����� ����� ���: ");
					Months month = Months.valueOf(s.toUpperCase());
					boolean haveResult = false;
					for (Months m : Months.values()) {
						if (m.getDays() < month.getDays()) {
							System.out.println(m);
							haveResult = true;
						}
					}
					if (!haveResult)
						System.out.println("���� ������ ����� � ����� ����� ���");
				} else
					System.out.println("���� ������ �����");
				System.out.println();
				break;
			}
			case "5": {
				System.out.println("������ �����: ");
				s = sc.nextLine();

				if (isMonth(months, s)) {
					System.out.println("̳����, � ����� ����� ���: ");
					Months month = Months.valueOf(s.toUpperCase());
					boolean haveResult = false;
					for (Months m : Months.values()) {
						if (m.getDays() > month.getDays()) {
							System.out.println(m);
							haveResult = true;
						}
					}
					if (!haveResult)
						System.out.println("���� ������ ����� � ����� ����� ���");
				} else
					System.out.println("���� ������ �����");
				System.out.println();
				break;
			}
			case "6": {
				System.out.println("������ ���� ����: ");
				s = sc.nextLine();

				if (isSeason(season, s)) {
					System.out.println(Seasons.values()[(Seasons.valueOf(s.toUpperCase()).ordinal() + 1) % 4]);
				} else
					System.out.println("���� ���� ���� ����");
				System.out.println();
				break;
			}
			case "7": {
				System.out.println("������ ���� ����: ");
				s = sc.nextLine();

				if (isSeason(season, s)) {
					int ord = Seasons.valueOf(s.toUpperCase()).ordinal() - 1;
					System.out.println(Seasons.values()[ord < 0 ? 3 : ord]);
				} else
					System.out.println("���� ���� ���� ����");
				System.out.println();
				break;
			}
			case "8": {
				for (Months month : months) {
					if (month.getDays() % 2 == 0)
						System.out.println(month);
				}
				System.out.println();
				break;
			}
			case "9": {
				for (Months month : months) {
					if (month.getDays() % 2 != 0)
						System.out.println(month);
				}
				System.out.println();
				break;
			}
			case "10": {
				System.out.println("������ �����: ");
				s = sc.nextLine();

				if (isMonth(months, s)) {
					Months month = Months.valueOf(s.toUpperCase());
					if (month.getDays() % 2 == 0)
						System.out.println("̳���� �� ����� ������� ���");
					else
						System.out.println("̳���� �� ������� ������� ���");

				} else
					System.out.println("���� ������ �����");
				System.out.println();
				break;
			}
			default:
				work = false;
				break;
			}

		}
		sc.close();
	}
}
