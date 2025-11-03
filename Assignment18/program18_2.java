class Logic
{
    void printEvenNumbers(int n)
    {
        if (n < 2)
        {
            System.out.println("No even numbers");
            return;
        }

        for (int i = 2; i <= n; i += 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class program18_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}
