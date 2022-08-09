public class Holiday {

    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean isSameMonth(Holiday hol)
    {
        return this.month.equals(hol.month);
    }

    public  double avgDate(Holiday[] hol) {
        double sum = 0;
        for(int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum)/hol.length;
    }

    public static void main(String args[])
    {
        Holiday holiday = new Holiday("Independence Day", 4, "July");
        Holiday holiday1 = new Holiday("Independence Day", 4, "AUG");
        Holiday array[];
        array = new Holiday[2];
        array[0] = holiday;
        array[1] = holiday1;

        System.out.println("Months are equal or not - " +holiday.isSameMonth(holiday1));
        System.out.println("avg of date - " + holiday.avgDate(array));
    }
}
