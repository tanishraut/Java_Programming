class Logic
{
    void productOfDigits(int num)
    {
        int n = Math.abs(num);
        int prod = 1;

        if (n == 0)
        {
            prod = 0;
        }
        while (n > 0)
        {
            prod *= (n % 10);
            n /= 10;
        }

        System.out.println("Product of digits of " + num + " is = " + prod);
    }
}

class program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}
