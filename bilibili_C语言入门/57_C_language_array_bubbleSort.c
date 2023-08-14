

//冒泡排序算法的核心思想：两个相邻元素比较

//数组传参的时候，形参有两种写法：1.数组 2.指针
//形参是数组的形式

//以下为数组的示例
# include<stdio.h>
void bubble_sort(int arr[], int sz )
{
		//确定整租数列需要冒泡排序的次数 n-1次
		int i = 0;
		for (i=0; i<sz-1; i++)
			{
				int j = 0;
				for (j=0;j<sz-1-i;j++)
				{
						if (arr[j]>arr[j+1])
						{ 
							int tmp = arr[j+1];
							arr[j+1]=arr[j];
							arr[j] =tmp;
						}
				} 
            }
}



int main ()
{
		
		int arr[] = {9,8,7,6,5,4,3,2,1};
		int sz = sizeof(arr)/sizeof(arr[0]);
		bubble_sort(arr,sz);
        int i = 0 ;
        for (i=0;i<sz;i++)
        {
            printf("%d ",arr[i]);
        }

		return 0;
}


