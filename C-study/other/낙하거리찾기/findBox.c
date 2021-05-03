#include <stdio.h>
/* ���� 4��
�ذ���:
�߷¿� ���� ������ ���ڵ��� �ᱹ ũ�⿡ ���� ���ĵ� ��
>> �׷� �ִ밪�� ��ġ�� �ڸ�= ���� ū ���ϰŸ� �ƴѰ�?
*/

int sort[101];//�迭 �����Ҷ� �ӽ÷� �����ϴ� ����

int merge(int num[],int left,int mid,int right) {
	int l = left;// ���ĵ� ���� �κ� �ε���
	int r = mid + 1;//���ĵ� ������ �κ� �ε���
	int c=left;//���Ľ�ų �κ� �ε���
	int i;

	//�迭 ����&����
	while (l<= mid && r<= right) {
		if (num[l] <= num[r]) {//���ĵ� ���� �ε����� �����ʺ��� �۰ų� ���� ���
			sort[c++] = num[l++];
		}
		else {//���ĵ� ���� �ε����� ���� �ʺ��� ū ���
			sort[c++] = num[r++];
		}
	}
	if (l > mid) {//(���� �ε����� �߰����� Ŭ ���) ���� �ִ� ������ ����
		for (i = r; i <= right; i++) {
			sort[c++] = num[i];
		}
	}
	else {// (���� �ε����� �߰����� �۰ų� ���� ���)���� �ִ� ������ ����
		for (i= l; i <= mid; i++) {
			sort[c++] = num[i];
		}
	}
	for(i=left;i<=right;i++){//�ӽù迭�� ���� num[]�� ����
		num[i] = sort[i];
	}

}
int merge_sort(int right,int left,int num[]) {
	int mid; //�迭�� �߰���
	if (left < right) {
		mid = (left + right) / 2;//�迭 ����	
		merge_sort(mid, left, num); // ���ҵ� ���� �κ� ���� 
		merge_sort(right, mid + 1, num); // ���� �κ� ����
		merge(num, left, mid, right); // ���ĵ� 2���� �κ� �迭�� �պ�
	}
}
int main(void) {
	int m;
	int n;

	printf("\n������ ���̸� �Է��Ͻÿ�: ");//���� ���� �Է�
	scanf_s("%d", &n);
	printf("������ ���̸� �Է��Ͻÿ�: ");//���� ���� �Է�
	scanf_s("%d", &m);

	int num[100];

	for (int i=0; i < n; i++) {
		printf("���ڵ��� �׿��ִ� ���̸� �Է��Ͻÿ�(��, ������ ���̺��� �۾ƾ� �մϴ�) : ");//������ ���� �Է�
		scanf_s("%d", &num[i]);
		printf("\n");
	}
	merge_sort(n-1,0,num);

	int max = num[n - 1];

	for (int i = 0; i < n; i++) {
		if (num[i] == max) {
			printf("���� ū ���ϰŸ�: %d\n", i);
			break;
		}
	}

	return 0;
}

//�������� �ڵ� ����: https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html