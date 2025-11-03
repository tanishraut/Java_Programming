class Logic
{
    void calculatePower(int base, int exp)
    {
        long result = 1;

        for (int i = 0; i < exp; i++)
        {
            result *= base;
        }

        System.out.println(base + " raised to " + exp + " = " + result);
    }
}

class program19_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}
