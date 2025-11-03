class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;

        for (int i = 1; i <= num/2; i++)
        {
            if (num % i == 0) sum += i;
        }

        if (sum == num)
            System.out.println(num + " is perfect number");
        else
            System.out.println(num + " is not perfect number");
    }
}

class program20_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}
