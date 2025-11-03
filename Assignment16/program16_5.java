class Logic
{
    void countDigits(int num)
    {
        int count = 0;
        int n = Math.abs(num);

        if (n == 0)
            count = 1;
        else
        {
            while (n > 0)
            {
                count++;
                n /= 10;
            }
        }

        System.out.println(count);
    }
}

class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}
