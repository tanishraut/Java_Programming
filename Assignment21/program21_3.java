class Logic
{
    void displayFactors(int num)
    {
        if (num <= 0)
        {
            System.out.println("negative number");
            return;
        }

        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}

class program21_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
