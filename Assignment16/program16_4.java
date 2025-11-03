class Logic
{
    void reverseNumber(int num)
    {
        int rev = 0;
        int n = num;

        while (n != 0)
        {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        System.out.println("Reverse : " + rev);
    }
}

class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}
