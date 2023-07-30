//函数练习

# include<stdio.h>

// 写一个函数判断一年是不是闰年
//闰年的判断规则：
//1.能被4整除，不能被100整除是闰年
//2. 能被400整除也是闰年
// int main()
// {
//     int year=0;
//     for (year =1000;year<=2000;year++)
//     {
//         if (year%4==0)
//         {
//             if(year%100=!0)
//             {
//                 printf("%d",year);
//             }

//         }
      

//         if(year % 400 ==0)
//         {
//             print("%d",year);
//         }
//     }

        
//     return 0;
// }


// int main ()
// {
//     int year =0;
//     for (year = 1000; year<=2000;year++)
//     {   
//         //写if多条件 &&并且 ｜｜或
//         if(((year % 4 == 0)&&(year % 100 != 0)) ||(year % 400 == 0)) 
//         {
//             printf("%d\n",year);
//         }
//     }
//     return 0 ;
// }

//写一个函数判断是不是闰年

//是闰年返回1，非闰年返回0
// 自定义函数的功能最好要单一，简单明了
//高内聚低耦合：意思是函数功能尽量独立，不要与其他因素有关联
// int is_leaf_year (int n)
// {
//     if (  ((n%4==0)&&(n%100!=0))|| (n%400==0)  )
//     {
//         return 1;
//     }

//     else
//     {
//         return 0;
//     }
// }


// int main ()
// {
//     int year =0;
//     int count=0;
//     for (year=1000;year<=2000;year++)
//     {
//         if (is_leaf_year(year))
//         {
//             printf("%d\n",year);
//             count++;
//         }
//     }

//     printf("%d",count);
//     return 0;
// }

//写一个函数，实现一个整形有序数组的二分查找


// int binary_search(int arr[],int k,int sz)  //arr[]看上去是数组，实际是指针
// //记得定义数据类型
// {
//     int left =0;
//     int right = sz-1;
//     while (left<=right)
//     {
//         int mid = left + (right-left)/2;
//         if (arr[mid] < k)
//         {
//             left =mid+1;
//         }
//         else if(arr[mid] > k)
//         {
//             right =mid-1;
//         }
//         else
//         {
//             return mid;
//         }

//     }

//     return -1;
// } 

// int main ()

// {
//     int arr[]= {1,2,3,4,5,6,7,8,9,10};
//     int k =17;
//     int sz =sizeof(arr)/sizeof(arr)[0];


//     //找到了返回下标
//     //找不到返回-1（因为数组中有0的下标）
//     //函数内的形参是数组的话，形参只是实参数组的首元素指针
//     //数组传参实际上传递的是首元素的地址，而不是整个数组
//     //所以在函数内部计算一个函数参数部分的数组的元素个数是不靠谱的
//     int ret = binary_search (arr,k,sz);
//     if (ret == -1)
//     {
//         printf("没找到'");
//     }
//     else 
//     {
//         printf("找到了，下标是：%d\n",ret);
//     }

//     return 0;
// }

//写一个函数，每调用一次这个含糊，就会将num的值+1
void Add(int *p)//指针变量通过地址该变量，传址调用
{
    (*p)++;
}
int main()
{
    int num =0;
    Add(&num);//取实参的地址
    printf("%d\n",num);
    Add(&num);
    printf("%d\n",num);
    return 0;
}
