import java.util.Scanner;
public class Numtoword
{
    public static void main(String[] srgs)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = "46000"; // Read user input
        //char[] sd = userName.toCharArray();
        convert(userName.toCharArray());
    }
    static void convert(char[] num)
    {
        int len = num.length;
        if(len == 0)
        {
            System.out.println("Emprty");
            return;
        }
        if(len > 7)
        {
            System.out.println("Too much digit");
            return;
        }
        String[] single_digits = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] two_digits = new String[]{"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", "fifty","sixty", "seventy", "eighty", "ninety"};
        String[] tens_power = new String[] {"hundred", "thousand","Lakh"};
        System.out.print(String.valueOf(num)+":");
        if(len == 1)
        {
            System.out.println(single_digits[num[0]-'0']);
            return;
        }
        int x= 0;
        while (x < num.length)
        {
            //System.out.println(x);
            //System.out.println("len"+len);
            if (len == 7)
            {
                if(num[x]-'0' != 0)
                {
                    if (num[x]-'0' == 1)
                    {
                        int a = num[x+1]-'0';
                        int b = num[x]-'0';
                        int sum =a+b;
                        System.out.println(two_digits[sum]);
                        System.out.println(tens_power[len-5]);
                        --len;
                        --len;
                        ++x;
                        ++x;
                        //continue;
                    }
                    else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)
                    {
                        System.out.println("twenty");
                        System.out.println(tens_power[len-5]);
                        --len;
                        --len;
                        ++x;
                        ++x;
                        //continue;
                    }
                    else
                    {
                        int i = num[x]-'0';
                        if (i>1)
                        {
                            System.out.print(tens_multiple[i]+" ");
                            System.out.println(single_digits[num[x+1] - '0']);
                            System.out.println(tens_power[len-5]);
                            --len;
                            --len;
                            ++x;
                            ++x;
                            //continue;
                        }
                    }
                }
                else
                {
                    --len;
                    ++x;
                }
            }
            if(len == 6)
            {
                if(num[x]-'0' != 0)
                {

                    System.out.println(single_digits[num[x]-'0']);
                    System.out.println(tens_power[len-4]);
                    --len;
                    ++x;
                    //continue;
                }
                else
                {
                    --len;
                    ++x;
                }
            }
            if (len==5)
            {
                if(num[x]-'0' != 0)
                {
                    if (num[x]-'0' == 1)
                    {
                        int a = num[x+1]-'0';
                        int b = num[x]-'0';
                        int sum =a+b;
                        System.out.println(two_digits[sum]);
                        System.out.println(tens_power[len-4]);
                        --len;
                        --len;
                        ++x;
                        ++x;
                        //continue;
                    }
                    else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)
                    {
                        System.out.println("twenty");
                        System.out.println(tens_power[len-4]);
                        --len;
                        --len;
                        ++x;
                        ++x;
                        //continue;
                    }
                    else
                    {
                        int i = num[x]-'0';
                        if (i>1)
                        {
                            System.out.print(tens_multiple[i]+" ");
                            System.out.println(single_digits[num[x+1] - '0']);
                            System.out.println(tens_power[len-4]);
                            --len;
                            --len;
                            ++x;
                            ++x;
                            //continue;
                        }
                    }
                }
                else
                {
                    --len;
                    ++x;
                }
            }
            if (len == 4)
            {
                if(num[x]-'0' != 0)
                {

                    System.out.println(single_digits[num[x]-'0']);
                    //System.out.println("df"+num);
                    System.out.println(tens_power[len-3]);
                    --len;
                    ++x;
                    //continue;
                }
                else
                {
                    --len;
                    ++x;
                }
            }
            if (len == 3)
            {
                if(num[x]-'0' != 0)
                {

                    System.out.println(single_digits[num[x]-'0']);
                    //System.out.println("df"+num);
                    System.out.println(tens_power[len-3]);
                    --len;
                    ++x;
                    //continue;
                }
                else
                {
                    --len;
                    ++x;
                }
            }
            if (len == 2)
            {
                if(num[x]-'0' != 0)
                {
                    if (num[x]-'0' == 1)
                    {
                        int a = num[x+1]-'0';
                        int b = num[x]-'0';
                        int sum =a+b;
                        System.out.println(two_digits[sum]);
                        --len;
                        --len;
                        ++x;
                        ++x;
                        //continue;
                    }
                    else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)
                    {
                        System.out.println("twenty");
                        --len;
                        --len;
                        ++x;
                        ++x;
                        //continue;
                    }
                    else
                    {
                        int i = num[x]-'0';
                        if (i>1)
                        {
                            System.out.print(tens_multiple[i]);
                            System.out.println(single_digits[num[x+1] - '0']);
                            --len;
                            --len;
                            ++x;
                            ++x;
                            //continue;
                        }
                    }
                }
                else
                {
                    --len;
                    ++x;
                }
            }
            //++x;

        }

    }
}
