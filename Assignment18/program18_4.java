class Logic
{
    void sumEvenOddDigits(int num)
    {
        int se = 0, so = 0;
        int n = Math.abs(num);

        while (n > 0)
        {
            int digit = n % 10;
            if (digit % 2 == 0) se += digit;
            else so += digit;
            n /= 10;
        }

        System.out.println("even digits Sum : " + se);
        System.out.println("odd digits Sum : " + so);
    }
}

class program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
