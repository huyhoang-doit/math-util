/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hdi.mathutil.core;

/**
 *
 * @author lvhho
 */
public class MathUtility {
    // Ta se viet nhung ham toan hoc cung cap cho ben ngoai su dung
    // giong nhu thu vien Math. cua JDK
    // cac ham mang y nghia tien ich dung chung cho nhieu noi
    // thi se duoc thiet ke la static
    // static se duoc goi truc tiep bang ten class
    
    // Ham tinh n!
    // n (0 - 20) 21! tran kieu long, khong co am giai thua
    // 0! = 1
    public static long getFactorial(int n) {
        long product =1;
        if( n < 0 || n > 20 ) {
            throw new IllegalArgumentException("Invalid n. n number < 0 or n > 20");
        }
        
        if( n == 0) {
            return 1;
        }
        
        for(int i = 1; i <= n; i ++) {
            product*= i;
        }
        return product;
    }
}
