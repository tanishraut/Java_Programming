class Logic
{
    void checkLeapYear(int year)
    {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


        if (isLeap) 
        {
    System.out.println(year + " is leap year");
        }       

        else 
        {
    System.out.println(year + " is not leap year");
        }

    }
}

class program19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}
