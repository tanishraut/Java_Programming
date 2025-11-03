class Logic
{
    void printDigits(int num)
    {
        int n = Math.abs(num);

        if (n == 0) System.out.println(0);
        while (n > 0)
        {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}

class program19_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
