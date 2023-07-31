//函数的嵌套调用
//函数可以嵌套调用，但不能嵌套定义




// //链式访问
// 链式访问的要求，被链接的函数，一定要有返回值;如果应用的函数没有返回值，则不允许使用链式访问
#include <stdio.h>
#include <string.h>
int main ()
{
    //普通写法
    int len =strlen("abcded");
    printf("%d\n",len);


    //链式访问，strlen()的返回值做了，printf这个函数的参数
    printf("%lu\n",strlen("abcded"));

    return 0;
}


//链式访问的案例：
#include <stdio.h>
#include <string.h>
int main()

{
    printf("%d",printf("%d",printf("%d",43)));

    return 0;
}


// 小tip，不规范代码的样式
//自定义函数不写返回值的时候，默认返回类型是int，
//但是这样写很糟糕，还是要把返回值带上
// 例子
Add (int x,int y)
{
    printf("hehe\n");
}

// 不规范代码样式，设置了返回值形式但没有写返回值语句
// 函数会默认返回语句中最后一条指令，最后一条指令是什么就返回什么
//例子
int Add (int x,int y)
{
    printf("hehe\n");
}
// 上面的代码在一些编译器上，返回的是函数的执行过程中最后一条指令执行的结果


//如果自定义函数没有形参，在调用时可以传入形参
//但也可以使用void放在参数的位置上，让其禁止传参
//例子
void test (void) //禁止传参数
{
    printf("hehe\n");
}

int main ()
    //int main（void）
    //  明确说明main函数不需要参数，本质上main函数有3个参数
{
    test();
    return 0;
}

// 介绍main的参数
int main (int argc,char* argv[], char* envp[])
{
    return 0;
}
