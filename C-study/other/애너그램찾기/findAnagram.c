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
		//입력받은 값들을 10으로 나누어 그 나머지를 배열에 넣는다(자릿수 분리)
	}

	for (i = 0; i < 5; i++) {
		for (int j = 0; j < i; j++) {
			if (num[j] > num[j + 1]) {
				int temp = num[j];
				num[j] = num[j + 1];
				num[j + 1] = temp;//첫번째 입력값을 숫자의 크기 순서로 정렬한다
			}
			if (num2[j] > num2[j + 1]) {
				int temp = num2[j];
				num2[j] = num2[j + 1];
				num2[j + 1] = temp;//번두째 입력값을 숫자의 크기 순서로 정렬한다
			}
		}
	}

	for (i = 0; i < 5; i++) {
		if (num[i] != num2[i]) {
			return(1);
			break;//두 값을 비교하고 하나라도 틀릴 경우 1을 반환하고 for문을 종료한다.
		}
	}
	return(2);//두 값을 비교하고 둘이 동일할 경우 1을 반환한다.
}
int main(void) {
	int n, n2;

	printf("첫번째 입력값:");//첫번째 입력값을 정수로 받는다
	scanf_s("%d", &n);
	printf("두번째 입력값:");//두번째 입력값을 정수로 받는다
	scanf_s("%d", &n2);

	int ans = answer(n, n2);

	if (ans == 1) {//반환받은 값이 1일 경우 거짓을 출력한다
		printf("false");
	}
	else {//반환받은 값이 1이 아닐 경우 참을 출력한다.
		printf("true");
	}

	return 0;
}