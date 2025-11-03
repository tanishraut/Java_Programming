class Logic
{
    void checkPalindrome(int num)
    {
        int n = Math.abs(num);
        int rev = 0;
        int temp = n;

        while (temp > 0)
        {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        if (rev == n)
            System.out.println(num + " palindrome");
        else
            System.out.println(num + " not palindrome");
    }
}

class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}
