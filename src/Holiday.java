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
        int sum = 0;
        for(int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum)/hol.length;
    }

    public static void main(String args[])
    {
        Holiday holiday = new Holiday("Independence Day", 4, "July");
        Holiday holiday1 = new Holiday("Independence Day", 4, "AUG");
        System.out.println("Months are equal or not - " +holiday.isSameMonth(holiday1));
    }
}
