// 看视频讲解才会的题目：视频号49，鹏哥c语言
// 给两个数，求这两个数的最大公约数
// 他妈的 忘了最大公约是是啥了
// 两个数的最大公约数，不会比两数之间的较小的数，小
// 如果两个数的最大公约数算出来了，最小公倍数是 a*b/6
//方法一：暴力求解

#include<stdio.h>

int main ()
{
    int a = 0;
    int b = 0;
    scanf ("%d %d",&a,&b);

    int min =(a<b)?a:b ;//a小于b么？如果小于a，不小于min=b
    int m = min;

    int i = 0;

    while (1)
    {
        if (a%m==0&&b%m==0)
        {
            break;
        }
        m--;
    }
    printf("最大公约数：%d\n",m);

    return 0;
}

//辗转相除法：

#include <stdio.h>
int main ()
{
    int a = 0;
    int b = 0;
    int c = 0;
    scanf ("%d %d",&a,&b);

    while (c=a%b) //0为假，非0为真
    {
        a=b;
        b=c;
    }
    printf("最大公约数：%d\n",b);

    return 0;
    
}



//编写程序数一下1-100的所有整数中出现多少个数字9，注意审题
//除了 9 19 29 。。99之外，还要90 91 92
#include<stdio.h>
int main()

{
    int i = 0;
    int count = 0;
    for (i=1;i<=100;i++)
    {
        if (i%10==9)
        {
            count ++ ;//判断个位数是不是9
        }
        if (i/10==9) //会将99计数两次
        {
            count ++; //判断十位数是不是9
        }
    }

    printf("%d",count);
    return 0;
}


//计算1/1-1/2+1/3...+1/99-1/100的值，打印出的结果
//分子总是1
//分母是1-100
//这道题最重要的是，用浮点数，不然会执行整数除法

#include<stdio.h>
int main ()
{
    int i = 0;
    double sum = 0;
    int flag = 1;

    for (i=1;i<=100;i++)
    {
        sum =sum + flag * 1.0/i;
        flag = -flag;
        //这个方法非常巧妙，通过每次变换flag的符号来执行+-
    } 

    printf("%lf",sum);
}

//第二种方法
#include<stdio.h>
int main ()
{
    int i = 0;
    double  sum =0;
    for (i=1;i<=100;i++)
    {
        if (i%2!=0)
        {
            sum =sum +1.0/i;
        }

        else 
        {
            sum = sum -1.0/i;
        }

    }

    printf("%lf",sum);
    return 0;
}



// 函数的递练习题

#include<stdio.h>

void print(unsigned int n )
{
    if (n>=10)
    {
        print(n/10);
    }
    printf("%d ",n%10);
}


int main ()
{

    unsigned int num = 0;
    scanf("%d",&num);
    print(num);
    return 0;   
}