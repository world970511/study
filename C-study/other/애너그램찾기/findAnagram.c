#include <stdio.h>

int answer(int n, int n2) {
	int i;
	int num[5];
	int num2[5];

	for (i = 0; i < 5; i++) {
		num[i] = n % 10;
		n = n / 10;
		num2[i] = n2 % 10;
		n2 = n2 / 10;
		//�Է¹��� ������ 10���� ������ �� �������� �迭�� �ִ´�(�ڸ��� �и�)
	}

	for (i = 0; i < 5; i++) {
		for (int j = 0; j < i; j++) {
			if (num[j] > num[j + 1]) {
				int temp = num[j];
				num[j] = num[j + 1];
				num[j + 1] = temp;//ù��° �Է°��� ������ ũ�� ������ �����Ѵ�
			}
			if (num2[j] > num2[j + 1]) {
				int temp = num2[j];
				num2[j] = num2[j + 1];
				num2[j + 1] = temp;//����° �Է°��� ������ ũ�� ������ �����Ѵ�
			}
		}
	}

	for (i = 0; i < 5; i++) {
		if (num[i] != num2[i]) {
			return(1);
			break;//�� ���� ���ϰ� �ϳ��� Ʋ�� ��� 1�� ��ȯ�ϰ� for���� �����Ѵ�.
		}
	}
	return(2);//�� ���� ���ϰ� ���� ������ ��� 1�� ��ȯ�Ѵ�.
}
int main(void) {
	int n, n2;

	printf("ù��° �Է°�:");//ù��° �Է°��� ������ �޴´�
	scanf_s("%d", &n);
	printf("�ι�° �Է°�:");//�ι�° �Է°��� ������ �޴´�
	scanf_s("%d", &n2);

	int ans = answer(n, n2);

	if (ans == 1) {//��ȯ���� ���� 1�� ��� ������ ����Ѵ�
		printf("false");
	}
	else {//��ȯ���� ���� 1�� �ƴ� ��� ���� ����Ѵ�.
		printf("true");
	}

	return 0;
}