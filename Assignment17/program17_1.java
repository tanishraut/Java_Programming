class Logic
{
    void sumOfDigits(int num)
    {
        int sum = 0;
        int n = Math.abs(num);

        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum " + sum);
    }
}

class program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}
