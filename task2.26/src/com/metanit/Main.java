package com.metanit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.security.util.ArrayUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean done = false;
        int row;
        int col;
        int diagonal1=0;
        int diagonal2=0;
        Scanner scan= new Scanner(System.in);
        System.out.print("Введите размерность квадратной матрицы: ");
        int n=scan.nextInt();
        int[][] array=new int[n][n];
        int[] sum=new int[n*2+2];
        while (done!=true) {
            //формирование массива чисел
            int[] number=new int[(int)Math.pow(n,2)];
            for (int i=0;i<Math.pow(n,2);i++){
                number[i]=i+1;
            }
            int q = 0;
            diagonal1=0;
            //заполнение массива чслами, подсчет суммы чисел в строках и на главной диагонали
            for (int i = 0; i < array.length; i++) {
                row=0;
                for (int j = 0; j < array[i].length; j++) {
                    int index= 0 + (int) (Math.random() * Math.pow(n, 2));
                    while (number[index]==0) {
                        index = 0 + (int) (Math.random() * Math.pow(n, 2));
                    }
                    array[i][j]=number[index];
                    number[index]=0;
                    row += array[i][j];
                    if (i == j) {
                        diagonal1 += array[i][j];
                    }
                }
                sum[q] = row;
                q++;
            }
            sum[q] = diagonal1;
            q++;
            //подсчет суммы чисел на побочной диагонали
            diagonal2=0;
            for (int i=0;i<n;i++){
                    diagonal2+=array[i][n-i-1];
            }
            sum[q]=diagonal2;
            q++;
            //подсчет суммы числе в столбцах
            for (int j = 0; j < n; j++) {
                col=0;
                for (int i = 0; i < n; i++) {
                    col += array[i][j];
                }
                sum[q] = col;
                q++;
            }
            //проверка совпадения всех сумм
            done=true;
            for (int i = 0; i < (n*2+2); i++) {
             //   System.out.print(sum[i]+"\t");
                if (sum[0] != sum[i]) {
                    done = false;
                }
            }
        }
        //вывод магического квадрата
        for (int[] i:array){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
