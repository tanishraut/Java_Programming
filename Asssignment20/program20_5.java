class Logic
{
    void findSmallestDigit(int num)
    {
        int n = Math.abs(num);
        int min = 9;

        if (n == 0) min = 0;
        while (n > 0)
        {
            int digit = n % 10;
            if (digit < min) min = digit;
            n /= 10;
        }

        System.out.println("Smallest digit " + min);
    }
}

class program20_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}
