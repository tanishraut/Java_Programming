class Logic
{
    void printOddNumbers(int n)
    {
        if (n < 1)
        {
            System.out.println("No odd numbers");
            return;
        }
    
        for (int i = 1; i <= n; i += 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class program18_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}
