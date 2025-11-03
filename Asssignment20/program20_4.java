class Logic
{
    void findLargestDigit(int num)
    {
        int n = Math.abs(num);
        int max = 0;

        while (n > 0)
        {
            int digit = n % 10;
            if (digit > max) max = digit;
            n /= 10;
        }

        System.out.println("Largest digit : " + max);
    }
}

class program20_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
