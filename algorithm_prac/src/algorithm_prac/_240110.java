package algorithm_prac;
import java.util.*;
class _240110 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1; // ä���� �� ���� ��
        int row = 0; // ���� �� ��ġ
        int col = 0; // ���� �� ��ġ
        int direction = 0; // �̵� ���� (0: ������, 1: �Ʒ�, 2: ����, 3: ��)

        while (value <= n * n) { // ��� ���� ���� �迭�� ä��� ����
            answer[row][col] = value++; // ���� ��ġ�� ���� ä��� ���� ������ �̵�

            // ���� �̵��� ��ġ ���
            if (direction == 0) { // ������ �������� �̵�
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) { // �Ʒ��� �������� �̵�
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) { // ���� �������� �̵�
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (direction == 3) { // ���� �������� �̵�
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }
}
