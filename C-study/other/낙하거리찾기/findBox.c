#include <stdio.h>
/* 문제 4번
해결방법:
중력에 의해 떨어진 상자들은 결국 크기에 따라 정렬된 것
>> 그럼 최대값이 위치한 자리= 가장 큰 낙하거리 아닌가?
*/

int sort[101];//배열 정렬할때 임시로 저장하는 공간

int merge(int num[],int left,int mid,int right) {
	int l = left;// 정렬된 왼쪽 부분 인덱스
	int r = mid + 1;//정렬된 오른쪽 부분 인덱스
	int c=left;//정렬시킬 부분 인덱스
	int i;

	//배열 병합&정리
	while (l<= mid && r<= right) {
		if (num[l] <= num[r]) {//정렬된 왼쪽 인덱스가 오른쪽보다 작거나 같은 경우
			sort[c++] = num[l++];
		}
		else {//정렬된 왼쪽 인덱스가 오른 쪽보다 큰 경우
			sort[c++] = num[r++];
		}
	}
	if (l > mid) {//(왼쪽 인덱스가 중간보다 클 경우) 남아 있는 값들을 복사
		for (i = r; i <= right; i++) {
			sort[c++] = num[i];
		}
	}
	else {// (왼쪽 인덱스가 중간보다 작거나 같을 경우)남아 있는 값들을 복사
		for (i= l; i <= mid; i++) {
			sort[c++] = num[i];
		}
	}
	for(i=left;i<=right;i++){//임시배열의 값을 num[]에 대입
		num[i] = sort[i];
	}

}
int merge_sort(int right,int left,int num[]) {
	int mid; //배열의 중간값
	if (left < right) {
		mid = (left + right) / 2;//배열 분할	
		merge_sort(mid, left, num); // 분할된 앞쪽 부분 정렬 
		merge_sort(right, mid + 1, num); // 뒤쪽 부분 정렬
		merge(num, left, mid, right); // 정렬된 2개의 부분 배열을 합병
	}
}
int main(void) {
	int m;
	int n;

	printf("\n가로의 길이를 입력하시오: ");//가로 길이 입력
	scanf_s("%d", &n);
	printf("세로의 길이를 입력하시오: ");//세로 길이 입력
	scanf_s("%d", &m);

	int num[100];

	for (int i=0; i < n; i++) {
		printf("상자들이 쌓여있는 높이를 입력하시오(단, 세로의 길이보다 작아야 합니다) : ");//상자의 높이 입력
		scanf_s("%d", &num[i]);
		printf("\n");
	}
	merge_sort(n-1,0,num);

	int max = num[n - 1];

	for (int i = 0; i < n; i++) {
		if (num[i] == max) {
			printf("가장 큰 낙하거리: %d\n", i);
			break;
		}
	}

	return 0;
}

//버블정렬 코드 참조: https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html