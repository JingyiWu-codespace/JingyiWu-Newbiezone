//函数的递归与迭代

//n!
//5! ——> 5*4*3*2*1

# include <stdio.h>

// // 函数的递归 算阶乘
// int fac (int n )
// {
//     if (n<=1)
//     return 1;
//     else  
//     return n* fac(n-1); //函数自己调用自己 就是递归
// }


// int main ()
// {
//     int y = 0; 
//     int n =0;
//     scanf("%d",&n);
//     y = fac (n);
//     printf("%d",y);

//     return 0 ;
// }

// 函数迭代的方式，算阶乘。就是循环
// int fac(int n )
// {
//     int i = 0 ;
//     int ret =1 ;
//     for (i=1; i<=n; i++)
//     {
//         ret = i*ret;
//     }

//     return  ret;
// }

// int main ()
// {
//     int y = 0; 
//     int n =0;
//     scanf("%d",&n);
//     y = fac (n);
//     printf("%d",y);

//     return 0 ;
// }

//求第n个斐波那契数列 两支递归 代码效率很低
//前两个数相加 = 第三个
// fib(n) 1 1 2 3 5 8 .....
// int Fib (int n )
// {
//     if (n<=2)
//     {
//         return 1;
//     }
//     else 
//     {
//         return (Fib(n-1)+Fib(n-2));
//     }
// }


// int main ()
// {
//     int n = 0 ;
//     scanf("%d",&n);
//     int ret = Fib(n);
//     printf("%d\n",ret);

//     return 0 ;
// }

int Fib (int n )

{
    int a = 1;
    int b = 1;
    int c = 1;
    
    while (n >=3)
    {
        c = a+b;
        a=b;
        b=c;
        n--;
    }

    return c;
}

int main ()
{
    int n = 0 ;
    scanf("%d",&n);
    int ret = Fib(n);
    printf("%d\n",ret);

    return 0 ;
}
//如何让递归不出现栈溢出的情况
//1.将递归改成非递归
//2.使用static对象替代nonstatic局部对象。
// 在递归函数设计中，可以使用static对象替代nonstatic局部对象(栈对象)
// 不仅可以减少每次递归调用和返回时产生和释放nonstatic对象开销，
// 而且static对象还可以保存递归调用的中间状态，并且可为各个调用层所访问