# include <stdio.h>
# include<math.h>

//写一个函数可以判断 一个数是不是素数
//打印100-200之间的素数
//素数是只能被1和他本身整出的数，如7，只能被1和7整除
// int main ()
// {
//     int i = 0 ;
//     int count=0;
    
//     for (i = 101; i<=200;i+=2)
//     {
//         //判断i是否为素数
//         //是素数就打印
//         //2~i-1的数字去试着初i

//         int flag =1;
//         //表示是素数
//         int j=0;
//         for (j=2;j<=sqrt(i);j++)//遍历开平方的所有数
//         {
//             if (i%j==0)
//             {
//                 flag=0;
//                 break;
//             }
//         }
//         if (flag==1)
//         {
//             count++;
//             printf("%d\n",i);
//         }

//     }
//     printf("\ncount=%d\n",count);
//     return 0;
// }

//是素数返回1，不是素数返回0
//写函数模式
int is_prime (int n)
{
    int j = 0;
    for (j=2;j<=sqrt(n);j++)
    {
        if (n % j==0)
        {
            return 0; //直接结束所有代码
        }
    }

    return 1;
}


int main ()
{
    int i=0;
    int count = 0;
    for  (i=101;i<=200;i+=2)
    {
        if (is_prime(i))
        {
            printf("%d\n",i);
            count ++;
        }

    }

    printf("\ncount=%d\n",count);

    return 0;
}