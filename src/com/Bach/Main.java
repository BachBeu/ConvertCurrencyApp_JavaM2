package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double VND = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số USD muốn chuyển đổi sang VND: ");
        double USD = sc.nextDouble();
        double convert = USD*VND;
        System.out.println("Số tiền sau khi chuyển đổi từ USD sang VND là: " + convert);
    }
}
